// Grid For Slime Mold Model Simulation

/* Written by Charlotte Lilley and Alex Kearney
 *                  2013 Summer Research
 * 
 *  Note For Next Person:
 * 
 *      Hey C, I put this in so that you would have some sort of idea as to what
 * I've been doing and what I'll do next. I've put change notes in before and
 * have a section for you. When you finish reading this you can just delete it,
 * that way I know you've got my message. Also, if you have any overarching
 * questions, just put them here. If you want to know what a specific piece of 
 * code is, just put "//" which makes a comment and then add something, like 
 * 
 * //WTF ALEX! EXPPPLAAAINNN!
 *
 *   Alex's Change notes:
 *      25-06-13:
 *          - Initial Set-up
 *          - My plan for the construction of the slime mold is to have multiple
 *  actors in a particular setting which manage their current loaction --
 *  like the nuclei -- which function as a whole through the 
 * 
 *      26-06-13:
 *          - More slime mold work, but not much else
 *      
 *      27-06-13
 *          - Fleshed out SlimeMold Class' structure.
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
 *      - Find a way to input the maze & connections ---------------- [ ]
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
