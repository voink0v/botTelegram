package org.example.validator.impl;

import org.example.BotDemo;
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



        } else {

            System.out.println("Ввеите /help для просмотра команд");

        } // пишем просто, что команда не валидна и ретернем фолс

        // todo: должна быть именно валидация: тру или фолс.
        return false;
    }
        public static String HelpCommand (String chatId){

        String help = "/convert - ковертировать валюту \n/convertForDate - актуальный курс на сейчас\n/help - помощь\n" +
                "/showAll- показываем все актуальные валюты\n/start - запуск бота и начала работы\nПример работы:\n" +
                "/start\nconvert usd rub 1000\nменяем валюту usd в рубли по актуальному курсу, наминалом 1000 долларов ";
            /*System.out.println("/convert - ковертировать валюту");
            System.out.println("/convertForDate - актуальный курс на сейчас");
            System.out.println("/help - помощь");
            System.out.println("/showAll- показываем все актуальные валюты");
            System.out.println("/start - запуск бота и начала работы");
            System.out.println("Пример работы: ");
            System.out.println("/start");
            System.out.println("/convert usd rub 1000 ");
            System.out.println("меняем валюту usd в рубли по актуальному курсу, наминалом 1000 долларов");*/

            BotDemo botDemo = new BotDemo();
            botDemo.sendMessage(chatId, help);

}



    @Override
    public String validatingCommand() {
        return "/help";
    }
}
