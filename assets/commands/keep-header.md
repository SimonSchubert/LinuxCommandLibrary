# TAGLINE

preserves the first line of a file while passing the remaining lines through

# TLDR

**Sort file keeping header**

```keep-header [file] -- sort```

**Filter with grep keeping header**

```keep-header [file] -- grep [pattern]```

**Combine several files** into one sorted output with a single header

```keep-header [file1] [file2] -- sort -k1,1nr```

Read from **standard input**

```cat [file] | keep-header -- sort```

**Shuffle** data rows, leaving the header in place

```keep-header [file] -- shuf```

Run a **pipeline** on the data rows only

```keep-header [file] -- /bin/sh -c '(sort -r | grep [pattern])'```

# SYNOPSIS

**keep-header** [_file_...] **--** _command_ [_args_...]

# PARAMETERS

**--h**, **--help**
> Print help.

**--V**, **--version**
> Print version information and exit.

# DESCRIPTION

**keep-header** executes a command against one or more files in a header-aware fashion. The first line of each file is treated as a header. The first header is written unchanged, the remaining lines are sent to the command on standard input (header lines of subsequent files are dropped), and the command's output is appended after the header.

A double dash (**--**) separates the input files from the command, much like a pipe. It is especially useful with commands that reorder or filter lines, such as **sort**, **shuf**, **grep**, **awk** or **tail**, when processing TSV or CSV files.

# CAVEATS

Only the command directly after **--** receives the header-less data; a shell pipe placed after it applies to the whole output, header included. Wrap multi-command pipelines in **sh -c**. Does not work on CSV files whose header contains embedded newlines.

# HISTORY

keep-header is part of **eBay's TSV Utilities**, a toolkit written in **D** by Jon Degenhardt. The project has seen no new releases since 2021.

# SEE ALSO

[tsv-filter](/man/tsv-filter)(1), [head](/man/head)(1), [tail](/man/tail)(1), [sort](/man/sort)(1), [mlr](/man/mlr)(1)

# RESOURCES

```[Source code](https://github.com/eBay/tsv-utils)```

```[Documentation](https://github.com/eBay/tsv-utils/blob/master/docs/tool_reference/keep-header.md)```

<!-- verified: 2026-09-29 -->
