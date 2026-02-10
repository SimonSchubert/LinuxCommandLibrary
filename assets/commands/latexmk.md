# TAGLINE

perl script that automates LaTeX document compilation

# TLDR

**Compile a LaTeX document** to PDF

```latexmk -pdf [document.tex]```

**Compile and continuously watch** for changes

```latexmk -pdf -pvc [document.tex]```

**Compile using XeLaTeX**

```latexmk -xelatex [document.tex]```

**Compile using LuaLaTeX**

```latexmk -lualatex [document.tex]```

**Clean auxiliary files**

```latexmk -c [document.tex]```

**Clean all generated files** including output

```latexmk -C [document.tex]```

**Compile with shell escape** (for minted, etc.)

```latexmk -pdf -shell-escape [document.tex]```

**Silent mode** (less output)

```latexmk -pdf -silent [document.tex]```

# SYNOPSIS

**latexmk** [_-pdf_|_-xelatex_|_-lualatex_] [_-pvc_] [_-c_|_-C_] [_options_] [_file.tex_]

# PARAMETERS

**-pdf**
> Generate PDF via pdflatex.

**-xelatex**
> Generate PDF via xelatex.

**-lualatex**
> Generate PDF via lualatex.

**-dvi**
> Generate DVI file.

**-ps**
> Generate PostScript file.

**-pvc**
> Preview continuously (watch mode).

**-pv**
> Preview after compilation.

**-c**
> Clean up auxiliary files.

**-C**
> Clean up all generated files including output.

**-f**
> Force processing past errors.

**-g**
> Force full processing (ignore timestamps).

**-silent**
> Reduce output verbosity.

**-verbose**
> Increase output verbosity.

**-interaction=** _mode_
> Set interaction mode: nonstopmode, batchmode, errorstopmode.

**-shell-escape**
> Enable shell escape (for packages like minted).

**-output-directory=** _dir_
> Output directory for generated files.

**-auxdir=** _dir_
> Directory for auxiliary files.

**-jobname=** _name_
> Set output base name.

**-bibtex**
> Run bibtex/biber when needed.

**-recorder**
> Enable recorder to track file dependencies.

# DESCRIPTION

**latexmk** is a Perl script that automates LaTeX document compilation. It determines the correct sequence and number of runs needed, automatically running latex, bibtex/biber, makeindex, and other tools as required.

LaTeX documents often need multiple passes: cross-references, bibliographies, and indexes require running latex/bibtex repeatedly. Latexmk analyzes log files and auxiliary files to determine when recompilation is needed and in what order.

The preview continuously mode (-pvc) watches source files and recompiles on changes. Combined with a PDF viewer that auto-refreshes (like Zathura, Skim, or SumatraPDF), this provides a live preview workflow.

Configuration can be set in **latexmkrc** files (system-wide, user, or project-specific). Common settings include default options, custom rules for specialized processing, and viewer preferences.

For complex documents with custom build steps, latexmk supports custom dependency rules and processing scripts, making it adaptable to most LaTeX workflows.

# CAVEATS

Requires Perl. Some packages may need special latexmkrc rules. Preview mode viewer support varies by platform. Shell escape enables arbitrary code execution - use only with trusted documents. May not detect all dependency changes.

# HISTORY

**latexmk** was written by John Collins, building on earlier work by Evan McLean and others. The script has been continuously maintained and updated since the **1990s**, becoming the standard automation tool for LaTeX compilation. It's included in TeX Live and MiKTeX distributions.

# SEE ALSO

[pdflatex](/man/pdflatex)(1), [xelatex](/man/xelatex)(1), [lualatex](/man/lualatex)(1), [bibtex](/man/bibtex)(1), [biber](/man/biber)(1)
