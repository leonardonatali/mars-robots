package com.leonardonatali.marsrobots.terrain;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TerrainTests {
    private final Terrain terrain = new Terrain(4, 4);

    @Test
    void shouldBeReturnValidCoordinates() {
        assertTrue(this.terrain.isValidCoordinate(0, 0));
    }

    @Test
    void shouldBeReturnInvalidNegativeCoordinates() {
        assertFalse(this.terrain.isValidCoordinate(-1, -2));
    }

    @Test
    void shouldBeReturnInvalidPositiveCoordinates() {
        assertFalse(this.terrain.isValidCoordinate(4, 4));
    }

    @Test
    void shouldBeReturnInvalidPositiveAndNegativeCoordinates() {
        assertFalse(this.terrain.isValidCoordinate(-4, 4));
    }
}
