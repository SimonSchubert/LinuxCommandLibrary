# TLDR

**Format file**

```tex-fmt [document.tex]```

**Format in place**

```tex-fmt -w [document.tex]```

**Check formatting**

```tex-fmt --check [document.tex]```

**Format from stdin**

```cat [document.tex] | tex-fmt```

**With config**

```tex-fmt -c [tex-fmt.toml] [document.tex]```

# SYNOPSIS

**tex-fmt** [_-w_] [_--check_] [_-c config_] [_options_] _files_

# PARAMETERS

**-w**
> Write in place.

**--check**
> Check only.

**-c** _FILE_
> Config file.

**--stdin**
> Read stdin.

**--tabsize** _N_
> Tab size.

# DESCRIPTION

**tex-fmt** formats LaTeX files. It standardizes whitespace.

Consistent indentation. Clean formatting.

Check mode for CI. Verify without changing.

Configurable rules. Customize style.

Fast formatting. Rust implementation.

# CAVEATS

LaTeX specific. May break manual formatting. Test before use.

# HISTORY

**tex-fmt** is a fast LaTeX formatter written in Rust for consistent document formatting.

# SEE ALSO

[latexindent](/man/latexindent)(1), [latex](/man/latex)(1), [pdflatex](/man/pdflatex)(1)
