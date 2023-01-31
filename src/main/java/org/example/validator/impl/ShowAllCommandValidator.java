package org.example.validator.impl;

import org.example.validator.CommandValidator;

public class ShowAllCommandValidator implements CommandValidator {
    @Override
    public boolean isValid(String[] arguments) {
        return false;
    }

    @Override
    public String validatingCommand() {
        return "/showAll";
    }
}
