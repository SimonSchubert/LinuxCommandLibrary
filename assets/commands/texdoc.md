# TAGLINE

View TeX package documentation

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

**texdoc** finds and opens documentation for TeX and LaTeX packages installed in the TeX Live distribution. Given a package name, it locates the corresponding PDF manual or documentation file and opens it in the default viewer.

The **-l** flag lists all matching documentation files when multiple exist for a package. Interactive mode (**-I**) presents a numbered list for selection. Search mode (**-s**) performs a broader search across the documentation tree, finding documents that mention the query term even if they don't match the package name directly. The **-f** flag shows file paths without opening them.

# CAVEATS

Requires TeX Live documentation. Not all packages documented. PDF viewer needed.

# HISTORY

**texdoc** is part of **TeX Live** for accessing documentation. It simplifies finding manuals for the thousands of available packages.

# SEE ALSO

[tlmgr](/man/tlmgr)(1), [latex](/man/latex)(1), [pdflatex](/man/pdflatex)(1)
