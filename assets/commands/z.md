# TLDR

**Jump to most frecent directory matching pattern**

```z [pattern]```

**Jump to directory matching multiple patterns**

```z [foo] [bar]```

**List matching directories ranked by frecency**

```z -l [pattern]```

**Jump to highest ranked match only**

```z -r [pattern]```

**Jump to most recently accessed match**

```z -t [pattern]```

**Remove current directory from database**

```z -x```

# SYNOPSIS

**z** [**-chlrtx**] [_pattern_...]

# PARAMETERS

**-c**
> Restrict matches to subdirectories of current directory

**-h**
> Show help

**-l**
> List matches instead of jumping

**-r**
> Match by rank only (most accessed)

**-t**
> Match by recency only (most recent)

**-x**
> Remove current directory from datafile

# DESCRIPTION

**z** tracks your most used directories and allows you to jump to them with minimal keystrokes. It uses "frecency" - a combination of frequency and recency - to rank directories.

As you navigate with cd, z learns which directories you visit most. Typing **z foo** jumps to the most frecent directory containing "foo" in its path. Multiple arguments are matched in order: **z foo bar** matches paths containing "foo" followed by "bar".

The database is stored in **~/.z** by default and is updated automatically when changing directories (via a shell hook).

# CAVEATS

Requires shell integration. Add **source /path/to/z.sh** to your shell profile (.bashrc, .zshrc) for it to track directories.

New installations start with an empty database. It takes time for z to learn your patterns.

Matching is case-insensitive by default but can be configured.

Similar tools exist: **zoxide**, **autojump**, **fasd** offer comparable functionality with different features.

# SEE ALSO

[cd](/man/cd)(1), [zoxide](/man/zoxide)(1), [autojump](/man/autojump)(1), [pushd](/man/pushd)(1)
