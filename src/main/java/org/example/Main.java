package org.example;

import org.example.client.ValCursClient;
import org.example.client.ValCursClientAdapter;
import org.example.dto.ValCurs;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import javax.xml.bind.JAXBException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws TelegramApiException, InterruptedException, JAXBException, IOException {

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