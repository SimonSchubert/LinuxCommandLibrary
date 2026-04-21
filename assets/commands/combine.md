# TAGLINE

combine lines of two files using boolean operations

# TLDR

**Output lines that appear in both files** (intersection)

```combine [file1] and [file2]```

**Output lines in file1 but not in file2** (difference)

```combine [file1] not [file2]```

**Output lines that are in either file** (union)

```combine [file1] or [file2]```

**Output lines present in exactly one file** (symmetric difference)

```combine [file1] xor [file2]```

**Read one input from standard input**

```cat [file1] | combine - and [file2]```

# SYNOPSIS

**combine** _file1_ **and**|**not**|**or**|**xor** _file2_

# PARAMETERS

**and**
> Output lines in _file1_ that are also in _file2_ (intersection).

**not**
> Output lines in _file1_ that are not in _file2_ (set difference).

**or**
> Output lines in _file1_ or in _file2_ (union); _file2_ lines are appended.

**xor**
> Output lines in exactly one of _file1_ or _file2_ (symmetric difference).

_file1_, _file2_
> Input files. Use **-** to read from standard input.

# DESCRIPTION

**combine** performs boolean set operations on the lines of two files, treating each file as a set of lines. Input does not need to be sorted; output lines appear in the order they occur in _file1_ (with _file2_ lines appended for **or**).

The command is part of the **moreutils** collection of handy Unix utilities and is useful for quickly computing set relationships on plain text data without piping through **sort**, **uniq**, and **comm**.

# CAVEATS

The operations are not commutative: swapping _file1_ and _file2_ can change the output order. Duplicate lines within a file are preserved in the output; pipe through **sort -u** for symmetric, deduplicated results. On some distributions the binary is installed as **combine** from moreutils, but may conflict with ImageMagick's legacy **combine** tool - check **which combine** or use the package's full path.

# HISTORY

**combine** is part of **moreutils**, a collection of Unix utilities maintained by Joey Hess since around **2006**. It provides set-theoretic operations that would otherwise require multiple pipeline stages with **sort** and **comm**.

# SEE ALSO

[comm](/man/comm)(1), [sort](/man/sort)(1), [uniq](/man/uniq)(1), [join](/man/join)(1), [diff](/man/diff)(1), [grep](/man/grep)(1)
