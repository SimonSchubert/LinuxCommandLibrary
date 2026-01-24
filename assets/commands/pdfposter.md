# TLDR

**Create 2x2 poster**

```pdfposter -p 2x2 [input.pdf] [output.pdf]```

**Scale to A0 size**

```pdfposter -s 4 [input.pdf] [output.pdf]```

**Specify output media**

```pdfposter -m a4 [input.pdf] [output.pdf]```

**Create poster with overlap**

```pdfposter -p 3x3 -o [10mm] [input.pdf] [output.pdf]```

**Preview without writing**

```pdfposter -n -p 2x2 [input.pdf] [output.pdf]```

# SYNOPSIS

**pdfposter** [_-p tiles_] [_-s scale_] [_-m media_] _input_ _output_

# PARAMETERS

**-p** _COLSxROWS_
> Tile layout.

**-s** _SCALE_
> Scale factor.

**-m** _SIZE_
> Output media size.

**-o** _SIZE_
> Overlap between tiles.

**-n**
> Dry run, no output.

**-v**
> Verbose output.

# DESCRIPTION

**pdfposter** creates posters from PDF. It tiles pages for large prints.

Splits single page into multiple. Print and assemble.

Scale factor determines size. 2x means twice original.

Tile specification sets layout. 2x2 makes 4 pages.

Overlap helps assembly. Tiles share edges.

Media size sets output pages. A4, letter, custom.

# CAVEATS

Requires PyPDF2 or pypdf. Python-based tool. Large posters need many pages.

# HISTORY

**pdfposter** was created for making large posters from PDF documents by splitting them across multiple printable pages.

# SEE ALSO

[pdfjam](/man/pdfjam)(1), [poster](/man/poster)(1), [pdfnup](/man/pdfnup)(1)
