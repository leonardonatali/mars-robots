package com.leonardonatali.marsrobots.terrain;

/**
 * Terrain
 */
public class Terrain {
    private boolean[][] coordinates;

    /**
     * Creates an terrain with x of width and y of length
     * 
     * @param x
     * @param y
     */
    public Terrain(int x, int y) {
        this.coordinates = new boolean[x][y];
    }

    /**
     * Checks if given point is valid coordinate in terrain
     * 
     * @param x
     * @param y
     */
    public boolean isValidCoordinate(int x, int y) {
        if (x < 0 || y < 0) {
            return false;
        }

        if (x >= this.coordinates.length - 1) {
            return false;
        }

        if (this.coordinates[0].length - 1 >= y) {
            return false;
        }

        return true;
    }
}