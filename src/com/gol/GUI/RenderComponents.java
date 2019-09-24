package com.gol.GUI;

import com.gol.Configure.Config;
import com.gol.Object.Cell;
import com.gol.Session.Session;

import java.awt.*;

/**
 * Class contains function for drawing the game frame
 */
public class RenderComponents {
    Graphics2D g2;
    public RenderComponents(Graphics2D g2){
        this.g2 = g2;
    }

    /**
     * Draw Grid on GUI
     */
    public void drawGrid(){
        g2.setColor(Color.black);
        for(int x = 0; x< Config.cellsInWidth; x++){
            g2.drawLine((x* Session.cellWidth),0,(x*Session.cellWidth),Config.width);
        }
        for(int y=0; y<Config.cellsInHeight; y++){
            g2.drawLine(0,(y*Session.cellHeight),Config.height,(y*Session.cellHeight));
        }
    }

    /**
     * Draw all alive cells
     */
    public void drawAliveCells(){
        g2.setColor(Color.BLUE);
        for(int i=0; i<Session.cells.size(); i++){
            Cell cell = Session.cells.get(i);
            if(Session.cells.get(i).isAlive()){
                g2.fillRect(cell.getPosX()*Session.cellWidth,cell.getPosY()*Session.cellHeight,Session.cellWidth,Session.cellHeight);
            }
        }
    }

    /**
     * draw dot on mouse pointer
     */
    public void drawMousePointer(){
        g2.setColor(Color.RED);
        g2.fillOval((int) Session.mousePoint.getX()-2,(int) Session.mousePoint.getY()-2,4,4);
    }
}
