# TAGLINE

automatically detects and removes margins from PDF pages using

# TLDR

**Automatically detect and remove** margins from each page

```pdfcrop [path/to/input_file.pdf] [path/to/output_file.pdf]```

Set **margins** to specific values for each page

```pdfcrop [path/to/input_file.pdf] --margins '[left] [top] [right] [bottom]' [path/to/output_file.pdf]```

Set **uniform margins** using the same value for all sides

```pdfcrop [path/to/input_file.pdf] --margins [300] [path/to/output_file.pdf]```

Use a **user-defined bounding box** for cropping

```pdfcrop [path/to/input_file.pdf] --bbox '[left] [top] [right] [bottom]' [path/to/output_file.pdf]```

Use different bounding boxes for **odd and even pages**

```pdfcrop [path/to/input_file.pdf] --bbox-odd '[left] [top] [right] [bottom]' --bbox-even '[left] [top] [right] [bottom]' [path/to/output_file.pdf]```

Use **lower resolution** for faster margin detection

```pdfcrop [path/to/input_file.pdf] --resolution 72 [path/to/output_file.pdf]```

# SYNOPSIS

**pdfcrop** [_options_] _input.pdf_ [_output.pdf_]

# PARAMETERS

**--margins** _"l t r b"_
> Add margins after cropping (in bp units)

**--clip**
> Clip content to bounding box

**--bbox** _"l t r b"_
> Use specified bounding box for all pages

**--bbox-odd** _"l t r b"_
> Bounding box for odd pages

**--bbox-even** _"l t r b"_
> Bounding box for even pages

**--resolution** _dpi_
> Resolution for bounding box detection (default: 72)

**--restricted**
> Turn on restricted mode (safer for web use)

**--verbose**
> Print additional processing information

**--debug**
> Enable debug mode with more output

**--gscmd** _command_
> Specify Ghostscript command to use

**--pdftexcmd** _command_
> Specify pdftex command to use

**--help**
> Display help message

**--version**
> Display version information

# DESCRIPTION

**pdfcrop** automatically detects and removes margins from PDF pages using Ghostscript for boundary detection and pdfTeX for the actual cropping. It analyzes each page to find the bounding box of actual content and creates a new PDF with minimal whitespace.

The tool is particularly useful for preparing scanned documents, removing excess margins from journal articles, or optimizing PDFs for e-reader displays. It can process all pages automatically or apply custom bounding boxes.

# CAVEATS

Requires Ghostscript and pdfTeX to be installed. Automatic detection may not work well for pages with very light content near edges. Processing time increases with resolution; use lower resolution for faster results when precision is not critical.

# HISTORY

Originally developed as part of **texlive** by Heiko Oberdiek. Widely used in academic and publishing workflows for preparing documents. Now maintained as part of the ho-tex bundle of TeX utilities.

# SEE ALSO

[pdfjam](/man/pdfjam)(1), [pdfbook2](/man/pdfbook2)(1), [gs](/man/gs)(1), [pdflatex](/man/pdflatex)(1)
