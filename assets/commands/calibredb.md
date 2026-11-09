# TAGLINE

Command-line interface to the Calibre ebook database

# TLDR

**List all books**

```calibredb list```

**Add book to library**

```calibredb add [book.epub]```

**Remove books by ID** (comma-separated, ranges allowed)

```calibredb remove [23,34,57-85]```

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

**List books as JSON**, with selected fields

```calibredb list --for-machine -f [title,authors,formats]```

**Operate on a remote library** through a Content server

```calibredb list --with-library [http://localhost:8080/#mylibrary] --username [user] --password [pass]```

# SYNOPSIS

**calibredb** _command_ [_options_] [_arguments_]

# DESCRIPTION

**calibredb** is the command-line interface to the Calibre ebook database. It manages ebook libraries, adds/removes books, modifies metadata, and can connect to local or remote Calibre Content servers. Because it can modify libraries, a Content server must have authentication configured, or local write access enabled with **--enable-local-write**, before calibredb can make changes through it.

# COMMANDS

**list**
> List books in database with customizable fields and filtering.

**add**
> Import book files into the library.

**remove**
> Remove books by ID. Uses the trash bin unless **--permanent** is given.

**search**
> Query library using calibre's search syntax.

**show_metadata**
> Display stored metadata for a book.

**set_metadata**
> Update book metadata from OPF file or individual fields.

**export**
> Export books to the filesystem with associated files.

**add_format**
> Attach an ebook file format to an existing book.

**remove_format**
> Remove a specific format from a book.

**catalog**
> Generate a formatted catalog of the library.

**backup_metadata**
> Export metadata to individual OPF files.

**restore_database**
> Rebuild the database from OPF metadata files.

**check_library**
> Validate library filesystem integrity.

**clone**
> Create a new empty library with identical custom columns and settings.

**embed_metadata**
> Update book file metadata from database records.

**fts_index**
> Manage full-text search indexing.

**fts_search**
> Perform full-text searches across library content.

**list_categories**
> Report on the categories in the database.

**saved_searches**
> List, add, or remove saved searches.

**add_custom_column**, **custom_columns**, **remove_custom_column**, **set_custom**
> Manage custom columns and their values.

**virtual_libraries**
> List, add, rename, or remove virtual libraries.

**notes**, **items**, **annotations**, **data_files**, **trash**
> Manage notes, category items, annotations, extra data files, and the trash bin.

# PARAMETERS

**--with-library**, **--library-path** _path_|_url_
> Path to the calibre library, or the URL of a Content server in the form http://hostname:port/#library_id. Use **-** as library_id to list available libraries.

**--username** _user_
> Username for Content server authentication.

**--password** _pass_
> Password for Content server authentication. Use **<stdin>** or **<f:/path/to/file>** to read it instead of passing it on the command line.

**--timeout** _seconds_
> Network connection timeout in seconds (default: 120).

**-f**, **--field** _name:value_
> Set metadata field (used with set_metadata; repeatable).

**--as-opf**
> Output metadata as OPF XML (used with show_metadata).

**--for-machine**
> Output in JSON format (used with list and other listing commands).

# CAVEATS

Book IDs can be found using the **list** or **search** commands. Arguments with spaces must be quoted. On macOS, command-line tools are inside the calibre.app bundle at `/Applications/calibre.app/Contents/MacOS/`. The Calibre GUI should not be running when using calibredb on a local library, or use **--with-library** to connect via the Content server instead.

# HISTORY

**calibredb** is part of **calibre**, an ebook management application created by **Kovid Goyal** and first released in **2006**.

# SEE ALSO

[calibre](/man/calibre)(1), [ebook-convert](/man/ebook-convert)(1), [ebook-meta](/man/ebook-meta)(1), [calibre-server](/man/calibre-server)(1)

# RESOURCES

```[Source code](https://github.com/kovidgoyal/calibre)```

```[Homepage](https://calibre-ebook.com/)```

```[Documentation](https://manual.calibre-ebook.com/generated/en/calibredb.html)```

<!-- verified: 2026-11-09 -->
