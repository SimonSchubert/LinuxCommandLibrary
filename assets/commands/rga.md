# TAGLINE

Search inside PDFs, archives, and documents

# TLDR

**Search in all files**

```rga [pattern]```

**Search in directory**

```rga [pattern] [directory/]```

**Search PDFs only**

```rga --type pdf [pattern]```

**Search with context**

```rga -C [3] [pattern]```

**List supported types**

```rga --list-adapters```

**Disable cache**

```rga --no-cache [pattern]```

**Case insensitive**

```rga -i [pattern]```

# SYNOPSIS

**rga** [_--type type_] [_-C context_] [_options_] _pattern_ [_paths_]

# PARAMETERS

**--type** _TYPE_
> File type filter.

**-C**, **--context** _N_
> Context lines.

**-i**, **--ignore-case**
> Case insensitive.

**--no-cache**
> Disable caching.

**--list-adapters**
> Show adapters.

**--rga-cache-max-blob-len** _SIZE_
> Max cache size.

**-l**, **--files-with-matches**
> Filenames only.

**-c**, **--count**
> Count matches.

# SUPPORTED FORMATS

**PDF** - Via pdftotext
**Office** - Word, Excel, PowerPoint
**Archives** - zip, tar, gz
**EPUB** - E-books
**SQLite** - Databases
**Images** - OCR via tesseract

# DESCRIPTION

**rga** (ripgrep-all) extends ripgrep to search inside file formats that plain text search cannot reach, including PDFs, Word documents, Excel spreadsheets, PowerPoint presentations, zip archives, tar files, e-books, and even SQLite databases. It uses format-specific adapters backed by external tools like pdftotext and pandoc to extract searchable text from these files.

Extracted text is cached on disk so that subsequent searches over the same files are nearly instantaneous. The tool can descend into compressed archives, searching nested files without manual extraction. All standard ripgrep features are available, including regex patterns, colored output, context lines, and file type filtering, providing a consistent search interface regardless of the underlying file format.

When optional dependencies like tesseract are available, rga can perform OCR on image files to make even scanned documents searchable.

# CONFIGURATION

**~/.cache/rga/**
> Cache directory storing extracted text from binary file formats. Speeds up repeated searches over the same files.

**--rga-cache-max-blob-len**
> Controls the maximum file size for caching extracted text. Files larger than this threshold are re-extracted on each search.

# CAVEATS

Requires external tools for some formats. Large files slow first search. Cache uses disk space.

# HISTORY

**rga** was created by **phiresky** to extend ripgrep's search capabilities. It adds document format support while maintaining ripgrep's speed and interface.

# SEE ALSO

[rg](/man/rg)(1), [pdftotext](/man/pdftotext)(1), [grep](/man/grep)(1)
