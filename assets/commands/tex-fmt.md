# TAGLINE

Fast LaTeX source code formatter

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

**tex-fmt** is a fast LaTeX source code formatter written in Rust that standardizes indentation and whitespace in .tex files. It ensures consistent formatting across documents and teams by applying configurable indentation rules to LaTeX environments, commands, and structures.

The **-w** flag writes changes in place, while **--check** mode verifies formatting without modifying files, making it suitable for CI pipelines. Configuration can be provided via a TOML file to customize indentation width, tab handling, and other style preferences.

# CAVEATS

LaTeX specific. May break manual formatting. Test before use.

# HISTORY

**tex-fmt** is a fast LaTeX formatter written in Rust for consistent document formatting.

# SEE ALSO

[latexindent](/man/latexindent)(1), [latex](/man/latex)(1), [pdflatex](/man/pdflatex)(1)
