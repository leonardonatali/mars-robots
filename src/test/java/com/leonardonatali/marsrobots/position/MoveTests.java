package com.leonardonatali.marsrobots.position;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.leonardonatali.marsrobots.position.enums.MoveEnum;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MoveTests {

    @Test
    void shouldBeReturnUndefinedMove() {
        assertTrue(Move.fromString("") == MoveEnum.UNDEFINED);
    }

    @Test
    void shouldBeReturnValidMoveInLowerCase() {
        assertTrue(Move.fromString("m") == MoveEnum.MOVE);
    }

    @Test
    void shouldBeReturnValidMoveInUpperCase() {
        assertTrue(Move.fromString("L") == MoveEnum.LEFT);
    }
}
