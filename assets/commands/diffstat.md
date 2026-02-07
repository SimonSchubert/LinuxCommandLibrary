# TAGLINE

patch file statistics generator

# TLDR

**Show diff statistics**

```diffstat [patch.diff]```

**Show from piped diff**

```diff -u [old] [new] | diffstat```

**Show with file names**

```diffstat -f [0|1|2|3|4] [patch.diff]```

**Summarize by directory**

```diffstat -p [1] [patch.diff]```

# SYNOPSIS

**diffstat** [_options_] [_file_]

# PARAMETERS

**-f** _format_
> Filename format: 0=path, 1=name, 2=auto, 3=dir, 4=count.

**-p** _num_
> Strip num path components.

**-w** _width_
> Set output width.

**-k**
> Keep temp files.

**-l**
> List files only.

# DESCRIPTION

**diffstat** reads output from diff and produces a histogram showing insertions, deletions, and modifications per file. It's commonly used to summarize patch statistics.

Reads from stdin by default, or from specified file.

# SEE ALSO

[diff](/man/diff)(1), [patch](/man/patch)(1)
