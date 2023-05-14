package ostersoft.abw.proc.scan_result;

import lombok.Data;

@Data
public class NmapScanPort {

    private int port;
    private String type;
    private String state;
    private String service;


}
