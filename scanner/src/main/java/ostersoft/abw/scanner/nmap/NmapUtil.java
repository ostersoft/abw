package ostersoft.abw.scanner.nmap;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ostersoft.abw.scanner.cmd_tools.CliExecutor;

@Component
@Log4j2
public class NmapUtil {

    private CliExecutor cliExecutor;

    @Autowired
    NmapUtil(CliExecutor cliExecutor) {
        log.info("Autowired constructor of NmapUtil called on init.");
        this.cliExecutor = cliExecutor;
    }

    public String execNmap() {
        log.info("Execution of NMAP: ");
        return cliExecutor.executeCmd("nmap");
    }

}
