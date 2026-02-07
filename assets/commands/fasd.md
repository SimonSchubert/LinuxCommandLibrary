# TAGLINE

frecency-based file and directory navigation

# TLDR

**Jump to frecent directory**

```z [pattern]```

**Edit frecent file**

```f [pattern]```

**List frecent directories**

```d```

**List frecent files**

```f```

**Show all frecent paths**

```fasd```

**Interactive selection**

```fasd -si [pattern]```

**Add path to database**

```fasd -A [path]```

# SYNOPSIS

**fasd** [_options_] [_patterns_...]

# DESCRIPTION

**fasd** provides quick access to frequently and recently used files and directories. It tracks access patterns and uses a "frecency" algorithm combining frequency and recency.

The tool integrates with the shell to track cd and file access, enabling fast navigation with minimal typing. Aliases like z (directories) and f (files) provide shortcuts.

# PARAMETERS

**-s**
> Show ranks and paths.

**-l**
> List paths only.

**-i**
> Interactive selection.

**-e** _cmd_
> Execute command on result.

**-a**
> Match files and directories.

**-d**
> Match directories only.

**-f**
> Match files only.

**-r**
> Match by rank only.

**-t**
> Match by recency only.

**-A**
> Add path to database.

**-D**
> Remove path from database.

# ALIASES (shell init)

**z**: Jump to directory (fasd_cd -d)
**zz**: Interactive directory select
**f**: Select file
**v**: Open frecent file in $EDITOR

# CONFIGURATION

**~/.fasd**
> Database file tracking frecency scores for files and directories.

# CAVEATS

Requires shell integration. Database builds over time. Patterns are substrings. May need manual cleanup of old entries.

# HISTORY

**fasd** was created by **Wei Dai** (clvv) inspired by autojump and z. It combined features of both, adding file tracking and extensibility. The project became popular for its speed and flexibility in shell navigation.

# SEE ALSO

[z](/man/z)(1), [autojump](/man/autojump)(1), [zoxide](/man/zoxide)(1), [fzf](/man/fzf)(1)
