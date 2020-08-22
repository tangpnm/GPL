package gpl;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import gpl.base.Node;
import gpl.base.Edge;
import gpl.base.Graph1;
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
public class TestAssertions {
    
    private Graph1 graph = new Graph1();
    
    public TestAssertions() {
    }
    
    
        @Test
    public void testIsConnected(){
        Node a = new Node("A");
        Node b = new Node("B");
        
        graph.add(a,b);
        
        assertTrue("Test connected", graph.isConnected(a,b));
    }
    
    @Test
    public void testAdd(){
        Node a = new Node("A");
        Node b = new Node("B");
        Edge e = new Edge(a, b);
        ArrayList<Node> nodes = new ArrayList<Node>();
        ArrayList<Edge> edges = new ArrayList<Edge>();
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
        List<Edge> neighbour = new ArrayList<>();
        ArrayList<Edge> edges = new ArrayList<Edge>();
        Node a = new Node("A");
        for(Edge e: edges){
            if( e.m == a || e.n == a ) {
                neighbour.add(e);
            }
            assertTrue("Test neighbour", neighbour.contains(e));
        }
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
