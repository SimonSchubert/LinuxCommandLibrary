# TAGLINE

TeX engine that produces PDF output directly

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
> Initialize (create) a format file for faster loading.

**-fmt** _FORMAT_
> Use the specified format file instead of the default.

**-file-line-error**
> Print error messages with file name and line number.

**-synctex** _NUMBER_
> Generate SyncTeX data for editor integration (1 to enable).

**-shell-escape**
> Enable \write18 for running external commands.

**-no-shell-escape**
> Disable \write18 (default).

# DESCRIPTION

**pdfTeX** is a TeX engine that produces PDF output directly from TeX source, without an intermediate DVI stage. It extends Knuth's original TeX with PDF-specific primitives and microtypographic features such as margin kerning (character protrusion) and font expansion (hz-optimization) for improved text appearance.

pdfTeX processes plain TeX by default. For LaTeX documents, use **pdflatex** instead, which is pdfTeX with the LaTeX format preloaded.

# CAVEATS

Processes plain TeX by default; use pdflatex for LaTeX documents. Large documents with cross-references, table of contents, or bibliography may need multiple compilation runs. The `-shell-escape` flag allows arbitrary command execution and should be used with caution.

# HISTORY

**pdfTeX** was developed by **Han The Thanh** as his PhD thesis project at Masaryk University in the Czech Republic, first released in **1996**. It extended TeX to output PDF directly and introduced microtypographic features. pdfTeX became the default engine in most TeX distributions.

# SEE ALSO

[pdflatex](/man/pdflatex)(1), [tex](/man/tex)(1), [xetex](/man/xetex)(1), [luatex](/man/luatex)(1)
