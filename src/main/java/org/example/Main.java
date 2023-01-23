package org.example;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class Main {
    public static void main(String[] args) throws TelegramApiException, InterruptedException {

        BotDemo telegram = new BotDemo();

        TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);

        telegramBotsApi.registerBot(telegram);

        System.out.println("Bot registered!");
        while (true) {
            System.out.println("Working......");
            Thread.sleep(Integer.MAX_VALUE);
        }
    }


}