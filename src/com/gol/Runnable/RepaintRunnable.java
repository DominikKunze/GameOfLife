package com.gol.Runnable;

import com.gol.Configure.Config;
import com.gol.Session.Session;

/**
 * Runnable of the repaint of the gui
 */
public class RepaintRunnable implements Runnable{
    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(Config.REFRESH_TIME_IN_MS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Session.frame.repaint();
        }
    }
}
