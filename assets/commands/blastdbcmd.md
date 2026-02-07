# TAGLINE

Extract sequences from BLAST databases

# TLDR

**Get database information**

```blastdbcmd -db [nr] -info```

**List available databases** in a path

```blastdbcmd -list [/path/to/databases] -recursive```

**Extract a sequence** by accession

```blastdbcmd -db [nr] -entry [NP_001234] -out [sequence.fasta]```

**Extract all sequences** from database

```blastdbcmd -db [swissprot] -entry all -out [swissprot.fasta]```

**Extract sequences** from a list file

```blastdbcmd -db [nr] -entry_batch [ids.txt] -out [sequences.fasta]```

**Get sequence in specific format**

```blastdbcmd -db [nr] -entry [NP_001234] -outfmt "%a %t %s"```

**Show BLAST database search path**

```blastdbcmd -show_blastdb_search_path```

**Get taxonomy information**

```blastdbcmd -db [nr] -entry [NP_001234] -outfmt "%a %S %T"```

# SYNOPSIS

**blastdbcmd** [_-db database_] [_-entry id_] [_options_]

# DESCRIPTION

**blastdbcmd** is a utility for extracting sequences and metadata from BLAST databases. It can retrieve individual sequences by accession, extract all sequences, display database statistics, and generate custom reports.

The tool is part of the NCBI BLAST+ suite and works with databases created by **makeblastdb** or downloaded from NCBI.

# PARAMETERS

**-db** _name_
> BLAST database name or path

**-entry** _id_
> Sequence identifier(s) to retrieve; use "all" for entire database

**-entry_batch** _file_
> File containing list of sequence identifiers

**-out** _file_
> Output file (default: stdout)

**-outfmt** _format_
> Custom output format string

**-info**
> Display database information

**-list** _path_
> List databases in specified path

**-recursive**
> Search directories recursively (with -list)

**-show_blastdb_search_path**
> Display BLAST database search paths

**-tax_info**
> Display taxonomy information (requires taxonomy database)

**-range** _start-stop_
> Extract subsequence range

# OUTPUT FORMAT TOKENS

**%a** - Accession
**%t** - Title
**%s** - Sequence
**%l** - Sequence length
**%T** - Taxonomy ID
**%S** - Scientific name
**%L** - Common name

# CAVEATS

Requires pre-formatted BLAST databases. Taxonomy information requires the BLAST taxonomy database to be installed. Large extractions may require significant time and disk space.

# SEE ALSO

[makeblastdb](/man/makeblastdb)(1), [blastn](/man/blastn)(1), [blastp](/man/blastp)(1), [blastx](/man/blastx)(1)
