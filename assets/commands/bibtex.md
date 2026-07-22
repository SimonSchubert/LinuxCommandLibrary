# TAGLINE

Process bibliography references for LaTeX documents

# TLDR

**Process the bibliography** for a document (pass the basename, without the .aux extension)

```bibtex [document]```

**Process a specific** .aux file

```bibtex [document.aux]```

**Operate silently**, printing only error messages

```bibtex -terse [document]```

**Set the minimum** number of cross references for automatic inclusion

```bibtex -min-crossrefs=[number] [document]```

# SYNOPSIS

**bibtex** [_options_] _auxname_[.aux]

# DESCRIPTION

**bibtex** processes bibliography information for LaTeX documents. It reads .aux files produced by LaTeX, looks up citations in .bib bibliography databases, formats them according to a bibliography style (.bst), and generates a .bbl file that LaTeX includes in the final document.

The tool is essential for academic writing and managing citations in LaTeX.

# PARAMETERS

**-terse**
> Operate silently, printing only error messages.

**-min-crossrefs=**_number_
> Minimum number of cross references required before a crossref base entry is automatically included in the bibliography (default: 2). Set a large value to disable automatic inclusion.

**-help**
> Display help and exit.

**-version**
> Display version information and exit.

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

**plain**
> Numeric citations, sorted alphabetically.

**alpha**
> Alpha-numeric citation labels.

**abbrv**
> Like plain, but with abbreviated first names, months, and journal names.

**unsrt**
> Like plain, but entries appear in citation order.

**ieeetr**
> IEEE Transactions style.

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

# INSTALL

```dnf: sudo dnf install texlive```

```apk: sudo apk add texlive```

```zypper: sudo zypper install texlive```

```brew: brew install texlive```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[biber](/man/biber)(1), [latex](/man/latex)(1), [pdflatex](/man/pdflatex)(1)

# RESOURCES

```[Homepage](https://www.tug.org/bibtex/)```

<!-- verified: 2026-06-19 -->
