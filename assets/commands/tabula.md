# TAGLINE

Extract tables from PDF documents

# TLDR

**Extract tables from PDF**

```tabula [document.pdf]```

**Output as CSV**

```tabula -o [output.csv] [document.pdf]```

**Specific pages**

```tabula -p [1,2,3] [document.pdf]```

**JSON output**

```tabula -f JSON [document.pdf]```

**All pages**

```tabula -p all [document.pdf]```

**With area**

```tabula -a [0,0,100,100] [document.pdf]```

# SYNOPSIS

**tabula** [_-p pages_] [_-o file_] [_-f format_] [_options_] _pdf_

# PARAMETERS

**-p** _PAGES_
> Page numbers.

**-o** _FILE_
> Output file.

**-f** _FORMAT_
> Output format (CSV, JSON, TSV).

**-a** _AREA_
> Extraction area.

**-g**
> Guess table areas.

**-l**
> Force lattice mode.

# DESCRIPTION

**tabula** extracts tabular data from PDF documents and converts it into structured formats such as CSV, JSON, or TSV. It is designed for liberating data trapped in PDFs, where tables are visually rendered but not stored as actual data structures.

The tool offers two extraction modes: lattice mode detects tables by looking for ruling lines between cells, while stream mode uses whitespace and text alignment to identify column boundaries. Automatic detection chooses the best approach, but manual mode selection often improves accuracy for specific document layouts. An area option allows targeting specific page regions when only part of a page contains the desired table.

Tabula runs as a Java application and can process specific pages or entire documents. It was originally created as a web application for journalists needing to extract data from government reports and financial disclosures, and the command-line version provides the same extraction engine for scripting and automation workflows.

# CAVEATS

Java required. Table detection varies. Complex tables may fail.

# HISTORY

**Tabula** was created by journalists at **ProPublica** and **The New York Times** for extracting data from PDF documents.

# SEE ALSO

[pdftotext](/man/pdftotext)(1), [camelot](/man/camelot)(1), [pdf2json](/man/pdf2json)(1)
