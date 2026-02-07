# TAGLINE

byte-by-byte file comparison

# TLDR

**Compare two files**

```cmp [file1] [file2]```

**Silent comparison (exit code only)**

```cmp -s [file1] [file2]```

**Show all differences**

```cmp -l [file1] [file2]```

**Print differing bytes**

```cmp -b [file1] [file2]```

**Compare first N bytes**

```cmp -n [1024] [file1] [file2]```

**Skip bytes at start**

```cmp -i [100] [file1] [file2]```

# SYNOPSIS

**cmp** [_option_]... _file1_ [_file2_ [_skip1_ [_skip2_]]]

# DESCRIPTION

**cmp** compares two files byte by byte and reports the location of the first difference. By default, it prints the byte number and line number where the files diverge, or produces no output if they are identical.

Unlike **diff**, which operates on text lines, cmp works at the byte level, making it more efficient and appropriate for binary files. The **-s** (silent) mode is commonly used in scripts where only the exit status matters: 0 for identical files, 1 for differences, and 2 for errors.

The **-l** option lists all byte positions where the files differ, along with the differing byte values in octal. The tool can also skip initial bytes in one or both files and limit the comparison to a specified number of bytes.

# PARAMETERS

**-b**, **--print-bytes**
> Print differing bytes

**-i** _skip_, **--ignore-initial** _skip_
> Skip first bytes of both files

**-i** _skip1:skip2_
> Skip different amounts per file

**-l**, **--verbose**
> Output all byte differences

**-n** _limit_, **--bytes** _limit_
> Compare at most limit bytes

**-s**, **--quiet**, **--silent**
> Suppress output, exit code only

**--help**
> Display help

**-v**, **--version**
> Show version

# EXIT STATUS

**0**: Files are identical

**1**: Files differ

**2**: Error occurred

# SKIP SUFFIXES

K (1024), M (1048576), G (1073741824)

kB (1000), MB (1000000), GB (1000000000)

# CAVEATS

Cannot compare directories, only files. For text file differences, use diff instead. Reading from stdin use - as filename.

# SEE ALSO

[diff](/man/diff)(1), [comm](/man/comm)(1), [md5sum](/man/md5sum)(1)
