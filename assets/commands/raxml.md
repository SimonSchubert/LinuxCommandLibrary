# TAGLINE

Maximum likelihood phylogenetic tree inference

# TLDR

**Basic phylogenetic analysis**

```raxml -s [alignment.phy] -n [output_name] -m GTRGAMMA```

**Rapid bootstrap analysis**

```raxml -f a -s [alignment.phy] -n [run] -m GTRGAMMA -x [12345] -N [100]```

**Parsimony starting tree**

```raxml -y -s [alignment.phy] -n [parsimony] -m GTRGAMMA```

**Multiple threads**

```raxmlHPC-PTHREADS -T [4] -s [alignment.phy] -n [run] -m GTRGAMMA```

# SYNOPSIS

**raxml** [_options_] **-s** _alignment_ **-n** _name_

# PARAMETERS

**-s** _file_
> Alignment file (PHYLIP format).

**-n** _name_
> Output file name.

**-m** _model_
> Substitution model.

**-f** _algorithm_
> Algorithm to execute.

**-x** _seed_
> Random seed for bootstrap.

**-N** _num_
> Number of runs/bootstraps.

**-T** _threads_
> Number of threads (PTHREADS version).

**-p** _seed_
> Parsimony random seed.

# DESCRIPTION

**RAxML** (Randomized Axelerated Maximum Likelihood) infers phylogenetic trees using maximum likelihood. It's widely used in evolutionary biology for large-scale phylogenetic analyses.

# EXAMPLES

```bash
# ML search
raxml -s alignment.phy -n result -m GTRGAMMA -p 12345

# Rapid bootstrap + ML search
raxml -f a -s alignment.phy -n boot -m GTRGAMMA -x 12345 -p 12345 -N 100

# Protein sequences
raxml -s proteins.phy -n protein_tree -m PROTGAMMAAUTO

# Partitioned analysis
raxml -s alignment.phy -q partitions.txt -n partitioned -m GTRGAMMA
```

# MODELS

```
GTRGAMMA      - GTR + Gamma (DNA)
PROTGAMMAAUTO - Auto-select protein model
GTRCAT        - Faster approximation
```

# CAVEATS

Computationally intensive. Use raxmlHPC-PTHREADS or MPI version for large datasets. Superseded by RAxML-NG.

# HISTORY

RAxML was developed by **Alexandros Stamatakis** for high-performance phylogenetic inference, first released in 2004.

# SEE ALSO

[raxml-ng](/man/raxml-ng)(1), [iqtree](/man/iqtree)(1), [fasttree](/man/fasttree)(1), [phyml](/man/phyml)(1)
