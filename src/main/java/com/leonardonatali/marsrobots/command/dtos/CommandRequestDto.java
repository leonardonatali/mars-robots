package com.leonardonatali.marsrobots.command.dtos;

import com.leonardonatali.marsrobots.position.Move;
import com.leonardonatali.marsrobots.position.enums.MoveEnum;

public class CommandRequestDto {

    private String command;

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public boolean isValid() {

        String[] args = this.command.split("");

        for (String arg : args) {
            MoveEnum move = Move.fromString(arg);
            if (move == MoveEnum.UNDEFINED) {
                return false;
            }
        }

        return true;
    }
}
