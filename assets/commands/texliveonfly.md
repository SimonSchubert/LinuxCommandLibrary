# TAGLINE

Auto-install missing LaTeX packages

# TLDR

**Compile with auto-install**

```texliveonfly [document.tex]```

**Use specific engine**

```texliveonfly --compiler=[pdflatex] [document.tex]```

**With arguments**

```texliveonfly --arguments="[-shell-escape]" [document.tex]```

**Dry run**

```texliveonfly --dry-run [document.tex]```

# SYNOPSIS

**texliveonfly** [_--compiler engine_] [_--arguments args_] [_options_] _file_

# PARAMETERS

**--compiler** _ENGINE_
> TeX engine to use.

**--arguments** _ARGS_
> Pass to compiler.

**--dry-run**
> Don't actually install.

**--terminal_only**
> Console output only.

**--help**
> Show help.

# DESCRIPTION

**texliveonfly** compiles LaTeX documents while automatically installing any missing packages from the TeX Live repository. When the compiler encounters an undefined package, texliveonfly detects the error, uses **tlmgr** to install the required package, and retries compilation until all dependencies are satisfied.

The tool works with any TeX Live engine including pdflatex, xelatex, and lualatex, selectable via the **--compiler** flag. Additional compiler arguments can be passed through **--arguments**. The **--dry-run** flag shows which packages would be installed without actually performing the installation.

# CAVEATS

TeX Live required. Network access needed. Admin for global install.

# HISTORY

**texliveonfly** was created to automatically install missing LaTeX packages during compilation.

# SEE ALSO

[pdflatex](/man/pdflatex)(1), [tlmgr](/man/tlmgr)(1), [latexmk](/man/latexmk)(1)
