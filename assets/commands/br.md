# TAGLINE

Shell function for interactive directory navigation

# TLDR

Start **interactive** navigation

```br```

Show file **sizes**

```br -s```

Show **hidden** files

```br -h```

Show **only directories**

```br -f```

# SYNOPSIS

**br** [_options_] [_path_]

# DESCRIPTION

**br** is a shell function that wraps **broot**, providing interactive directory tree navigation with the ability to change directories. It is the recommended way to use broot for shell integration.

# PARAMETERS

See **broot** for all available options. Common options:

**-s, --sizes**
> Display file and directory sizes

**-h, --hidden**
> Show hidden files and directories

**-f, --only-folders**
> Show only directories

**-p, --permissions**
> Display file permissions

# CAVEATS

The br function must be installed using "broot --install" for proper shell integration. Unlike calling broot directly, br allows changing the shell's current directory.

# HISTORY

**br** is the shell function component of **broot**, installed to enable directory navigation and shell integration features.

# SEE ALSO

[broot](/man/broot)(1), [tree](/man/tree)(1), [ranger](/man/ranger)(1)
