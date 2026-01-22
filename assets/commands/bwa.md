# TLDR

**Index** the reference genome

```bwa index [path/to/reference.fa]```

Map **single-end reads** to indexed genome

```bwa mem -t 32 [path/to/reference.fa] [path/to/read.fq.gz] | gzip > [path/to/alignment.sam.gz]```

Map **pair-end reads** to indexed genome

```bwa mem -t 32 [path/to/reference.fa] [path/to/read_1.fq.gz] [path/to/read_2.fq.gz] | gzip > [path/to/alignment.sam.gz]```

Map with **Picard compatibility** (mark shorter splits as secondary)

```bwa mem -M -t 32 [path/to/reference.fa] [path/to/read_1.fq.gz] [path/to/read_2.fq.gz] | gzip > [path/to/alignment.sam.gz]```

Map with **FASTA/Q comments** appended

```bwa mem -C -t 32 [path/to/reference.fa] [path/to/read_1.fq.gz] [path/to/read_2.fq.gz] | gzip > [path/to/alignment.sam.gz]```

# SYNOPSIS

**bwa** _command_ [_options_] [_arguments_]

# DESCRIPTION

**bwa** (Burrows-Wheeler Aligner) is a software package for mapping low-divergent DNA sequences against a large reference genome, such as the human genome. It uses the Burrows-Wheeler Transform to build an index of the reference.

The **mem** algorithm is recommended for most applications, supporting reads from 70bp to a few megabases and providing accurate mapping.

# SUBCOMMANDS

**index**
> Build index from reference genome

**mem**
> Map reads using BWA-MEM algorithm

**aln**
> Align reads (older algorithm)

**samse/sampe**
> Generate SAM from aln output

# PARAMETERS

**-t** _threads_
> Number of CPU threads

**-M**
> Mark shorter splits as secondary (Picard compatible)

**-C**
> Append FASTA/Q comment to output

**-R** _string_
> Read group header line

**-o** _file_
> Output file name

# CAVEATS

Indexing large genomes requires significant memory and time. Output is uncompressed SAM by default; pipe through gzip for storage. Quality of results depends on read quality and reference completeness.

# HISTORY

**BWA** was developed by Heng Li and first published in **2009**. The MEM algorithm was introduced in **2013** and has become the preferred method for most mapping tasks.

# SEE ALSO

[samtools](/man/samtools)(1), [bowtie2](/man/bowtie2)(1), [minimap2](/man/minimap2)(1)
