# TLDR

**Start BloodHound GUI**

```bloodhound```

**Start with a specific database**

```bloodhound --database=[path/to/neo4j]```

**Import collected data**

```bloodhound --import=[path/to/data.json]```

**Run with debug logging**

```bloodhound --debug```

**Connect to specific Neo4j instance**

```bloodhound --neo4j-uri=bolt://[localhost:7687]```

# SYNOPSIS

**bloodhound** [_options_]

# PARAMETERS

**--database** _path_
> Path to Neo4j database.

**--import** _file_
> Import JSON data file on startup.

**--neo4j-uri** _uri_
> URI for Neo4j connection.

**--neo4j-user** _user_
> Neo4j username.

**--neo4j-password** _pass_
> Neo4j password.

**--debug**
> Enable debug logging.

**--version**
> Display version information.

# DATA COLLECTION

**SharpHound** (Windows):
```SharpHound.exe -c All```

**BloodHound.py** (Linux):
```bloodhound-python -u [user] -p [pass] -d [domain] -c all```

# DESCRIPTION

**BloodHound** is a security tool that uses graph theory to reveal hidden relationships and attack paths within Active Directory environments. It visualizes complex trust relationships, group memberships, and permissions that attackers could exploit to compromise domain administrators.

The tool consists of two components: collectors (SharpHound for Windows, bloodhound-python for Linux) that enumerate Active Directory objects, and the BloodHound GUI that imports this data into a Neo4j graph database for analysis.

Security teams use BloodHound to identify and remediate dangerous configurations, while penetration testers use it to find privilege escalation paths. Built-in queries find common attack paths like "Shortest Path to Domain Admin" or "Kerberoastable Users."

# CAVEATS

BloodHound is a powerful security tool that requires proper authorization before use. Collecting data from Active Directory may trigger security alerts. The tool shows theoretical attack paths; actual exploitation requires additional steps. Neo4j must be running before starting BloodHound. Large environments may require significant memory for analysis.

# HISTORY

BloodHound was created by **Andy Robbins**, **Rohan Vazarkar**, and **Will Schroeder** at SpecterOps and first presented at **DEF CON 24** in **2016**. It revolutionized Active Directory security assessments by visualizing complex relationships that were previously difficult to analyze manually. The tool is open source and has become an industry standard for AD security assessment.

# SEE ALSO

[neo4j](/man/neo4j)(1), [impacket](/man/impacket)(1), [ldapsearch](/man/ldapsearch)(1)
