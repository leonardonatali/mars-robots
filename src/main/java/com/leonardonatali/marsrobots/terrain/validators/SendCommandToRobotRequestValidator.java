package com.leonardonatali.marsrobots.terrain.validators;

import java.util.Arrays;
import java.util.List;

import com.leonardonatali.marsrobots.terrain.dto.SendCommandToRobotRequestDto;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class SendCommandToRobotRequestValidator implements Validator {

    private static final String[] availableArgs = new String[] { "L", "R", "M" };
    private static final List<String> validArgs = Arrays.asList(availableArgs);

    @Override
    public boolean supports(Class<?> clazz) {
        return String.class.equals(clazz);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        SendCommandToRobotRequestDto request = (SendCommandToRobotRequestDto) obj;

        if (!this.checkCommand(request.command)) {
            errors.rejectValue("command",
                    String.format("invalid command only %s commands are available", String.join(", ", availableArgs)));
        }
    }

    private boolean checkCommand(String command) {

        String[] args = command.split("");

        // iterate over command and check every arg
        for (String arg : args) {
            if (!validArgs.contains(arg)) {
                return false;
            }
        }

        return true;
    }
}