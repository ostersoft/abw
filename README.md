# abw
ABW is a Network Security Scanner designed for scalability and modularity.

ABW stands for Agencja Bezpieczeństwa Wewnętrznego which translates from Polish into Internal Security Agency.

Tech stack:

Backend: Java + SpringBoot
Frontend: React
OS Tooling: Linux
Distribution: Docker Image
Build Too: Jenkins
Database - to be selected
Message Queue - to be selected

Development:

They say every project can be done with infinite number of interns, let's try, and also let's try to get them from TikTok.

Code Style:

Microservice oriented with dedicated and independent single-purpose modules.
Allow code/object redundancy or duplication in favor of total modules independence.
Less is always better, forget all you learned, just try to keep it simple at all cost.

Documentation:

Easy - not existing but README files.

Development setup:

1. Download OpenJDK: https://download.java.net/java/GA/jdk17.0.2/dfd4a8d0985749f896bed50d7138ee7f/8/GPL/openjdk-17.0.2_windows-x64_bin.zip
   a) unzip at C:\java\
   b) set JAVA_HOME as C:\java\jdk-17.0.2 (hint: hit windows and type: edit system environmental variables)
   c) add to PATH: C:\java\jdk-17.0.2\bin (hint: same as above)
   d) verify: cmd -> java --version:
   C:\Users\user>java --version
  openjdk 17.0.2 2022-01-18
  OpenJDK Runtime Environment (build 17.0.2+8-86)
  OpenJDK 64-Bit Server VM (build 17.0.2+8-86, mixed mode, sharing)
   
2. Download Docker: https://www.docker.com/products/docker-desktop/
3. Download IntelliJ IDEA: https://www.jetbrains.com/idea/download/download-thanks.html?platform=windows&code=IIC
4. Download nmap for Windows: https://nmap.org/download.html#windows
   a) ensure "nmap localhost" cmd works.
Architecture:

Phase 1:

GUI MODULE <React + Java>: [_____] : Enter IP to Scan [SCAN NOW] : button --> Send scan request to MQ (toScan) [ip]

SCANNING MODULE <Java> : Listen to MQ (toScan). Execute command - nmap ip -> send results to MQ (toProcess) [ip,result]

PROCESSING MODULU <Java> : Listen to MQ (toProcess). Format nmap output -> send result to MQ (toDisplay) [json]

GUI MODULE 2 <React + Java>: List to MQ (toDisplay). Display te result as table with all the fields from the [json]

JSON ARRAY FIELDS - [json]:
[ip : {
port: number [0-65535]
type: enum [tcp/udp... possible more]
service: string
}]
*ip is the scanned ip address.

