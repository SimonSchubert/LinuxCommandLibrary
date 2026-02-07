# TAGLINE

Command-line bookmark manager with tagging and search

# TLDR

**Add** bookmark

```buku -a [https://example.com] [tag1,tag2]```

**Search** bookmarks

```buku [keyword]```

**List** all bookmarks

```buku -p```

**Open** bookmark

```buku -o [index]```

**Delete** bookmark

```buku -d [index]```

**Export** to HTML

```buku -e [bookmarks.html]```

# SYNOPSIS

**buku** [_options_] [_keywords_]

# DESCRIPTION

**buku** is a powerful command-line bookmark manager. It stores bookmarks in a SQLite database with support for tagging, searching, automatic title fetching, and browser integration.

Bookmarks can be organized with comma-separated tags and searched using keywords, regular expressions, or tag filters. The tool automatically fetches page titles and descriptions when adding URLs. Import and export is supported in HTML, Markdown, and JSON formats, enabling migration from browsers and other bookmark managers. An optional web interface (**bukuserver**) is available for graphical access to the same database.

# PARAMETERS

**-a**, **--add** _url_ [_tags_]
> Add bookmark

**-u**, **--update** _index_
> Update bookmark

**-d**, **--delete** _index_
> Delete bookmark

**-p**, **--print** [_index_]
> List bookmarks

**-o**, **--open** _index_
> Open in browser

**-s**, **--sany** _keywords_
> Search (any keyword)

**-S**, **--sall** _keywords_
> Search (all keywords)

**-e**, **--export** _file_
> Export to HTML

**-i**, **--import** _file_
> Import from HTML/Markdown

**-t**, **--tags**
> List all tags

# FEATURES

- Automatic title fetching
- Full-text search
- Tag-based organization
- Browser integration
- Import/export (HTML, Markdown, JSON)
- Encryption support
- Regex search
- Portable database

# WORKFLOW

```bash
# Add bookmark
buku -a https://github.com programming,git

# Search
buku python

# Browse all
buku -p

# Open in browser
buku -o 5

# Update tags
buku -u 5 --tag +docker,-kubernetes

# Export
buku -e bookmarks.html
```

# BROWSER INTEGRATION

Can import from:
- Chrome/Chromium
- Firefox
- Safari

# CAVEATS

Requires internet for title fetching. Browser integration needs configuration. Database is local (not synced). Command-line interface may not suit all users. GUI available separately (bukuserver).

# HISTORY

**buku** was created by Arun Prakash Jana around **2015** to provide a fast, privacy-focused bookmark manager for the terminal.

# SEE ALSO

[urlview](/man/urlview)(1), [qutebrowser](/man/qutebrowser)(1)
