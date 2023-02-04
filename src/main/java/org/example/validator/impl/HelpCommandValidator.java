package org.example.validator.impl;

import org.example.validator.CommandValidator;


//делать от сюда


public class HelpCommandValidator implements CommandValidator {

    private static final int EQUIRED_ARGUMENTS_NUMBER = 0;
    // нам нужен просто первый элемент массива



    @Override
    public boolean isValid(String[] arguments) {
        // todo: грубая ошибка! Класс, занимающийся валидацией выполняет команду!
        //  Это нарушает принцип единой ответственности
        // Правильно будет так: провалидировали команду.
        // Если валидна, то передаём её на исполнение какому-нибудь executor-у
        if (arguments.length == EQUIRED_ARGUMENTS_NUMBER) {

            /*if ("/help" == arguments[EQUIRED_ARGUMENTS_NUMBER]){
                System.out.println("/convert - ковертировать валюту");
                System.out.println("/convertForDate - актуальный курс на сейчас");
                System.out.println("/help - помощь");
                System.out.println("/showAll- показываем все актуальные валюты");
                System.out.println("/start - запуск бота и начала работы");
                System.out.println("Пример работы: ");
                System.out.println("/start");
                System.out.println("/convert usd rub 1000 ");
                System.out.println("меняем валюту usd в рубли по актуальному курсу, наминалом 1000 долларов");

            } else {
                System.out.println("Ввеите /help для просмотра команд");
            }*/





// тут пошел от "равно" что бы сразу вывести список команд и образец записи


            System.out.println("/convert - ковертировать валюту");
            System.out.println("/convertForDate - актуальный курс на сейчас");
            System.out.println("/help - помощь");
            System.out.println("/showAll- показываем все актуальные валюты");
            System.out.println("/start - запуск бота и начала работы");
            System.out.println("Пример работы: ");
            System.out.println("/start");
            System.out.println("/convert usd rub 1000 ");
            System.out.println("меняем валюту usd в рубли по актуальному курсу, наминалом 1000 долларов");

            // todo: много лишних отступов, код не отформатирован, читается с усилием.

        } else {

            System.out.println("Ввеите /help для просмотра команд");


        } // пишем просто, что команда не валидна и ретернем фолс

        // todo: должна быть именно валидация: тру или фолс.
        return false;
    }


    @Override
    public String validatingCommand() {
        return "/help";
    }
}
