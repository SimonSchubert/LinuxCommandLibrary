# TLDR

**Subset** a TTF font file to the Basic Latin Unicode block

```fonttools subset [path/to/font.ttf] --unicodes=U+0000-007F```

Display **help**

```fonttools --help```

# SYNOPSIS

**fonttools** [_subcommand_] [_options_] [_file_]

# PARAMETERS

**subset**
> Subset font files to include only specific glyphs or Unicode ranges

**ttx**
> Convert font binaries to/from XML format

**merge**
> Merge multiple font files into one

**help**
> Display help for fonttools or a specific subcommand

**--unicodes=**_RANGE_
> Specify Unicode ranges to include (e.g., U+0000-007F)

**--output-file=**_FILE_
> Specify output file path

**--help**
> Display help message

# DESCRIPTION

**fonttools** is a Python library and command-line toolkit for manipulating font files. It provides tools for converting, subsetting, merging, and inspecting TrueType (TTF), OpenType (OTF), and other font formats.

The most common use cases include subsetting fonts for web optimization (reducing file size by including only needed glyphs), converting between binary and XML representations for inspection or editing, and merging font families.

Requires Python 3.10 or later. Install via pip with **pip install fonttools**.

# CAVEATS

Some features require optional dependencies like **brotli** for WOFF2 compression or **zopfli** for optimized WOFF compression. Complex font operations may require deep understanding of font table structures.

# HISTORY

fonttools originated in the late 1990s, created by Just van Rossum. It became one of the earliest tools for programmatic font manipulation in Python. The project has evolved significantly and is now maintained by the open-source community on GitHub, becoming a foundational tool in the font development ecosystem.

# SEE ALSO

[fc-cache](/man/fc-cache)(1), [fc-list](/man/fc-list)(1), [ttx](/man/ttx)(1)
