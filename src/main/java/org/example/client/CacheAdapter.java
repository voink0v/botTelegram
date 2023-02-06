package org.example.client;


import org.example.dto.ValCurs;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.time.LocalDateTime;

public class CacheAdapter {
    private ValCursClientAdapter valCursClientAdapter;
    private ValCurs valCurs;
    private LocalDateTime expireDate;


    public ValCurs getValCurs() throws JAXBException, IOException, InterruptedException {

        if (this.valCurs != null && expireDate.isAfter(LocalDateTime.now())) {
            return valCurs;
        }
        valCurs = this.valCursClientAdapter.getValCurs();
        expireDate = LocalDateTime.now().plusSeconds(10);
        return valCurs;
    }

}
