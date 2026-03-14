# TAGLINE

TUI librarian for PDFs and EPUBs

# TLDR

**Open** library browser

```gorae```

**Add** files to library

```gorae add [/path/to/books]```

**Search** library

```gorae search [query]```

# SYNOPSIS

**gorae** [_options_] [_command_]

# PARAMETERS

**add** _PATH_
> Add files or directory to library

**remove** _ID_
> Remove item from library

**search** _QUERY_
> Search library

**list**
> List all items

**open** _ID_
> Open book with external viewer

**-c, --config** _FILE_
> Configuration file path

**-v, --version**
> Display version and exit

**-h, --help**
> Display help and exit

# DESCRIPTION

**gorae** is a terminal-based library manager for PDF and EPUB documents. It provides an organized way to browse, search, and manage digital book collections.

The tool can extract metadata from documents, display covers (in supported terminals), and integrates with external viewers for reading.

# KEYBINDINGS

**↑/↓**
> Navigate items

**/**
> Search

**Enter**
> Open book

**i**
> Show book info

**d**
> Delete from library

**q**
> Quit

# CAVEATS

Requires external viewer for reading. Cover display depends on terminal capabilities. Metadata extraction may fail for some documents.

# HISTORY

**gorae** was created as a TUI-based alternative to GUI ebook managers, providing keyboard-driven library management.

# SEE ALSO

[zathura](/man/zathura)(1), [pdftotext](/man/pdftotext)(1)