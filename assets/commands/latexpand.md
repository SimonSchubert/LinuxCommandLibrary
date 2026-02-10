# TAGLINE

expands \\input and \\include commands in LaTeX documents, producing a single

# TLDR

**Expand includes in LaTeX file**

```latexpand [input.tex] > [output.tex]```

**Keep comments**

```latexpand --keep-comments [input.tex]```

**Expand bibliography**

```latexpand --expand-bbl [input.bbl] [input.tex]```

**Output to file**

```latexpand -o [output.tex] [input.tex]```

# SYNOPSIS

**latexpand** [_options_] _file_

# PARAMETERS

**-o** _file_
> Output to file instead of stdout.

**--keep-comments**
> Preserve comments in output.

**--expand-bbl** _file_
> Expand bibliography from .bbl file.

**--empty-comments**
> Replace comments with empty lines.

**--verbose**
> Show verbose output.

# DESCRIPTION

**latexpand** expands \\input and \\include commands in LaTeX documents, producing a single flattened file. Useful for journal submissions that require single-file documents or for processing with tools that don't handle includes.

# SEE ALSO

[pdflatex](/man/pdflatex)(1), [latexmk](/man/latexmk)(1)

