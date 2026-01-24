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

**tectonic** is a modernized LaTeX engine. It downloads packages automatically, runs the right number of times, and produces reproducible output.

Automatic package management fetches missing packages from the network. No separate TeX Live installation is required.

The engine runs multiple passes automatically. References, tables of contents, and bibliographies are resolved without manual reruns.

Reproducible builds ensure the same input produces identical output. This is important for collaborative writing and version control.

Watch mode recompiles when files change. Combined with a PDF viewer, this provides live preview during editing.

Bundles are self-contained package collections. They enable offline compilation with known package versions.

# CAVEATS

Initial compilation downloads packages. Network required for new packages. Some exotic packages may be missing. Different from traditional TeX workflow.

# HISTORY

**Tectonic** was created by **Peter Williams** starting around **2016**. It builds on the XeTeX engine with modern tooling, addressing pain points of traditional TeX distributions.

# SEE ALSO

[pdflatex](/man/pdflatex)(1), [xelatex](/man/xelatex)(1), [lualatex](/man/lualatex)(1), [latexmk](/man/latexmk)(1)
