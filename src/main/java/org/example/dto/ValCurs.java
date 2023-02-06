package org.example.dto;

import org.example.client.LocalDateAdapter;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;
import java.util.List;

@XmlRootElement(name = "ValCurs")
public class ValCurs {
    @XmlElement(name = "Valute")
    private List<Valute> valute;
    @XmlAttribute(name = "Date")
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    private LocalDate date;
    @XmlAttribute(name = "name")
    private String name;

    @XmlTransient
    private List<org.example.dto.Valute> getValute() {
        return valute;
    }


    public void setValute(List<org.example.dto.Valute> valute) {
        this.valute = valute;
    }

    @XmlTransient
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @XmlTransient
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
