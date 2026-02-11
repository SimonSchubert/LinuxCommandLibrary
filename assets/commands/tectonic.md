# TAGLINE

Modernized self-contained LaTeX engine

# TLDR

**Compile LaTeX document**

```tectonic [document.tex]```

**Compile with output directory**

```tectonic -o [output/] [document.tex]```

**Compile with synctex**

```tectonic --synctex [document.tex]```

**Keep intermediate files**

```tectonic --keep-intermediates [document.tex]```

**Print mode** (no network)

```tectonic --only-cached [document.tex]```

**Watch mode**

```tectonic --watch [document.tex]```

**Use bundle**

```tectonic -b [bundle.tar] [document.tex]```

# SYNOPSIS

**tectonic** [_-o dir_] [_--synctex_] [_--keep-intermediates_] [_options_] _file.tex_

# PARAMETERS

**-o** _DIR_
> Output directory.

**--synctex**
> Generate SyncTeX data.

**--keep-intermediates**
> Keep .aux, .log, etc.

**--keep-logs**
> Keep log files.

**--only-cached**
> Don't download packages.

**--watch**, **-w**
> Watch and recompile.

**-b** _FILE_
> Use bundle file.

**--print**
> Print mode (PDF to stdout).

**--format** _FMT_
> Output format.

**--untrusted**
> Disable shell-escape.

**-c** _FILE_
> Config file.

**-h**, **--help**
> Show help.

# DESCRIPTION

**tectonic** is a modernized, self-contained LaTeX engine that automatically downloads packages, runs the correct number of compilation passes, and produces reproducible output. Unlike traditional TeX distributions, it requires no separate TeX Live installation — missing packages are fetched from the network on demand.

The engine automatically handles the multiple compilation passes that LaTeX typically requires for resolving references, tables of contents, bibliographies, and cross-references. Watch mode (**--watch**) recompiles whenever source files change, providing live preview when paired with a PDF viewer.

Tectonic uses bundles — self-contained package collections — to ensure reproducible builds where the same input always produces identical output. The **--only-cached** flag enables offline compilation using previously downloaded packages. This approach makes Tectonic well-suited for CI/CD pipelines and collaborative writing projects under version control.

# CAVEATS

Initial compilation downloads packages. Network required for new packages. Some exotic packages may be missing. Different from traditional TeX workflow.

# HISTORY

**Tectonic** was created by **Peter Williams** starting around **2016**. It builds on the XeTeX engine with modern tooling, addressing pain points of traditional TeX distributions.

# SEE ALSO

[pdflatex](/man/pdflatex)(1), [xelatex](/man/xelatex)(1), [lualatex](/man/lualatex)(1), [latexmk](/man/latexmk)(1)
