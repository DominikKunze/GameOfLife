package com.gol.GUI;

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
        // initialize classes
        Graphics2D g2 = (Graphics2D) g;
        RenderComponents renderComponents = new RenderComponents(g2);

        // draw components
        renderComponents.drawGrid();
        renderComponents.drawAliveCells();
        renderComponents.drawMousePointer();
    }
}
