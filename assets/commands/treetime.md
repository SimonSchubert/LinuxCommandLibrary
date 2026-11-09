# TAGLINE

Ancestral sequence reconstruction and molecular clocks

# TLDR

Infer a **time tree**

```treetime --aln [input.fasta] --tree [input.nwk] --dates [dates.csv] --outdir [results]```

Infer **ancestral** sequences

```treetime ancestral --aln [input.fasta] --tree [input.nwk]```

Analyze **homoplasies**

```treetime homoplasy --aln [input.fasta] --tree [input.nwk]```

Estimate the molecular **clock** and reroot

```treetime clock --tree [input.nwk] --aln [input.fasta] --dates [dates.csv] --reroot [least-squares]```

Map discrete **characters**

```treetime mugration --tree [input.nwk] --states [states.csv] --attribute [country]```

# SYNOPSIS

**treetime** [_COMMAND_] [_OPTIONS_]

# COMMANDS

**ancestral**
> Infer ancestral sequences maximizing likelihood

**homoplasy**
> Analyze patterns of recurrent mutations

**clock**
> Estimate molecular clock parameters and reroot tree

**mugration**
> Map discrete characters (host, country) to tree

**version**
> Print the version

Without a command, treetime infers a time-scaled phylogeny.

# DESCRIPTION

**treetime** provides routines for ancestral sequence reconstruction and inference of molecular-clock phylogenies. It is used in phylogenetic analysis to understand evolutionary relationships and timing of divergence events.

The tool can reconstruct ancestral sequences, detect homoplasies (convergent evolution), estimate mutation rates, and map geographic or host information onto phylogenetic trees.

# CAVEATS

Requires a phylogenetic tree and, depending on the command, a sequence alignment, dates or trait table. Computationally intensive for large datasets. Results depend on model assumptions.

# HISTORY

**TreeTime** was developed by Pavel Sagulenko, Vadim Puller and Richard Neher and described in the journal Virus Evolution.

# SEE ALSO

[iqtree](/man/iqtree)(1), [raxml](/man/raxml)(1)

# RESOURCES

```[Source code](https://github.com/neherlab/treetime)```

```[Documentation](https://treetime.readthedocs.io/en/latest/)```

<!-- verified: 2026-11-09 -->
