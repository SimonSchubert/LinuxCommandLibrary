# TLDR

**Connect to TigerGraph**

```gsql```

**Run query from file**

```gsql [query.gsql]```

**Run inline query**

```gsql -g [graphname] "[GSQL query]"```

**Specify graph**

```gsql -g [mygraph]```

**Run as user**

```gsql -u [username] -p [password]```

# SYNOPSIS

**gsql** [_options_] [_file_|_query_]

# PARAMETERS

**-g** _graph_
> Graph name to use.

**-u** _user_
> Username.

**-p** _password_
> Password.

**-ip** _host_
> Server IP address.

**--ssl**
> Use SSL connection.

# DESCRIPTION

**GSQL** is the query language and shell for TigerGraph, a graph database. It provides SQL-like syntax for graph queries, data loading, and schema management.

GSQL supports pattern matching, graph algorithms, and procedural extensions for complex graph analytics.

# QUERY EXAMPLE

```gsql
USE GRAPH social

CREATE QUERY findFriends(VERTEX<Person> p) FOR GRAPH social {
  Start = {p};
  Friends = SELECT t FROM Start:s -(Knows:e)- Person:t;
  PRINT Friends;
}

INSTALL QUERY findFriends
RUN QUERY findFriends("person1")
```

# CAVEATS

Requires TigerGraph installation. Query installation needed before running. Syntax differs from standard SQL. Graph schema must be defined first.

# HISTORY

GSQL was developed by **TigerGraph** (formerly GraphSQL), founded by **Yu Xu** in **2012**. TigerGraph focuses on real-time analytics on massive graphs, with GSQL designed for both simple queries and complex graph algorithms.

# SEE ALSO

[neo4j](/man/neo4j)(1), [arangosh](/man/arangosh)(1)
