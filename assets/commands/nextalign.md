# TAGLINE

viral genome sequence alignment tool

# TLDR

**Align sequences to reference**

```nextalign run --input-ref [reference.fasta] -i [sequences.fasta] -o [aligned.fasta]```

**Use genome annotation**

```nextalign run --input-ref [ref.fasta] --input-annotation [genemap.gff3] -i [seqs.fasta] -o [out.fasta]```

**Output all results to a directory**

```nextalign run --input-ref [ref.fasta] -i [seqs.fasta] --output-all [output_dir/]```

**Use a Nextclade dataset instead of individual files**

```nextalign run --input-dataset [nextstrain/sars-cov-2/wuhan-hu-1/orfs] -i [seqs.fasta] -o [out.fasta]```

**Set number of threads**

```nextalign run -j [8] --input-ref [ref.fasta] -i [seqs.fasta] -o [out.fasta]```

# SYNOPSIS

**nextalign** run [_options_]

# PARAMETERS

**--input-ref** _file_
> Reference sequence (FASTA). Required when not using --input-dataset.

**-i**, **--input** _file_
> Input sequences (FASTA).

**-o**, **--output-fasta** _file_
> Output aligned sequences.

**--input-annotation** _file_
> Genome annotation (GFF3).

**--input-dataset** _name_
> Use a Nextclade dataset (replaces individual --input-ref, --input-annotation).

**--output-all** _dir_
> Write all output files to a directory.

**--output-translations** _template_
> Output translated protein sequences.

**-j**, **--jobs** _n_
> Number of threads.

**--include-reference**
> Include reference sequence in output alignment.

**--in-order**
> Output sequences in the same order as input.

# DESCRIPTION

**Nextalign** is a viral genome sequence alignment tool. It performs pairwise alignment of viral sequences against a reference and identifies mutations, insertions, and deletions.

Nextalign is part of the Nextclade suite, commonly used for SARS-CoV-2 analysis. As of Nextclade v3, the standalone Nextalign CLI has been superseded by **nextclade run**, which provides the same alignment functionality plus additional analysis. Users are encouraged to migrate to **nextclade**.

# OUTPUT FILES

```
aligned.fasta        - Aligned sequences
insertions.csv       - Insertion positions
translations/        - Translated proteins
```

# CAVEATS

Optimized for viral genomes with low divergence (less than 10% from reference). For more diverse datasets, tools like mafft or minimap2 are more robust. As of v3, the standalone nextalign CLI is removed in favor of **nextclade run**.

# HISTORY

Nextalign was developed at the **Nextstrain** project, led by **Trevor Bedford** and **Richard Neher**, gaining prominence during the COVID-19 pandemic.

# SEE ALSO

[nextclade](/man/nextclade)(1), [mafft](/man/mafft)(1), [minimap2](/man/minimap2)(1)
