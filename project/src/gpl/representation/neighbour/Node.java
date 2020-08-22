/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpl.representation.neighbour;

import gpl.representation.neighbour.Neighbour;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class Node{
    public gpl.base.Node node;
    public List<Neighbour> neighbours;
    
    public Node(gpl.base.Node n){
        this.node = n;
        this.neighbours = new ArrayList<>();
    }
    
    public boolean equals(Object obj) {
        return this.node.equals(((Node) obj).node); //To change body of generated methods, choose Tools | Templates.
    }

//    List<gpl.base.Edge> edges = new ArrayList<gpl.base.Edge>();
    
    
}
