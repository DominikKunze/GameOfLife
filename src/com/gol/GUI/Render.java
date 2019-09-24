package com.gol.GUI;

import com.gol.Configure.Config;
import com.gol.Session.Session;

import javax.swing.*;
import java.awt.*;

/**
 * Class contains method to painting the gui.
 *
 * @author Dominik Kunze
 * @version 1.0
 */
public class Render extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        Graphics2D g2 = (Graphics2D) g;

        //draw lines
        g2.setColor(Color.black);
        for(int x=0; x< Config.cellsInWidth; x++){
            g2.drawLine((x*Session.cellWidth),0,(x*Session.cellWidth),Config.width);
        }
        for(int y=0; y<Config.cellsInHeight; y++){
            g2.drawLine(0,(y*Session.cellHeight),Config.height,(y*Session.cellHeight));
        }

        //draw alive cells
        g2.setColor(Color.BLUE);
        for(int i=0; i<Session.cells.size(); i++){
            if(Session.cells.get(i).isAlive()){
                g2.fillRect(Session.cells.get(i).getPosX()*Session.cellWidth,Session.cells.get(i).getPosY()*Session.cellHeight,Session.cellWidth,Session.cellHeight);
            }
        }

        //draw mouse pointer
        g2.setColor(Color.RED);
        g2.fillOval((int) Session.mousePoint.getX()-2,(int) Session.mousePoint.getY()-2,4,4);
    }
}
