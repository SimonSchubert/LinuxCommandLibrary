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
> Set interaction mode: batchmode, nonstopmode, scrollmode, or errorstopmode.

**-jobname** _NAME_
> Set the job name instead of deriving it from the input file name.

**-ini**
> Start in INI mode for dumping formats; no format is preloaded.

**-output-directory** _DIR_
> Write output files in DIR instead of the current directory.

**-halt-on-error**
> Stop processing at the first error.

**-file-line-error**
> Print error messages in file:line:error format.

**-recorder**
> Enable the filename recorder, creating a .fls file listing opened files.

**-fmt** _NAME_
> Use NAME as the format instead of the default.

# DESCRIPTION

**tex** is the original TeX typesetting engine created by Donald Knuth. It reads plain TeX source files and produces DVI (Device Independent) output, which can then be converted to PostScript, PDF, or other formats using tools like dvips or dvipdfm.

TeX uses the plain TeX macro format by default, which provides basic typesetting commands without the higher-level abstractions of LaTeX. It excels at mathematical typesetting, producing publication-quality output for equations, formulas, and technical documents. TeX serves as the foundation upon which LaTeX, ConTeXt, and other macro packages are built.

# CAVEATS

Produces DVI output only; use pdftex or pdflatex for direct PDF output. Uses plain TeX macros by default without higher-level LaTeX abstractions.

# HISTORY

**TeX** was created by **Donald Knuth** starting in 1977 for typesetting his books, especially mathematical content.

# SEE ALSO

[latex](/man/latex)(1), [pdftex](/man/pdftex)(1), [xetex](/man/xetex)(1), [dvips](/man/dvips)(1)
