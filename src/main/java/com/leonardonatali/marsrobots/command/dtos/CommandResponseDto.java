package com.leonardonatali.marsrobots.command.dtos;

import com.leonardonatali.marsrobots.position.Position;
import com.leonardonatali.marsrobots.position.enums.PositionEnum;

public class CommandResponseDto {
    private int x;
    private int y;
    private PositionEnum position;

    public CommandResponseDto(int x, int y, PositionEnum position) {
        this.x = x;
        this.y = y;
        this.position = position;
    }

    @Override
    public String toString() {
        return String.format("(%d, %d, %s)", this.x, this.y, Position.toString(this.position));
    }
}
