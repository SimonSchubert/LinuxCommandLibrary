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

**Install** or reinstall the br shell function

```broot --install```

# SYNOPSIS

**br** [_options_] [_path_]

# DESCRIPTION

**br** is a shell function that wraps **broot**, providing interactive directory tree navigation with the ability to change the shell's working directory. It is the recommended way to use broot for shell integration. Supported shells are bash, zsh, fish, and nushell.

On first run, broot offers to register the **br** function in your shell config. You can also install it manually with **broot --install**, or print the function with **broot --print-shell-function** _shell_.

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

[broot](/man/broot)(1), [tree](/man/tree)(1), [ranger](/man/ranger)(1), [nnn](/man/nnn)(1), [yazi](/man/yazi)(1)

# RESOURCES

```[Source code](https://github.com/Canop/broot)```

```[Homepage](https://dystroy.org/broot/)```

<!-- verified: 2026-06-19 -->
