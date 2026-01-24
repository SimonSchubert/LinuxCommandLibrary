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

**rg** (ripgrep) searches fast. It respects gitignore.

Faster than grep. Rust implementation.

Smart defaults. Skips binary files.

Respects .gitignore. No manual excludes needed.

Colored output. Easy to read.

Unicode support. Full regex syntax.

# CAVEATS

Different from grep. Some options renamed. Regex syntax varies.

# HISTORY

**ripgrep** was created by **Andrew Gallant** in 2016. It combines speed with smart defaults, becoming a popular grep alternative.

# SEE ALSO

[grep](/man/grep)(1), [ag](/man/ag)(1), [ack](/man/ack)(1), [fd](/man/fd)(1)
