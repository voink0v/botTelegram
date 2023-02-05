package org.example.client;

import com.sun.xml.bind.api.JAXBRIContext;
import org.example.dto.ValCurs;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class ValCursClientAdapter {
    private ValCursClient valCursClient;
    private JAXBContext jaxbContext;
    private Unmarshaller unmarshaller;

    public ValCursClientAdapter(ValCursClient valCursClient) throws JAXBException {
        this();
        this.valCursClient = valCursClient;
    }

    public ValCursClientAdapter() throws JAXBException {
        this.jaxbContext = JAXBRIContext.newInstance(ValCurs.class);
        this.unmarshaller = jaxbContext.createUnmarshaller();

    }

    public ValCurs getValCurs (){


    }

}
