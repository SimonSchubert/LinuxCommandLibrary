# TAGLINE

administers Neo4j databases

# TLDR

**Dump a database** to a file (database must be stopped)

```neo4j-admin database dump --to-path=[/backups] [neo4j]```

**Load a database** from a dump file

```neo4j-admin database load --from-path=[/backups] [neo4j]```

**Set the initial admin password**

```neo4j-admin dbms set-initial-password [password]```

**Check database consistency**

```neo4j-admin database check [neo4j]```

**Bulk import CSV data** into a new database

```neo4j-admin database import full --nodes=[nodes.csv] --relationships=[rels.csv] [neo4j]```

**Show memory recommendations** for heap and pagecache

```neo4j-admin server memory-recommendation```

# SYNOPSIS

**neo4j-admin** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Administration command category: database, dbms, or server.

**database dump**
> Dump a database to a single-file archive for offline backup.

**database load**
> Load a database from a dump file.

**database import full**
> Bulk import data from CSV files into a new database.

**database check**
> Check database consistency and integrity.

**dbms set-initial-password**
> Set the initial admin password before first startup.

**server memory-recommendation**
> Print heuristic memory recommendations for heap and pagecache.

**--additional-config** _file_
> Provide additional configuration from a file.

**--expand-commands**
> Allow command expansion in config values.

**--verbose**
> Enable verbose output.

**--help**
> Display help information.

# DESCRIPTION

**neo4j-admin** is the administration tool for Neo4j graph databases. It handles backup and restore (dump/load), database consistency checking, bulk data import, memory configuration recommendations, and initial setup tasks.

In Neo4j 5+, commands are organized into categories: **database** (per-database operations like dump, load, import, check), **dbms** (system-wide operations like setting the initial password), and **server** (server configuration like memory recommendations). Some operations require the database to be stopped first.

# CAVEATS

Some operations (dump, load, import) require the database to be stopped first. Admin privileges are typically required. Command syntax changed significantly between Neo4j 4.x and 5.x; the examples here use Neo4j 5+ syntax.

# HISTORY

neo4j-admin has been part of the Neo4j distribution since its early releases. The command structure was significantly reorganized in **Neo4j 5** (2022), moving from flat commands (e.g., `dump`, `memrec`) to categorized subcommands (e.g., `database dump`, `server memory-recommendation`).

# SEE ALSO

[neo4j](/man/neo4j)(1), [cypher-shell](/man/cypher-shell)(1)

