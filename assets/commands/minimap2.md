# TLDR

**Map long reads to reference**

```minimap2 -a [reference.fa] [reads.fq] > [aligned.sam]```

**Map with preset for ONT reads**

```minimap2 -ax map-ont [reference.fa] [ont_reads.fq] > [aligned.sam]```

**Map PacBio HiFi reads**

```minimap2 -ax map-hifi [reference.fa] [hifi.fq] > [aligned.sam]```

**Map short reads**

```minimap2 -ax sr [reference.fa] [reads_1.fq] [reads_2.fq] > [aligned.sam]```

**Create index**

```minimap2 -d [reference.mmi] [reference.fa]```

**Use multiple threads**

```minimap2 -t [8] -ax map-ont [reference.fa] [reads.fq] > [aligned.sam]```

# SYNOPSIS

**minimap2** [_options_] _target_ [_query_...]

# PARAMETERS

**-a**
> Output SAM format.

**-x** _preset_
> Preset (map-ont, map-pb, map-hifi, sr, asm5).

**-t** _threads_
> Number of threads.

**-d** _file_
> Save index to file.

**-o** _file_
> Output file.

**-k** _k_
> K-mer size.

**-w** _w_
> Minimizer window.

# DESCRIPTION

**minimap2** is a versatile sequence aligner for DNA and RNA sequences. It can align long reads from PacBio or Oxford Nanopore, short reads, and even whole assemblies.

minimap2 is extremely fast and memory-efficient, becoming the standard for long-read alignment.

# PRESETS

```
map-ont   - ONT reads to reference
map-hifi  - PacBio HiFi reads
map-pb    - PacBio CLR reads
sr        - Short reads
asm5      - Divergent assembly
splice    - Long-read RNA-seq
```

# CAVEATS

Output is PAF by default; use -a for SAM. Index size depends on reference. Presets should match data type.

# HISTORY

minimap2 was developed by **Heng Li** (author of BWA) and published in **2018** as a fast, accurate aligner for long reads.

# SEE ALSO

[bwa](/man/bwa)(1), [samtools](/man/samtools)(1), [paftools](/man/paftools)(1), [seqtk](/man/seqtk)(1)
