package com.gol.Library;

import com.gol.Configure.Config;
import com.gol.Object.Cell;
import com.gol.Session.Session;

/**
 * Contains functions, that you need to load.
 *
 * @author Dominik Kunze
 * @version 1.0
 */
public class Loader {
    /**
     * Load a gamerule.
     * @param   gameRule
     *          String of a gamerule, default "23/3"
     */
    public void loadGameRule(String gameRule){
        System.out.println("Loading gamerule...");

        String [] split = gameRule.split("/");

        Session.alive = new int[split[0].length()];
        Session.reborn = new int[split[1].length()];

        for(int i=0; i<split[0].length(); i++){
            Session.alive[i] = Integer.parseInt(String.valueOf(split[0].charAt(i)));
        }
        for(int i=0; i<split[1].length(); i++){
            Session.reborn[i] = Integer.parseInt(String.valueOf(split[1].charAt(i)));
        }

        System.out.println("Gamerule loaded!");
    }

    /**
     * Calculate size of the cells for the gui.
     */
    public void calculateSize(){
        System.out.println("Calculate size...");

        Session.cellWidth = Config.width/Config.cellsInWidth;
        Session.cellHeight = Config.height/Config.cellsInHeight;

        System.out.println("Size calculated!");

        System.out.println(Session.cellWidth);
        System.out.println(Session.cellHeight);
    }

    /**
     * Generate all cells.
     */
    public void generateCells(){
        System.out.println("Generate cells...");

        int count = 0;
        for(int x=0; x< Config.cellsInWidth; x++){
            for(int y=0; y<Config.cellsInHeight; y++){
                count++;
                Session.cells.add(new Cell(x,y));
                System.out.println("Cell #"+x+" on x="+x+",y="+y+" generated");
            }
        }

        System.out.println("Cells generated!");
    }
}
