# TAGLINE

Original TeX typesetting engine

# TLDR

**Compile document**

```tex [document.tex]```

**Compile with jobname**

```tex -jobname=[output] [document.tex]```

**Interaction mode**

```tex -interaction=nonstopmode [document.tex]```

**Initialize format**

```tex -ini [format.tex]```

# SYNOPSIS

**tex** [_-interaction mode_] [_-jobname name_] [_options_] _file_

# PARAMETERS

**-interaction** _MODE_
> Set mode (nonstopmode, batchmode).

**-jobname** _NAME_
> Output base name.

**-ini**
> Initialize format.

**-output-directory** _DIR_
> Output location.

**--help**
> Show help.

# DESCRIPTION

**tex** is the original TeX typesetting engine created by Donald Knuth. It reads plain TeX source files and produces DVI (Device Independent) output, which can then be converted to PostScript, PDF, or other formats using tools like dvips or dvipdfm.

TeX uses the plain TeX macro format by default, which provides basic typesetting commands without the higher-level abstractions of LaTeX. It excels at mathematical typesetting, producing publication-quality output for equations, formulas, and technical documents. TeX serves as the foundation upon which LaTeX, ConTeXt, and other macro packages are built.

# CAVEATS

DVI output only. Plain TeX macros. Use pdflatex for PDF.

# HISTORY

**TeX** was created by **Donald Knuth** starting in 1977 for typesetting his books, especially mathematical content.

# SEE ALSO

[latex](/man/latex)(1), [pdftex](/man/pdftex)(1), [xetex](/man/xetex)(1), [dvips](/man/dvips)(1)
