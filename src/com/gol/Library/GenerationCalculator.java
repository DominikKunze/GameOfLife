package com.gol.Library;

import com.gol.Session.Session;

/**
 * Class contains functions to calculate the next generation.
 *
 * @author Dominik Kunze
 * @version 1.0
 */
public class GenerationCalculator {
    /**
     * Calculate the next generation.
     */
    public void calculate(){
        for(int cellId=0; cellId<Session.cells.size(); cellId++){
            // Position of the cell
            int x = Session.cells.get(cellId).getPosX();
            int y = Session.cells.get(cellId).getPosY();

            if(Session.cells.get(cellId).isAlive()){
                // evaluate the next generation status
                boolean keepAlive = false;
                for(int aliveNumbers=0; aliveNumbers<Session.alive.length; aliveNumbers++){
                    if(getNeighborCount(cellId) == Session.alive[aliveNumbers]) keepAlive = true;
                }
                Session.cells.get(cellId).setNextGenAlive(keepAlive);
            }else{
                // evaluate the next generation status
                boolean reborn = false;
                for(int aliveNumbers=0; aliveNumbers<Session.reborn.length; aliveNumbers++){
                    if(getNeighborCount(cellId) == Session.reborn[aliveNumbers]) reborn = true;
                }
                Session.cells.get(cellId).setNextGenAlive(reborn);
            }
        }
    }

    /**
     * Check if the cell on a position is alive.
     *
     * @param   x
     *          Horizontal position of the cell
     * @param   y
     *          Vertical position of the cell
     * @return true - When the cell is alive
     */
    private boolean cellOnPointAlive(int x, int y){
        for(int i=0; i<Session.cells.size(); i++){
            if(Session.cells.get(i).getPosX() == x && Session.cells.get(i).getPosY() == y){
                if(Session.cells.get(i).isAlive()){
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Get number of Neighbors
     * @param   cellId
     *          ID of the Cell,
     * @return int - Number of Neighbors
     */
    private int getNeighborCount(int cellId){
        int x = Session.cells.get(cellId).getPosX();
        int y = Session.cells.get(cellId).getPosY();

        int count=0;
        // count alive cells around this cell
        for(int x1=-1; x1<2; x1++){
            for(int y1=-1; y1<2; y1++){
                if(x1 != 0 && y1 != 0) {
                    if (cellOnPointAlive(x + x1, y + y1)) count++;
                }
            }
        }
        return count;
    }
}
