# TLDR

**Jump to highest ranked directory matching pattern**

```z [pattern]```

**Jump to directory matching multiple patterns**

```z [foo] [bar]```

**Interactive selection with fzf**

```zi [pattern]```

**Add a directory to the database**

```zoxide add [/path/to/dir]```

**Remove a directory from the database**

```zoxide remove [/path/to/dir]```

**List all entries**

```zoxide query -l```

**Show entry scores**

```zoxide query -ls```

# SYNOPSIS

**zoxide** _subcommand_ [_options_] [_arguments_]

**z** [_pattern_...]

**zi** [_pattern_...]

# SUBCOMMANDS

**add** _path_
> Add directory to database

**edit**
> Edit database interactively

**import** _file_
> Import from autojump/z database

**init** _shell_
> Generate shell initialization

**query** [_pattern_...]
> Search database

**remove** _path_
> Remove directory from database

# PARAMETERS (query)

**-l**, **--list**
> List matches instead of selecting best

**-s**, **--score**
> Show scores with results

**-i**, **--interactive**
> Interactive selection (requires fzf)

**--exclude** _path_
> Exclude path from results

# DESCRIPTION

**zoxide** is a smarter cd command that learns your habits. It tracks directory visits and uses frecency (frequency + recency) to rank directories, allowing quick navigation with minimal typing.

After shell integration, **z foo** jumps to the most likely directory containing "foo". Multiple patterns narrow results: **z foo bar** finds paths with both patterns in order.

The **zi** command opens fzf for interactive selection when multiple matches exist.

Shell initialization: add **eval "$(zoxide init bash)"** (or zsh, fish, etc.) to your shell profile.

zoxide is a faster, more modern alternative to **autojump** and **z.sh**, written in Rust.

# CAVEATS

Requires shell initialization to track directories and provide z/zi commands.

Database needs time to learn your patterns. New installations have limited effectiveness.

Interactive mode requires fzf to be installed.

Different from the **z** shell plugin but can import its database.

# SEE ALSO

[cd](/man/cd)(1), [z](/man/z)(1), [autojump](/man/autojump)(1), [fzf](/man/fzf)(1)
