/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpl.representation;

import gpl.base.Graph1;
import gpl.base.Node;
import gpl.representation.neighbour.Neighbour;
//import java.util.List;

/**
 *
 * @author Acer
 */
public abstract class Representation {
    
    public abstract Graph1 graph();
    public abstract Node nodes();
    public abstract Neighbour neighbour();
    
   
    
}
