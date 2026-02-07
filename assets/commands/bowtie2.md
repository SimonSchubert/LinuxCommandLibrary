# TAGLINE

Align sequencing reads to reference genomes.

# TLDR

**Align reads** to a reference genome

```bowtie2 -x [genome_index] -1 [reads_1.fq] -2 [reads_2.fq] -S [output.sam]```

**Align single-end reads**

```bowtie2 -x [genome_index] -U [reads.fq] -S [output.sam]```

**Use multiple threads** for faster alignment

```bowtie2 -p [8] -x [genome_index] -1 [reads_1.fq] -2 [reads_2.fq] -S [output.sam]```

**Build an index** from a reference genome

```bowtie2-build [reference.fa] [index_base]```

**Align with local** (soft-clipping) mode

```bowtie2 --local -x [genome_index] -U [reads.fq] -S [output.sam]```

**Very sensitive alignment**

```bowtie2 --very-sensitive -x [genome_index] -1 [r1.fq] -2 [r2.fq] -S [out.sam]```

**Output unaligned reads** to a file

```bowtie2 -x [genome_index] -U [reads.fq] -S [output.sam] --un [unaligned.fq]```

# SYNOPSIS

**bowtie2** [_options_] **-x** _index_ {**-1** _m1_ **-2** _m2_ | **-U** _reads_} **-S** _sam_

**bowtie2-build** [_options_] _reference_ _index_base_

# DESCRIPTION

**bowtie2** is a fast and memory-efficient tool for aligning sequencing reads to long reference sequences. It is particularly good at aligning reads of about 50 to 1000 base pairs to relatively large genomes like the human genome.

Bowtie2 uses an FM Index (based on the Burrows-Wheeler transform) for the reference genome, enabling fast alignment while maintaining low memory usage. It supports gapped, local, and paired-end alignment modes.

The alignment output is SAM format, which can be processed by samtools and other downstream tools for variant calling, expression analysis, and other genomics workflows.

# PARAMETERS

**-x** _index_
> Index filename prefix (built with bowtie2-build).

**-1** _reads_
> Comma-separated files with #1 mates.

**-2** _reads_
> Comma-separated files with #2 mates.

**-U** _reads_
> Comma-separated files with unpaired reads.

**-S** _sam_
> Output SAM file.

**-p** _threads_
> Number of parallel threads.

**--local**
> Local alignment mode (soft-clipping).

**--end-to-end**
> End-to-end alignment (default).

**--very-fast**
> Preset for very fast alignment.

**--sensitive**
> Preset for sensitive alignment (default).

**--very-sensitive**
> Preset for very sensitive alignment.

**--un** _file_
> Write unaligned reads to file.

**--al** _file_
> Write aligned reads to file.

**-q**
> Input files are FASTQ (default).

**-f**
> Input files are FASTA.

# CAVEATS

Index must be built before alignment using bowtie2-build. Memory usage scales with genome size. Very sensitive mode is significantly slower. Paired-end alignment requires coordinated mate files. Output needs sorting for many downstream applications.

# HISTORY

**Bowtie2** was developed by **Ben Langmead** and **Steven Salzberg** at Johns Hopkins University, published in **2012** in Nature Methods. It succeeded the original Bowtie aligner with improved handling of longer reads and gapped alignments. Bowtie2 has become one of the most widely used aligners in genomics research, particularly for DNA-seq and ChIP-seq analysis.

# SEE ALSO

[bowtie](/man/bowtie)(1), [bwa](/man/bwa)(1), [samtools](/man/samtools)(1), [hisat2](/man/hisat2)(1)
