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

**--all**
> Use all matching manuals.

**--subnodes**
> Recursively output menu items.

**-k** _STRING_, **--index-search** _STRING_
> Look up STRING in all indices of all manuals.

**--help**
> Display help information.

# DESCRIPTION

**info** reads documentation in GNU's texinfo format. It provides hypertext navigation through structured documentation organized as nodes in a tree.

The reader supports navigation between nodes, menus, and cross-references. Common navigation keys: **n** (next node), **p** (previous node), **u** (up), **l** (last visited), **q** (quit), **/** or **s** (search), **Tab** (next link), **Enter** (follow link).

# CAVEATS

Not all software has info pages. Navigation keys differ from man. Uses Emacs-style keybindings by default. The **--apropos** search can be slow as it scans all info files.

# HISTORY

info was created as part of the **GNU project** to provide richer documentation than man pages, supporting hypertext features.

# SEE ALSO

[man](/man/man)(1)
