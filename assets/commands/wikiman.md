# TLDR

**Search documentation**

```wikiman [query]```

**Search specific sources**

```wikiman -s [arch] [query]```

**List sources**

```wikiman -l```

**Interactive mode**

```wikiman -H [query]```

**Raw output**

```wikiman -R [query]```

**Update sources**

```wikiman -S```

# SYNOPSIS

**wikiman** [_-s sources_] [_-l_] [_-H_] [_options_] _query_

# PARAMETERS

**-s** _SOURCES_
> Specific sources.

**-l**
> List sources.

**-H**
> HTML viewer.

**-R**
> Raw output.

**-S**
> Sync sources.

**-p** _PAGER_
> Set pager.

**-W** _WIDTH_
> Output width.

# SOURCES

**arch** - Arch Wiki
**man** - Man pages
**tldr** - TLDR pages
**gentoo** - Gentoo Wiki

# DESCRIPTION

**wikiman** searches offline documentation. It aggregates multiple sources.

Query searches all configured sources. Results ranked by relevance.

Source filtering focuses search. Limit to wiki or man pages.

Interactive HTML opens in browser. Full formatting preserved.

Offline access works without network. Downloaded sources used.

Sync updates documentation. Pull latest from sources.

# CAVEATS

Initial sync downloads data. Disk space needed. Some sources large.

# HISTORY

**wikiman** was created for unified offline documentation access. It combines wikis, man pages, and TLDR into one search.

# SEE ALSO

[man](/man/man)(1), [tldr](/man/tldr)(1), [arch-wiki](/man/arch-wiki)(1)
