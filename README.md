# abw
<h2>ABW is a Network Security Scanner designed for scalability and modularity.</h2>

ABW stands for Agencja Bezpieczeństwa Wewnętrznego which translates from Polish into Internal Security Agency.

<h4>Tech stack:</h4>

<ul>
   <li>Backend: Java + SpringBoot</li>
<li>Frontend: React</li>
<li>OS Tooling: Linux</li>
<li>Distribution: Docker Image</li>
<li>Build Too: Jenkins</li>
<li>Database - to be selected</li>
<li>Message Queue - RabbitMq over Docker</li>
</ul>

<h4>Development:</h4>

They say every project can be done with infinite number of interns, let's try, and also let's try to get them from TikTok.

<h4>Code Style:</h4>

Microservice oriented with dedicated and independent single-purpose modules.
Allow code/object redundancy or duplication in favor of total modules independence.
Less is always better, forget all you learned, just try to keep it simple at all cost.

<h4>Documentation:</h4>

Easy - not existing but README files.

<h4>Development setup:</h4>

1. Download OpenJDK: https://download.java.net/java/GA/jdk17.0.2/dfd4a8d0985749f896bed50d7138ee7f/8/GPL/openjdk-17.0.2_windows-x64_bin.zip<br />
   a) unzip at C:\java\<br />
   b) set JAVA_HOME as C:\java\jdk-17.0.2 (hint: hit windows and type: edit system environmental variables)<br />
   c) add to PATH: C:\java\jdk-17.0.2\bin (hint: same as above)<br />
   d) verify: cmd -> java --version:<br />
   C:\Users\user>java --version<br />
  openjdk 17.0.2 2022-01-18<br />
  OpenJDK Runtime Environment (build 17.0.2+8-86)<br />
  OpenJDK 64-Bit Server VM (build 17.0.2+8-86, mixed mode, sharing)<br />
   
2. Download Docker: https://www.docker.com/products/docker-desktop/<br />
   a) it might requiere to update Linux Subsystem for Windows: execute in cmd: wsl --update<br />
   b) Install RabbitMq: docker pull rmohr/activemq <br />
3. Download IntelliJ IDEA: https://www.jetbrains.com/idea/download/download-thanks.html?platform=windows&code=IIC<br />
4. Download nmap for Windows: https://nmap.org/download.html#windows<br />
   a) ensure "nmap localhost" cmd works.<br />
   
<h4>Architecture:</h4>

<h4>Phase 1:</h4>

<ul>
<li>GUI MODULE <React + Java>: [_____] : Enter IP to Scan [SCAN NOW] : button --> Send scan request to MQ (toScan) [ip]</li>

<li>SCANNING MODULE <Java> : Listen to MQ (toScan). Execute command - nmap ip -> send results to MQ (toProcess) [ip,result]</li>

<li>PROCESSING MODULE <Java> : Listen to MQ (toProcess). Format nmap output -> send result to MQ (toDisplay) [json]</li>
   </ul>

JSON ARRAY FIELDS - [json]:<br />
[ip : { <br />
port: number [0-65535] <br />
type: enum [tcp/udp... possible more] <br />
service: string <br />
}] <br />
*ip is the scanned ip address. <br />

