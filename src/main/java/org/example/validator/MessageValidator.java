package org.example.validator;

import org.telegram.telegrambots.meta.api.objects.Message;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MessageValidator {


    private Map<String, CommandValidator> commandValidatorMap;

    public MessageValidator() {
    }

    public void initialize(List<CommandValidator> validators) {
        Map<String, CommandValidator> commandValidatorMap = new HashMap<>();

        for (int i = 0; validators.size() > i; i++) {
            CommandValidator commandValidator = validators.get(i);
            commandValidatorMap.put(commandValidator.validatingCommand(), commandValidator);
        }

        this.commandValidatorMap = commandValidatorMap;

    }

    public boolean isValid(Message message) {

        if (message.hasText()) {
            String text = message.getText();
            String[] args = text.split(" ");
            CommandValidator commandValidator = this.commandValidatorMap.get(args[0]);
            if (commandValidator == null){
                return false;
            }
            return commandValidator.isValid(args);
        }


        return false;
    }


}
