# TLDR

**Search a protein query** against a nucleotide database

```tblastn -query [protein.fasta] -db [nt_database]```

**Search with a specific output format**

```tblastn -query [protein.fasta] -db [database] -outfmt [6]```

**Save results to a file**

```tblastn -query [protein.fasta] -db [database] -out [results.txt]```

**Use multiple threads** for faster search

```tblastn -query [protein.fasta] -db [database] -num_threads [4]```

**Set E-value threshold**

```tblastn -query [protein.fasta] -db [database] -evalue [1e-10]```

**Use the fast task** for quicker searches

```tblastn -query [protein.fasta] -db [database] -task tblastn-fast```

**Search against a remote NCBI database**

```tblastn -query [protein.fasta] -db [nr] -remote```

# SYNOPSIS

**tblastn** [**-query** _file_] [**-db** _database_] [**-out** _file_] [_options_]

# PARAMETERS

**-query** _file_
> Input file with protein query sequence(s) in FASTA format.

**-db** _database_
> Nucleotide database name or path to search against.

**-out** _file_
> Output file for results (default: stdout).

**-outfmt** _format_
> Output format: 0 (pairwise), 6 (tabular), 7 (tabular with comments), 10 (CSV), and others.

**-evalue** _value_
> E-value threshold for reporting matches (default: 10).

**-num_threads** _n_
> Number of threads for parallel execution.

**-task** _task_
> Task to execute: **tblastn** (standard) or **tblastn-fast** (faster, larger word size).

**-remote**
> Execute search against NCBI servers instead of local database.

**-max_target_seqs** _n_
> Maximum number of aligned sequences to keep.

**-word_size** _n_
> Word size for initial match.

**-matrix** _name_
> Scoring matrix (e.g., BLOSUM62, PAM30).

**-comp_based_stats** _mode_
> Composition-based statistics mode (0-3).

**-seg** _options_
> Filter query with SEG algorithm.

**-h**
> Print abbreviated help.

**-help**
> Print detailed help with all options.

**-version**
> Print version information.

# DESCRIPTION

**tblastn** is part of the NCBI BLAST+ suite for sequence alignment. It searches a protein query sequence against a nucleotide sequence database, translating the database sequences in all six reading frames at search time. This is useful for finding protein-coding regions in nucleotide sequences.

The algorithm compares each protein query against the translated nucleotide subjects and reports statistically significant alignments. Results can be formatted in various ways for downstream analysis, including tabular formats suitable for parsing.

# CAVEATS

Searching against translated databases is computationally intensive since each subject sequence is translated in six frames. For large databases, use **-num_threads** to enable parallel execution. The **tblastn-fast** task provides faster but less sensitive searches. Local database searches require pre-built BLAST databases created with **makeblastdb**.

# HISTORY

BLAST (Basic Local Alignment Search Tool) was developed at **NCBI** by **Stephen Altschul** and colleagues, with the original algorithm published in **1990**. tblastn was part of the original BLAST suite for protein-to-translated-nucleotide searches. The BLAST+ command-line applications, a complete rewrite in C++, were released in **2009** and continue to be actively maintained by NCBI.

# SEE ALSO

[blastn](/man/blastn)(1), [blastp](/man/blastp)(1), [blastx](/man/blastx)(1), [makeblastdb](/man/makeblastdb)(1), [tblastx](/man/tblastx)(1)
