
import gpl.base.*;
//import gpl.representation.neighbour;
import gpl.representation.neighbour.Graph;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        JUnitCore junit = new JUnitCore();
        junit.addListener(new TextListener(System.out));
        junit.run(gpl.TestAssertions2.class);
//        System.out.print("Enter the number of nodes and edges: ");
//        Scanner scan = new Scanner(System.in);
//        int number_nodes = scan.nextInt();
//        int number_edges = scan.nextInt();
        Graph graph = new Graph();
        graph.setDirected(true);
//      Graph1 graph = new Graph1();
        Node a = new Node("A");
        Node b = new Node("B");
        Node c = new Node("C");
        Node d = new Node("D");
        Node e = new Node("E");
        Node f = new Node("F");
        Node g = new Node("G");
        Node h = new Node("H");
        
        graph.add(a, b);
        graph.add(a, c);
        graph.add(c, b);
        graph.add(a, d);
        graph.add(a, e);
        graph.add(e, f);
        graph.add(e, g);
        graph.add(e, h);
        graph.add(c, a);
        graph.add(a, b);
       
        
//       System.out.println(graph.isConnected(a, b));
//        System.out.println(graph.isConnected(a, f));
//        
//       System.out.println(graph.getNeighbours(a).toString());

        System.out.println(graph.print());
        
        
        
    }
    
}
