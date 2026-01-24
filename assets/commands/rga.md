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

**rga** (ripgrep-all) extends ripgrep to search within files. It handles PDFs, Office documents, and archives.

Adapters extract text from different formats. External tools like pdftotext are used.

Caching speeds up repeated searches. Extracted text is stored for reuse.

Archive searching descends into compressed files. Nested archives are handled.

Ripgrep features apply: regex, colors, context. Same interface for all file types.

# CAVEATS

Requires external tools for some formats. Large files slow first search. Cache uses disk space.

# HISTORY

**rga** was created by **phiresky** to extend ripgrep's search capabilities. It adds document format support while maintaining ripgrep's speed and interface.

# SEE ALSO

[rg](/man/rg)(1), [pdftotext](/man/pdftotext)(1), [grep](/man/grep)(1)
