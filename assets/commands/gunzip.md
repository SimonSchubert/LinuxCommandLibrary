# TAGLINE

decompresses files compressed by gzip, zip, compress, or pack

# TLDR

**Decompress a file**

```gunzip [file.gz]```

**Decompress keeping original file**

```gunzip -k [file.gz]```

**Decompress to stdout**

```gunzip -c [file.gz]```

**Decompress multiple files**

```gunzip [file1.gz] [file2.gz]```

**Test compressed file integrity**

```gunzip -t [file.gz]```

**List compression information**

```gunzip -l [file.gz]```

**Force decompression** (ignore warnings)

```gunzip -f [file.gz]```

**Verbose output**

```gunzip -v [file.gz]```

# SYNOPSIS

**gunzip** [_options_] [_files_...]

# DESCRIPTION

**gunzip** decompresses files compressed by gzip, zip, compress, or pack. It is equivalent to `gzip -d`. For each compressed file, gunzip creates the uncompressed version and removes the .gz extension.

The tool automatically detects the compression format and handles .gz, .z, .Z, and .tgz extensions. Files created by gzip can be recovered even if corrupted, with gunzip replacing damaged blocks with zeros.

gunzip preserves the original file's name, timestamp, and permissions stored in the compressed file header.

# PARAMETERS

**-c**, **--stdout**
> Write to stdout, keep original files.

**-f**, **--force**
> Force decompression even with warnings.

**-k**, **--keep**
> Keep compressed files.

**-l**, **--list**
> List compression ratio.

**-n**, **--no-name**
> Don't restore original name/timestamp.

**-N**, **--name**
> Restore original name/timestamp (default).

**-q**, **--quiet**
> Suppress warnings.

**-r**, **--recursive**
> Recurse into directories.

**-t**, **--test**
> Test integrity.

**-v**, **--verbose**
> Verbose output.

# CAVEATS

Original compressed file is removed by default. Cannot decompress to a different filename directly (use -c and redirection). May fail silently on corrupted files without -v flag.

# HISTORY

**gunzip** is part of the **gzip** package, created by **Jean-loup Gailly** and **Mark Adler** in **1992**. It was designed as a free decompressor for gzip files and also handles other compression formats for compatibility. The tool became standard on Unix systems as part of the transition from the patent-encumbered compress utility.

# SEE ALSO

[gzip](/man/gzip)(1), [zcat](/man/zcat)(1), [bunzip2](/man/bunzip2)(1), [unxz](/man/unxz)(1)
