# TLDR

**Intersect** genomic intervals

```bedtools intersect -a [file1.bed] -b [file2.bed]```

**Merge** overlapping intervals

```bedtools merge -i [sorted.bed]```

**Sort** BED file

```bedtools sort -i [unsorted.bed]```

**Get coverage**

```bedtools coverage -a [regions.bed] -b [reads.bam]```

**Subtract** intervals

```bedtools subtract -a [all.bed] -b [exclude.bed]```

# SYNOPSIS

**bedtools** _command_ [_options_]

# DESCRIPTION

**bedtools** is a suite of utilities for analyzing genomic intervals in BED, BAM, VCF, and GFF formats. It provides fast operations on genome annotations including intersection, merging, counting, and statistical analysis.

The tool is essential for genomics research and comparative analysis of genomic features.

# COMMANDS

**intersect**
> Find overlapping intervals

**merge**
> Combine overlapping intervals

**coverage**
> Compute coverage statistics

**subtract**
> Remove overlapping intervals

**closest**
> Find nearest intervals

**window**
> Find nearby intervals within window

**sort**
> Sort BED/GFF/VCF files

**genomecov**
> Compute genome-wide coverage

**getfasta**
> Extract sequences from FASTA

**bamtobed**
> Convert BAM to BED

# COMMON PARAMETERS

**-a** _file_
> First input file

**-b** _file_
> Second input file

**-wa**
> Write original A entry

**-wb**
> Write original B entry

**-f** _fraction_
> Minimum overlap fraction

**-v**
> Report A entries without B overlap

**-s**
> Require same strand

# WORKFLOW

```bash
# Find genes overlapping SNPs
bedtools intersect -a genes.bed -b snps.bed

# Merge nearby features
bedtools merge -i features.bed -d 100

# Count reads in regions
bedtools coverage -a regions.bed -b reads.bam

# Extract promoter regions
bedtools flank -i genes.bed -g genome.txt -l 2000 -r 0
```

# CAVEATS

Some operations require sorted input. Large files consume significant memory. Coordinate systems (0-based vs 1-based) can cause off-by-one errors. Performance depends on file size and operation.

# HISTORY

**bedtools** was created by Aaron Quinlan and Ira Hall, first released in **2010** as a comprehensive toolkit for genomic interval analysis.

# SEE ALSO

[samtools](/man/samtools)(1), [vcftools](/man/vcftools)(1), [bcftools](/man/bcftools)(1)
