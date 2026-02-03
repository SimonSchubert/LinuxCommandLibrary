# TLDR

**Show line-by-line authorship**

```git annotate [file]```

**Annotate specific revision**

```git annotate [revision] -- [file]```

**Show in porcelain format**

```git annotate --porcelain [file]```

**Ignore whitespace changes**

```git annotate -w [file]```

# SYNOPSIS

**git** **annotate** [_options_] [_rev_] [_--_] _file_

# PARAMETERS

**-L** _start,end_
> Annotate specific lines.

**-w**
> Ignore whitespace changes.

**--porcelain**
> Machine-readable format.

**-M**
> Detect moved lines.

**-C**
> Detect copied lines.

# DESCRIPTION

**git annotate** shows what revision and author last modified each line of a file. Similar to git blame but with different default output format. Useful for tracking down when changes were introduced.

# SEE ALSO

[git-blame](/man/git-blame)(1), [git-log](/man/git-log)(1)

