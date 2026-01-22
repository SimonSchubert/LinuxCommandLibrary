# TLDR

Search pubmed then find **related sequences**

```esearch -db pubmed -query "[query]" | elink -target nuccore```

Search nucleotide then find **related biosamples**

```esearch -db nuccore -query "[query]" | elink -target biosample```

# SYNOPSIS

**elink** [_options_]

# DESCRIPTION

**elink** looks up precomputed neighbors within an NCBI database or finds associated records in other databases. It takes search results from esearch and finds related entries.

Part of the NCBI EDirect utilities for programmatic access to biological databases.

# PARAMETERS

**-target** _database_
> Target database for linked records

**-name** _linkname_
> Specific link name to follow

**-db** _database_
> Source database

**-cmd** _command_
> Entrez link command mode

# CAVEATS

Part of the edirect package from NCBI. Works with piped input from esearch. Requires internet connection.

# SEE ALSO

[esearch](/man/esearch)(1), [einfo](/man/einfo)(1), [efetch](/man/efetch)(1)
