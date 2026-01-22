# TLDR

**Dump database**

```neo4j-admin dump --database=[neo4j] --to=[backup.dump]```

**Load database**

```neo4j-admin load --from=[backup.dump] --database=[neo4j]```

**Set password**

```neo4j-admin set-initial-password [password]```

**Check consistency**

```neo4j-admin check-consistency --database=[neo4j]```

**Import CSV data**

```neo4j-admin import --database=[neo4j] --nodes=[nodes.csv] --relationships=[rels.csv]```

**Show memory recommendations**

```neo4j-admin memrec```

# SYNOPSIS

**neo4j-admin** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Administration command.

**dump**
> Backup database.

**load**
> Restore database.

**set-initial-password**
> Set admin password.

**check-consistency**
> Verify database integrity.

**import**
> Bulk import data.

**--help**
> Display help information.

# DESCRIPTION

**neo4j-admin** administers Neo4j databases. It handles backup, restore, and maintenance.

The tool manages graph databases. Essential for Neo4j operations.

neo4j-admin manages Neo4j database.

# CAVEATS

Requires stopped database for some ops. Admin privileges needed. Version specific.

# HISTORY

neo4j-admin is the **administration tool** for Neo4j graph database, providing maintenance operations.

# SEE ALSO

[neo4j](/man/neo4j)(1), [cypher-shell](/man/cypher-shell)(1)

