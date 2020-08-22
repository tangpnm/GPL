    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
    package gpl.representation.neighbour;

    import gpl.base.Edge;
    import java.util.ArrayList;
    import java.util.List;

    /**
     *
     * @author ASUS
     */
    public class Graph {
        private List<Node> nodes;
        
        boolean isDirected;
        public void setDirected(boolean b) {
            this.isDirected = b;
            if (isDirected) {
                this.printer = new DirectedPrint();
            }
            else {
                this.printer = new UndirectedPrint();
            }
        }
        
        Print printer;
        public void setPrinter(Print p) {
            this.printer = p;
        }

         public Graph(){
            nodes = new ArrayList<>();
            setDirected(false);
        }

        public List<gpl.base.Node> getNodes() {
            List<gpl.base.Node> gplNodes = new ArrayList<>();
            for (Node n: nodes) {
                gplNodes.add(n.node);
            }
            return gplNodes;
    //        return nodes;
        }

        public List<Edge> getEdges(){
            List<Edge> result = new ArrayList<>();      // empty
            for (Node n : nodes) {
                for (Neighbour nei : n.neighbours) {
                    Edge e = new Edge(n.node, nei.node);
//                     if( e.m == n || e.n == n ) {
                        result.add(e);
//                     }
    //                
                }
            }
            return result;
        }

        public gpl.base.Edge add(gpl.base.Node mGPL, gpl.base.Node nGPL){
            
            Edge e = new Edge(mGPL, nGPL);
            
            // M
            Node m = new Node(mGPL);      
            if(nodes.contains(m) == false){
                this.nodes.add(m);
            }
            else {
                m = this.nodes.get(this.nodes.indexOf(m));
            }
            
            // N
            Node n = new Node(nGPL);
            if(nodes.contains(n) == false){
                this.nodes.add(n);
            }
            else {
                n = this.nodes.get(this.nodes.indexOf(n));
            }

            // add Neighbour
            Neighbour nNei = new Neighbour(nGPL);
            Neighbour mNei = new Neighbour(mGPL);
            if (m.neighbours.contains(nNei) == false && n.neighbours.contains(mNei) == false){
//                System.out.println(mGPL + " -- " + nGPL);;
                m.neighbours.add(nNei);
            }

            return e;
        }

        public boolean isConnected(gpl.base.Node mGPL, gpl.base.Node nGPL){
    //        List<gpl.base.Edge> edges = new ArrayList<gpl.base.Edge>();
            Node m = new Node(mGPL);
            Node n = new Node(nGPL);
            if(nodes.contains(m) && nodes.contains(n)){
                for(Edge e: this.getEdges()){
                    if( (e.m.equals(mGPL) && e.n.equals(nGPL)) || (e.m.equals(nGPL) && e.n.equals(mGPL) )){
                        return true;
                    }
                }
            }
            return false;
        }

        public List<gpl.base.Edge> getNeighbours(gpl.base.Node n){
            List<Edge> neighbour = new ArrayList<>();
            for(Edge e: this.getEdges()){
                if( e.m == n || e.n == n ) {
                    neighbour.add(e);
                }
            }
            return neighbour;
        }
        
        public String print(){
            return printer.printGraph(this.getEdges());
        }
    }
