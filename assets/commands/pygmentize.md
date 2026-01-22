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

**pygmentize** highlights source code syntax. Python library CLI.

The tool colorizes code output. Supports many languages and formats.

pygmentize highlights code.

# CAVEATS

Python library required. Many output formats.

# HISTORY

Pygments was created as a **syntax highlighting** library for Python.

# SEE ALSO

[highlight](/man/highlight)(1), [source-highlight](/man/source-highlight)(1)

