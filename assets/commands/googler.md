# TLDR

**Search Google**

```googler [search terms]```

**Search news**

```googler -N [query]```

**Search specific site**

```googler -w [site.com] [query]```

**Limit results**

```googler -n [5] [query]```

**Open result in browser**

```googler --open [query]```

# SYNOPSIS

**googler** [_options_] [_query_]

# PARAMETERS

_QUERY_
> Search terms.

**-n** _NUM_
> Number of results.

**-N**, **--news**
> Search news.

**-w** _SITE_
> Limit to website.

**--open**
> Open in browser.

**-l** _LANG_
> Language.

**--help**
> Display help information.

# DESCRIPTION

**googler** is a power tool to search Google from the terminal. It shows results with titles, URLs, and snippets, supporting navigation and browser opening.

The tool provides an interactive interface for browsing results. It supports various search options and output customization.

googler enables comprehensive Google search from terminal.

# CAVEATS

Relies on web scraping. May break with Google changes. No API key needed.

# HISTORY

googler was created by **Arun Prakash Jana** to provide comprehensive Google search functionality from the command line.

# SEE ALSO

[ddgr](/man/ddgr)(1), [w3m](/man/w3m)(1)
