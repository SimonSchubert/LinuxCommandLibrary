# TLDR

**Sort a file alphabetically**

```sort [file]```

**Sort in reverse order**

```sort -r [file]```

**Sort numerically**

```sort -n [file]```

**Sort by specific column** (e.g., 2nd column)

```sort -k2 [file]```

**Sort by multiple columns**

```sort -k1,1 -k2,2n [file]```

**Sort unique lines only**

```sort -u [file]```

**Sort case-insensitively**

```sort -f [file]```

**Sort and save to file**

```sort [file] -o [output_file]```

**Sort human-readable sizes** (1K, 2M, 3G)

```sort -h [file]```

# SYNOPSIS

**sort** [_options_] [_file_...]

# PARAMETERS

**-r**, **--reverse**
> Reverse the sort order

**-n**, **--numeric-sort**
> Compare according to string numerical value

**-h**, **--human-numeric-sort**
> Compare human-readable numbers (2K, 1G)

**-f**, **--ignore-case**
> Fold lowercase to uppercase (case-insensitive)

**-u**, **--unique**
> Output only unique lines

**-k** _KEYDEF_
> Sort by specified key/column

**-t** _SEP_
> Use SEP as field separator

**-o** _FILE_
> Write result to FILE instead of stdout

**-c**, **--check**
> Check if input is sorted; exit with status

**-s**, **--stable**
> Stabilize sort by disabling last-resort comparison

**-m**, **--merge**
> Merge already sorted files

**-b**, **--ignore-leading-blanks**
> Ignore leading blanks in keys

**-V**, **--version-sort**
> Natural sort of version numbers

**--parallel**=_N_
> Use N parallel threads

# KEY DEFINITION

**-k** _POS1_[,_POS2_]: Sort by field from POS1 to POS2
Format: **F**[**.**_C_][_OPTS_]
- F = field number (1-based)
- C = character position within field
- OPTS = ordering options (n, r, b, f, etc.)

Examples:
- **-k2**: Sort by field 2 to end
- **-k2,2**: Sort by field 2 only
- **-k2n**: Sort by field 2 numerically
- **-k1,1 -k2,2n**: Primary alpha, secondary numeric

# DESCRIPTION

**sort** sorts lines of text files according to specified criteria. By default, it performs lexicographic (dictionary) sorting using the current locale.

Multiple input files are merged and sorted together. Output goes to stdout by default; use **-o** to write to a file (can be same as input file safely).

The **-k** option is powerful for structured data. Combined with **-t** to set the delimiter, it can sort CSV, TSV, and other columnar data by specific fields.

For large files, sort automatically uses temporary files and can utilize multiple CPU cores with **--parallel**.

# CAVEATS

Locale affects sort order. Use **LC_ALL=C** for byte-value sorting, which is faster and more predictable for machine processing.

Numeric sort (**-n**) handles integers and decimals. For version numbers like "1.10" vs "1.9", use **-V** (version sort).

Memory usage can be significant for large files. Use **-S** to limit buffer size or **-T** to specify temp directory.

# SEE ALSO

[uniq](/man/uniq)(1), [join](/man/join)(1), [comm](/man/comm)(1), [cut](/man/cut)(1), [tsort](/man/tsort)(1)
