package org.example.executor.impl;

import org.example.client.CacheAdapter;
import org.example.dto.ValCurs;
import org.example.executor.CommandExecutor;

import javax.xml.bind.JAXBException;
import java.io.IOException;

public class HelpCommandExecutor implements CommandExecutor {

    private CacheAdapter cacheAdapter;

    public HelpCommandExecutor(CacheAdapter cacheAdapter) {


        this.cacheAdapter = cacheAdapter;
    }

    @Override
    public String getProcessableCommand() {
        return null;
    }

    @Override
    public String executeCommand(String[] command)  {





        return
        return null;
    }
}
