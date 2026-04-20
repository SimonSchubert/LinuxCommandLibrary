# TAGLINE

native graph database platform for connected data

# TLDR

**Start Neo4j server**

```neo4j start```

**Stop server**

```neo4j stop```

**Check status**

```neo4j status```

**Run as console (foreground)**

```neo4j console```

**Open Cypher shell**

```cypher-shell```

**Set initial password**

```neo4j-admin dbms set-initial-password [password]```

# SYNOPSIS

**neo4j** _command_ [_options_]

# PARAMETERS

**start**
> Start server in background.

**stop**
> Stop server.

**restart**
> Restart server.

**status**
> Check server status.

**console**
> Run in foreground.

**version**
> Print Neo4j version information and exit.

**help**
> Print usage information for the **neo4j** launcher.

# DESCRIPTION

**Neo4j** is a native graph database platform for connected data. It uses the Cypher query language and stores data as nodes and relationships.

Neo4j excels at queries involving complex relationships that would require expensive joins in relational databases.

# CYPHER EXAMPLES

```cypher
// Create node
CREATE (n:Person {name: 'Alice'})

// Create relationship
MATCH (a:Person), (b:Person)
WHERE a.name = 'Alice' AND b.name = 'Bob'
CREATE (a)-[:KNOWS]->(b)

// Query
MATCH (n:Person)-[:KNOWS]->(m)
RETURN n.name, m.name
```

# CONFIGURATION

```
/etc/neo4j/neo4j.conf
~/.neo4j/neo4j.conf
```

# CAVEATS

Memory-intensive for large graphs. Community edition is single-node only. Requires Java 21 or later (starting with the 2025 calendar-versioned releases). Default endpoints: Neo4j Browser on port **7474**, Bolt protocol on port **7687**. Administrative actions (initial password, dump/load, database create) are handled by **neo4j-admin**, not **neo4j**.

# HISTORY

Neo4j was developed by **Neo4j, Inc.** (originally Neo Technology), with version 1.0 released in **2010**. It pioneered the property graph model.

# SEE ALSO

[cypher-shell](/man/cypher-shell)(1), [redis-cli](/man/redis-cli)(1), [mongosh](/man/mongosh)(1)
