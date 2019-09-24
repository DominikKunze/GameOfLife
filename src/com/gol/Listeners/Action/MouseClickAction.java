package com.gol.Listeners.Action;

import com.gol.Configure.Config;
import com.gol.Interfaces.MouseClickInterface;
import com.gol.Session.Session;

import java.awt.event.MouseEvent;

/**
 * Action class of MouseClickListener
 *
 * @see com.gol.Listeners.MouseClickListener
 * @author Dominik Kunze
 * @version 1.0
 */
public class MouseClickAction implements MouseClickInterface {
    /**
     * Player click on a position in the gui.
     * @see MouseClickInterface
     * @param   e
     *          MouseEvent
     */
    @Override
    public void onClick(MouseEvent e){
        int y = e.getY()-25;
        int x = e.getX();

        //evaluate the position of the cell
        for(int x1=0; x1< Config.cellsInWidth; x1++){
            for(int y1=0; y1<Config.cellsInHeight; y1++){
                if((x >= (x1*Session.cellWidth)) && (x <= (x1*Session.cellWidth+Session.cellWidth))){
                    if((y >= (y1*Session.cellHeight)) && (y <= (y1*Session.cellHeight+Session.cellHeight))){
                        System.out.println(x1 + " " +y1);
                        clickOnCell(x1, y1);
                        break;
                    }
                }
            }
        }
    }

    /**
     * Player clicked on a cell.
     *
     * @param   x
     *          Horizontal of the cell
     * @param   y
     *          Vertical of the cell
     */
    private void clickOnCell(int x, int y){
        for(int i=0; i<Session.cells.size(); i++){
            if(Session.cells.get(i).getPosX() == x && Session.cells.get(i).getPosY() == y){
                if(Session.cells.get(i).isAlive()) Session.cells.get(i).setAlive(false);
                else Session.cells.get(i).setAlive(true);
            }
        }
    }
}
