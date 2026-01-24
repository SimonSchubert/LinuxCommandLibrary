# TLDR

**Start newsboat**

```newsboat```

**Import OPML feed list**

```newsboat -i [feeds.opml]```

**Export feeds to OPML**

```newsboat -e > [feeds.opml]```

**Use alternate config file**

```newsboat -C [/path/to/config]```

**Use alternate URL file**

```newsboat -u [/path/to/urls]```

**Refresh feeds and exit**

```newsboat -x reload```

**Specify cache file**

```newsboat -c [/path/to/cache.db]```

# SYNOPSIS

**newsboat** [_-C config_] [_-u urls_] [_-c cache_] [_-i opml_] [_-e_] [_options_]

# PARAMETERS

**-C**, **--config-file** _file_
> Alternate config file.

**-u**, **--url-file** _file_
> Alternate URL file.

**-c**, **--cache-file** _file_
> Alternate cache database.

**-i**, **--import-from-opml** _file_
> Import feeds from OPML.

**-e**, **--export-to-opml**
> Export feeds to OPML on stdout.

**-r**, **--refresh-on-start**
> Refresh feeds on startup.

**-x** _command_, **--execute** _command_
> Execute command (reload, print-unread).

**-l** _level_, **--log-level** _level_
> Logging level (1-6).

**-q**, **--quiet**
> Quiet startup.

**-v**, **--version**
> Show version.

**-h**, **--help**
> Show help.

# KEYBOARD SHORTCUTS

**r**
> Reload current feed.

**R**
> Reload all feeds.

**Enter**
> Open selected item.

**o**
> Open in browser.

**n / p**
> Next / previous unread.

**j / k**
> Move down / up.

**q**
> Quit / back.

**A**
> Mark all as read.

**s**
> Save article.

**/**
> Search.

**?**
> Show help.

# DESCRIPTION

**Newsboat** is a terminal RSS/Atom feed reader forked from Newsbeuter. It displays feeds in a customizable text interface with vim-like keybindings.

Feeds are configured in **~/.newsboat/urls**, one URL per line. Tags can be added after URLs for organization. Query feeds allow filtering across multiple feeds by criteria like unread status or age.

The config file (~/.newsboat/config) controls appearance and behavior: colors, keybindings, browser command, refresh settings, and macros. Extensive customization is possible.

Articles are cached locally in SQLite, enabling offline reading. Automatic cleanup removes old articles. The cache can be shared across machines.

Integration with external tools includes: opening links in browsers, saving articles, piping content to scripts, and executing shell commands on articles. Podcast support downloads enclosures.

Filter expressions select articles by date, author, title, or content. Bookmarking sends articles to external services or scripts.

# CAVEATS

Text-only interface may not render all HTML content well. Images not displayed (requires external viewer). Feed parsing depends on feed quality. Large numbers of feeds can slow refresh. Some dynamic web content not supported.

# HISTORY

**Newsboat** was forked from **Newsbeuter** in **2017** after Newsbeuter was abandoned. Newsbeuter (German for "news pirate") was created by **Andreas Krennmair** around **2007**. The fork maintains active development, adding features while preserving the minimalist, keyboard-driven philosophy. It's become the de facto terminal feed reader for Linux users.

# SEE ALSO

[rss2email](/man/rss2email)(1), [elfeed](/man/elfeed)(1), [snownews](/man/snownews)(1), [rsstail](/man/rsstail)(1)
