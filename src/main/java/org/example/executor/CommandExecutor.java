package org.example.executor;

public interface CommandExecutor  {
    String getProcessableCommand();
    String executeCommand (String [] command);

}


