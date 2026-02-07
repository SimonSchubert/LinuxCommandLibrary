# TAGLINE

duplicate file finder

# TLDR

**Find duplicate files in directory**

```duff [directory]```

**Find duplicates recursively**

```duff -r [directory]```

**Show only duplicate file names**

```duff -q [directory]```

**Follow symlinks**

```duff -L [directory]```

**Compare files from multiple directories**

```duff [dir1] [dir2] [dir3]```

**Exclude empty files**

```duff -z [directory]```

# SYNOPSIS

**duff** [_options_] [_directory_...]

# PARAMETERS

**-r**, **--recursive**
> Search directories recursively.

**-q**, **--quiet**
> Quiet mode; only print file names.

**-L**, **--follow-links**
> Follow symbolic links.

**-z**, **--no-empty**
> Exclude empty files.

**-t**, **--thorough**
> Perform thorough (slow) comparison.

**-e**, **--excess**
> Only list excess duplicates, not first occurrence.

**-f** _format_
> Custom output format.

**-l** _limit_
> Limit number of duplicates to report.

# DESCRIPTION

**duff** (Duplicate File Finder) identifies duplicate files by comparing file sizes and contents. It groups files with identical content, making it useful for finding and removing redundant files to free disk space.

The tool first groups files by size, then compares content using checksums and byte-by-byte comparison when necessary. Output shows clusters of duplicate files separated by blank lines.

# OUTPUT FORMAT

```
file1.txt
file2.txt

another1.jpg
another2.jpg
another3.jpg
```

Each cluster contains files with identical content.

# CAVEATS

Large directories may take time to process. Thorough mode is slower but more accurate. Does not delete files automatically; output can be piped to removal scripts. Hard links are detected and reported separately.

# HISTORY

duff was written by **Camilla Löwy** as a simple, fast duplicate file finder for Unix systems. It focuses on efficiency by using a multi-stage comparison approach, avoiding unnecessary byte comparisons when checksums differ.

# SEE ALSO

[fdupes](/man/fdupes)(1), [rdfind](/man/rdfind)(1), [jdupes](/man/jdupes)(1), [find](/man/find)(1)
