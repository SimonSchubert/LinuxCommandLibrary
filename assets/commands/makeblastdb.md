# TLDR

**Create nucleotide database**

```makeblastdb -in [sequences.fasta] -dbtype nucl -out [mydb]```

**Create protein database**

```makeblastdb -in [proteins.fasta] -dbtype prot -out [mydb]```

**Add title to database**

```makeblastdb -in [sequences.fasta] -dbtype nucl -title "[My Database]" -out [mydb]```

**Parse sequence IDs**

```makeblastdb -in [sequences.fasta] -dbtype nucl -parse_seqids -out [mydb]```

**Create with taxonomy**

```makeblastdb -in [sequences.fasta] -dbtype nucl -taxid_map [taxid.map] -out [mydb]```

# SYNOPSIS

**makeblastdb** -in _fasta_ -dbtype _type_ [_options_]

# PARAMETERS

**-in** _file_
> Input FASTA file.

**-dbtype** _type_
> nucl (nucleotide) or prot (protein).

**-out** _name_
> Database name prefix.

**-title** _title_
> Database title.

**-parse_seqids**
> Parse sequence identifiers.

**-taxid_map** _file_
> Taxonomy mapping file.

**-hash_index**
> Create hash index.

# DESCRIPTION

**makeblastdb** creates BLAST databases from FASTA sequences. These databases are required for running local BLAST searches with blastn, blastp, blastx, and related programs.

The resulting database consists of multiple files with extensions like .nhr, .nin, .nsq for nucleotide or .phr, .pin, .psq for protein.

# OUTPUT FILES

```
mydb.nhr  # Header
mydb.nin  # Index
mydb.nsq  # Sequences
```

# CAVEATS

Large sequences need significant memory. Database files must stay together. Rebuilding required when source changes.

# HISTORY

makeblastdb is part of **BLAST+**, the successor to legacy BLAST, developed at **NCBI** (National Center for Biotechnology Information).

# SEE ALSO

[blastn](/man/blastn)(1), [blastp](/man/blastp)(1), [blastx](/man/blastx)(1), [tblastn](/man/tblastn)(1)
