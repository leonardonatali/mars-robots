package com.leonardonatali.marsrobots.orientation;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.leonardonatali.marsrobots.position.Orientation;
import com.leonardonatali.marsrobots.position.enums.Move;
import com.leonardonatali.marsrobots.position.enums.Position;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OrientationTests {

    // Clockwise tests
    @Test
    void shouldBeMoveToEastFromNorth() {
        assertTrue(Orientation.nextPosition(Position.NORTH, Move.RIGHT) == Position.EAST);
    }

    @Test
    void shouldBeMoveToSouthFromNorth() {
        Position pos = Position.NORTH;
        pos = Orientation.nextPosition(pos, Move.RIGHT);
        pos = Orientation.nextPosition(pos, Move.RIGHT);

        assertTrue(pos == Position.SOUTH);
    }

    @Test
    void shouldBeMoveToWestFromNorth() {
        Position pos = Position.NORTH;
        pos = Orientation.nextPosition(pos, Move.RIGHT);
        pos = Orientation.nextPosition(pos, Move.RIGHT);
        pos = Orientation.nextPosition(pos, Move.RIGHT);

        assertTrue(pos == Position.WEST);
    }

    @Test
    void shouldBeMoveToNorthFromNorth() {
        Position pos = Position.NORTH;
        pos = Orientation.nextPosition(pos, Move.RIGHT);
        pos = Orientation.nextPosition(pos, Move.RIGHT);
        pos = Orientation.nextPosition(pos, Move.RIGHT);
        pos = Orientation.nextPosition(pos, Move.RIGHT);

        assertTrue(pos == Position.NORTH);
    }

    // Counter clockwise tests
    @Test
    void shouldBeMoveFromNorthToWest() {
        assertTrue(Orientation.nextPosition(Position.NORTH, Move.LEFT) == Position.WEST);
    }

    @Test
    void shouldBeMoveFromWestToSouth() {
        Position pos = Position.NORTH;
        pos = Orientation.nextPosition(pos, Move.LEFT);
        pos = Orientation.nextPosition(pos, Move.LEFT);

        assertTrue(pos == Position.SOUTH);
    }

    @Test
    void shouldBeMoveFromNorthToEast() {
        Position pos = Position.NORTH;
        pos = Orientation.nextPosition(pos, Move.LEFT);
        pos = Orientation.nextPosition(pos, Move.LEFT);
        pos = Orientation.nextPosition(pos, Move.LEFT);

        assertTrue(pos == Position.EAST);
    }

    @Test
    void shouldBeMoveFromNorthToNorth() {
        Position pos = Position.NORTH;
        pos = Orientation.nextPosition(pos, Move.LEFT);
        pos = Orientation.nextPosition(pos, Move.LEFT);
        pos = Orientation.nextPosition(pos, Move.LEFT);
        pos = Orientation.nextPosition(pos, Move.LEFT);

        assertTrue(pos == Position.NORTH);
    }

}