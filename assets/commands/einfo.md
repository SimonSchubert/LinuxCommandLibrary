# TLDR

**Print** all database names

```einfo -dbs```

**Print** all information of a database in XML format

```einfo -db [protein]```

**Print** all fields of a database

```einfo -db [nuccore] -fields```

**Print** all links of a database

```einfo -db [protein] -links```

# SYNOPSIS

**einfo** [_options_]

# DESCRIPTION

**einfo** provides information about NCBI Entrez databases. It shows the number of records indexed in each field, last update dates, and available cross-database links.

Part of the NCBI EDirect utilities for programmatic access to biological databases.

# PARAMETERS

**-dbs**
> List all database names

**-db** _database_
> Specify database to query

**-fields**
> Show available search fields

**-links**
> Show available database links

# CAVEATS

Part of the edirect package from NCBI. Requires internet connection. Output is in XML format by default.

# SEE ALSO

[esearch](/man/esearch)(1), [elink](/man/elink)(1), [efetch](/man/efetch)(1)
