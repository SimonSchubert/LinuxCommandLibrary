# TLDR

**Compile LaTeX document**

```latex [document.tex]```

**Compile to PDF directly**

```pdflatex [document.tex]```

**Compile with XeLaTeX**

```xelatex [document.tex]```

**Compile with LuaLaTeX**

```lualatex [document.tex]```

**Continuous compilation**

```latexmk -pvc [document.tex]```

**Clean auxiliary files**

```latexmk -c```

# SYNOPSIS

**latex** [_options_] _file_

**pdflatex** [_options_] _file_

# PARAMETERS

**-interaction** _mode_
> Interaction mode: nonstopmode, batchmode.

**-output-directory** _dir_
> Output directory.

**-shell-escape**
> Enable shell commands.

**-synctex** _n_
> Generate SyncTeX data.

**-halt-on-error**
> Stop on first error.

# DESCRIPTION

**LaTeX** is a document preparation system for high-quality typesetting. It's the standard for scientific papers, theses, and technical documentation.

Common engines: **pdflatex** (traditional), **xelatex** (Unicode/modern fonts), **lualatex** (Lua scripting). Most documents use pdflatex or lualatex.

# DOCUMENT STRUCTURE

```latex
\documentclass{article}
\usepackage{amsmath}

\title{My Document}
\author{Author Name}

\begin{document}
\maketitle

\section{Introduction}
Content here.

\end{document}
```

# CAVEATS

Multiple compilations often needed for references. Bibliography requires bibtex/biber run. Use latexmk for automation.

# HISTORY

LaTeX was created by **Leslie Lamport** in the **1980s** as a set of macros for TeX (created by Donald Knuth in 1978). It remains the standard for academic publishing.

# SEE ALSO

[pdflatex](/man/pdflatex)(1), [bibtex](/man/bibtex)(1), [latexmk](/man/latexmk)(1), [texdoc](/man/texdoc)(1)
