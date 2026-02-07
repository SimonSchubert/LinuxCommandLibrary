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

# SEE ALSO

[ls](/man/ls)(1), [dir](/man/dir)(1)
