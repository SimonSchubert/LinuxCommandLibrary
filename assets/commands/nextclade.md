# TAGLINE

analyzes viral genome sequences, assigning clades, calling mutations

# TLDR

**Analyze sequences** with a dataset downloaded on the fly, writing all outputs to a directory

```nextclade run -d [nextstrain/sars-cov-2/wuhan-hu-1/orfs] -O [output/] [sequences.fasta]```

**Write only a TSV** of results

```nextclade run -d [sars-cov-2] -t [results.tsv] [sequences.fasta]```

**List available datasets**

```nextclade dataset list --only-names```

**Search datasets**

```nextclade dataset list --search [flu]```

**Download a dataset**

```nextclade dataset get -n [nextstrain/sars-cov-2/wuhan-hu-1/orfs] -o [dataset/]```

**Run with a local dataset**

```nextclade run -D [dataset/] -O [output/] [sequences.fasta]```

**Output the placement tree** and aligned sequences

```nextclade run -D [dataset/] -T [tree.json] -o [aligned.fasta] [sequences.fasta]```

**Sort mixed sequences** by detected pathogen

```nextclade sort -O [sorted/] [sequences.fasta]```

# SYNOPSIS

**nextclade** _command_ [_options_]

**nextclade run** [**-d** _name_ | **-D** _dataset_] [_output options_] _input.fasta_...

**nextclade dataset** {**list** | **get**} [_options_]

# COMMANDS

**run**
> Alignment, mutation calling, clade assignment, quality checks and phylogenetic placement.

**dataset list**
> List available datasets (--search, --name, --tag, --json, --only-names).

**dataset get**
> Download a dataset to a directory (-o) or zip file (-z).

**sort**
> Detect which dataset each sequence belongs to and split the input accordingly.

**completions** _shell_
> Generate shell completions.

# PARAMETERS

**-d**, **--dataset-name** _NAME_
> Download and use this dataset (full name like nextstrain/sars-cov-2/wuhan-hu-1/orfs, or a shortcut like sars-cov-2).

**-D**, **--input-dataset** _PATH_
> Use a local dataset directory or zip file.

**-r**, **--input-ref** _FILE_
> Reference sequence FASTA (overrides the dataset).

**-m**, **--input-annotation** _FILE_
> Genome annotation in GFF3 format.

**-O**, **--output-all** _DIR_
> Write all output files into this directory.

**-s**, **--output-selection** _LIST_
> Restrict --output-all to: all, fasta, json, ndjson, csv, tsv, tree, tree-nwk, translations, gff, tbl.

**-n**, **--output-basename** _NAME_
> Base filename for output files.

**-t**, **--output-tsv** _FILE_
> Results as TSV.

**-c**, **--output-csv** _FILE_
> Results as CSV (semicolon-delimited).

**-J**, **--output-json** _FILE_
> Results as JSON.

**-N**, **--output-ndjson** _FILE_
> Results as newline-delimited JSON.

**-o**, **--output-fasta** _FILE_
> Aligned nucleotide sequences.

**-P**, **--output-translations** _TEMPLATE_
> Aligned peptides, one file per gene (template must contain {cds}).

**-T**, **--output-tree** _FILE_
> Tree with placed sequences, Auspice JSON v2.

**--output-tree-nwk** _FILE_
> Tree with placed sequences, Newick format.

**--include-reference**
> Include the reference in output FASTA files.

**--min-length** _N_
> Minimum sequence length to attempt alignment.

**--alignment-preset** _PRESET_
> default, high-diversity or short-sequences.

**-j**, **--jobs** _N_
> Number of processing jobs (default: all CPU threads).

**--verbosity** _LEVEL_
> off, error, warn (default), info, debug, trace.

# DESCRIPTION

**nextclade** analyzes viral genome sequences, assigning clades, calling mutations, and assessing sequence quality. It's widely used for SARS-CoV-2, influenza, mpox, RSV and other pathogen surveillance.

The tool aligns sequences against a reference genome, identifies mutations (substitutions, insertions, deletions), translates genes, and places each sequence on a reference phylogenetic tree to assign its clade.

Quality control metrics flag potential problems: missing data, mixed bases, frameshifts, stop codons, and private mutation clusters. These help identify sequencing errors or contamination.

Datasets contain the reference sequence, genome annotation, reference tree and QC configuration. Official and community datasets are served from data.clades.nextstrain.org; custom datasets can be created.

The same engine powers Nextclade Web, which runs entirely in the browser.

# CAVEATS

Results depend on dataset quality and version; pin a dataset tag (-t on dataset get) for reproducible results. Novel lineages may not be assigned correctly. In v3, input FASTA files are positional arguments; the v2 flag --input-fasta (-i) was removed and dataset names changed to paths like nextstrain/sars-cov-2/wuhan-hu-1/orfs, so older scripts need updating. Using -d re-downloads the dataset on every run.

# HISTORY

**Nextclade** was developed by the **Nextstrain** team (Ivan Aksamentov, Richard Neher and others) starting in **2020** during the COVID-19 pandemic. Version 2 (2022) rewrote the CLI in Rust, and version 3 (2024) introduced a new dataset system and absorbed the standalone **nextalign** tool, which is no longer released separately.

# SEE ALSO

[nextalign](/man/nextalign)(1), [pangolin](/man/pangolin)(1), [mafft](/man/mafft)(1), [minimap2](/man/minimap2)(1)

# RESOURCES

```[Source code](https://github.com/nextstrain/nextclade)```

```[Homepage](https://clades.nextstrain.org)```

```[Documentation](https://docs.nextstrain.org/projects/nextclade)```

<!-- verified: 2026-09-29 -->
