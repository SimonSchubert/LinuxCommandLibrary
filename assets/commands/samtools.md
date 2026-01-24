# TLDR

**View BAM file**

```samtools view [alignment.bam]```

**Convert SAM to BAM**

```samtools view -bS [alignment.sam] > [alignment.bam]```

**Sort BAM file**

```samtools sort [input.bam] -o [sorted.bam]```

**Index BAM file**

```samtools index [sorted.bam]```

**View specific region**

```samtools view [sorted.bam] [chr1:1000-2000]```

**Count alignments**

```samtools view -c [alignment.bam]```

**Generate statistics**

```samtools flagstat [alignment.bam]```

**Merge BAM files**

```samtools merge [output.bam] [input1.bam] [input2.bam]```

# SYNOPSIS

**samtools** _command_ [_-b_] [_-o output_] [_-@ threads_] [_options_] [_file_] [_region_]

# PARAMETERS

**view**
> View/convert SAM/BAM/CRAM.

**sort**
> Sort alignments.

**index**
> Create BAM index.

**merge**
> Merge sorted files.

**flagstat**
> Statistics from FLAG field.

**stats**
> Comprehensive statistics.

**idxstats**
> Per-reference statistics.

**faidx**
> Index FASTA file.

**depth**
> Compute depth at each position.

**mpileup**
> Generate pileup for variants.

**coverage**
> Calculate coverage statistics.

**fastq**
> Extract FASTQ from BAM.

**-b**
> Output BAM format.

**-S**
> Input is SAM (deprecated, auto-detected).

**-o** _FILE_
> Output file.

**-@** _NUM_, **--threads** _NUM_
> Number of threads.

**-f** _FLAGS_
> Only include reads with FLAGS.

**-F** _FLAGS_
> Exclude reads with FLAGS.

**-q** _MAPQ_
> Minimum mapping quality.

**-h**
> Include header.

# DESCRIPTION

**samtools** manipulates alignments in SAM (Sequence Alignment/Map) format and its binary equivalent BAM. It's essential for next-generation sequencing data analysis.

SAM/BAM files contain sequence reads aligned to reference genomes. Each record includes read name, position, mapping quality, CIGAR string (alignment operations), and optional tags.

The view command converts between formats and filters alignments. Sorted BAM files with indices enable random access to genomic regions. Most downstream tools require sorted, indexed BAM.

Statistics commands (flagstat, stats, idxstats) summarize alignment characteristics: mapping rates, insert sizes, coverage distributions. These quality metrics guide analysis decisions.

Pileup output (mpileup) aggregates alignments at each position for variant calling. Coverage commands calculate read depth across regions.

CRAM format provides better compression than BAM with reference-based encoding. Samtools handles CRAM transparently.

# CAVEATS

Large BAM files require significant memory for some operations. Threading helps but some commands are single-threaded. Unsorted BAM limits available operations. Index required for random access. Reference needed for CRAM files.

# HISTORY

**samtools** was developed by **Heng Li** at the Wellcome Sanger Institute, released around **2009**. It defined the SAM/BAM formats that became standards for sequence alignment. The project is maintained by the samtools/htslib team, part of the broader bioinformatics ecosystem built on these formats.

# SEE ALSO

[bcftools](/man/bcftools)(1), [bwa](/man/bwa)(1), [bedtools](/man/bedtools)(1), [tabix](/man/tabix)(1)
