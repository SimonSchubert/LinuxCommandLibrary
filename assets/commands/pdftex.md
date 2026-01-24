# TLDR

**Compile TeX to PDF**

```pdftex [document.tex]```

**Compile with output name**

```pdftex -jobname=[output] [document.tex]```

**Interaction mode**

```pdftex -interaction=nonstopmode [document.tex]```

**Draft mode (no output)**

```pdftex -draftmode [document.tex]```

**Show version**

```pdftex --version```

# SYNOPSIS

**pdftex** [_-interaction mode_] [_-jobname name_] [_options_] _file_

# PARAMETERS

**-interaction** _MODE_
> Set interaction (nonstopmode, batchmode, scrollmode).

**-jobname** _NAME_
> Set output name.

**-draftmode**
> No PDF output.

**-output-directory** _DIR_
> Output directory.

**-halt-on-error**
> Stop on first error.

**-ini**
> Initialize format.

# DESCRIPTION

**pdftex** is a TeX engine. It produces PDF directly.

Extended from original TeX. Adds PDF primitives.

Direct PDF generation. No DVI intermediate.

Microtypographic extensions. Better text appearance.

Foundation for pdfLaTeX. Most LaTeX uses this engine.

# CAVEATS

Plain TeX by default. Use pdflatex for LaTeX. Large documents may need multiple runs.

# HISTORY

**pdfTeX** was developed by **Hàn Thế Thành** as his PhD project. It extended TeX to output PDF directly.

# SEE ALSO

[pdflatex](/man/pdflatex)(1), [tex](/man/tex)(1), [xetex](/man/xetex)(1), [luatex](/man/luatex)(1)
