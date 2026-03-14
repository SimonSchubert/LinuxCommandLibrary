# TAGLINE

patch file statistics generator

# TLDR

**Show diff statistics**

```diffstat [patch.diff]```

**Show from piped diff**

```diff -u [old] [new] | diffstat```

**Show with specific filename format**

```diffstat -f [0|1|2|3|4] [patch.diff]```

**Strip path components like patch -p**

```diffstat -p [1] [patch.diff]```

**Show as a table**

```diffstat -t [patch.diff]```

**Set histogram output width**

```diffstat -w [80] [patch.diff]```

# SYNOPSIS

**diffstat** [_options_] [_file_]

# PARAMETERS

**-C**
> Strip ANSI color escape sequences before parsing. Useful with colordiff output.

**-c**
> Show concise output with a single histogram code per file: `+` (insert), `-` (delete), `!` (modify).

**-D** _dir_
> Directory of result files to compute unchanged line counts.

**-f** _format_
> Filename format: 0=path, 1=name, 2=auto, 3=dir, 4=count.

**-l**
> List filenames only.

**-m**
> Merge insert/delete counts from each chunk to approximate modified lines.

**-p** _num_
> Strip num leading path components (like `patch -p`).

**-S** _dir_
> Directory containing original files (before applying diff).

**-t**
> Output as a comma-separated table.

**-u**
> Assume patch was created with old and new files swapped.

**-w** _width_
> Set output width (histogram is never shorter than 10 columns).

# DESCRIPTION

**diffstat** reads output from diff and produces a histogram showing insertions, deletions, and modifications per file. It is commonly used to summarize patch statistics.

Reads from stdin by default, or from a specified file.

# SEE ALSO

[diff](/man/diff)(1), [patch](/man/patch)(1)
