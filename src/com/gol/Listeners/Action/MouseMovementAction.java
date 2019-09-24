package com.gol.Listeners.Action;

import com.gol.Interfaces.MouseMovementInterface;
import com.gol.Session.Session;

import java.awt.event.MouseEvent;

/**
 * Action class of MouseMovementListener
 *
 * @see com.gol.Listeners.MouseMovementListener
 * @author Dominik Kunze
 * @version 1.0
 */
public class MouseMovementAction implements MouseMovementInterface {
    /**
     * Player moved his mouse on the gui.
     *
     * @see MouseMovementInterface
     * @param   e
     *          MouseEvent
     */
    @Override
    public void getPosition(MouseEvent e){
        Session.mousePoint.setLocation(e.getX(),e.getY()-25);
    }
}
