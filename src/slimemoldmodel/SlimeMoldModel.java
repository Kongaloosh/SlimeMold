// Grid For Slime Mold Model Simulation

/* Written by Charlotte Lilley and Alex Kearney
 *                  2013 Summer Research
 * 
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
 *  - Build toy maze ------------------------------------------------ [X]
 *  - Create SlimeMold Class ---------------------------------------- [X]
 *  - Create SlimeMold Builder -------------------------------------- [X]
 *      - Create actors for SlimeMold Endpoints --------------------- [ ]
 *  - Multiple actors on grid --------------------------------------- [ ]
 * 
 */
package slimemoldmodel;

import info.gridworld.actor.Rock;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import info.gridworld.world.World;
import java.util.ArrayList;

public class SlimeMoldModel {

    ArrayList<SlimeMold> slimeMold;
    
    public static void main(String[] args) {
        int numberOfRows = 5;
        int numberOfColumns = 5;
        BoundedGrid boundedGrid;
        World world;
        boundedGrid = new BoundedGrid(numberOfRows, numberOfColumns);//this makes the gui we use to do the grid stuff
        world = new World(boundedGrid); // this is where we store the things which interact with the grid
        world.show();//this makes the grid visible

        /*
         *  Basic Grid Plan:
         *      s = Start
         *      e = End
         *      d = Dead End
         *      R = Rock
         * 
         *            
         *         A
         *   0  1  2  3  4    (B , A)
         *    -  -  -  -  - 
         *  | s  R           | 0
         *  |    R     R     | 1
         *  |    R     R  d  | 2 B
         *  |    R     R  R  | 3
         *  |             e  | 4
         *    -  -  -  -  - 
         * 
         * 
         * 
         *   Rocks: 
         *      (0,1), (1,1), (2,1), (3,1), (4,1), (2,3), (3,3), (4,3)
         * 
         */

        // --- Create The Rocks To Build Maze ---

        boundedGrid.put(new Location(0, 1), new Rock());
        boundedGrid.put(new Location(1, 1), new Rock());
        boundedGrid.put(new Location(2, 1), new Rock());
        boundedGrid.put(new Location(3, 1), new Rock());
        boundedGrid.put(new Location(2, 3), new Rock());
        boundedGrid.put(new Location(3, 3), new Rock());
        boundedGrid.put(new Location(3, 4), new Rock());
        boundedGrid.put(new Location(1, 3), new Rock());
    }

    public void generateSlime(int numberOfPoints, ArrayList<Location> connections) {
        for (int i = 0; i < connections.size(); i++) {
            int startNode = connections.get(i).getCol();
            int endNode = connections.get(i).getRow();
            slimeMold.add(new SlimeMold(startNode , endNode));
        }
    }
}