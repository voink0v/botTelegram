package org.example.validator.impl;

import org.example.validator.CommandValidator;

public class ShowAllCommandValidator implements CommandValidator {

    private static final int REQUIRED_ARGUMENTS_NUMBER =0;

    // тут так же надо посмотреть что пользователь ввел именно 1 аргумент и показать все валюты

    // как то надо показать все валюты наверное через апи


    @Override
    public boolean isValid(String[] arguments) {
        // todo: Возвращаем результат проверки - валидна ли комманда.
        //   Никаких действий больше не нужно делать здесь!
        if (arguments.length != REQUIRED_ARGUMENTS_NUMBER){
            return false;
        } else {
            // тут наверное ссылочка на апи
        }

        // todo: У тебя есть только одно условие, при котором поманда будет невалидна (фолс)
        //    Во всех остальных случаях - тру. Возвращай в конце тру
        // return false; не знаю, надо ли возвращать тут тру (или фолс)))))))
    }

    @Override
    public String validatingCommand() {
        return "/showAll";
    }
}
//