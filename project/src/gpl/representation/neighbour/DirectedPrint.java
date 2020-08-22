/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpl.representation.neighbour;

import gpl.base.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dell77
 */
public class DirectedPrint implements  Print{
    
    public DirectedPrint(){
    }
    
    public String printGraph(List<Edge> edges){
        String out = "Directed Graph {\n";
        for(Edge e : edges){
            out = out + e.m.name + " -> " + e.n.name + "\n";
        }
        out = out + "}\n";
        return out;
    }
}
