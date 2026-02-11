# TAGLINE

Genomic position file indexer

# TLDR

**Index a VCF file**

```tabix -p vcf [file.vcf.gz]```

**Index a BED file**

```tabix -p bed [file.bed.gz]```

**Index a GFF file**

```tabix -p gff [file.gff.gz]```

**Query a region**

```tabix [file.vcf.gz] [chr1:1000000-2000000]```

**Query with header output**

```tabix -h [file.vcf.gz] [chr1:1000000-2000000]```

**List chromosomes in index**

```tabix -l [file.vcf.gz]```

**Query regions from file**

```tabix -R [regions.bed] [file.vcf.gz]```

**Create CSI index** for large chromosomes

```tabix -C -p vcf [file.vcf.gz]```

# SYNOPSIS

**tabix** [_options_] _file_ [_region_...]

# PARAMETERS

**-p**, **--preset** _format_
> Input format preset: gff, bed, sam, vcf.

**-s**, **--sequence** _col_
> Column of sequence name (default: 1).

**-b**, **--begin** _col_
> Column of start position (default: 4).

**-e**, **--end** _col_
> Column of end position (default: 5).

**-S**, **--skip-lines** _n_
> Skip first n lines.

**-c** _char_
> Skip lines starting with character (default: #).

**-0**, **--zero-based**
> Positions are 0-based half-open.

**-C**, **--csi**
> Create CSI index instead of TBI.

**-f**, **--force**
> Overwrite existing index.

**-h**, **--print-header**
> Print header lines with output.

**-H**
> Print only header lines.

**-l**
> List chromosome names in index.

**-R** _file_
> Query regions from BED or TAB file.

**--separate-regions**
> Print region name before each group.

# DESCRIPTION

**tabix** is a generic indexer for TAB-delimited genome position files. It creates an index that enables fast retrieval of data lines overlapping specified genomic regions.

Input files must be position-sorted and compressed with **bgzip**. The index file (.tbi or .csi) enables random access to compressed data without decompressing the entire file.

Common applications include indexing VCF variant files, BED annotation files, and GFF/GTF gene annotation files. The tool is essential for working with large genomic datasets in bioinformatics pipelines.

Region queries use 1-based inclusive coordinates in the format chr:start-end.

# CAVEATS

Input must be bgzip-compressed, not gzip. TBI index format supports chromosomes up to 512 Mbp; use CSI (-C) for larger. Preset options cannot be combined with manual column specifications. The index stores column settings so retrieval doesn't need format specification.

# HISTORY

**tabix** was developed by Heng Li and published in Bioinformatics journal in 2011. It is now part of the HTSlib project maintained by the samtools/htslib team. The tool has become a standard component in genomics workflows for efficient data access.

# SEE ALSO

[bgzip](/man/bgzip)(1), [bcftools](/man/bcftools)(1), [samtools](/man/samtools)(1), [vcftools](/man/vcftools)(1)
