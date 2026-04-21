# TAGLINE

creates posters from PDF

# TLDR

**Create an A3 poster on A4 pages from an A1 source**

```pdfposter -p a3 -m a4 [input.pdf] [output.pdf]```

**Scale input by factor of 4**

```pdfposter -s 4 [input.pdf] [output.pdf]```

**Target A0 poster on A4 media**

```pdfposter -p a0 -m a4 [input.pdf] [output.pdf]```

**Use a custom media size (with margins)**

```pdfposter -m 160x247mm [input.pdf] [output.pdf]```

**Preview without writing output (dry run)**

```pdfposter -n -p 2xa4 [input.pdf] [output.pdf]```

# SYNOPSIS

**pdfposter** [_options_] _infile_ _outfile_

# PARAMETERS

**-p** _BOX_, **--poster-size** _BOX_
> Target poster size (e.g. `a0`, `2xa4`, `30x40cm`).

**-s** _NUMBER_, **--scale** _NUMBER_
> Linear scaling factor applied to the input.

**-m** _BOX_, **--media-size** _BOX_
> Output media (page) size (default: A4).

**-A**, **--art-box**
> Use ArtBox instead of TrimBox for the input page.

**-n**, **--dry-run**
> Show what would be done without writing output.

**-v**, **--verbose**
> Verbose output (repeat for more detail).

**--help-media-names**
> List recognized media and distance names.

**--version**
> Display version information.

# DESCRIPTION

**pdfposter** scales and tiles a PDF document so a single page can be printed on multiple sheets and assembled into a large poster.

The desired output size is defined with **-p**/**--poster-size** or a direct **-s**/**--scale** factor; **-m**/**--media-size** selects the paper that tiles are rendered onto. Many standard media names (A4, A3, Letter, ...) are accepted, as are explicit distances such as `10x15cm` or `160x247mm`.

Only the first page of the input is used. The program computes the number of tiles needed and writes a multi-page PDF whose pages, when printed and joined, recreate the scaled original.

# CAVEATS

Python-based tool built on pypdf/PyPDF2. Only the first page of the input is tiled. Combine with `pdfjam` or `pdftk` if you need to pre-select a page.

# HISTORY

**pdfposter** was written by **Hartmut Goebel** as a Python alternative to `poster`(1), which operates on PostScript. It has been packaged by major Linux distributions since the mid-2000s.

# SEE ALSO

[pdfjam](/man/pdfjam)(1), [poster](/man/poster)(1), [pdfnup](/man/pdfnup)(1), [pdftk](/man/pdftk)(1)
