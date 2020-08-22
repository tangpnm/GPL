/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpl.representation.edgelist;

import gpl.representation.neighbour.Weight;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author user
 */
public class Edge implements Weight{
    public gpl.base.Node m;
    public gpl.base.Node n;
    //public int w;
    
    public Edge(gpl.base.Node m, gpl.base.Node n){
        this.m = m;
        this.n = n;
        //this.w = w;
    }
    
    @Override
    public Map<Edge, Integer> weight(int w) {
        Map<Edge, Integer> map = new HashMap<Edge,Integer>();
        Edge e = null;
        for(Map.Entry<Edge,Integer> entry : map.entrySet()){
            map.put(e, w);
        }
        return map;
    }

}
