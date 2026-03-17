# TAGLINE

Unicode-aware LaTeX to PDF compiler

# TLDR

**Compile a LaTeX document to PDF**

```xelatex [document.tex]```

**Compile with shell escape enabled**

```xelatex -shell-escape [document.tex]```

**Compile to a specified output directory**

```xelatex -output-directory=[build/] [document.tex]```

**Run in non-stop mode, skipping errors**

```xelatex -interaction=nonstopmode [document.tex]```

**Compile with a custom job name**

```xelatex -jobname=[output] [document.tex]```

**Compile with SyncTeX for editor integration**

```xelatex -synctex=1 [document.tex]```

**Generate XDV output instead of PDF**

```xelatex -no-pdf [document.tex]```

# SYNOPSIS

**xelatex** [_options_] [_file_]

# PARAMETERS

**-output-directory** _DIR_
> Write output files to the specified directory.

**-jobname** _NAME_
> Set the output file base name.

**-interaction** _MODE_
> Set interaction mode: batchmode, nonstopmode, scrollmode, errorstopmode.

**-shell-escape**
> Enable \\write18 shell command execution.

**-no-shell-escape**
> Disable shell command execution (default).

**-synctex** _N_
> Generate SyncTeX data for editor synchronization.

**-halt-on-error**
> Stop processing at the first error.

**-file-line-error**
> Show file name and line number in error messages.

**-no-pdf**
> Generate XDV (XeTeX DeVice-independent) output rather than PDF.

**-output-driver** _CMD_
> Use CMD as the XDV-to-PDF driver instead of the default xdvipdfmx.

**-8bit**
> Make all characters printable by default.

**--help**
> Display help information.

**--version**
> Display version information.

# DESCRIPTION

**xelatex** compiles LaTeX documents using the XeTeX engine, producing PDF output. It provides native Unicode (UTF-8) support and can use any system-installed OpenType or TrueType fonts directly via the **fontspec** package.

Unlike pdfLaTeX, xelatex handles non-Latin scripts and complex typography without special encoding packages. Documents can include characters from any writing system directly. Internally, xelatex first produces an XDV (XeTeX DeVice-independent) file, then converts it to PDF using xdvipdfmx.

Multiple compilation passes may be needed for cross-references, bibliographies, and indices. Build systems like **latexmk** automate this process.

# CAVEATS

Some packages designed for pdfLaTeX may be incompatible. Compilation is slightly slower than pdfLaTeX due to the two-stage XDV-to-PDF conversion. Microtype support is more limited than in pdfLaTeX or LuaLaTeX. Part of the TeX Live distribution.

# HISTORY

**XeTeX** was created by Jonathan Kew, initially for Mac OS X in **2004**. It was ported to Linux in **2006** and included in TeX Live **2007**. XeTeX brought modern font technology and Unicode support to TeX, making it practical for multilingual and professionally typeset documents.

# SEE ALSO

[xetex](/man/xetex)(1), [pdflatex](/man/pdflatex)(1), [lualatex](/man/lualatex)(1), [latexmk](/man/latexmk)(1), [biber](/man/biber)(1)
