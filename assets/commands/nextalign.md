# TLDR

**Align sequences to reference**

```nextalign run -r [reference.fasta] -i [sequences.fasta] -o [aligned.fasta]```

**Use gene annotation**

```nextalign run -r [ref.fasta] -m [genemap.gff] -i [seqs.fasta] -o [out.fasta]```

**Output to directory**

```nextalign run -r [ref.fasta] -i [seqs.fasta] -O [output_dir/]```

**Multiple threads**

```nextalign run -j [8] -r [ref.fasta] -i [seqs.fasta] -o [out.fasta]```

# SYNOPSIS

**nextalign** run [_options_]

# PARAMETERS

**-r**, **--reference** _file_
> Reference sequence.

**-i**, **--input** _file_
> Input sequences.

**-o**, **--output-fasta** _file_
> Output alignment.

**-m**, **--genemap** _file_
> Gene annotation (GFF).

**-O**, **--output-dir** _dir_
> Output directory.

**-j**, **--jobs** _n_
> Number of threads.

# DESCRIPTION

**Nextalign** is a viral genome sequence alignment tool. It performs pairwise alignment of viral sequences against a reference and identifies mutations, insertions, and deletions.

Nextalign is part of the Nextclade suite, commonly used for SARS-CoV-2 analysis.

# OUTPUT FILES

```
aligned.fasta        - Aligned sequences
insertions.csv       - Insertion positions
translations/        - Translated proteins
```

# CAVEATS

Optimized for viral genomes. Reference must be appropriate. Part of Nextclade ecosystem.

# HISTORY

Nextalign was developed at the **Nextstrain** project, led by **Trevor Bedford** and **Richard Neher**, gaining prominence during the COVID-19 pandemic.

# SEE ALSO

[nextclade](/man/nextclade)(1), [mafft](/man/mafft)(1), [minimap2](/man/minimap2)(1)
