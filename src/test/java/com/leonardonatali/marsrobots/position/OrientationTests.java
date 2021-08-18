package com.leonardonatali.marsrobots.position;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.leonardonatali.marsrobots.position.enums.MoveEnum;
import com.leonardonatali.marsrobots.position.enums.PositionEnum;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OrientationTests {

    // Clockwise tests
    @Test
    void shouldBeMoveToEastFromNorth() {
        assertTrue(Orientation.nextPosition(PositionEnum.NORTH, MoveEnum.RIGHT) == PositionEnum.EAST);
    }

    @Test
    void shouldBeMoveToSouthFromNorth() {
        PositionEnum pos = PositionEnum.NORTH;
        pos = Orientation.nextPosition(pos, MoveEnum.RIGHT);
        pos = Orientation.nextPosition(pos, MoveEnum.RIGHT);

        assertTrue(pos == PositionEnum.SOUTH);
    }

    @Test
    void shouldBeMoveToWestFromNorth() {
        PositionEnum pos = PositionEnum.NORTH;
        pos = Orientation.nextPosition(pos, MoveEnum.RIGHT);
        pos = Orientation.nextPosition(pos, MoveEnum.RIGHT);
        pos = Orientation.nextPosition(pos, MoveEnum.RIGHT);

        assertTrue(pos == PositionEnum.WEST);
    }

    @Test
    void shouldBeMoveToNorthFromNorth() {
        PositionEnum pos = PositionEnum.NORTH;
        pos = Orientation.nextPosition(pos, MoveEnum.RIGHT);
        pos = Orientation.nextPosition(pos, MoveEnum.RIGHT);
        pos = Orientation.nextPosition(pos, MoveEnum.RIGHT);
        pos = Orientation.nextPosition(pos, MoveEnum.RIGHT);

        assertTrue(pos == PositionEnum.NORTH);
    }

    // Counter clockwise tests
    @Test
    void shouldBeMoveFromNorthToWest() {
        assertTrue(Orientation.nextPosition(PositionEnum.NORTH, MoveEnum.LEFT) == PositionEnum.WEST);
    }

    @Test
    void shouldBeMoveFromWestToSouth() {
        PositionEnum pos = PositionEnum.NORTH;
        pos = Orientation.nextPosition(pos, MoveEnum.LEFT);
        pos = Orientation.nextPosition(pos, MoveEnum.LEFT);

        assertTrue(pos == PositionEnum.SOUTH);
    }

    @Test
    void shouldBeMoveFromNorthToEast() {
        PositionEnum pos = PositionEnum.NORTH;
        pos = Orientation.nextPosition(pos, MoveEnum.LEFT);
        pos = Orientation.nextPosition(pos, MoveEnum.LEFT);
        pos = Orientation.nextPosition(pos, MoveEnum.LEFT);

        assertTrue(pos == PositionEnum.EAST);
    }

    @Test
    void shouldBeMoveFromNorthToNorth() {
        PositionEnum pos = PositionEnum.NORTH;
        pos = Orientation.nextPosition(pos, MoveEnum.LEFT);
        pos = Orientation.nextPosition(pos, MoveEnum.LEFT);
        pos = Orientation.nextPosition(pos, MoveEnum.LEFT);
        pos = Orientation.nextPosition(pos, MoveEnum.LEFT);

        assertTrue(pos == PositionEnum.NORTH);
    }

}