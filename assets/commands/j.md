# TLDR

**Jump to directory**

```j [pattern]```

**Jump to child directory**

```jc [pattern]```

**Open directory in file manager**

```jo [pattern]```

**Show matching directories**

```j -s [pattern]```

**Add directory to database**

```j -a [/path/to/dir]```

# SYNOPSIS

**j** [_options_] [_pattern_]

# PARAMETERS

_PATTERN_
> Directory name pattern to match.

**-s**
> Show matching directories.

**-a** _PATH_
> Add path to database.

**-i**
> Case-insensitive match.

**--help**
> Display help information.

# DESCRIPTION

**j** is the autojump shell function for quick directory navigation. It learns from your cd habits and jumps to frequently visited directories.

The tool maintains a weighted database of directories. Partial names match against this database for fast navigation.

j is autojump's directory jumper.

# CAVEATS

Alias for autojump. Requires shell integration. Database builds over time.

# HISTORY

j is the default alias for **autojump**, created by **William Ting** to speed up directory navigation in the shell.

# SEE ALSO

[autojump](/man/autojump)(1), [z](/man/z)(1), [cd](/man/cd)(1), [fasd](/man/fasd)(1)
