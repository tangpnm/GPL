/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpl.representation.neighbour;

import gpl.base.Edge;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author ASUS
 */
public class Neighbour {
    public gpl.base.Node node;

    @Override
    public boolean equals(Object obj) {
        return node.equals(((Neighbour) obj).node);
    }
    
    
    
    public Neighbour(gpl.base.Node n){
//        List<Edge> neighbour = new ArrayList<>();
//        List<gpl.base.Edge> edges = new ArrayList<gpl.base.Edge>();
//        for(Edge e: edges){
//            if( e.m == n || e.n == n ) {
//                neighbour.add(e);
//            }
//        }
        
        this.node = n;
    }
}
