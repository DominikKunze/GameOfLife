package com.gol.Listeners;


import com.gol.Interfaces.MouseClickInterface;
import com.gol.Listeners.Action.MouseClickAction;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Listerer class of the Mouse
 *
 * @see MouseListener
 * @author Dominik Kunze
 * @version 1.0
 */
public class MouseClickListener implements MouseListener {
    MouseClickInterface action;

    /**
     * Constructor of MouseClickListener
     * @param   MouseClickAction
     *          Action class
     */
    public MouseClickListener(MouseClickInterface MouseClickAction){
        this.action = MouseClickAction;
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        action.onClick(e);
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }
}
