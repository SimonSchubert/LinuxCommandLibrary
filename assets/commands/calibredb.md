# TLDR

**List all books**

```calibredb list```

**Add book to library**

```calibredb add [book.epub]```

**Remove book by ID**

```calibredb remove [23]```

**Search for books**

```calibredb search "[title:keyword]"```

**Show book metadata**

```calibredb show_metadata [42]```

**Set book metadata**

```calibredb set_metadata [42] -f [title:"New Title"]```

**Export books**

```calibredb export [23,45] --to-dir [output/]```

**Add format to existing book**

```calibredb add_format [42] [book.mobi]```

# SYNOPSIS

**calibredb** _command_ [_options_] [_arguments_]

# DESCRIPTION

**calibredb** is the command-line interface to the Calibre ebook database. It manages ebook libraries, adds/removes books, modifies metadata, and can connect to local or remote Calibre Content servers.

# COMMANDS

**list**
> List books in database

**add**
> Add books to database

**remove**
> Remove books by ID

**search**
> Search for books

**show_metadata**
> Display book metadata

**set_metadata**
> Modify book metadata

**export**
> Export books from database

**add_format**
> Add format to existing book

**remove_format**
> Remove format from book

**catalog**
> Generate catalog

**backup_metadata**
> Backup metadata to OPF files

# PARAMETERS

**--library-path**=_path_
> Path to Calibre library

**--with-library**=_url_
> Connect to Content server

**-f**, **--field**=_name:value_
> Set metadata field

**--as-opf**
> Output metadata as OPF

**--for-machine**
> Output in JSON format

# OUTPUT FIELDS

Available fields: title, authors, publisher, pubdate, rating, series, tags, formats, identifiers, isbn, languages, comments, cover, uuid

# CAVEATS

Book IDs can be found using search command. Arguments with spaces must be quoted. On macOS, tools are inside calibre.app bundle.

# SEE ALSO

[calibre](/man/calibre)(1), [ebook-convert](/man/ebook-convert)(1), [ebook-meta](/man/ebook-meta)(1), [calibre-server](/man/calibre-server)(1)
