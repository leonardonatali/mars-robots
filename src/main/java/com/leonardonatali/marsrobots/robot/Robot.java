package com.leonardonatali.marsrobots.robot;

import com.leonardonatali.marsrobots.position.Orientation;
import com.leonardonatali.marsrobots.position.enums.MoveEnum;
import com.leonardonatali.marsrobots.position.enums.PositionEnum;

public class Robot {
    private PositionEnum position;

    public Robot() {
        this.position = PositionEnum.NORTH;
    }

    public void turn(MoveEnum move) {
        this.position = Orientation.nextPosition(this.position, move);
    }
}
