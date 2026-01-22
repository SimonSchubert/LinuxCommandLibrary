# TLDR

**Connect to Neo4j** with default settings

```cypher-shell```

**Connect with credentials**

```cypher-shell -u [username] -p [password]```

**Connect to specific address**

```cypher-shell -a [bolt://localhost:7687]```

**Execute a query** and exit

```cypher-shell "MATCH (n) RETURN count(n)"```

**Execute queries from file**

```cypher-shell -f [queries.cypher]```

**Connect to specific database**

```cypher-shell -d [neo4j]```

**Output in plain format**

```cypher-shell --format plain "MATCH (n) RETURN n LIMIT 5"```

# SYNOPSIS

**cypher-shell** [_options_] [_query_]

# PARAMETERS

**-a** _ADDRESS_, **--address** _ADDRESS_
> Connection address (default: bolt://localhost:7687).

**-u** _USER_, **--username** _USER_
> Neo4j username.

**-p** _PASSWORD_, **--password** _PASSWORD_
> Neo4j password.

**-d** _DATABASE_, **--database** _DATABASE_
> Database to connect to.

**-f** _FILE_, **--file** _FILE_
> Execute Cypher queries from file.

**--format** _FORMAT_
> Output format: auto, verbose, plain.

**--encryption** _MODE_
> Encryption mode: true, false, default.

**--version**
> Display version information.

**--help**
> Display help information.

# DESCRIPTION

**cypher-shell** is the command-line interface for executing Cypher queries against Neo4j graph databases. Cypher is Neo4j's declarative query language for creating, reading, updating, and deleting graph data.

In interactive mode, it provides a REPL environment for exploring graph data, with command history and basic editing. Non-interactive mode executes queries and returns results, useful for scripting and automation.

The shell supports transaction management, allowing multiple statements to be executed atomically. It can output results in various formats suitable for human reading or machine parsing.

# CAVEATS

Passwords passed on command line may be visible in process listings. Large result sets can consume significant memory. Some Cypher features require specific Neo4j versions. Encrypted connections require proper certificate configuration.

# HISTORY

cypher-shell was introduced by Neo4j as part of their database tooling. It replaced the older neo4j-shell, providing better support for modern Neo4j features and the Bolt protocol introduced in **Neo4j 3.0** in **2016**.

# SEE ALSO

[neo4j](/man/neo4j)(1), [neo4j-admin](/man/neo4j-admin)(1)
