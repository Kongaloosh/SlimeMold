/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package slimemoldmodel;

import info.gridworld.actor.Rock;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import info.gridworld.world.World;
import java.util.ArrayList;

/**
 *
 * @author Alex Kearney
 */
public class SlimeMoldModel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             int numberOfRows =5;
        int numberOfColumns=5;
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
        
        boundedGrid.put(new Location(0,1), new Rock());
        boundedGrid.put(new Location(1,1), new Rock());
        boundedGrid.put(new Location(2,1), new Rock());
        boundedGrid.put(new Location(3,1), new Rock());
        boundedGrid.put(new Location(2,3), new Rock());
        boundedGrid.put(new Location(3,3), new Rock());
        boundedGrid.put(new Location(3,4), new Rock());
       boundedGrid.put(new Location(1,3), new Rock());
    }
  
    public ArrayList<SlimeMold> generateSlime(){
        return new ArrayList
    }

}