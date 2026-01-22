# TLDR

**Align sequences** using blastp with e-value threshold

```blastp -query [query.fa] -subject [subject.fa] -evalue [1e-9]```

Align sequences using **blastp-fast**

```blastp -task blastp-fast -query [query.fa] -subject [subject.fa]```

Align with **custom tabular output** to file

```blastp -query [query.fa] -subject [subject.fa] -outfmt '6 qseqid qlen qstart qend sseqid slen sstart send bitscore evalue pident' -out [output.tsv]```

Search **protein databases** with multiple threads

```blastp -query [query.fa] -db [blast_database_name] -num_threads [16] -max_target_seqs [10]```

Search the **remote non-redundant** protein database

```blastp -query [query.fa] -db nr -remote```

# SYNOPSIS

**blastp** [_options_]

# DESCRIPTION

**blastp** performs protein-to-protein BLAST (Basic Local Alignment Search Tool) searches. It compares amino acid sequences to find regions of similarity, which can reveal functional, structural, or evolutionary relationships.

The tool is essential for identifying protein families, finding homologs across species, and annotating newly sequenced proteins based on similarity to known sequences.

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
> Algorithm variant: blastp or blastp-fast

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

Large database searches require significant memory and time. Remote searches are rate-limited by NCBI. Results should be interpreted in the context of sequence length and database size.

# SEE ALSO

[blastn](/man/blastn)(1), [blastx](/man/blastx)(1), [makeblastdb](/man/makeblastdb)(1)
