/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpl.base;

import java.util.*;

/**
 *
 * @author Student
 */
public class Graph1 {
    private List<Node> nodes;
    private List<Edge> edges;
    public Graph1(){
        nodes = new ArrayList<>();
        edges = new ArrayList<>();
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public List<Edge> getEdges() {
        return edges;
    }
    
    public Edge add(Node m, Node n){
        Edge e = new Edge(m, n);
        if(!nodes.contains(m)){
            this.nodes.add(m);
        }
        if(!nodes.contains(n)){
            this.nodes.add(n);
        }
        if(!isConnected(m,n)){
            edges.add(e);
            return e;
        }
        
       
        return e;
    }
    
    public boolean isConnected(Node m, Node n){
        if(nodes.contains(m) && nodes.contains(n)){
            for(Edge e: edges){
                if( (e.m.name.equals(m.name) && e.n.name.equals(n.name)) || (e.m.name.equals(n.name) && e.n.name.equals(m.name) )){
                    return true;
                }
            }
        }
        return false;
    }
    
    public List<Edge> getNeighbours(Node n){
        List<Edge> neighbour = new ArrayList<>();
        for(Edge e: edges){
            if( e.m == n || e.n == n ) {
                neighbour.add(e);
            }
        }
        return neighbour;
    }
    
    public String print(){
        Print p = new PrintG(edges);
        return p.printGraph();
    }
    
}


