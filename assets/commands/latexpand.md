# TAGLINE

Flatten LaTeX source by expanding \input and \include directives

# TLDR

**Expand includes in LaTeX file**

```latexpand [input.tex] > [output.tex]```

**Keep comments**

```latexpand --keep-comments [input.tex]```

**Expand bibliography**

```latexpand --expand-bbl [input.bbl] [input.tex]```

**Output to file**

```latexpand -o [output.tex] [input.tex]```

**Fail if an included file cannot be found**

```latexpand --fatal [input.tex]```

**Expand \usepackage directives inline**

```latexpand --expand-usepackage [input.tex]```

**Also expand biber bibliography**

```latexpand --biber [input.bcf] [input.tex]```

# SYNOPSIS

**latexpand** [_options_] _file_

# PARAMETERS

**-o**, **--output** _file_
> Output to file instead of stdout.

**--verbose**
> Show what is going on.

**--keep-comments**
> Preserve comments (lines starting with % and anything below \end{document}) in output. By default, comments are stripped.

**--empty-comments**
> Keep empty comments (trailing % at end of lines) for clarity.

**--keep-includes**
> Do not expand \input and \include directives.

**--expand-usepackage**
> Expand \usepackage directives when a matching .sty file is found in $TEXINPUTS or the current directory.

**--expand-bbl** _file_
> Inline the given .bbl file in place of the bibliography.

**--biber** _file_
> Inline the biber .bcf/bibliography data (for biblatex with the biber backend).

**-d**, **--define** _key=val_
> Define a macro for replacement. May be given multiple times.

**--explain**
> Generate explanatory comments in the output showing what was expanded.

**--show-graphics**
> List included graphics on stderr.

**--graphics_extensions** _LIST_
> Colon-separated list of possible graphics file extensions.

**--fatal**
> Exit with an error if an included file cannot be located (default is to warn).

**--makeatletter**
> Insert a \makeatletter in the preamble to help resolve some inclusion issues.

**--in-encoding** _FMT_
> Specify input file encoding using PerlIO syntax (e.g., :encoding(UTF-8)).

**--out-encoding** _FMT_
> Specify output file encoding using PerlIO syntax.

**--help**
> Display help.

# DESCRIPTION

**latexpand** expands **\input** and **\include** commands in LaTeX documents, producing a single flattened file. Useful for journal submissions that require single-file documents (e.g., arXiv) or for processing with tools that don't handle includes. It is a Perl script distributed via CTAN and TeX Live.

# SEE ALSO

[pdflatex](/man/pdflatex)(1), [latexmk](/man/latexmk)(1)
