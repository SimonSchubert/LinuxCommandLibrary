# TAGLINE

Translated nucleotide to nucleotide search

# TLDR

**Search query against database**

```tblastx -query [sequence.fasta] -db [database] -out [results.txt]```

**Search with specific output format**

```tblastx -query [sequence.fasta] -db [database] -outfmt [6]```

**Search against local FASTA file**

```tblastx -query [query.fasta] -subject [subject.fasta]```

**Set e-value threshold**

```tblastx -query [sequence.fasta] -db [database] -evalue [1e-5]```

**Use multiple threads**

```tblastx -query [sequence.fasta] -db [database] -num_threads [4]```

**Limit number of alignments**

```tblastx -query [sequence.fasta] -db [database] -max_target_seqs [10]```

**Display help**

```tblastx -help```

# SYNOPSIS

**tblastx** [_options_]

# PARAMETERS

**-query** _file_
> Input FASTA file with nucleotide query sequence(s).

**-db** _database_
> BLAST database name to search.

**-subject** _file_
> Subject sequence file for pairwise comparison.

**-out** _file_
> Output file (default: stdout).

**-outfmt** _format_
> Output format (0=pairwise, 6=tabular, 7=tabular with comments, etc.).

**-evalue** _value_
> Expectation value threshold (default: 10).

**-max_target_seqs** _n_
> Maximum number of aligned sequences to keep.

**-num_threads** _n_
> Number of CPU threads to use.

**-query_gencode** _code_
> Genetic code for query translation.

**-db_gencode** _code_
> Genetic code for database translation.

**-strand** _strand_
> Query strand(s) to search: both, plus, minus.

**-soft_masking** _bool_
> Apply soft masking to query.

**-seg** _value_
> Filter query with SEG (yes, no, or parameters).

**-matrix** _name_
> Scoring matrix (default: BLOSUM62).

**-word_size** _n_
> Word size for initial match.

**-h**, **-help**
> Display help information.

# DESCRIPTION

**tblastx** searches a translated nucleotide query against a translated nucleotide database. Both query and database sequences are translated in all six reading frames (three forward, three reverse), and protein-level comparisons are performed.

This program is useful for finding distant protein-coding relationships between nucleotide sequences, especially when working with unannotated genomic or EST data. It is computationally intensive due to the multiple translations.

Unlike other BLAST programs, tblastx only supports ungapped alignments. For sequences with insertions or deletions, consider using blastx or tblastn instead.

Part of the NCBI BLAST+ suite, tblastx requires properly formatted BLAST databases created with makeblastdb.

# CAVEATS

Only ungapped alignments are supported. Very computationally intensive due to six-frame translations on both query and database. Requires BLAST+ installation and formatted databases. Memory usage scales with database and query sizes.

# HISTORY

**tblastx** is part of BLAST (Basic Local Alignment Search Tool), originally developed at NCBI in 1990 by Stephen Altschul and colleagues. The BLAST+ suite, rewritten in C++, replaced the original C implementation. It remains a fundamental tool in bioinformatics for sequence similarity searching.

# SEE ALSO

[blastn](/man/blastn)(1), [blastp](/man/blastp)(1), [blastx](/man/blastx)(1), [makeblastdb](/man/makeblastdb)(1)
