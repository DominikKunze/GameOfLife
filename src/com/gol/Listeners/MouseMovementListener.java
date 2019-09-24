package com.gol.Listeners;

import com.gol.Interfaces.MouseMovementInterface;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

/**
 * Listener class of MouseMovement
 *
 * @see MouseMotionListener
 * @author Dominik Kunze
 * @version 1.0
 */
public class MouseMovementListener implements MouseMotionListener {
    MouseMovementInterface action;

    /**
     * Constructor of the MouseMovementListener
     * @param   MouseMovementAction
     *          Action class
     */
    public MouseMovementListener(MouseMovementInterface MouseMovementAction){
        this.action = MouseMovementAction;
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        action.getPosition(e);
    }
}
