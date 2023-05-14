package ostersoft.abw.proc.scan_result;

import lombok.Data;

import java.util.List;

@Data
public class NmapScanResult {

    private String ipAddress;
    private String rDns; //displayed when querying by hostname like nmap localhost
    private String hostname; //displayed when querying by ip address like nmap 127.0.0.1
    private List<NmapScanPort> ports;

}
