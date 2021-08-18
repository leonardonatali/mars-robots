package com.leonardonatali.marsrobots.command;

import javax.websocket.server.PathParam;

import com.leonardonatali.marsrobots.command.dtos.CommandRequestDto;
import com.leonardonatali.marsrobots.robot.Robot;
import com.leonardonatali.marsrobots.terrain.Terrain;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommandController {
    private Terrain terrain;
    private Robot robot;

    public CommandController() {
        this.terrain = new Terrain(5, 5);
        this.robot = new Robot();
    }

    @PostMapping(path = "/rest/mars/{command}")
    public ResponseEntity<String> Post(@PathParam(value = "command") CommandRequestDto command) {
        if (!command.isValid()) {
            return ResponseEntity.badRequest().body("400 Bad request");
        }

        return ResponseEntity.ok("Ok");
    }

}
