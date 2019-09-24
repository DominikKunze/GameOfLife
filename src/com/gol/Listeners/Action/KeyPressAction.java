package com.gol.Listeners.Action;

import com.gol.Interfaces.KeyPressInterface;
import com.gol.Session.Session;

import java.awt.event.KeyEvent;

/**
 * Action class of MouseClickListener
 *
 * @see com.gol.Listeners.MouseClickListener
 * @author Dominik Kunze
 * @version 1.0
 */
public class KeyPressAction implements KeyPressInterface {
    /**
     * Player press a key.
     *
     * @see KeyPressInterface
     * @param   e
     *          KeyEvent of the key
     */
    @Override
    public void pressKey(KeyEvent e){
        if(e.getKeyCode() == 32){ // key "space"
            if(Session.start){
                Session.start = false;
                System.out.println("Off");
            } else {
                Session.start = true;
                System.out.println("On");
            }
        }
    }
}
