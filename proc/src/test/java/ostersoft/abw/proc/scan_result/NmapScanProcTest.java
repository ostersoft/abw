package ostersoft.abw.proc.scan_result;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NmapScanProcTest {


    @Test
    public void testNmapScanProcParser001() {
        NmapScanProc nsp = new NmapScanProc();
        NmapScanResult result = nsp.parseStringToNmapScanResult(NMAP_SAMPLE_001);

//        assertEquals(" kubernetes.docker.internal", result.getRDns());
//        assertEquals("localhost", result.getHostname());
//        assertEquals(135,result.getPorts().get(0));

    }

    @Test
    public void testNmapScanProcParser002() {
        NmapScanProc nsp = new NmapScanProc();
        NmapScanResult result = nsp.parseStringToNmapScanResult(NMAP_SAMPLE_002);

//        assertEquals("kubernetes.docker.internal", result.getRDns());
//        assertEquals("kubernetes.docker.internal", result.getHostname());
//        assertEquals(135,result.getPorts().get(0));

    }


    //nmap localhost
    static String NMAP_SAMPLE_001 = "Starting Nmap 7.93 ( https://nmap.org ) at 2023-05-14 21:04 Central European Summer Time\n" + "Nmap scan report for localhost (127.0.0.1)\n" + "Host is up (0.00019s latency).\n" + "Other addresses for localhost (not scanned): ::1\n" + "rDNS record for 127.0.0.1: kubernetes.docker.internal\n" + "Not shown: 994 closed tcp ports (reset)\n" + "PORT     STATE SERVICE\n" + "135/tcp  open  msrpc\n" + "445/tcp  open  microsoft-ds\n" + "1042/tcp open  afrog\n" + "1043/tcp open  boinc\n" + "2869/tcp open  icslap\n" + "5357/tcp open  wsdapi\n" + "\n" + "Nmap done: 1 IP address (1 host up) scanned in 0.22 seconds\n" + "\n" + "\n" + "BUILD SUCCESSFUL in 1s\n" + "3 actionable tasks: 2 executed, 1 up-to-date\n" + "21:04:00: Execution finished ':scanner:CliExecutor.main()'.\n";

    //nmap 127.0.0.1
    static String NMAP_SAMPLE_002 = "Starting Nmap 7.93 ( https://nmap.org ) at 2023-05-14 21:37 Central European Summer Time\n" + "Nmap scan report for kubernetes.docker.internal (127.0.0.1)\n" + "Host is up (0.000042s latency).\n" + "Not shown: 994 closed tcp ports (reset)\n" + "PORT     STATE SERVICE\n" + "135/tcp  open  msrpc\n" + "445/tcp  open  microsoft-ds\n" + "1042/tcp open  afrog\n" + "1043/tcp open  boinc\n" + "2869/tcp open  icslap\n" + "5357/tcp open  wsdapi\n" + "\n" + "Nmap done: 1 IP address (1 host up) scanned in 0.18 seconds\n" + "\n" + "\n" + "BUILD SUCCESSFUL in 1s\n" + "3 actionable tasks: 2 executed, 1 up-to-date\n" + "21:37:12: Execution finished ':scanner:CliExecutor.main()'.\n";

}