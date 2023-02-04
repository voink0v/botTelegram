package org.example.validator.impl;

import org.example.validator.CommandValidator;

public class StartCommandValidator implements CommandValidator {

    // todo: Сделай автоформат!
    private static final int REQUIRED_ARGUMENTS_NUMBER = 0; // так же проверяем


    @Override

    public boolean isValid(String[] arguments) {

        // todo: должна быть только валидация! Ничего стартовать здесь не нужно!
        //  Если код успешно прошёл валидацию, то будет отрабатывать дальнейшая логика, которую мы ещё не написали
        if (arguments.length != REQUIRED_ARGUMENTS_NUMBER) {
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