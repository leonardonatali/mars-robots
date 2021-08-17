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
        int lastIndex = positions.size() - 1;

        index = index == lastIndex ? 0 : index + 1;
        // If moves to right, increase index, if reach limit of positions, starts of
        // befinning
        if (turn == Move.RIGHT) {
        } else {
            // If moves to left, decrease index, if reach init of positions, starts of
            // end
            index = index == 0 ? lastIndex : index - 1;
        }

        return positions.get(index);
    }
}
