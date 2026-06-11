# TAGLINE

Browse the Arch Linux Wiki from the terminal

# TLDR

**Search** the Arch Wiki by title

```archwiki-rs search "[query]"```

**Search** within page text content

```archwiki-rs search "[query]" -t```

**Read** a page in the terminal

```archwiki-rs read-page "[Neovim]"```

**Read** a page as Markdown

```archwiki-rs read-page "[Neovim]" --format markdown```

**Download** page and category names for offline search

```archwiki-rs sync-wiki```

**List** all available pages

```archwiki-rs list-pages```

# SYNOPSIS

**archwiki-rs** _command_ [_options_] [_query_]

# DESCRIPTION

**archwiki-rs** is a command-line tool for browsing the Arch Linux Wiki from the terminal. It can search pages by title or text, render page content as plain text or Markdown, and cache pages for offline reading.

The tool provides offline-capable access to Arch Wiki documentation, useful for system administration and troubleshooting.

# PARAMETERS

**read-page** _page_
> Fetch and display a wiki page. Use **--format** to choose the output format (e.g. markdown).

**search** _query_
> Search pages by title; add **-t** to search page text content instead.

**list-pages**
> List all available wiki pages (tree by default, **-f** for a flat list, **-c** to filter by category).

**list-categories**
> List all available wiki categories.

**list-languages**
> List the supported page languages.

**sync-wiki**
> Download the page and category names used by the search and list commands.

**local-wiki**
> Download a complete local copy of the Arch Wiki (makes many requests).

**info**
> Show application metadata and configuration, such as the cache directory.

**completions** _shell_
> Generate a shell completion file.

**--json**, **--json-raw**
> Emit machine-readable JSON output.

# CAVEATS

Content may be outdated if used offline. Formatting may differ from web version. Some wiki features not available in terminal.

# HISTORY

**archwiki-rs** was created as a Rust-based tool for Arch Linux users who prefer terminal-based documentation access.

# SEE ALSO

[man](/man/man)(1), [tldr](/man/tldr)(1), [curl](/man/curl)(1)

# RESOURCES

```[Source code](https://github.com/lucifayr/archwiki-rs)```

<!-- verified: 2026-06-11 -->
