# TAGLINE

Offline documentation search engine

# TLDR

**Search** documentation across all sources

```wikiman [query]```

**Search** only specific sources (comma-separated)

```wikiman -s [man,arch] [query]```

**List** available sources

```wikiman -S```

**Search** with quick search mode

```wikiman -q [query]```

**Search** using AND operator (all keywords must match)

```wikiman -a [query]```

**Print** raw output without interactive selection

```wikiman -R [query]```

**Open** results in HTML viewer instead of pager

```wikiman -H [w3m] [query]```

# SYNOPSIS

**wikiman** [_options_] [_keyword..._]

# PARAMETERS

**-s** _SOURCES_
> Comma-separated list of sources to search (default: all available).

**-l** _LANGUAGES_
> Comma-separated search languages (default: en).

**-f** _FINDER_
> Fuzzy finder to use (default: fzf).

**-H** _VIEWER_
> HTML viewer for wiki pages (default: w3m).

**-q**
> Enable quick search mode.

**-a**
> Enable AND operator mode (all keywords must match).

**-p**
> Disable quick result preview.

**-k**
> Keep wikiman open after viewing a result.

**-c**
> Show source column in results.

**-R**
> Print raw output without interactive selection.

**-S**
> List available sources and exit.

**-W** _SHELL_
> Print widget code for the specified shell (bash, zsh, fish) and exit.

**-v**
> Print version and exit.

**-h**
> Display help and exit.

# SOURCES

**man** - Man pages
**arch** - Arch Wiki
**gentoo** - Gentoo Wiki
**tldr** - TLDR pages
**fbsd** - FreeBSD documentation
**devdocs** - DevDocs

# DESCRIPTION

**wikiman** is an offline documentation search engine that aggregates multiple sources including man pages, Arch Wiki, Gentoo Wiki, TLDR pages, FreeBSD documentation, and DevDocs into a single searchable interface. Queries are matched across all configured sources simultaneously, with results ranked by relevance using fuzzy matching.

Source filtering allows narrowing searches to specific documentation types, such as only wiki articles or only man pages. Results can be viewed in a terminal pager or opened in a browser with full HTML formatting preserved for wiki content.

All documentation is stored locally after an initial sync, enabling fast searches without network access. If no keywords are provided, all pages are shown.

# CONFIGURATION

**~/.config/wikiman/wikiman.conf**
> User configuration file. Falls back to /etc/wikiman.conf if not present. Respects XDG_CONFIG_HOME.

Shell key binding (default Ctrl+F) can be enabled by sourcing widget files from /usr/share/wikiman/widgets/ for bash, zsh, or fish.

# CAVEATS

Initial source sync requires network access and may download significant data depending on which sources are enabled. Requires fzf or another fuzzy finder for interactive selection.

# SEE ALSO

[man](/man/man)(1), [tldr](/man/tldr)(1), [apropos](/man/apropos)(1), [fzf](/man/fzf)(1), [w3m](/man/w3m)(1)
