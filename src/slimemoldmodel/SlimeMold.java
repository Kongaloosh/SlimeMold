// Grid For Slime Mold Model Simulation

/* Written by Charlotte Lilley and Alex Kearney
 *                  2013 Summer Research
 * 
 *   
 * 
 *   Alex's Change notes:
 *      25-6-13:
 *          - Initial Set-up
 *          - My plan for the construction of the slime mold is to have multiple
 *  actors in a particular setting which manage their current loaction --
 *  like the nuclei -- which function as a whole through the 
 * 
 *   Charlotte's Change notes:
 * 
 * 
 * _________________________________________________________________________
 * 
 *  Current Goals:
 * 
 *  - Override important actions ------------------------------------ [ ]
 *  - Change image instantiation ------------------------------------ [ ]
 *  - Add formulae for actions -------------------------------------- [ ]
 *  - Multiple actors on grid --------------------------------------- [ ]
 *  - method that grnerates the nucli and structure to build safely - [ ]
 */

package slimemoldmodel;

import info.gridworld.actor.Actor;
import java.math.MathContext;

public class SlimeMold extends Actor {

    private int startNode;
    private int endNode;
    
    public SlimeMold( int startNode, int endNode ){
        this.startNode = startNode;
        this.endNode = endNode;
    }
    
    @Override
    public void act() {
        //Find state
        
        // update
        
        
        //act
    }
    
    public void returnFlux(){
        
    }
    
    public void returnConductuvity(){
        
    }
    
    
      
}
