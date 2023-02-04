package org.example.validator.impl;

import org.example.validator.CommandValidator;

public class StartCommandValidator implements CommandValidator {

    private static final int REQUIRED_ARGUMENTS_NUMBER = 1; // так же проверяем

    @Override
    public boolean isValid(String[] arguments) {

        if (arguments.length == REQUIRED_ARGUMENTS_NUMBER) {
            return true;
        }
        return false;
    }

    @Override
    public String validatingCommand() {
        return "/start";
    }
}
