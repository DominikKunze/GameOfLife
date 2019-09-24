package com.gol.Configure;

/**
 * Default configuration of this game.
 * It can be chanced in the settings menu.
 *
 * @author Dominik Kunze
 * @version 1.0
 */
public class Config {
    /**
     * Refresh time of the frame in ms.<br>
     * Default 10ms = 100 FPS.
     */
    public static int refreshTimeInMS = 10;
    /**
     * Evolution time in ms.<br>
     * Default 100ms = 10 Evolutions per second.
     */
    public static int evolutionInMS = 100;
    /**
     * Amount of cells in the horizontal.<br>
     * Default 30 cells.
     */
    public static int cellsInWidth = 30;
    /**
     * Amount of cells in the vertical.<br>
     * Default 30 cells.
     */
    public static int cellsInHeight = 30;
    /**
     * Width of the frame in pixel.<br>
     * Default 600px.
     */
    public static int width = 600;
    /**
     * Height of the frame in pixel.<br>
     * Default 600px.
     */
    public static int height = 600;
    /**
     * Gamerule of the game.<br><br>
     *
     * <h3>Examples</h3>
     * <p>
     * <b><u>Gamerule 23/3</u></b><br>
     * <b>Keep cells alive:</b> 2 or 3 neighbor<br>
     * <b>Reborn dead cells:</b> 3 neightbor
     * </p>
     * <p>
     * <b><u>Gamerule 245/3</u></b>
     * <b>Keep cells alive:</b> 2, 4 or 5 neighbor<br>
     * <b>Reborn dead cells:</b> 3 neighbor
     * </p>
     */
    public static String gameRule = "23/3";
}
