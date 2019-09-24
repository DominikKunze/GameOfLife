package com.gol.Session;

import com.gol.Object.Cell;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * variables of the session.
 */
public class Session {
    /**
     * Frame of the game
     */
    public static JFrame frame;
    /**
     * ArrayList contains all cells
     */
    public static ArrayList<Cell> cells = new ArrayList<Cell>();
    /**
     * Position of the mouse
     */
    public static Point mousePoint = new Point(0, 0);
    /**
     * Game started
     */
    public static boolean start = false;
    /**
     * Array of the numbers, where the cell keeps alive
     */
    public static int [] alive;
    /**
     * Array of the numbers, where a death cell turns alive
     */
    public static int [] reborn;
    /**
     * Cell height in pixel
     */
    public static int cellHeight;
    /**
     * Cell width in pixel
     */
    public static int cellWidth;
}
