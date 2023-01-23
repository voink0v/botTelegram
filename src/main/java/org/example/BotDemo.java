package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class BotDemo extends TelegramLongPollingBot {


    public String getBotUsername() {
        return "zver112211bot";
    }

    public String getBotToken() {
        return "5931749957:AAFPbUoP5mJiLt3DQkwBpeeze541hb2uDs0";
    }

    public void onUpdateReceived(Update update) {
        System.out.println("Сообщение получено");
        if (update.hasMessage()) {
            Message message = update.getMessage();
            if (message.hasText()) {
                System.out.println(message.getText());
                SendMessage sendMessage = new SendMessage();
                sendMessage.setChatId(String.valueOf(message.getChatId()));
                sendMessage.setText("Принято");
                try {
                    this.execute(sendMessage);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }

        }


    }
}
