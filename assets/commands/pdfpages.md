# TLDR

**Include PDF in LaTeX**

```\includepdf{[document.pdf]}```

**Include specific pages**

```\includepdf[pages={1,3,5}]{[document.pdf]}```

**Multiple pages per sheet**

```\includepdf[nup=2x2]{[document.pdf]}```

**Include all pages**

```\includepdf[pages=-]{[document.pdf]}```

# SYNOPSIS

**\\usepackage**{pdfpages}

**\\includepdf**[_options_]{_filename_}

# PARAMETERS

**pages**
> Page selection (-, 1-5, {1,3,5}, last).

**nup**
> Pages per sheet layout (2x2, 3x2).

**landscape**
> Landscape orientation.

**frame**
> Draw frames around pages.

**scale**
> Scale factor.

**offset**
> Position offset.

# DESCRIPTION

**pdfpages** is a LaTeX package for including external PDF documents. It supports multi-page inclusion, n-up printing, and page selection, making it essential for combining documents.

# EXAMPLE

```latex
\documentclass{article}
\usepackage{pdfpages}

\begin{document}
% Include entire PDF
\includepdf[pages=-]{external.pdf}

% Include pages 1-3, scaled
\includepdf[pages={1-3},scale=0.8]{slides.pdf}

% 2x2 layout
\includepdf[nup=2x2,pages=-]{handout.pdf}
\end{document}
```

# CAVEATS

Only works with pdfLaTeX, XeLaTeX, or LuaLaTeX. PDF must be valid. Large PDFs increase compile time.

# HISTORY

pdfpages was created by **Andreas Matthias** for the LaTeX Project, enabling seamless PDF inclusion.

# SEE ALSO

[pdflatex](/man/pdflatex)(1), [pdfjam](/man/pdfjam)(1), [pdfbook](/man/pdfbook)(1)
