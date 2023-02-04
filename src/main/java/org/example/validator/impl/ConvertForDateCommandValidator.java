package org.example.validator.impl;

import org.example.validator.CommandValidator;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ConvertForDateCommandValidator implements CommandValidator {

    private static final int REQUIRED_ARGUMENTS_NUMBER = 5;
    private static final int CONVERTABLE_AMOUNT_INDEX = 3;

    private static final int CONVERTABLE_DATE_INDEX = 4;

    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    @Override
    public boolean isValid(String[] arguments) {
        //todo: метод всегда возвращает false
        if (arguments.length  != REQUIRED_ARGUMENTS_NUMBER ) {
            return false;
        }

        try {
            Long.parseLong(arguments [CONVERTABLE_AMOUNT_INDEX]);
        }catch (NumberFormatException e){
            return false;
        }
        // todo: не забывай форматировать код.
        //  Код с одинаковым уровнем вложенности должен иметь одинаковые отступы.
        //  Достаточно вызвать автоформат и убрать лишние пустые строки

                try {
                    LocalDate.parse(arguments [CONVERTABLE_DATE_INDEX], DATE_TIME_FORMATTER);

                }catch (DateTimeParseException e){
                    return false;
                }

        return false;
    }



    @Override
    public String validatingCommand() {
        return "/convertForDate";
    }
}

//dd.mm.yyyy