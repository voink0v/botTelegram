package org.example.validator.impl;

import org.example.validator.CommandValidator;

public class ConvertCommandValidator implements CommandValidator {

    private static final int REQUIRED_ARGUMENTS_NUMBER = 4;
    private static final int CONVERTABLE_AMOUNT_INDEX = 3;

    @Override
    public boolean isValid(String[] arguments) {
        if (arguments.length != REQUIRED_ARGUMENTS_NUMBER) {

            return false;
        }

        try {
            Long.parseLong(arguments[CONVERTABLE_AMOUNT_INDEX]);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }


    @Override
    public String validatingCommand() {
        return "/convert";
    }

}





