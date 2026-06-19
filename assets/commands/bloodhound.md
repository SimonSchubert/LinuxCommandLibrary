# TAGLINE

Visualize Active Directory attack paths

# TLDR

**Start the BloodHound GUI** (legacy Electron app)

```bloodhound```

**Start without the Chromium sandbox** (common workaround on modern Linux)

```bloodhound --no-sandbox```

**Disable GPU acceleration** if the window renders incorrectly

```bloodhound --no-sandbox --disable-gpu```

After launch, log in to the Neo4j database and use the GUI "Upload Data" button to import the JSON or zip produced by a collector.

# SYNOPSIS

**bloodhound** [_electron-options_]

# DESCRIPTION

**BloodHound** is a security tool that uses graph theory to reveal hidden relationships and attack paths within Active Directory and Azure environments. It visualizes complex trust relationships, group memberships, and permissions that attackers could exploit to compromise domain administrators.

The tool consists of two parts: collectors (SharpHound for Windows, bloodhound-python for Linux) that enumerate directory objects, and the BloodHound application that imports this data into a Neo4j graph database for analysis.

The **bloodhound** command described here launches the legacy Electron desktop GUI. It is a graphical client and takes no BloodHound-specific command-line flags: databases and credentials are configured in the login screen, and collected data is imported through the GUI. The legacy edition is deprecated. The actively maintained successor, BloodHound Community Edition (BHCE), ships as a web application deployed with Docker Compose (or the bloodhound-cli helper) rather than as a standalone command.

Security teams use BloodHound to identify and remediate dangerous configurations, while penetration testers use it to find privilege escalation paths. Built-in queries find common attack paths like "Shortest Path to Domain Admin" or "Kerberoastable Users."

# CAVEATS

BloodHound is a powerful security tool that requires proper authorization before use. Collecting data from Active Directory may trigger security alerts. The tool shows theoretical attack paths; actual exploitation requires additional steps. The legacy GUI requires a running Neo4j instance, configured at the login screen. On modern Linux desktops the Electron app often needs **--no-sandbox** to start. Large environments may require significant memory for analysis. The legacy edition is no longer maintained; new deployments should use BloodHound Community Edition.

# HISTORY

BloodHound was created by **Andy Robbins**, **Rohan Vazarkar**, and **Will Schroeder** at SpecterOps and first presented at **DEF CON 24** in **2016**. It revolutionized Active Directory security assessments by visualizing complex relationships that were previously difficult to analyze manually. The tool is open source and has become an industry standard for AD security assessment.

# SEE ALSO

[bloodhound-python](/man/bloodhound-python)(1), [neo4j](/man/neo4j)(1), [impacket](/man/impacket)(1), [ldapsearch](/man/ldapsearch)(1)

# RESOURCES

```[Source code](https://github.com/SpecterOps/BloodHound)```

```[Homepage](https://bloodhound.specterops.io/)```

<!-- verified: 2026-06-19 -->
