# TLDR

**Fastest method** to create a tree from fastq and/or fasta files using multiple threads

```mashtree --numcpus [12] [*.fastq.gz] [*.fasta] > [mashtree.dnd]```

**Most accurate method** to create a tree with mindepth 0

```mashtree --mindepth 0 --numcpus [12] [*.fastq.gz] [*.fasta] > [mashtree.dnd]```

Most accurate method with **confidence values** (bootstrap)

```mashtree_bootstrap.pl --reps [100] --numcpus [12] [*.fastq.gz] -- --min-depth 0 > [mashtree.bootstrap.dnd]```

# SYNOPSIS

**mashtree** [_options_] _genome_files_...

# PARAMETERS

**--numcpus _n_**
> Number of CPU threads to use for parallel processing

**--mindepth _n_**
> Minimum depth for k-mer counting (0 for most accuracy)

**--genomesize _size_**
> Estimated genome size for sketch calculations

**--truncLength _n_**
> Truncate sequence names at this length

**--outtree _file_**
> Output file for the tree (default: stdout)

# DESCRIPTION

**mashtree** rapidly creates distance trees from genome sequences using MinHash sketching. It computes pairwise distances between genomes based on k-mer similarity and constructs a neighbor-joining tree.

The tool accepts FASTA, FASTQ, and compressed versions (.gz) of both formats. It uses the Mash algorithm internally for efficient sketch-based distance calculation, making it suitable for thousands of genomes.

Output is in Newick format (.dnd), compatible with tree visualization tools. Note that mashtree creates distance trees, not phylogenetic trees—it shows similarity relationships, not evolutionary history.

# CAVEATS

Not suitable for formal phylogenetic analysis; use proper phylogenetic methods for evolutionary studies. Accuracy depends on genome completeness and quality. Very divergent sequences may produce unreliable trees. Memory usage scales with the number of genomes being compared.

# HISTORY

Mashtree was developed by Lee Katz at the CDC (Centers for Disease Control and Prevention) for rapid outbreak analysis and genome clustering in public health microbiology.

# SEE ALSO

[mash](/man/mash)(1), [quicktree](/man/quicktree)(1), [fasttree](/man/fasttree)(1)
