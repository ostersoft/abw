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

