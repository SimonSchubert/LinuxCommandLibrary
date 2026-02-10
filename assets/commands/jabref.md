# TAGLINE

open-source bibliography reference manager

# TLDR

**Start JabRef**

```jabref```

**Open bibliography file**

```jabref [library.bib]```

**Import from file**

```jabref --import [refs.ris]```

**Export to format**

```jabref [library.bib] --export [output.html]```

# SYNOPSIS

**jabref** [_options_] [_file_...]

# PARAMETERS

_file_
> BibTeX file to open.

**--import** _file_
> Import from file.

**--importToOpen** _file_
> Import and add to current library.

**--export** _file_
> Export to file.

**--exportMatches** _query_,_file_
> Export matching entries.

**--fetch** _fetcher_:_query_
> Fetch entries from online database.

**-n**, **--nogui**
> Run without GUI.

**--help**
> Show help.

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
