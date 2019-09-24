package com.gol.GUI;

import com.gol.Configure.Config;
import com.gol.Listeners.Action.KeyPressAction;
import com.gol.Listeners.Action.MouseClickAction;
import com.gol.Listeners.Action.MouseMovementAction;
import com.gol.Listeners.KeyPressListener;
import com.gol.Listeners.MouseClickListener;
import com.gol.Listeners.MouseMovementListener;
import com.gol.Runnable.GenerationRunnable;
import com.gol.Runnable.RepaintRunnable;
import com.gol.Session.Session;

import javax.swing.*;

/**
 * Class contains the gui of the game.
 *
 * @author Dominik Kunze
 * @version 1.0
 */
public class GUI {
    /**
     * Opens the game gui and starts all threads.
     *
     * @see RepaintRunnable
     * @see GenerationRunnable
     * @see JFrame
     */
    public void openGUI(){
        // create JFrame
        Session.frame = new JFrame("Game of life");
        Session.frame.setSize(Config.width,Config.height);
        Session.frame.setLocationRelativeTo(null);
        Session.frame.setResizable(true);
        Session.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Session.frame.add(new Render());
        Session.frame.addMouseMotionListener(new MouseMovementListener(new MouseMovementAction()));
        Session.frame.addMouseListener(new MouseClickListener(new MouseClickAction()));
        Session.frame.addKeyListener(new KeyPressListener(new KeyPressAction()));
        Session.frame.setVisible(true);

        // Start threads
        Thread t1 = new Thread(new RepaintRunnable());
        t1.start();
        Thread t2 = new Thread(new GenerationRunnable());
        t2.start();
    }
}
