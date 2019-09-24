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
        for(int i=0; i<Session.cells.size(); i++){
            // Position of the cell
            int x = Session.cells.get(i).getPosX();
            int y = Session.cells.get(i).getPosY();

            int count=0;
            if(Session.cells.get(i).isAlive()){
                // count alive cells around this cell
                for(int x1=-1; x1<2; x1++){
                    for(int y1=-1; y1<2; y1++){
                        if(x1 == 0 && y1 == 0) {

                        }else{
                            if (cellOnPointAlive(x + x1, y + y1)) count++;
                        }
                    }
                }

                // evaluate the next generation status
                boolean keepalive = false;
                for(int ali=0; ali<Session.alive.length; ali++){
                    if(count == Session.alive[ali]) keepalive = true;
                }
                Session.cells.get(i).setNextGenAlive(keepalive);
            }else{
                // count alive cells around this cell
                for(int x1=-1; x1<2; x1++){
                    for(int y1=-1; y1<2; y1++){
                        if(x1 == 0 && y1 == 0) {

                        }else{
                            if (cellOnPointAlive(x + x1, y + y1)) count++;
                        }
                    }
                }

                // evaluate the next generation status
                boolean doalive = false;
                for(int ali=0; ali<Session.reborn.length; ali++){
                    if(count == Session.reborn[ali]) doalive = true;
                }
                Session.cells.get(i).setNextGenAlive(doalive);
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
}
