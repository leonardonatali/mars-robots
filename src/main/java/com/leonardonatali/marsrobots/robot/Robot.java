package com.leonardonatali.marsrobots.robot;

import com.leonardonatali.marsrobots.position.Orientation;
import com.leonardonatali.marsrobots.position.enums.Move;
import com.leonardonatali.marsrobots.position.enums.Position;

public class Robot {
    private Position position;

    public Robot() {
        this.position = Position.NORTH;
    }

    public void turn(Move move) {
        this.position = Orientation.nextPosition(this.position, move);
    }
}
