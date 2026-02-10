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

Memory-intensive for large graphs. Community edition single-node only. Requires Java. Default browser UI on port 7474.

# HISTORY

Neo4j was developed by **Neo4j, Inc.** (originally Neo Technology), with version 1.0 released in **2010**. It pioneered the property graph model.

# SEE ALSO

[cypher-shell](/man/cypher-shell)(1), [redis](/man/redis)(1), [mongodb](/man/mongodb)(1)
