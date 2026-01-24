# TLDR

**Compile LaTeX to PDF**

```pdflatex [document.tex]```

**Compile in non-stop mode**

```pdflatex -interaction=nonstopmode [document.tex]```

**Compile with shell escape**

```pdflatex -shell-escape [document.tex]```

**Output to specific directory**

```pdflatex -output-directory=[outdir] [document.tex]```

**Specify output name**

```pdflatex -jobname=[output] [document.tex]```

# SYNOPSIS

**pdflatex** [_options_] _file_

# DESCRIPTION

**pdflatex** compiles LaTeX documents directly to PDF format. It's part of TeX Live and MiKTeX distributions, and the most common way to produce PDFs from LaTeX source.

The tool processes .tex files, handling typesetting, cross-references, and including graphics. Multiple runs may be needed for complete document processing.

# PARAMETERS

**-interaction=** _mode_
> Interaction mode (batchmode, nonstopmode, scrollmode, errorstopmode).

**-output-directory=** _dir_
> Output directory.

**-jobname=** _name_
> Set output name.

**-shell-escape**
> Enable shell commands.

**-halt-on-error**
> Stop at first error.

**-file-line-error**
> Show file:line:error format.

**-synctex=** _n_
> Generate SyncTeX data.

# CAVEATS

Often needs multiple runs for references. Shell escape has security implications. Package errors can be cryptic. Auxiliary files accumulate.

# HISTORY

**pdfTeX** was developed by **Han The Thanh** starting in **1996**, extending TeX to output PDF directly. pdflatex combines this with the LaTeX format. It became the standard LaTeX workflow, largely replacing DVI output.

# SEE ALSO

[latex](/man/latex)(1), [xelatex](/man/xelatex)(1), [lualatex](/man/lualatex)(1), [bibtex](/man/bibtex)(1)
