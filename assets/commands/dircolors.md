# TAGLINE

color scheme configurator for ls

# TLDR

**Output shell commands** to set LS_COLORS

```dircolors```

**Use a specific database file**

```dircolors [/path/to/dircolors.db]```

**Output for Bourne shell**

```dircolors -b```

**Output for C shell**

```dircolors -c```

**Print default database**

```dircolors -p```

# SYNOPSIS

**dircolors** [_options_] [_file_]

# PARAMETERS

**-b**, **--sh**, **--bourne-shell**
> Output Bourne shell commands.

**-c**, **--csh**, **--c-shell**
> Output C shell commands.

**-p**, **--print-database**
> Print the default database.

# CONFIGURATION

**~/.dircolors** or **~/.dir_colors**
> User-specific color configuration database mapping file types and extensions to colors.

**/etc/DIR_COLORS**
> System-wide default color configuration.

# DESCRIPTION

**dircolors** outputs shell commands to set the LS_COLORS environment variable, which controls the colors used by **ls** and other tools. It reads a configuration file that maps file types and extensions to colors.

Typically invoked in shell configuration files: **eval "$(dircolors)"**.

# CAVEATS

Output must be evaluated by the shell (e.g., `eval "$(dircolors)"`) to take effect. The default database covers common file types; customize with `dircolors -p > ~/.dircolors` and edit. Only affects tools that read LS_COLORS (primarily GNU ls and compatible tools).

# HISTORY

**dircolors** is part of GNU coreutils and has been included in Linux distributions since the early days of colorized terminal output.

# SEE ALSO

[ls](/man/ls)(1), [dir](/man/dir)(1)
