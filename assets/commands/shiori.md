# TAGLINE

Self-hosted bookmark manager with web interface

# TLDR

**Start server**

```shiori serve```

**Add bookmark**

```shiori add [https://example.com]```

**Add with title**

```shiori add -t "[Title]" [https://example.com]```

**Search bookmarks**

```shiori search [query]```

**List bookmarks**

```shiori print```

**Delete bookmark**

```shiori delete [id]```

**Export bookmarks**

```shiori export > [bookmarks.html]```

**Import bookmarks**

```shiori import [bookmarks.html]```

# SYNOPSIS

**shiori** _command_ [_options_] [_args_]

# PARAMETERS

**serve**
> Start web server.

**add** _URL_
> Add bookmark.

**search** _QUERY_
> Search bookmarks.

**print**
> List bookmarks.

**delete** _ID_
> Remove bookmark.

**export**
> Export bookmarks.

**import** _FILE_
> Import bookmarks.

**-t**, **--title** _TITLE_
> Set title.

**-e**, **--excerpt** _TEXT_
> Set excerpt.

**--tags** _TAGS_
> Add tags.

# DESCRIPTION

**shiori** is a self-hosted bookmark manager that saves web pages for offline reading. When a URL is added, shiori downloads the page, extracts readable content using a readability algorithm, and stores both the original HTML and a clean text version in its database.

Bookmarks support full-text search across titles, URLs, and saved content, making it easy to find previously saved pages. Tags provide additional organization, and the built-in web interface offers a visual way to browse, edit, and manage the collection.

Data can be imported from and exported to standard bookmark HTML files for interoperability with browsers and other bookmark managers. The CLI provides the same functionality as the web interface for scripting and automation.

# CONFIGURATION

**SHIORI_DIR**
> Environment variable setting the data directory for the database and archived pages (default: ~/.local/share/shiori).

# CAVEATS

Requires database (SQLite default). Large archives use storage. Some pages don't parse well.

# HISTORY

**Shiori** was created by **RadhiFadlillah** as a simple bookmark manager. Named after Japanese for bookmark, it focuses on offline reading.

# SEE ALSO

[buku](/man/buku)(1), [pocket](/man/pocket)(1)
