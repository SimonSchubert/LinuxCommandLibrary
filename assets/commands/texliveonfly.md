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

**texliveonfly** installs packages on demand. It compiles and fetches.

Automatic package installation. Missing packages fetched.

Works with TeX Live. Uses tlmgr.

Multiple engines. pdflatex, xelatex, etc.

Iterative compilation. Installs until complete.

# CAVEATS

TeX Live required. Network access needed. Admin for global install.

# HISTORY

**texliveonfly** was created to automatically install missing LaTeX packages during compilation.

# SEE ALSO

[pdflatex](/man/pdflatex)(1), [tlmgr](/man/tlmgr)(1), [latexmk](/man/latexmk)(1)
