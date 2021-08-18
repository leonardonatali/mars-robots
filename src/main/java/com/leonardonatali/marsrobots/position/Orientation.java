package com.leonardonatali.marsrobots.position;

import java.util.Arrays;
import java.util.List;

import com.leonardonatali.marsrobots.position.enums.MoveEnum;
import com.leonardonatali.marsrobots.position.enums.PositionEnum;

public final class Orientation {
    public static final List<PositionEnum> positions = Arrays.asList(
            new PositionEnum[] { PositionEnum.NORTH, PositionEnum.EAST, PositionEnum.SOUTH, PositionEnum.WEST });

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
    public static PositionEnum nextPosition(PositionEnum current, MoveEnum turn) {
        int index = positions.indexOf(current);
        int lastIndex = positions.size() - 1;

        // If moves to right, increase index, if reach limit of positions, starts of
        // befinning
        if (turn == MoveEnum.RIGHT) {
            index = index == lastIndex ? 0 : index + 1;
        } else {
            // If moves to left, decrease index, if reach init of positions, starts of
            // end
            index = index == 0 ? lastIndex : index - 1;
        }

        return positions.get(index);
    }
}
