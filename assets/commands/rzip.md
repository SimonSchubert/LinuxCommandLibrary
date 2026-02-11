# TAGLINE

Long-range compression for large files

# TLDR

**Compress file**

```rzip [file]```

**Compress keeping original**

```rzip -k [file]```

**Decompress file**

```rzip -d [file.rz]```

**Set compression level**

```rzip -[9] [file]```

**Verbose output**

```rzip -v [file]```

# SYNOPSIS

**rzip** [_options_] _files_...

# PARAMETERS

**-d**, **--decompress**
> Decompress.

**-k**, **--keep**
> Keep input files.

**-f**, **--force**
> Force overwrite.

**-0** to **-9**
> Compression level.

**-v**, **--verbose**
> Verbose output.

**-L**, **--level** _n_
> Compression level.

**-o** _file_
> Output file.

# DESCRIPTION

**rzip** is a compression program designed for large files. It uses a rolling-window algorithm similar to rsync, then bzip2, achieving good compression on files with repeated sequences.

# EXAMPLES

```bash
# Compress file
rzip largefile.tar

# Keep original
rzip -k database.sql

# Maximum compression
rzip -9 bigdata.csv

# Decompress
rzip -d file.rz

# Force overwrite
rzip -f -k important.dat

# Verbose
rzip -v -9 archive.tar
```

# CHARACTERISTICS

- Excellent for large files with repetition
- Uses rolling checksum (rsync algorithm)
- Final compression with bzip2
- Memory-intensive

# CAVEATS

High memory usage. Best for files >10MB. Cannot decompress standard gzip/bzip2.

# HISTORY

rzip was written by **Andrew Tridgell** (rsync author) to efficiently compress large files with long-distance redundancy.

# SEE ALSO

[lrzip](/man/lrzip)(1), [bzip2](/man/bzip2)(1), [gzip](/man/gzip)(1), [xz](/man/xz)(1)
