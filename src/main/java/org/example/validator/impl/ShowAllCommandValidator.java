package org.example.validator.impl;

import org.example.validator.CommandValidator;

public class ShowAllCommandValidator implements CommandValidator {

    private static final int REQUIRED_ARGUMENTS_NUMBER =0;

    // тут так же надо посмотреть что пользователь ввел именно 1 аргумент и показать все валюты

    // как то надо показать все валюты наверное через апи


    @Override
    public boolean isValid(String[] arguments) {
        if (arguments.length != REQUIRED_ARGUMENTS_NUMBER){
            return false;
        } else {
            // тут наверное ссылочка на апи
        }


        // return false; не знаю, надо ли возвращать тут тру (или фолс)))))))
    }

    @Override
    public String validatingCommand() {
        return "/showAll";
    }
}
