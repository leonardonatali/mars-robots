package com.leonardonatali.marsrobots.position;

import com.leonardonatali.marsrobots.position.enums.MoveEnum;

public class Move {
    public static MoveEnum fromString(String move) {
        switch (move.toUpperCase()) {
            case "L":
                return MoveEnum.LEFT;
            case "R":
                return MoveEnum.RIGHT;
            case "M":
                return MoveEnum.MOVE;
            default:
                return MoveEnum.UNDEFINED;
        }
    }
}
