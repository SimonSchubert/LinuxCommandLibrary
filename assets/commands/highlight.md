# TAGLINE

converts source code to formatted output with syntax highlighting

# TLDR

**Highlight source code**

```highlight [file.py]```

**Output as HTML**

```highlight -O html [file.py] > [file.html]```

**Output as ANSI** (terminal)

```highlight -O ansi [file.py]```

**Specify language**

```highlight --syntax=[python] [file]```

**Use specific theme**

```highlight --style=[molokai] [file.py]```

**List supported languages**

```highlight --list-scripts=langs```

**List available themes**

```highlight --list-scripts=themes```

# SYNOPSIS

**highlight** [_options_] [_files_...]

# DESCRIPTION

**highlight** converts source code to formatted output with syntax highlighting. It supports over 200 programming languages and can output to HTML, ANSI, RTF, LaTeX, and other formats.

The tool is useful for documentation, presentations, and generating printable source listings with proper syntax coloring.

# PARAMETERS

**-O** _format_
> Output format (html, ansi, xhtml, rtf, latex, tex, svg).

**-S**, **--syntax** _lang_
> Specify source language.

**-s**, **--style** _name_
> Color theme.

**-l**, **--line-numbers**
> Include line numbers.

**-i**, **--input** _file_
> Input file.

**-o**, **--output** _file_
> Output file.

**--list-scripts** _type_
> List langs, themes, or plugins.

**-f**, **--fragment**
> Omit document headers.

**--inline-css**
> Embed CSS in HTML.

# CAVEATS

Language detection may need hints. Theme appearance varies by output format. Some languages have limited support.

# HISTORY

**highlight** was created by **Andre Simon** as a universal source code highlighter. It has been actively developed since **2002**, continuously adding language support and output formats.

# SEE ALSO

[pygmentize](/man/pygmentize)(1), [bat](/man/bat)(1), [source-highlight](/man/source-highlight)(1), [vim](/man/vim)(1)
