package com.leonardonatali.marsrobots.position;

import com.leonardonatali.marsrobots.position.enums.PositionEnum;

public class Position {
    public static String toString(PositionEnum position) {
        switch (position) {
            case EAST:
                return "E";
            case NORTH:
                return "N";
            case SOUTH:
                return "S";
            case WEST:
                return "W";
            default:
                return "N";
        }
    }
}
