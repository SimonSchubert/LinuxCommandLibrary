# TAGLINE

Analyze genomic variant call format files

# TLDR

**Filter VCF file** by chromosome and output new VCF

```vcftools --vcf [input.vcf] --chr [chr1] --recode --out [output]```

**Calculate allele frequency**

```vcftools --vcf [input.vcf] --freq --out [output]```

**Extract specific individuals**

```vcftools --vcf [input.vcf] --keep [individuals.txt] --recode --out [output]```

**Filter by minimum quality score**

```vcftools --vcf [input.vcf] --minQ [30] --recode --out [output]```

**Calculate depth statistics** per individual

```vcftools --vcf [input.vcf] --depth --out [output]```

**Filter by minor allele frequency**

```vcftools --vcf [input.vcf] --maf [0.05] --recode --out [output]```

**Read compressed VCF** file

```vcftools --gzvcf [input.vcf.gz] --freq --out [output]```

# SYNOPSIS

**vcftools** [**--vcf** _file_ | **--gzvcf** _file_ | **--bcf** _file_] [**--out** _prefix_] [_options_]

# PARAMETERS

**--vcf** _file_
> Input VCF file (v4.0, v4.1, or v4.2).

**--gzvcf** _file_
> Input compressed (gzipped) VCF file.

**--bcf** _file_
> Input BCF2 format file.

**--out** _prefix_
> Output file prefix. Results are written to prefix.extension.

**--recode**
> Output a new VCF file after applying filters.

**--recode-INFO-all**
> Retain all INFO fields in recoded output.

**--chr** _name_
> Process only variants on specified chromosome.

**--keep** _file_
> Retain only individuals listed in file (one ID per line).

**--remove** _file_
> Remove individuals listed in file.

**--maf** _float_
> Filter by minimum minor allele frequency.

**--minQ** _int_
> Minimum variant quality score.

**--freq**
> Calculate allele frequencies.

**--depth**
> Calculate mean depth per individual.

**--relatedness**
> Calculate pairwise relatedness statistics.

**--hap-r2**
> Calculate linkage disequilibrium statistics using phased haplotypes.

# DESCRIPTION

**VCFtools** is a suite of utilities for analyzing Variant Call Format (VCF) and Binary Call Format (BCF) files, the standard formats for storing genomic sequence variations. It provides comprehensive tools for filtering, manipulating, and computing statistics from variant data.

The tool supports filtering variants by quality scores, allele frequencies, missing data, genomic regions, and individual samples. It calculates population genetics statistics including allele frequencies, nucleotide diversity, Fst, linkage disequilibrium, and relatedness measures.

VCFtools can convert between formats, compare VCF files, and extract subsets of data for downstream analysis. Output files use the prefix specified by **--out** with appropriate extensions for each analysis type.

# CAVEATS

Large VCF files can consume significant memory. Some operations require the input to be sorted by chromosome and position. Compressed files should use bgzip compression (not gzip) for optimal performance with indexing. Binary BCF format is faster for repeated analyses.

# HISTORY

**VCFtools** was developed by **Adam Auton** and **Anthony Marcketta** at Cornell University, with the first release around **2011**. It was created to address the need for efficient VCF manipulation as next-generation sequencing became widespread. The tool has become a standard in bioinformatics pipelines for variant analysis and quality control.

# SEE ALSO

[bcftools](/man/bcftools)(1), [tabix](/man/tabix)(1), [bgzip](/man/bgzip)(1), [samtools](/man/samtools)(1)
