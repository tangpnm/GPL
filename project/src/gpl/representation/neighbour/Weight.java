/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpl.representation.neighbour;

import gpl.representation.edgelist.Edge;
import java.util.Map;

/**
 *
 * @author user
 */
public interface Weight {
    public Map<Edge, Integer> weight(int w);
}
