# TLDR

**Open package documentation**

```texdoc [package-name]```

**List available docs**

```texdoc -l [package-name]```

**Search documentation**

```texdoc -s [query]```

**Open in specific viewer**

```texdoc --viewer=[evince] [package-name]```

**Show file path**

```texdoc -f [package-name]```

**Interactive mode**

```texdoc -I [package-name]```

# SYNOPSIS

**texdoc** [_-l_] [_-s_] [_-I_] [_options_] _query_

# PARAMETERS

**-l**, **--list**
> List matches.

**-s**, **--search**
> Full search.

**-I**, **--interact**
> Interactive mode.

**-f**, **--files**
> Show file paths.

**-w**, **--view**
> View documentation.

**--viewer** _CMD_
> PDF viewer.

**-D**, **--debug**
> Debug output.

# DESCRIPTION

**texdoc** finds and opens TeX/LaTeX documentation. It searches the TeX Live documentation tree.

Package names find their docs. Most packages have PDF manuals.

List mode shows all matches. Multiple docs may exist.

Interactive mode lets you choose. Select from numbered list.

Search mode does full-text search. Finds docs mentioning query.

# CAVEATS

Requires TeX Live documentation. Not all packages documented. PDF viewer needed.

# HISTORY

**texdoc** is part of **TeX Live** for accessing documentation. It simplifies finding manuals for the thousands of available packages.

# SEE ALSO

[tlmgr](/man/tlmgr)(1), [latex](/man/latex)(1), [pdflatex](/man/pdflatex)(1)
