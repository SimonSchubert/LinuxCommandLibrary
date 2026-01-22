# TLDR

Infer **ancestral** sequences

```treetime ancestral```

Analyze **homoplasies**

```treetime homoplasy```

Estimate molecular **clock**

```treetime clock```

Map discrete **characters**

```treetime mugration```

# SYNOPSIS

**treetime** _COMMAND_ [_OPTIONS_]

# COMMANDS

**ancestral**
> Infer ancestral sequences maximizing likelihood

**homoplasy**
> Analyze patterns of recurrent mutations

**clock**
> Estimate molecular clock parameters and reroot tree

**mugration**
> Map discrete characters (host, country) to tree

# DESCRIPTION

**treetime** provides routines for ancestral sequence reconstruction and inference of molecular-clock phylogenies. It is used in phylogenetic analysis to understand evolutionary relationships and timing of divergence events.

The tool can reconstruct ancestral sequences, detect homoplasies (convergent evolution), estimate mutation rates, and map geographic or host information onto phylogenetic trees.

# CAVEATS

Requires phylogenetic tree and sequence alignment inputs. Computationally intensive for large datasets. Results depend on model assumptions.

# HISTORY

**treetime** was developed for phylogenetic analysis in molecular epidemiology and evolutionary biology, providing tools for understanding pathogen evolution and spread.

# SEE ALSO

[iqtree](/man/iqtree)(1), [raxml](/man/raxml)(1)
