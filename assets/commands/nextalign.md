# TAGLINE

viral genome sequence alignment tool

# TLDR

**Align sequences to a reference**

```nextalign run --input-ref [reference.fasta] --output-fasta [aligned.fasta] [sequences.fasta]```

**Use a gene map** for codon-aware alignment and translation

```nextalign run --input-ref [ref.fasta] --input-gene-map [genemap.gff] --output-all [output_dir/] [seqs.fasta]```

**Output all results to a directory**

```nextalign run --input-ref [ref.fasta] --output-all [output_dir/] [seqs.fasta]```

**Restrict translation to selected genes**

```nextalign run -r [ref.fasta] -m [genemap.gff] -g [S,ORF1a] -O [output_dir/] [seqs.fasta]```

**Set number of threads**

```nextalign run -j [8] --input-ref [ref.fasta] --output-fasta [out.fasta] [seqs.fasta]```

# SYNOPSIS

**nextalign** run [_options_] --input-ref _file_ [_fasta_...]

# PARAMETERS

_fasta_
> Input FASTA files (optionally gz, bz2, xz or zstd compressed). Reads plain FASTA from stdin if none are given.

**-r**, **--input-ref**, **--reference** _file_
> Reference sequence (FASTA with exactly one sequence). Required.

**-m**, **--input-gene-map** _file_
> Gene map (genome annotation) in GFF3 format.

**-g**, **--genes** _list_
> Comma-separated list of gene names to use. Defaults to all genes in the gene map.

**-O**, **--output-all** _dir_
> Write all output files to a directory.

**-n**, **--output-basename** _name_
> Base filename for files written with **--output-all** (default: nextalign).

**-s**, **--output-selection** _list_
> Restrict **--output-all** to: all, fasta, translations, insertions, errors.

**-o**, **--output-fasta** _file_
> Output aligned sequences.

**-P**, **--output-translations** _template_
> Output translated peptides, one file per gene. The template must contain **{gene}**.

**-I**, **--output-insertions** _file_
> Output CSV with insertions stripped from the alignment.

**-e**, **--output-errors** _file_
> Output CSV with errors and warnings.

**-j**, **--jobs** _n_
> Number of threads (default: all CPU cores).

**--include-reference**
> Include reference sequence in output alignment.

**--in-order**
> Output sequences in the same order as input.

**--replace-unknown**
> Replace unknown nucleotide characters with N.

# DESCRIPTION

**Nextalign** is a viral genome sequence alignment tool. It performs pairwise alignment of viral sequences against a reference and, given a gene map, translates them into peptides. Insertions relative to the reference are stripped from the alignment and reported separately.

Nextalign is part of the Nextclade suite, commonly used for SARS-CoV-2 analysis. As of Nextclade v3, the standalone Nextalign CLI has been superseded by **nextclade run**, which provides the same alignment functionality plus additional analysis. Users are encouraged to migrate to **nextclade**. This page describes the final Nextalign v2 command line. At least one output flag is required.

# OUTPUT FILES

```
nextalign.aligned.fasta                 - Aligned sequences
nextalign.insertions.csv                - Insertion positions
nextalign.errors.csv                    - Errors and warnings
nextalign_gene_GENE.translation.fasta   - Translated peptides
```

# CAVEATS

Optimized for viral genomes with low divergence (less than 10% from reference). For more diverse datasets, tools like mafft or minimap2 are more robust. As of v3, the standalone nextalign CLI is removed in favor of **nextclade run**.

# HISTORY

Nextalign was developed at the **Nextstrain** project, led by **Trevor Bedford** and **Richard Neher**, gaining prominence during the COVID-19 pandemic.

# SEE ALSO

[nextclade](/man/nextclade)(1), [mafft](/man/mafft)(1), [minimap2](/man/minimap2)(1)

# RESOURCES

```[Source code](https://github.com/nextstrain/nextclade)```

```[Homepage](https://clades.nextstrain.org)```

```[Documentation](https://docs.nextstrain.org/projects/nextclade)```

<!-- verified: 2026-11-09 -->
