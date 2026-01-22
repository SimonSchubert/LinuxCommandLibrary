# TLDR

**Convert equation** to image

```echo "x = {-b +- sqrt{b sup 2 - 4ac}} over 2a" | eqn2graph > [equation.png]```

**Specify output format**

```echo "[equation]" | eqn2graph -format [svg]```

**Set font size**

```echo "[equation]" | eqn2graph -s [14]```

# SYNOPSIS

**eqn2graph** [_options_]

# PARAMETERS

**-format** _FORMAT_
> Output format: png, svg, pdf, etc.

**-s** _SIZE_
> Font point size.

**-unsafe**
> Allow unsafe operations.

**-v**
> Verbose mode.

# DESCRIPTION

**eqn2graph** converts eqn equation descriptions into graphic images. It's a wrapper that processes eqn input through groff and converts the output to various image formats.

The tool reads equation text from stdin using eqn syntax and produces image files suitable for embedding in documents, web pages, or presentations.

eqn2graph is useful for generating standalone equation images without full document processing.

# CAVEATS

Requires groff and image conversion tools. Output quality depends on settings. Complex equations may need adjustment. Limited to eqn syntax.

# HISTORY

eqn2graph is part of the **groff** suite, providing a convenient way to generate equation images from eqn's preprocessor language.

# SEE ALSO

[eqn](/man/eqn)(1), [groff](/man/groff)(1), [pic2graph](/man/pic2graph)(1)
