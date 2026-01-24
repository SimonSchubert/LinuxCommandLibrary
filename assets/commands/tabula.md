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

**tabula** extracts tables from PDF. It converts to structured data.

Table detection. Automatic or manual.

Multiple formats. CSV, JSON, TSV.

Area specification. Target specific regions.

Lattice and stream modes. Different table types.

# CAVEATS

Java required. Table detection varies. Complex tables may fail.

# HISTORY

**Tabula** was created by journalists at **ProPublica** and **The New York Times** for extracting data from PDF documents.

# SEE ALSO

[pdftotext](/man/pdftotext)(1), [camelot](/man/camelot)(1), [pdf2json](/man/pdf2json)(1)
