# TAGLINE

Optimize and clean SVG files

# TLDR

**Optimize an SVG file**

```scour -i [input.svg] -o [output.svg]```

**Optimize with maximum compression**

```scour -i [input.svg] -o [output.svg] --enable-id-stripping --enable-comment-stripping --shorten-ids```

**Remove metadata and editor data**

```scour -i [input.svg] -o [output.svg] --remove-metadata```

**Indent output for readability**

```scour -i [input.svg] -o [output.svg] --indent=space```

**Process from stdin to stdout**

```cat [input.svg] | scour > [output.svg]```

**Show optimization statistics**

```scour -i [input.svg] -o [output.svg] -v```

# SYNOPSIS

**scour** [_options_] [_-i input.svg_] [_-o output.svg_]

# PARAMETERS

**-i** _file_, **--input**=_file_
> Input SVG file (default: stdin)

**-o** _file_, **--output**=_file_
> Output SVG file (default: stdout)

**-p** _digits_, **--set-precision**=_digits_
> Number of significant digits for coordinates

**--enable-id-stripping**
> Remove unreferenced ID attributes

**--enable-comment-stripping**
> Remove all comments

**--shorten-ids**
> Replace IDs with shorter versions

**--remove-metadata**
> Remove metadata elements

**--indent**=_type_
> Indentation type: none, space, tab

**-v**, **--verbose**
> Show statistics about optimization

**-q**, **--quiet**
> Suppress non-error output

# DESCRIPTION

**Scour** is a Python-based SVG optimizer that reduces file size by removing unnecessary data and optimizing structure. It cleans "cruft" added by SVG editors while maintaining identical visual rendering.

Optimizations include removing unused elements and attributes, shortening numeric values, collapsing groups, and converting shapes to paths. The tool is designed for preparing SVGs for web deployment or further processing.

Scour performs lossless optimization by default, preserving the visual appearance of the original file. More aggressive options may alter structure but should not affect rendering.

# CAVEATS

Never overwrite original files; Scour changes document structure and semantics. Hand-edited SVGs may not produce optimal results since Scour is designed for editor-generated files. Some optimizations may cause issues with specific SVG viewers or processors.

# HISTORY

Scour was originally created by **Jeff Schiller** and **Louis Simard** as an open-source tool for SVG optimization. It became popular in the Inkscape community and is now maintained by Tobias Oberstein and Patrick Storz. Licensed under Apache-2.0.

# SEE ALSO

[svgo](/man/svgo)(1), [inkscape](/man/inkscape)(1), [convert](/man/convert)(1), [xmllint](/man/xmllint)(1)
