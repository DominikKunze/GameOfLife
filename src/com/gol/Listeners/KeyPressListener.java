package com.gol.Listeners;

import com.gol.Interfaces.KeyPressInterface;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Listener class of Key
 *
 * @see java.awt.event.KeyListener
 * @author Dominik Kunze
 * @version 1.0
 */
public class KeyPressListener implements KeyListener {
    KeyPressInterface action;

    /**
     * Constructor of KeyPressListener
     * @param   KeyPressAction
     *          Action class
     */
    public KeyPressListener(KeyPressInterface KeyPressAction){
        this.action = KeyPressAction;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        action.pressKey(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
}
