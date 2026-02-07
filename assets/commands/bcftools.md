# TAGLINE

Variant calling and VCF/BCF file manipulation

# TLDR

**View a VCF/BCF file**

```bcftools view [input.vcf.gz]```

**Filter variants** by region

```bcftools view -r [chr1:1000000-2000000] [input.vcf.gz]```

**Convert VCF to BCF**

```bcftools view -Ob -o [output.bcf] [input.vcf.gz]```

**Call variants** from aligned reads

```bcftools mpileup -f [reference.fa] [aligned.bam] | bcftools call -mv -Oz -o [calls.vcf.gz]```

**Merge multiple VCF files**

```bcftools merge [file1.vcf.gz] [file2.vcf.gz] -Oz -o [merged.vcf.gz]```

**Filter variants** by quality

```bcftools filter -i 'QUAL>30 && DP>10' [input.vcf.gz] -Oz -o [filtered.vcf.gz]```

**Extract sample genotypes**

```bcftools query -f '%CHROM\t%POS\t%REF\t%ALT[\t%GT]\n' [input.vcf.gz]```

**Index a VCF/BCF file**

```bcftools index [input.vcf.gz]```

# SYNOPSIS

**bcftools** _subcommand_ [_options_] [_file_]

# DESCRIPTION

**bcftools** is a suite of utilities for variant calling and manipulating files in the Variant Call Format (VCF) and its binary counterpart BCF. It is part of the SAMtools/HTSlib project and is widely used in bioinformatics for genomic variant analysis.

All commands work transparently with both VCF and BCF files, compressed or uncompressed. The tools are designed to work in pipelines, reading from stdin and writing to stdout.

# SUBCOMMANDS

**Variant Calling**
> mpileup, call

**File Operations**
> view, merge, concat, sort, index, convert

**Filtering & Querying**
> filter, query, norm

**Statistics**
> stats, roh, gtcheck

**Annotation**
> annotate, csq, fill-tags

**Manipulation**
> reheader, isec, +split, +scatter

**Consensus**
> consensus

# PARAMETERS

**-Ob**
> Output compressed BCF

**-Oz**
> Output compressed VCF (bgzipped)

**-Ov**
> Output uncompressed VCF

**-Ou**
> Output uncompressed BCF (fastest for piping)

**-r** _region_
> Restrict to regions (chr:from-to format)

**-s** _samples_
> Comma-separated list of samples to include

**-i** _expression_
> Include sites matching filter expression

**-e** _expression_
> Exclude sites matching filter expression

**-o** _file_
> Output file name

# CAVEATS

Use **-Ou** when piping between bcftools subcommands to avoid unnecessary compression overhead. Indexed files are required for random access and some operations. VCF/BCF files should be sorted by chromosome and position for most operations.

# HISTORY

bcftools was developed as part of the **SAMtools** project, initially created by **Heng Li** at the Wellcome Sanger Institute. It became a separate project around **2014** with the HTSlib library rewrite, gaining significant functionality for variant analysis.

# SEE ALSO

[samtools](/man/samtools)(1), [tabix](/man/tabix)(1), [bgzip](/man/bgzip)(1)
