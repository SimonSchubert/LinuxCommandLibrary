# TAGLINE

Convert LaTeX formulas in HTML to images

# TLDR

**Convert HTML with LaTeX**

```gladtex [input.htex]```

**Specify output file**

```gladtex -o [output.html] [input.htex]```

**Set image directory**

```gladtex -d [images/] [input.htex]```

**Set resolution**

```gladtex -r [150] [input.htex]```

# SYNOPSIS

**gladtex** [_options_] _file_

# PARAMETERS

_FILE_
> Input .htex file.

**-o** _FILE_
> Output file.

**-d** _DIR_
> Image directory.

**-r** _DPI_
> Image resolution.

**-b** _COLOR_
> Background color.

**--help**
> Display help information.

# DESCRIPTION

**gladtex** converts LaTeX formulas embedded in HTML documents to images. It processes `.htex` files containing LaTeX math markup and produces standard HTML with rendered formula images.

The tool enables embedding mathematical notation in web pages by rendering formulas through LaTeX and converting them to images that display in any browser.

# CAVEATS

Requires LaTeX installation. Output is images, not MathML. Consider MathJax for modern sites.

# HISTORY

gladtex was created to enable mathematical formulas in HTML before widespread browser support for MathML and JavaScript math rendering.

# SEE ALSO

[latex](/man/latex)(1), [dvipng](/man/dvipng)(1)
