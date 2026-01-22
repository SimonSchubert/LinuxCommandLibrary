# TLDR

Search **pubmed** for a query

```esearch -db pubmed -query "[selective serotonin reuptake inhibitor]"```

Search **protein** database using regex

```esearch -db [protein] -query '[Escherichia*]'```

Search **nucleotide** database with field qualifiers

```esearch -db nuccore -query "[insulin [PROT] AND rodents [ORGN]]"```

Display **help**

```esearch [-h|-help]```

# SYNOPSIS

**esearch** [_options_]

# DESCRIPTION

**esearch** performs new Entrez searches using terms in indexed fields. It queries NCBI biological databases like pubmed, protein, and nucleotide.

Part of the NCBI EDirect utilities for programmatic access to biological databases.

# PARAMETERS

**-db** _database_
> Database to search

**-query** _string_
> Search query with optional field qualifiers

**-h, -help**
> Display help

# CAVEATS

Part of the edirect package from NCBI. Requires internet connection. Output is typically piped to elink or efetch for further processing.

# SEE ALSO

[elink](/man/elink)(1), [efetch](/man/efetch)(1), [einfo](/man/einfo)(1)
