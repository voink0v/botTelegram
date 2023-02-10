package org.example;

import org.example.executor.CommandExecutor;
import org.example.validator.MessageValidator;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.HashMap;
import java.util.Map;

public class BotDemo extends TelegramLongPollingBot {

    private static MessageValidator messageValidator;

    private Map <String, CommandExecutor> commandsExecutors;

    public BotDemo(Map<String, CommandExecutor> commandsExecutors) {
        this.commandsExecutors = commandsExecutors;

        Map <String , CommandExecutor> commandExecutorMap = new HashMap<>();

        //

    }

    public BotDemo() {

    }

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
