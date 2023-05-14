package ostersoft.abw.scanner.cmd_tools;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Component
public class CliExecutor {

    /**
     * Main method to those who want to execute something locally to get the Java-like output.
     */
    public static void main(String... args) {
        CliExecutor cliExecutor = new CliExecutor();
        String result = cliExecutor.executeCmd("nmap 127.0.0.1");
        System.out.println("CMD: ");
        System.out.println(result);
    }

    public String executeCmd(String cmd) {
        ProcessBuilder processBuilder = new ProcessBuilder();
        // Windows
        processBuilder.command("cmd.exe", "/c", cmd);
        // TODO Linux
        StringBuffer sb = new StringBuffer();

        try {

            Process process = processBuilder.start();

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line+"\r\n");
            }

            int exitCode = process.waitFor();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }


}
