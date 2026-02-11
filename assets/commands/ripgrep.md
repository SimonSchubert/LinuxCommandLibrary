# TAGLINE

Fast recursive text search tool

# TLDR

**Search pattern**

```rg "[pattern]"```

**Search specific file type**

```rg -t [py] "[pattern]"```

**Case insensitive**

```rg -i "[pattern]"```

**Show context lines**

```rg -C [3] "[pattern]"```

**List files only**

```rg -l "[pattern]"```

**Search hidden files**

```rg --hidden "[pattern]"```

**Fixed string (no regex)**

```rg -F "[literal string]"```

**Count matches**

```rg -c "[pattern]"```

# SYNOPSIS

**rg** [_-i_] [_-t type_] [_-C num_] [_options_] _pattern_ [_path_]

# PARAMETERS

**-i**
> Case insensitive.

**-t** _TYPE_
> File type filter.

**-C** _NUM_
> Context lines.

**-l**
> List files only.

**-c**
> Count matches.

**-F**
> Fixed strings.

**--hidden**
> Search hidden files.

**-g** _GLOB_
> Glob filter.

**-w**
> Word boundaries.

# DESCRIPTION

**ripgrep** (rg) is a line-oriented search tool that recursively searches directories for regex patterns, optimized for speed through a Rust implementation and parallel directory traversal. It is typically several times faster than traditional grep, ag, or ack for searching large codebases.

Smart defaults make it productive out of the box: it automatically respects .gitignore rules, skips binary files and hidden directories, and provides colored output with line numbers. These defaults eliminate the need for complex exclude patterns that are common with recursive grep usage. The **--hidden** flag includes hidden files, and **-u** flags progressively disable filters for unrestricted searching.

Ripgrep supports full Unicode-aware regex syntax, PCRE2 patterns via **-P**, literal string matching with **-F**, and word boundary matching with **-w**. File type filters (**-t**) cover dozens of common programming languages and can be customized.

# CAVEATS

Different from grep. Some options renamed. Regex syntax varies.

# HISTORY

**ripgrep** was created by **Andrew Gallant** in 2016. It combines speed with smart defaults, becoming a popular grep alternative.

# SEE ALSO

[grep](/man/grep)(1), [ag](/man/ag)(1), [ack](/man/ack)(1), [fd](/man/fd)(1)
