package org.example.executor.impl;

import org.example.client.CacheAdapter;
import org.example.dto.ValCurs;
import org.example.dto.Valute;
import org.example.executor.CommandExecutor;

import javax.xml.bind.JAXBException;
import java.io.IOException;

public class ConvertCommandExecutor implements CommandExecutor {

    private CacheAdapter cacheAdapter;

    public ConvertCommandExecutor(CacheAdapter cacheAdapter) {
        this.cacheAdapter = cacheAdapter;
    }

    @Override
    public String getProcessableCommand() {


        return null;
    }

    @Override
    public String executeCommand(String[] command) {

        ValCurs valCurs = null;
        try {
            valCurs = cacheAdapter.getValCurs();
        } catch (JAXBException | IOException | InterruptedException e1) {
            return "команда не сработала. У нас отловлено исключения";
        }

        String codeFrom = command[1];
        String codeTo = command[2];
        Valute from = null;
        Valute to = null;

        for (int i = 0; i < valCurs.getValute().size(); i++) {
            Valute tmp = valCurs.getValute().get(i);
            if (tmp.getCharCode().equals(codeFrom)) {
                from = tmp;
            }
            if (tmp.getCharCode().equals(codeTo)) {
                to = tmp;
            }
        }

        if (from == null) {
            return "Введенная вами валюта отсутствует" + codeFrom;
        }
        if (to == null) {
            return "Введенная вами валюта отсутствует" + codeTo;
        }

        long summa = Long.parseLong(command[3]);

        double result = ((double)summa)/from.getNominal()*from.getValue()/to.getValue()*to.getNominal();

        return result + codeTo;
    }
}

//решить вопрос с рублем


/* https://www.cbr.ru/scripts/XML_daily.asp? */

//https://www.cbr.ru/scripts/XML_daily.asp?