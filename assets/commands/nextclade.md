# TLDR

**Analyze sequences**

```nextclade run -i [sequences.fasta] -d [sars-cov-2]```

**Analyze with output files**

```nextclade run -i [sequences.fasta] -d [sars-cov-2] -o [output.tsv]```

**List available datasets**

```nextclade dataset list```

**Download dataset**

```nextclade dataset get -n [sars-cov-2] -o [dataset/]```

**Run with local dataset**

```nextclade run -i [sequences.fasta] -D [dataset/]```

**Generate tree output**

```nextclade run -i [sequences.fasta] -d [sars-cov-2] --output-tree [tree.json]```

**Output aligned sequences**

```nextclade run -i [sequences.fasta] -d [sars-cov-2] --output-fasta [aligned.fasta]```

# SYNOPSIS

**nextclade** [_run_] [_dataset_] [_-i input_] [_-d dataset_] [_-o output_] [_options_]

# PARAMETERS

**run**
> Analyze sequences.

**dataset list**
> List available datasets.

**dataset get**
> Download dataset.

**-i** _FILE_
> Input FASTA file.

**-d** _NAME_
> Dataset name.

**-D** _DIR_
> Dataset directory.

**-o** _FILE_
> Output TSV file.

**--output-tree** _FILE_
> Output tree JSON.

**--output-fasta** _FILE_
> Output aligned FASTA.

**--output-json** _FILE_
> Output JSON results.

**-j** _N_
> Number of threads.

**--min-length** _N_
> Minimum sequence length.

**--include-reference**
> Include reference in outputs.

# DESCRIPTION

**nextclade** analyzes viral genome sequences, assigning clades, calling mutations, and assessing sequence quality. It's widely used for SARS-CoV-2 surveillance.

The tool aligns sequences against a reference genome, identifies mutations (substitutions, insertions, deletions), and assigns sequences to clades in the phylogenetic tree.

Quality control metrics flag potential problems: missing data, mixed bases, frameshifts, stop codons, and unusual mutations. These help identify sequencing errors or contamination.

Datasets contain reference sequences, gene annotations, and clade definitions. Pre-built datasets are available for major pathogens. Custom datasets can be created.

Output includes detailed mutation lists, clade assignments, and quality scores. Results can be visualized or processed for epidemiological analysis.

Tree placement shows where sequences fit in the global phylogeny, useful for tracking outbreak origins.

# CAVEATS

Results depend on dataset quality. Novel clades may not be assigned correctly. Large datasets need significant memory. Some features are pathogen-specific.

# HISTORY

**Nextclade** was developed at the **Nextstrain** project by **Cornelius Roemer** and others, starting around **2020** during the COVID-19 pandemic. It provides rapid clade assignment and quality control for genomic surveillance programs worldwide.

# SEE ALSO

[nextalign](/man/nextalign)(1), [pangolin](/man/pangolin)(1), [mafft](/man/mafft)(1), [minimap2](/man/minimap2)(1)
