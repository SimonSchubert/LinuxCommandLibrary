# TAGLINE

Show line-by-line authorship and revision information for a file

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

**git annotate** displays line-by-line authorship information for a file, showing which commit and author last modified each line. It's functionally equivalent to **git blame** but uses a slightly different default output format that emphasizes revision information over authorship.

For each line in the file, the command displays the abbreviated commit hash, author name, timestamp, line number, and the actual line content. This makes it invaluable for understanding the history of changes, identifying when bugs were introduced, or determining who to ask about specific code sections.

The command supports detecting moved and copied code across files using the **-M** and **-C** options, following code even when it's been refactored or relocated. The **--porcelain** format provides machine-readable output suitable for parsing by scripts or tools.

While **git blame** is more commonly used and has become the de facto standard, **git annotate** remains available as an alias with historically different formatting preferences.

# SEE ALSO

[git-blame](/man/git-blame)(1), [git-log](/man/git-log)(1)

