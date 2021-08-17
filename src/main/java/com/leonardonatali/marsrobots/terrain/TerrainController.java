package com.leonardonatali.marsrobots.terrain;

import com.leonardonatali.marsrobots.robot.Robot;
import com.leonardonatali.marsrobots.terrain.dto.SendCommandToRobotResponseDto;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TerrainController {

    private Robot robot;
    private Terrain terrain;

    private final int terrainWidth = 5;
    private final int terrainLenght = 5;

    public TerrainController() {
        this.robot = new Robot();
        this.terrain = new Terrain(terrainWidth, terrainLenght);
    }

    @PostMapping("/rest/mars/{command}")
    public SendCommandToRobotResponseDto sendCommandToRobot(@PathVariable SendCommandToRobotResponseDto command) {
        // command = new Command(command);
        return new SendCommandToRobotResponseDto();
    }
}
