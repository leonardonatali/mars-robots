package com.leonardonatali.marsrobots.command;

import javax.websocket.server.PathParam;

import com.leonardonatali.marsrobots.command.dtos.CommandRequestDto;
import com.leonardonatali.marsrobots.command.dtos.CommandResponseDto;
import com.leonardonatali.marsrobots.position.Move;
import com.leonardonatali.marsrobots.position.enums.MoveEnum;
import com.leonardonatali.marsrobots.position.enums.PositionEnum;
import com.leonardonatali.marsrobots.robot.Robot;
import com.leonardonatali.marsrobots.terrain.Terrain;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommandController {
    private final String badRequestMessage = "400 Bad Request";
    private Terrain terrain;
    private Robot robot;

    public CommandController() {
        this.terrain = new Terrain(5, 5);
        this.robot = new Robot();
    }

    @PostMapping(path = "/rest/mars/{command}")
    public ResponseEntity<String> Post(@PathParam(value = "command") CommandRequestDto command) {
        if (!command.isValid()) {
            return ResponseEntity.badRequest().body(this.badRequestMessage);
        }

        this.robot = new Robot();

        String[] args = command.getCommand().split("");

        for (String arg : args) {
            MoveEnum move = Move.fromString(arg);

            if (move == MoveEnum.RIGHT || move == MoveEnum.LEFT) {
                robot.turn(move);
                continue;
            }

            int stepX = 0;
            int stepY = 0;

            if (robot.getPosition() == PositionEnum.NORTH || robot.getPosition() == PositionEnum.SOUTH) {
                stepY = robot.getPosition() == PositionEnum.NORTH ? 1 : -1;
            }

            if (robot.getPosition() == PositionEnum.WEST || robot.getPosition() == PositionEnum.EAST) {
                stepX = robot.getPosition() == PositionEnum.EAST ? 1 : -1;
            }

            if (!this.terrain.isValidCoordinate(robot.getX() + stepX, robot.getY() + stepY)) {
                return ResponseEntity.badRequest().body(this.badRequestMessage);
            }

            robot.setX(robot.getX() + stepX);
            robot.setY(robot.getY() + stepY);
        }

        CommandResponseDto response = new CommandResponseDto(robot.getX(), robot.getY(), robot.getPosition());
        return ResponseEntity.ok(response.toString());
    }

}
