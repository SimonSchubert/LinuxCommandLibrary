# TAGLINE

phylogenetic analysis tool for maximum likelihood tree inference

# TLDR

**Run phylogenetic analysis**

```iqtree -s [alignment.fasta]```

**Specify model**

```iqtree -s [alignment.fasta] -m [GTR+G]```

**Automatic model selection**

```iqtree -s [alignment.fasta] -m MFP```

**Standard bootstrap analysis**

```iqtree -s [alignment.fasta] -b [1000]```

**Ultra-fast bootstrap** (IQ-TREE2 uses -B)

```iqtree -s [alignment.fasta] -B [1000]```

**Use multiple threads** (IQ-TREE2 uses -T)

```iqtree -s [alignment.fasta] -T [4]```

# SYNOPSIS

**iqtree** [_options_] **-s** _alignment_

# PARAMETERS

**-s** _file_
> Input alignment file.

**-m** _model_
> Substitution model (or MFP for selection).

**-b** _n_
> Standard bootstrap replicates.

**-B**, **--ufboot** _n_
> Ultra-fast bootstrap replicates (minimum 1000). IQ-TREE v1 used -bb.

**-T**, **--threads** _n_|AUTO
> Number of CPU threads, or AUTO to auto-detect. IQ-TREE v1 used -nt.

**-pre** _prefix_
> Output file prefix.

**-o** _taxa_
> Outgroup taxa.

**-t** _tree_
> Starting tree file.

**-wbt**
> Write bootstrap trees.

**--bnni**
> Optimize UFBoot trees by NNI on bootstrap alignment (reduces overestimation).

**-alrt** _n_
> SH-like approximate likelihood ratio test.

# DESCRIPTION

**IQ-TREE** is a phylogenetic analysis tool for maximum likelihood tree inference. It supports various substitution models, model selection, and multiple bootstrap methods.

IQ-TREE is known for its speed and accuracy, implementing efficient algorithms for large-scale phylogenetic analysis. It handles DNA, protein, codon, and morphological data.

# OUTPUT FILES

```
.treefile    Best tree in Newick format
.iqtree      Analysis report
.log         Screen log
.mldist      ML distances
.bionj       BIONJ starting tree
```

# CAVEATS

Large alignments require significant memory. Model selection can be time-consuming. Bootstrap numbers vary by study requirements.

# HISTORY

IQ-TREE was developed by **Bui Quang Minh**, **Lam-Tung Nguyen**, and **Arndt von Haeseler** at the University of Vienna. First released in **2014**, it's become a standard tool for molecular phylogenetics.

# SEE ALSO

[mafft](/man/mafft)(1), [raxml](/man/raxml)(1)
