package org.example.client;

import org.example.dto.ValCurs;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class ValCursClientAdapter {
    private ValCursClient valCursClient;
    private JAXBContext jaxbContext;
    private Unmarshaller unmarshaller;

    public ValCursClientAdapter(ValCursClient valCursClient) throws JAXBException {
        this();
        this.valCursClient = valCursClient;
    }

    public ValCursClientAdapter() throws JAXBException {
        this.jaxbContext = JAXBContext.newInstance(ValCurs.class);
        this.unmarshaller = jaxbContext.createUnmarshaller();
    }

    public ValCurs getValCurs() throws IOException, InterruptedException, JAXBException {
        String rawValCurs = valCursClient.getRawValCurs();
        BufferedReader bufferedReader = new BufferedReader(new StringReader(rawValCurs));
        StreamSource streamSource = new StreamSource(bufferedReader);
        return ((ValCurs) unmarshaller.unmarshal(streamSource));
    }
}
