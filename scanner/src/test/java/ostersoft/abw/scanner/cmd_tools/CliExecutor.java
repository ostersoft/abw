package ostersoft.abw.scanner.cmd_tools;

import org.springframework.boot.test.context.TestConfiguration;

/**
 * This class mimics the CliExecutor class in order not to execute real cmds during test runs.
 */
@TestConfiguration
public class CliExecutor  {
    public String executeCmd(String cmd) {
        return "expected output";
    }

    /**
     * Main method for testing/debugging the code locally.
     */


}