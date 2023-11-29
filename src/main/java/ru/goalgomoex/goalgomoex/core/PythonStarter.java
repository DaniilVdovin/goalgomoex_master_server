package ru.goalgomoex.goalgomoex.core;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class PythonStarter {
    public static String Start(String file){
        String fetching = "python3 "+ "/Users/daniilvdovin/Documents/goalgomoex/src/main/resources/static/scripts/" + file;
        String[] MacOScommandToExecute = new String[]{"/bin/sh", "-c", fetching, "echo work"};
        String[] WinScommandToExecute = new String[]{"cmd.exe", "/c", fetching};
        try {
            Process process = Runtime.getRuntime()
                    //MaxOS
                    .exec(MacOScommandToExecute);
                    //Win
                    //.exec(WinScommandToExecute);
            int exitCode = process.waitFor();
            int exitValue = process.exitValue();
            System.out.println("Finished with code: " + exitCode);
            System.out.println("Finished with exitValue: " + exitValue);
            String out = new String(process.getInputStream().readAllBytes(), StandardCharsets.UTF_8);
            System.out.println(out);
            return out;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
