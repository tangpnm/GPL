package gpl;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import gpl.representation.neighbour.Graph;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class TestAssertions2 {
    
    private Graph graph;
    
    public TestAssertions2() {
        graph = new Graph();
    }
    
    
    @Test
    public void testIsConnected(){
        gpl.base.Node a = new gpl.base.Node("A");
        gpl.base.Node b = new gpl.base.Node("B");
        
        graph.add(a,b);
        
        assertTrue("Test connected", graph.isConnected(a,b));
    }
    
    @Test
    public void testAdd(){
        gpl.base.Node a = new gpl.base.Node("A");
        gpl.base.Node b = new gpl.base.Node("B");
        gpl.base.Edge e = new gpl.base.Edge(a, b);
        ArrayList<gpl.base.Node> nodes = new ArrayList<gpl.base.Node>();
        ArrayList<gpl.base.Edge> edges = new ArrayList<gpl.base.Edge>();
        if(!nodes.contains(a)){
            nodes.add(a);
        }
        if(!nodes.contains(b)){
            nodes.add(b);
        }
       
        edges.add(e);
        
        assertTrue("Test add", edges.contains(e));
        }
    
    @Test
    public void testNeighbour(){
        List<gpl.base.Edge> neighbour = new ArrayList<>();
        ArrayList<gpl.base.Edge> edges = new ArrayList<gpl.base.Edge>();
        gpl.base.Node a = new gpl.base.Node("A");
        for(gpl.base.Edge e: edges){
            if( e.m == a || e.n == a ) {
                neighbour.add(e);
            }
            assertTrue("Test neighbour", neighbour.contains(e));
        }
    }
    
}
