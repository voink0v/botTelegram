package org.example.validator.impl;

import org.example.validator.CommandValidator;

public class StartCommandValidator implements CommandValidator {
 private static final int REQUIRED_ARGUMENTS_NUMBER =0; // так же проверяем


    @Override
    public boolean isValid(String[] arguments) {

        if (arguments.length != REQUIRED_ARGUMENTS_NUMBER){
            return false;
        } else {
            validatingCommand(); // как то надо стартануть
        }

    }

    @Override
    public String validatingCommand() {
        return "/start";
    }
}
//123