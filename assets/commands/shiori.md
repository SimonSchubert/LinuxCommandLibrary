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

**shiori** is a bookmark manager with web interface. It saves readable content from web pages.

Adding bookmarks downloads and parses content. Readable text is extracted and stored.

Full-text search finds bookmarks by content. Title, URL, and text are indexed.

Web interface provides visual management. Browse, edit, and organize bookmarks.

Tags organize bookmarks by topic. Multiple tags per bookmark supported.

# CAVEATS

Requires database (SQLite default). Large archives use storage. Some pages don't parse well.

# HISTORY

**Shiori** was created by **RadhiFadlillah** as a simple bookmark manager. Named after Japanese for bookmark, it focuses on offline reading.

# SEE ALSO

[buku](/man/buku)(1), [pocket](/man/pocket)(1)
