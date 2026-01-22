# TLDR

**Highlight source file**

```chroma [file.go]```

**Specify language**

```chroma -l python [file.py]```

**HTML output**

```chroma --html [file.js] > [output.html]```

**List available lexers**

```chroma --list```

**Use specific style**

```chroma -s monokai [file.rb]```

**HTML with inline styles**

```chroma --html --html-inline-styles [file.c]```

# SYNOPSIS

**chroma** [_options_] [_file_...]

# DESCRIPTION

**chroma** is a general purpose syntax highlighter supporting ~250 languages. Converts source code to syntax highlighted HTML, ANSI-colored terminal output, and more. Based on Pygments. Written in Go.

# PARAMETERS

**-l**, **--lexer** _name_
> Lexer to use (default: autodetect)

**-s**, **--style** _name_
> Highlighting style

**-f**, **--formatter** _name_
> Output formatter: terminal, terminal256, terminal16m, html

**--html**
> Enable HTML mode

**--html-only**
> Output HTML fragment only

**--html-inline-styles**
> Inline CSS styles (no classes)

**--list**
> List lexers, styles, formatters

**--fail**
> Exit with status 1 if lexer not found

# USAGE WITH LESS

```bash
export LESSOPEN='| chroma --fail "$1" || cat "$1"; "%s"'
```

# CAVEATS

Autodetects language from filename and content. Use --fail for fallback pipelines.

# SEE ALSO

[highlight](/man/highlight)(1), [pygmentize](/man/pygmentize)(1), [bat](/man/bat)(1)
