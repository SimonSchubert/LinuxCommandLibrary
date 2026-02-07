# TAGLINE

Google search from the terminal

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

**googler** is a power tool to search Google from the terminal. It shows results with titles, URLs, and snippets, and supports an interactive interface for browsing results and opening them in a browser.

The tool supports site-specific search, news, various output customizations, and works without requiring an API key.

# CONFIGURATION

**BROWSER**
> Environment variable to specify the browser for opening search results.

# CAVEATS

Relies on web scraping. May break with Google changes. No API key needed.

# HISTORY

googler was created by **Arun Prakash Jana** to provide comprehensive Google search functionality from the command line.

# SEE ALSO

[ddgr](/man/ddgr)(1), [w3m](/man/w3m)(1)
