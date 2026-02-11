# TAGLINE

Syntax highlight source code

# TLDR

**Highlight code file**

```pygmentize [file.py]```

**Specify output format**

```pygmentize -f [html] [file.py]```

**Output to file**

```pygmentize -o [output.html] [file.py]```

**Specify language**

```pygmentize -l [python] [file]```

**List available lexers**

```pygmentize -L lexers```

**Generate CSS**

```pygmentize -S [monokai] -f html > [style.css]```

# SYNOPSIS

**pygmentize** [_options_] [_file_]

# PARAMETERS

_FILE_
> Input file.

**-f** _FORMATTER_
> Output format.

**-l** _LEXER_
> Language lexer.

**-o** _FILE_
> Output file.

**-S** _STYLE_
> Syntax style.

**-L**
> List available options.

# DESCRIPTION

**pygmentize** is the command-line interface for the Pygments syntax highlighting library. It reads source code files and outputs syntax-highlighted versions in various formats including terminal ANSI colors, HTML, LaTeX, RTF, and SVG, supporting over 500 programming languages and markup formats.

The tool auto-detects the input language from file extensions or can be specified explicitly with **-l**. Output format is set with **-f**, and visual themes are controlled with **-S** for generating CSS stylesheets. pygmentize is widely used for generating highlighted code in documentation, blogs, and presentations.

# CAVEATS

Python library required. Many output formats.

# HISTORY

Pygments was created as a **syntax highlighting** library for Python.

# SEE ALSO

[highlight](/man/highlight)(1), [source-highlight](/man/source-highlight)(1)

