# TAGLINE

View TeX/LaTeX package documentation from TeX Live

# TLDR

**Open the documentation** for a package

```texdoc [package-name]```

**List matching docs** without opening anything

```texdoc -l [package-name]```

**Full-text search** across documentation

```texdoc -s [query]```

**Open in a specific PDF viewer**

```texdoc --viewer=[evince] [package-name]```

**Show file paths** instead of opening

```texdoc -f [package-name]```

**Interactively pick** between matches

```texdoc -I [package-name]```

**Open multiple packages** at once

```texdoc [package1] [package2] [package3]```

# SYNOPSIS

**texdoc** [_options_] _name_...

# PARAMETERS

**-l**, **--list**
> Show numbered list of matches; prompt to choose one.

**-s**, **--search**
> Full-text search across the documentation tree.

**-I**, **--interact**
> Force interactive mode (opposite of **--nointeract**).

**-M**, **--machine**
> Machine-readable output: one line per match (file path, score, name).

**-f**, **--files**
> Print matching file paths instead of opening them.

**-w**, **--view**
> View documentation (default action).

**-m**, **--mixed**
> Combine name search and full-text search (useful when names overlap with content).

**--viewer** _CMD_
> Override the configured PDF viewer.

**-D**, **--debug**
> Print debug output to stderr.

**-q**, **--quiet**
> Suppress informational messages.

**-v**, **--verbose**
> Increase verbosity.

**-V**, **--version**
> Show texdoc version.

# DESCRIPTION

**texdoc** finds and displays documentation for TeX, LaTeX, ConTeXt, and related packages installed in a TeX Live distribution. It searches **TEXMF** trees for files associated with a package — usually a PDF manual but sometimes README, .txt, or .html — and opens the best match in a configured viewer.

When multiple matches exist, **-l** prompts for a selection and **-s** broadens the search to the documentation contents (using the texdoc-fulltext index). The viewer is selected from configuration (**~/.texlive*/texmf-config/texdoc/texdoc.cnf**) or from the **PDFVIEWER** / **BROWSER** environment variables.

# CONFIGURATION

**texdoc.cnf**
> Per-user configuration controlling viewer selection, mode aliases, and language preferences. Searched in **TEXMFCONFIG**, **TEXMFVAR**, **TEXMFHOME**, etc.

**TEXDOCS**
> kpathsea variable controlling where texdoc looks for documentation files.

# CAVEATS

Requires a TeX Live (or MiKTeX) installation with documentation packages installed; minimal "scheme-small" installs ship without docs. Not all packages provide documentation in PDF form. Full-text search depends on the **texdoc-fulltext** package being installed.

# HISTORY

**texdoc** is part of TeX Live, written in Lua and bundled with **luatex**. Earlier shell-script versions were superseded by the Lua implementation in **TeX Live 2009**.

# INSTALL

```pacman: sudo pacman -S texlive-binextra```

```apk: sudo apk add texlive-binextra```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[tlmgr](/man/tlmgr)(1), [latex](/man/latex)(1), [pdflatex](/man/pdflatex)(1)
