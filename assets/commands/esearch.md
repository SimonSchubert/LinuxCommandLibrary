# TAGLINE

NCBI Entrez database search utility

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

**esearch** is a command-line tool for performing searches in NCBI's Entrez databases using indexed field queries. It provides programmatic access to major biological databases including PubMed (biomedical literature), GenBank (nucleotide sequences), Protein (protein sequences), and many others.

The tool is part of the NCBI EDirect (Entrez Direct) utilities suite, designed for automated retrieval and processing of biological data. esearch typically serves as the first step in a pipeline, identifying records that match search criteria. Its output is usually piped to other EDirect commands like efetch (to retrieve full records) or elink (to find related data across databases). This enables powerful automation of biological database queries in research workflows.

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
