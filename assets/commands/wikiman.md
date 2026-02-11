# TAGLINE

Offline documentation search aggregator

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

**wikiman** is an offline documentation search tool that aggregates multiple sources including man pages, Arch Wiki, Gentoo Wiki, and TLDR pages into a single searchable interface. Queries are matched across all configured sources simultaneously, with results ranked by relevance using fuzzy matching.

Source filtering allows narrowing searches to specific documentation types, such as only wiki articles or only man pages. Results can be viewed in a terminal pager or opened in a browser with full HTML formatting preserved for wiki content.

All documentation is stored locally after an initial sync, enabling fast searches without network access. The sync command updates the local cache with the latest content from each configured source.

# CAVEATS

Initial sync downloads data. Disk space needed. Some sources large.

# HISTORY

**wikiman** was created for unified offline documentation access. It combines wikis, man pages, and TLDR into one search.

# SEE ALSO

[man](/man/man)(1), [tldr](/man/tldr)(1), [arch-wiki](/man/arch-wiki)(1)
