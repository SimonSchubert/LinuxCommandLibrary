# TAGLINE

reads documentation in GNU's texinfo format

# TLDR

**Read manual for command**

```info [command]```

**Start at top directory**

```info```

**Go to specific node**

```info -n "[node_name]" [command]```

**Search in manuals**

```info --apropos=[keyword]```

**Output to stdout**

```info -o - [command]```

**Use specific file**

```info -f [file.info]```

# SYNOPSIS

**info** [_options_] [_menu-item_...]

# PARAMETERS

_MENU-ITEM_
> Manual page or node to display.

**-f** _FILE_
> Read specified info file.

**-n** _NODE_
> Start at named node.

**-o** _FILE_
> Output to file (- for stdout).

**--apropos** _STRING_
> Search all manuals for string.

**-w**, **--where**
> Print location of info file.

**--help**
> Display help information.

# DESCRIPTION

**info** reads documentation in GNU's texinfo format. It provides hypertext navigation through structured documentation.

The reader supports navigation between nodes, menus, and cross-references. It offers more features than man pages including search and index.

# CAVEATS

Not all software has info pages. Navigation keys differ from man. Emacs-style keybindings.

# HISTORY

info was created as part of the **GNU project** to provide richer documentation than man pages, supporting hypertext features.

# SEE ALSO

[man](/man/man)(1), [pinfo](/man/pinfo)(1), [texinfo](/man/texinfo)(5), [install-info](/man/install-info)(1)
