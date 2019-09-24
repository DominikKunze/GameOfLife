package com.gol.Runnable;

import com.gol.Configure.Config;
import com.gol.Library.GenerationCalculator;
import com.gol.Session.Session;

/**
 * Runnable of the generation
 */
public class GenerationRunnable implements Runnable{
    GenerationCalculator calculator = new GenerationCalculator();

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(Config.evolutionInMS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(Session.start) {
                calculator.calculate(); // Calculate next generation

                // set status of all cells for the next generation
                for (int i = 0; i < Session.cells.size(); i++) {
                    if (Session.cells.get(i).isNextGenAlive()) Session.cells.get(i).setAlive(true);
                    else Session.cells.get(i).setAlive(false);
                }
            }
        }
    }
}
