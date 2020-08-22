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
public class Node {
    public String name;

    @Override
    public String toString() {
        return name;
    }
    
    @Override
    public boolean equals(Object obj) {
        return this.name.equals(((Node) obj).name); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Node(String name){
        this.name = name;
    }
    
}
