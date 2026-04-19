# TAGLINE

open-source bibliography reference manager

# TLDR

**Start JabRef**

```jabref```

**Open bibliography file**

```jabref [library.bib]```

**Import from file**

```jabref -i [refs.ris]```

**Export to a file**

```jabref -i [library.bib] -o [output.html]```

**Fetch entries from an online fetcher**

```jabref --fetch=[arxiv]:[query]```

**Run headless without the GUI**

```jabref --nogui -i [library.bib] -o [output.html]```

# SYNOPSIS

**jabref** [_options_] [_file_...]

# PARAMETERS

_file_
> BibTeX file to open.

**-i**, **--import** _file_[,_format_]
> Import or load a file with optional format specification.

**-o**, **--output** _file_[,_format_]
> Export to a file with optional format.

**-m**, **--exportMatches** _[field]searchTerm,outputFile_
> Save database entries matching a search query.

**-f**, **--fetch** _fetcher_:_query_
> Query a web fetcher (e.g., arxiv, doi, pubmed) and import results.

**-a**, **--aux** _infile,outfile_ _base-file_
> Extract a sub-database from a LaTeX .aux file.

**-g**, **--generateCitationKeys**
> Regenerate all citation keys in the opened library.

**-b**, **--blank**
> Do not open any files at startup.

**-n**, **--nogui**
> Suppress the GUI and exit after processing commands.

**-v**, **--version**
> Display the version number.

**--debug**
> Enable debug-level logging.

**-h**, **--help**
> Show help and list supported import/export formats.

# DESCRIPTION

**JabRef** is an open-source bibliography reference manager. It uses BibTeX/BibLaTeX format natively and integrates with LaTeX editors like TeXstudio, Emacs, and VS Code.

JabRef can import from many formats (RIS, EndNote, PubMed), fetch references from online databases, and manage PDF attachments. It supports grouping, searching, and automatic key generation.

# FEATURES

- BibTeX/BibLaTeX native format
- Web search (DOI, arXiv, PubMed)
- PDF and file management
- Duplicate detection
- Custom entry types
- Shared databases

# CAVEATS

Requires Java runtime. Large libraries may be slow. Some web fetchers have rate limits.

# HISTORY

JabRef was started by **Morten O. Alver** in **2003** as an open-source alternative to commercial reference managers. It's maintained by a community of developers and is popular in academic circles.

# SEE ALSO

[bibtex](/man/bibtex)(1), [zotero](/man/zotero)(1), [mendeley](/man/mendeley)(1)
