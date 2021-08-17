package com.leonardonatali.marsrobots.position;

import java.util.Arrays;
import java.util.List;

import com.leonardonatali.marsrobots.position.enums.Move;
import com.leonardonatali.marsrobots.position.enums.Position;

public final class Orientation {
    private static final List<Position> positions = Arrays
            .asList(new Position[] { Position.NORTH, Position.EAST, Position.SOUTH, Position.WEST });

    private Orientation() {
        super();
    }

    /**
     * Gets next position based on current position
     * 
     * @param current
     * @param turn
     * @return
     */
    public static Position nextPosition(Position current, Move turn) {
        int index = positions.indexOf(current);
        int size = positions.size();

        if (turn == Move.RIGHT) {
            if (index == size - 1) {
                index = 0;
            }

            return positions.get(index);
        }

        if (turn == Move.LEFT) {
            if (index == 0) {
                index = size - 1;
            }

            return positions.get(index);
        }

        return current;
    }
}
