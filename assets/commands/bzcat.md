# TLDR

**View** compressed file

```bzcat [file.txt.bz2]```

**View** multiple files

```bzcat [file1.bz2] [file2.bz2]```

**Pipe** to less

```bzcat [file.txt.bz2] | less```

# SYNOPSIS

**bzcat** [_file_...]

# DESCRIPTION

**bzcat** decompresses bzip2 files to standard output without modifying the original compressed file. It's equivalent to `bzip2 -dc` and useful for viewing or piping compressed content.

The tool allows working with compressed files without extracting them to disk.

# WORKFLOW

```bash
# View compressed file
bzcat log.txt.bz2

# View with pager
bzcat log.txt.bz2 | less

# Search in compressed file
bzcat log.txt.bz2 | grep "error"

# Concatenate compressed files
bzcat file1.bz2 file2.bz2 > combined.txt

# Count lines in compressed file
bzcat data.txt.bz2 | wc -l
```

# FEATURES

- Preserves original compressed file
- Streams output (low memory)
- Supports multiple files
- Pipeline-friendly

# CAVEATS

Output is always to stdout. No options for compression level. For viewing only, consider bzless. Cannot handle corrupted files.

# HISTORY

**bzcat** has been part of the bzip2 suite since its creation in **1996**.

# SEE ALSO

[bzip2](/man/bzip2)(1), [bzless](/man/bzless)(1), [bzgrep](/man/bzgrep)(1), [zcat](/man/zcat)(1)
