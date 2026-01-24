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

**tex** typesets documents. It's the original TeX engine.

Plain TeX format. No LaTeX macros.

DVI output. Device independent.

Mathematical typesetting. High quality.

Foundation for LaTeX. Base system.

# CAVEATS

DVI output only. Plain TeX macros. Use pdflatex for PDF.

# HISTORY

**TeX** was created by **Donald Knuth** starting in 1977 for typesetting his books, especially mathematical content.

# SEE ALSO

[latex](/man/latex)(1), [pdftex](/man/pdftex)(1), [xetex](/man/xetex)(1), [dvips](/man/dvips)(1)
