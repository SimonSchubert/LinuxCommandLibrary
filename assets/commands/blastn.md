# TAGLINE

Nucleotide-to-nucleotide sequence alignment search

# TLDR

**Align sequences** using megablast with e-value threshold

```blastn -query [query.fa] -subject [subject.fa] -evalue [1e-9]```

Align sequences using **standard blastn**

```blastn -task blastn -query [query.fa] -subject [subject.fa]```

Align with **custom tabular output** to file

```blastn -query [query.fa] -subject [subject.fa] -outfmt '6 qseqid qlen qstart qend sseqid slen sstart send bitscore evalue pident' -out [output.tsv]```

Search **nucleotide databases** with multiple threads

```blastn -query [query.fa] -db [path/to/blast_db] -num_threads [16] -max_target_seqs [10]```

Search the **remote non-redundant** nucleotide database

```blastn -query [query.fa] -db nt -remote```

Display **help**

```blastn -h```

# SYNOPSIS

**blastn** [_options_]

# DESCRIPTION

**blastn** performs nucleotide-to-nucleotide BLAST (Basic Local Alignment Search Tool) searches. It finds regions of similarity between nucleotide sequences, which can indicate functional, structural, or evolutionary relationships.

The tool supports multiple search algorithms including megablast (default, for highly similar sequences), discontiguous megablast, and standard blastn. Results can help identify genes, compare genomes, or find homologous sequences.

# PARAMETERS

**-query** _file_
> Input file with query sequences in FASTA format

**-subject** _file_
> Subject sequence file for direct comparison

**-db** _name_
> BLAST database name for searching

**-evalue** _threshold_
> Expectation value (E) threshold for reporting matches

**-task** _name_
> Algorithm variant: megablast, dc-megablast, or blastn

**-outfmt** _format_
> Output format (0=pairwise, 6=tabular, 7=tabular with headers)

**-out** _file_
> Output file name

**-num_threads** _n_
> Number of CPU threads to use

**-max_target_seqs** _n_
> Maximum number of aligned sequences to keep

**-remote**
> Execute search on NCBI servers

# CAVEATS

Large database searches require significant memory and time. Remote searches are rate-limited. Local database searches require pre-formatted BLAST databases created with **makeblastdb**.

# HISTORY

BLAST was developed at NCBI (National Center for Biotechnology Information) with the original algorithm published in **1990** by Altschul et al. It has become one of the most widely used bioinformatics tools.

# SEE ALSO

[blastp](/man/blastp)(1), [blastx](/man/blastx)(1), [makeblastdb](/man/makeblastdb)(1)
