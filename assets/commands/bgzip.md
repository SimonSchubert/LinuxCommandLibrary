# TAGLINE

Block compression with random access support for genomics data

# TLDR

**Compress** file

```bgzip [file.vcf]```

**Decompress** file

```bgzip -d [file.vcf.gz]```

**Compress** with specific threads

```bgzip -@ [4] [file.vcf]```

**Index** compressed file

```bgzip -r [file.vcf.gz]```

# SYNOPSIS

**bgzip** [_options_] [_file_]

# DESCRIPTION

**bgzip** is a block compression tool that creates gzip-compatible files with internal indexing support. Unlike standard gzip, bgzip compresses data in blocks, allowing random access to specific regions when combined with a .gzi index.

The tool is part of htslib and commonly used for genomics data files (VCF, SAM, BED) enabling indexed access.

# PARAMETERS

**-d**, **--decompress**
> Decompress file

**-c**, **--stdout**
> Write to standard output

**-@**, **--threads** _n_
> Number of threads

**-r**, **--reindex**
> Rebuild .gzi index

**-b**, **--offset** _n_
> Virtual file offset for random access

**-s**, **--size** _n_
> Size to extract (with -b)

**-l**, **--compress-level** _n_
> Compression level (0-9)

# FEATURES

- Block-based compression
- Random access support
- gzip-compatible format
- Multi-threaded compression
- Index generation (.gzi files)
- Streaming support

# WORKFLOW

```bash
# Compress VCF
bgzip variants.vcf

# Creates: variants.vcf.gz

# Decompress
bgzip -d variants.vcf.gz

# Compress with 4 threads
bgzip -@ 4 large.vcf

# Random access (requires .gzi index)
bgzip -b 1000 -s 500 file.vcf.gz
```

# USE WITH TABIX

```bash
# Compress and index
bgzip file.vcf
tabix -p vcf file.vcf.gz

# Now tools can query regions
tabix file.vcf.gz chr1:1000-2000
```

# CAVEATS

Slightly larger files than maximum gzip compression. Requires .gzi index for random access. Not all gzip tools recognize block structure. Primarily useful for genomics applications.

# HISTORY

**bgzip** was developed as part of SAMtools/htslib around **2009** to enable efficient random access to compressed genomics data files.

# SEE ALSO

[gzip](/man/gzip)(1), [tabix](/man/tabix)(1), [htslib](/man/htslib)(7)
