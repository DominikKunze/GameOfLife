package com.gol.Object;

/**
 * Object class of the cell.
 *
 * @author Dominik Kunze
 * @version 1.0
 */
public class Cell {
    /** Status of the cell. */
    private boolean alive = false;
    /** Horizontal position of the cell. */
    private int posX;
    /** Vertical position of the cell. */
    private int posY;
    /** Status of the cell in the next generation. */
    private boolean nextGenAlive = false;

    /**
     * Constructor of the cell.
     * @param   x
     *          Horizontal position of the cell.
     * @param   y
     *          Vertical position of the cell.
     */
    public Cell(int x, int y){
        this.posX = x;
        this.posY = y;
    }

    /**
     * Constructor of the cell.
     * @param   x
     *          Horizontal position of the cell
     * @param   y
     *          Vertical position of the cell
     * @param   alive
     *          Status of the cell
     */
    public Cell(int x, int y, boolean alive){
        this.posX = x;
        this.posY = y;
        this.alive = alive;
    }

    /**
     * Get horizontal position of the cell.
     * @return int - returns the horizontal position
     */
    public int getPosX() {
        return posX;
    }

    /**
     * Set horizontal position of the cell.
     * @param   posX
     *          Horizontal position
     */
    public void setPosX(int posX) {
        this.posX = posX;
    }

    /**
     * Get vertical position of the cell.
     * @return int - returns the vertical position
     */
    public int getPosY() {
        return posY;
    }

    /**
     * Set vertical position of the cell.
     * @param   posY
     *          Vertical position
     */
    public void setPosY(int posY) {
        this.posY = posY;
    }

    /**
     * Check if cell is alive (check the status).
     * @return true - when the cell is alive
     */
    public boolean isAlive() {
        return alive;
    }

    /**
     * Set the status of the cell.
     * @param   alive
     *          Status of the cell
     */
    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    /**
     * Check if cell is in next generation alive.
     * @return true - when the cell is alive in next generation
     */
    public boolean isNextGenAlive() {
        return nextGenAlive;
    }

    /**
     * Set the status of the cell in the next generation.
     * @param   nextGenAlive
     *          Status of the cell in next generation
     */
    public void setNextGenAlive(boolean nextGenAlive) {
        this.nextGenAlive = nextGenAlive;
    }
}
