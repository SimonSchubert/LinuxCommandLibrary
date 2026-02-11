# TAGLINE

Unicode-aware LaTeX to PDF compiler

# TLDR

**Compile LaTeX document to PDF**

```xelatex [document.tex]```

**Compile with shell escape enabled**

```xelatex -shell-escape [document.tex]```

**Compile to specified output directory**

```xelatex -output-directory=[build/] [document.tex]```

**Run in non-stop mode**

```xelatex -interaction=nonstopmode [document.tex]```

**Compile with job name**

```xelatex -jobname=[output] [document.tex]```

**Compile with synctex for editor integration**

```xelatex -synctex=1 [document.tex]```

# SYNOPSIS

**xelatex** [_options_] [_file_]

# PARAMETERS

**-output-directory** _dir_
> Write output files to directory.

**-jobname** _name_
> Set output file base name.

**-interaction** _mode_
> Set interaction mode: batchmode, nonstopmode, scrollmode, errorstopmode.

**-shell-escape**
> Enable \write18 shell commands.

**-no-shell-escape**
> Disable shell commands.

**-synctex** _n_
> Generate SyncTeX data for editor sync.

**-halt-on-error**
> Stop on first error.

**-file-line-error**
> Show file and line in error messages.

**--help**
> Display help.

**--version**
> Display version.

# DESCRIPTION

**xelatex** compiles LaTeX documents using the XeTeX engine, producing PDF output. It provides native Unicode (UTF-8) support and can use any system-installed OpenType or TrueType fonts directly.

Unlike pdfLaTeX, xelatex handles non-Latin scripts and complex typography without special encoding packages. The fontspec package provides high-level font selection. Documents can include characters from any writing system directly.

Multiple compilation passes may be needed for cross-references, bibliographies, and indices. Build systems like latexmk automate this process.

# CAVEATS

Some packages designed for pdfLaTeX may be incompatible. Compilation is slightly slower than pdfLaTeX. Requires fontspec for advanced font features. Part of TeX Live distribution.

# HISTORY

**XeTeX** was created by Jonathan Kew, initially for Mac OS X in 2004. It was ported to Linux in 2006 and included in TeX Live 2007. XeTeX brought modern font technology and Unicode support to TeX, making it practical for multilingual and professionally typeset documents.

# SEE ALSO

[pdflatex](/man/pdflatex)(1), [lualatex](/man/lualatex)(1), [latexmk](/man/latexmk)(1), [biber](/man/biber)(1)
