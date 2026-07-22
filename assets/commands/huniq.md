# TAGLINE

Filter duplicate lines without sorting

# TLDR

**Unique lines**, preserve first-seen order

```echo -e "foo\nbar\nfoo\nbaz" | huniq```

**Count occurrences**

```echo -e "foo\nbar\nfoo\nbaz" | huniq -c```

**Null-delimited** records

```find . -print0 | huniq -0```

**Custom delimiter**

```huniq -d [,]```

# SYNOPSIS

**huniq** [**-c**|**--count**] [**-0**|**--null**|**-d** *DELIM*|**--delim** *DELIM*]

# DESCRIPTION

**huniq** removes duplicate lines from stdin using a hash set instead of sorting. Output order is stable in normal mode (first occurrence wins). With **-c** / **--count** it prints occurrence counts (order is not stable in count mode).

It is intended as a faster alternative to **sort | uniq** or **sort -u** when sorted output is not required. Install with **cargo install huniq**.

# PARAMETERS

**-c**, **--count**

> Print counts of unique lines (like **uniq -c**, without sorting).

**-0**, **--null**

> Use NUL as record delimiter.

**-d**, **--delim** *DELIM*

> Use a custom delimiter instead of newline.

**-h**

> Show help.

# CAVEATS

Memory grows with the number of unique keys (hash table). For sorted unique output, keep using **sort -u**. Count mode does not preserve input order.

# INSTALL

```nix: nix profile install nixpkgs#huniq```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[uniq](/man/uniq)(1), [sort](/man/sort)(1), [awk](/man/awk)(1)

# RESOURCES

```[Source code](https://github.com/koraa/huniq)```

<!-- verified: 2026-07-19 -->
