# TAGLINE

Extract tables from PDF files

# TLDR

**Extract tables from a PDF**

```camelot read -p [1] [document.pdf]```

**Extract tables and save as CSV**

```camelot read -p [1] [document.pdf] -o [output.csv]```

**Extract tables from multiple pages**

```camelot read -p [1,2,3] [document.pdf]```

**Extract using stream mode** (for borderless tables)

```camelot read -p [1] -flavor stream [document.pdf]```

**Extract with table area specification**

```camelot read -p [1] -T [50,700,500,100] [document.pdf]```

**Generate visual debugging report**

```camelot read -p [1] -plot text [document.pdf]```

**Export to multiple formats**

```camelot read -p [1] -f [json] [document.pdf]```

# SYNOPSIS

**camelot** _command_ [_options_] _pdffile_

# PARAMETERS

**read**
> Read tables from PDF file.

**-p**, **--pages** _pages_
> Page numbers to process (e.g., "1", "1-5", "1,3,5").

**-o**, **--output** _file_
> Output file path.

**-f**, **--format** _format_
> Output format: csv, excel, html, json, markdown, sqlite.

**-flavor** _mode_
> Extraction mode: lattice (bordered) or stream (borderless).

**-T**, **--table-areas** _coords_
> Table boundaries as x1,y1,x2,y2.

**-C**, **--columns** _coords_
> Column separators for stream mode.

**-plot** _type_
> Generate debug plot: text, grid, contour, joint, line.

**-compress**
> Compress output file.

**-split**
> Split output into separate files per table.

# DESCRIPTION

**Camelot** is a Python library and CLI tool for extracting tabular data from PDF files. It uses computer vision and lattice detection algorithms to identify tables and extract their contents into structured formats.

Two extraction methods are available: **lattice** mode detects tables with visible borders by looking for intersecting lines, while **stream** mode finds tables based on whitespace patterns, suitable for borderless tables.

The tool handles multi-page extraction, merged cells, and various output formats. Visual debugging helps understand how tables are detected and tune extraction parameters for difficult PDFs.

# CAVEATS

Camelot only works with text-based PDFs; scanned documents require OCR first. Complex table layouts with nested tables or irregular structures may require manual parameter tuning. Stream mode accuracy depends heavily on consistent spacing. Large PDFs may consume significant memory.

# HISTORY

Camelot was created by **Vinayak Mehta** and released in **2019** as an open-source alternative to commercial PDF table extraction tools. Named after the legendary castle, it was designed to be "excalibur for PDF table extraction." The project gained popularity for making table extraction accessible and programmable, filling a gap in the Python data science ecosystem.

# SEE ALSO

[tabula](/man/tabula)(1), [pdftotext](/man/pdftotext)(1), [pdfplumber](/man/pdfplumber)(1)
