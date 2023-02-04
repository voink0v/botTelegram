package org.example;

import org.example.validator.MessageValidator;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class BotDemo extends TelegramLongPollingBot {

    private static MessageValidator messageValidator;


    public String getBotUsername() {
        return "zver112211bot";
    }

    public String getBotToken() {
        return "5931749957:AAFPbUoP5mJiLt3DQkwBpeeze541hb2uDs0";
    }

    public void onUpdateReceived(Update update) {
      if(messageValidator.isValid(update.getMessage())){

      }


    }


    public void sendMessage (String chatId, String textMessage){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(textMessage);

        try {
            this.execute(sendMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }


}
