/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpl.base;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dell77
 */
public class PrintG implements  Print{
    private List<Edge> edges = new ArrayList<>();
    
    public PrintG(List<Edge> edges){
        this.edges = edges;
    }
    
    public String printGraph(){
        String out = "graph {\n";
        for(Edge e : edges){
            out = out + e.m + " -- " + e.n + "\n";
        }
        out = out + "}\n";
        return out;
    }
}
