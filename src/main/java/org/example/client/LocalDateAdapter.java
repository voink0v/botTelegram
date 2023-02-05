package org.example.client;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateAdapter extends XmlAdapter<String, LocalDate> {
    private DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    @Override
    public LocalDate unmarshal(String s) throws Exception {

        return LocalDate.parse(s, dateTimeFormatter);
    }

    @Override
    public String marshal(LocalDate localDate) throws Exception {

        return dateTimeFormatter.format(localDate);
    }
}
