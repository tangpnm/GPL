/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpl.base;

/**
 *
 * @author Student
 */
public class Edge {
    public Node m;
    public Node n;
    
    public Edge(Node m, Node n){
        this.m = m;
        this.n = n;
    }

    @Override
    public String toString() {
        return m + " -- " + n + "\n";
    }
    
}
