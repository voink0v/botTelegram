package org.example.dto;


import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name = "Valute")
public class Valute {
    @XmlElement(name = "NumCode")
    private int numCode;
    @XmlElement(name = "CharCode")
    private String charCode;
    @XmlElement(name = "Nominal")
    private int nominal;
    @XmlElement(name = "Name")
    private String name;
    @XmlElement(name = "Value")
    private double value;
    @XmlAttribute (name = "ID")
    private String id;

    public Valute() {

    }

    public Valute(int numCode, String charCode, int nominal, String name, double value, String id) {
        this.numCode = numCode;//5 "" 6.L
        this.charCode = charCode;
        this.nominal = nominal;
        this.name = name;
        this.value = value;
        this.id = id;
    }

    @XmlTransient
    public int getNumCode() {
        return numCode;
    }

    public void setNumCode(int numCode) {
        this.numCode = numCode;
    }

    @XmlTransient
    public String getCharCode() {
        return charCode;
    }

    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }

    @XmlTransient
    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    @XmlTransient
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlTransient
    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @XmlTransient
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}


