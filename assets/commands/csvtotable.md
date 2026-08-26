# TAGLINE

convert CSV, TSV, or Excel files to a self-contained HTML table

# TLDR

Write a **standalone** HTML page

```csvtotable [input.csv] [page.html]```

Combine **several** files with the same columns

```csvtotable [a.csv] [b.csv] [page.html]```

Read an **Excel** workbook

```csvtotable [sales.xlsx] [sales.html]```

Fetch CSV from a **URL**

```csvtotable [https://example.com/data.csv] [out.html]```

Build and **preview** on a local HTTP server

```csvtotable [data.csv] --serve```

**Split** assets into a cacheable directory

```csvtotable [data.csv] [site/] --split```

Read **stdin**, write stdout

```csvtotable - - < [data.csv] > [out.html]```

# SYNOPSIS

**csvtotable** [_options_] _input_ [_input_...] [_output_]

# PARAMETERS

**--serve** [[_host_]:_port_]
> Build into a temp dir, serve over HTTP, open a browser. Empty host is loopback.

**--split**
> Write a directory (`index.html` plus hashed CSS/JS/data) instead of one file.

**--title** / **--description** _text|_@_file_
> Markdown title and description (`--title-html` / `--description-html` for raw HTML).

**--page-size** _n_
> Paginate instead of showing every row.

**--theme** _name_
> Initial colour theme (built-in or a `--css` palette).

**--css** / **--js** _file_
> Inline extra stylesheet and script (`CsvToTable.table` is the DataTables API).

**--no-header**
> Synthesize column headers.

**--no-compress**
> Inline uncompressed frontend (default pages gzip the script for older-browser fallback messaging).

**--encoding** / **--delimiter** / **--quotechar**
> Override autodetection (BOM and UTF-16 are detected).

# DESCRIPTION

**csvtotable** (vividvilla) turns tabular files into one offline HTML page with search, per-column filters, sort, pagination or virtual scroll, and export (copy, CSV, JSON, print). Inputs may be CSV, TSV, `.xlsx`, gzip of those, local paths, URLs, or `-` for stdin. Several files with the same columns are concatenated.

The Go binary embeds the frontend. Default output is a single file (~145KB empty) that unpacks with `DecompressionStream` (Chrome 103+, Firefox 113+, Safari 16.4+). **--split** is better for deployment behind a compressing server.

# CAVEATS

Not a TUI: **--serve** is a one-shot preview, not a daemon. `--css` and `--js` run as-is for anyone who opens the page. Compressed pages need a moderately new browser. Version-2 flags `--caption`, `--display-length`, `--pagination`, and `--export` still work.

# HISTORY

Originally a Python tool; current releases are a Go binary also published on PyPI/npm/Homebrew (`uvx csvtotable`, `pipx install csvtotable`, `brew install vividvilla/tap/csvtotable`).

# SEE ALSO

[csvkit](/man/csvkit)(1), [mlr](/man/mlr)(1), [xsv](/man/xsv)(1)

# RESOURCES

```[Source code](https://github.com/vividvilla/csvtotable)```

<!-- verified: 2026-08-26 -->
