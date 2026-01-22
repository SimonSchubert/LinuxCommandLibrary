# TLDR

**Search translated nucleotide** against protein database

```blastx -query [sequences.fasta] -db [nr] -out [results.txt]```

**Output in tabular format**

```blastx -query [sequences.fasta] -db [swissprot] -outfmt 6 -out [results.tsv]```

**Output in XML format**

```blastx -query [sequences.fasta] -db [nr] -outfmt 5 -out [results.xml]```

**Set E-value threshold**

```blastx -query [sequences.fasta] -db [nr] -evalue [0.001] -out [results.txt]```

**Limit number of alignments**

```blastx -query [sequences.fasta] -db [nr] -max_target_seqs [10] -out [results.txt]```

**Use multiple threads**

```blastx -query [sequences.fasta] -db [nr] -num_threads [8] -out [results.txt]```

**Show help**

```blastx -help```

# SYNOPSIS

**blastx** [_-query file_] [_-db database_] [_-out file_] [_options_]

# DESCRIPTION

**blastx** translates a nucleotide query sequence in all six reading frames and searches it against a protein database. It is part of the NCBI BLAST+ suite for sequence similarity searching.

This tool is useful for identifying protein homologs of nucleotide sequences, annotating genes, and finding coding regions in DNA sequences.

# PARAMETERS

**-query** _file_
> Input nucleotide sequence file (FASTA format)

**-db** _name_
> Protein database to search against (e.g., nr, swissprot)

**-out** _file_
> Output file for results

**-outfmt** _format_
> Output format: 0=pairwise, 5=XML, 6=tabular, 7=tabular with comments

**-evalue** _value_
> E-value threshold for reporting hits (default: 10)

**-max_target_seqs** _n_
> Maximum number of aligned sequences to keep

**-num_threads** _n_
> Number of threads/CPUs to use

**-word_size** _n_
> Word size for initial match

**-matrix** _name_
> Scoring matrix (e.g., BLOSUM62, PAM250)

**-query_gencode** _n_
> Genetic code for query translation (default: 1)

# CAVEATS

Requires pre-formatted BLAST databases; use **makeblastdb** to create them. Large databases like nr require significant disk space and memory. Translation in six frames increases computational time compared to blastn.

# HISTORY

BLAST (Basic Local Alignment Search Tool) was originally developed at NCBI by **Stephen Altschul** and colleagues in **1990**. The BLAST+ suite, including blastx, was released in **2009** with improved performance and new features.

# SEE ALSO

[blastn](/man/blastn)(1), [blastp](/man/blastp)(1), [tblastn](/man/tblastn)(1), [makeblastdb](/man/makeblastdb)(1), [blastdbcmd](/man/blastdbcmd)(1)
