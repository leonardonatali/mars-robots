package com.leonardonatali.marsrobots.robot;

import com.leonardonatali.marsrobots.position.Orientation;
import com.leonardonatali.marsrobots.position.enums.MoveEnum;
import com.leonardonatali.marsrobots.position.enums.PositionEnum;

public class Robot {
    private PositionEnum position;
    private int x;
    private int y;

    public Robot() {
        this.position = PositionEnum.NORTH;
        this.x = 0;
        this.y = 0;
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    public void turn(MoveEnum move) {
        this.position = Orientation.nextPosition(this.position, move);
    }
}
