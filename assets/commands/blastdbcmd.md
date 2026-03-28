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
> Output file (default: stdout).

**-outfmt** _format_
> Custom output format string using % tokens.

**-info**
> Display database information (type, number of sequences, total length, date).

**-list** _path_
> List databases in specified path.

**-recursive**
> Search directories recursively (with -list).

**-show_blastdb_search_path**
> Display BLAST database search paths.

**-dbtype** _type_
> Database type: nucl (nucleotide) or prot (protein). Needed when both types share a name.

**-target_only**
> Retrieve only target sequences (no redundant group members).

**-tax_info**
> Display taxonomy information (requires taxonomy database).

**-range** _start-stop_
> Extract subsequence range (1-based, inclusive).

**-strand** _strand_
> Strand to retrieve: plus or minus (nucleotide only).

**-line_length** _N_
> Line length for FASTA output (default: 80). Use 0 for single-line sequences.

**-long_seqids**
> Use long sequence identifiers including database and accession.version.

# OUTPUT FORMAT TOKENS

**%a** - Accession
**%g** - GI number
**%o** - OID (ordinal ID)
**%t** - Title (definition line)
**%s** - Sequence data
**%l** - Sequence length
**%T** - Taxonomy ID
**%S** - Scientific name
**%L** - Common name
**%m** - Masking data
**%h** - Hash value
**%e** - Membership integer

# ENVIRONMENT

**BLASTDB**
> Colon-separated list of directories to search for BLAST databases.

# CAVEATS

Requires pre-formatted BLAST databases created by **makeblastdb** or downloaded from NCBI. Taxonomy information requires the BLAST taxonomy database (taxdb.btd/bti) to be installed. Large extractions may require significant time and disk space. The **-range** option uses 1-based inclusive coordinates.

# SEE ALSO

[makeblastdb](/man/makeblastdb)(1), [blastn](/man/blastn)(1), [blastp](/man/blastp)(1), [blastx](/man/blastx)(1), [tblastn](/man/tblastn)(1)
