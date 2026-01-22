# TLDR

**Generate** bibliography

```bibtex [document]```

# SYNOPSIS

**bibtex** _aux-file_

# DESCRIPTION

**bibtex** processes bibliography information for LaTeX documents. It reads .aux files produced by LaTeX, looks up citations in .bib bibliography databases, formats them according to a bibliography style (.bst), and generates a .bbl file that LaTeX includes in the final document.

The tool is essential for academic writing and managing citations in LaTeX.

# WORKFLOW

```bash
# 1. Run LaTeX (generates .aux with citations)
pdflatex document.tex

# 2. Run BibTeX (processes bibliography)
bibtex document

# 3. Run LaTeX twice more (to resolve references)
pdflatex document.tex
pdflatex document.tex
```

# FILES

**document.tex**
> LaTeX source with \cite commands

**refs.bib**
> Bibliography database

**document.aux**
> Auxiliary file (LaTeX output)

**document.bbl**
> Formatted bibliography (BibTeX output)

**document.blg**
> BibTeX log file

# BIBLIOGRAPHY STYLE

Common styles:
- **plain** - Numeric citations, alphabetical
- **alpha** - Alpha-numeric citations
- **abbrv** - Abbreviated names
- **unsrt** - Unsorted, citation order
- **ieeetr** - IEEE Transactions style

# BIB FORMAT

```bibtex
@article{key2023,
  author = {Author, First},
  title = {Article Title},
  journal = {Journal Name},
  year = {2023},
  volume = {10},
  pages = {1-20}
}
```

# CAVEATS

Requires multiple LaTeX/BibTeX runs. Error messages can be cryptic. BibTeX syntax strict. Modern alternative: biblatex/biber. Unicode support limited (use biber for full Unicode).

# HISTORY

**BibTeX** was created by Oren Patashnik in **1985** as part of the LaTeX document preparation system to manage bibliographies.

# SEE ALSO

[biber](/man/biber)(1), [latex](/man/latex)(1), [pdflatex](/man/pdflatex)(1)
