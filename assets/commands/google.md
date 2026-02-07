# TAGLINE

Command-line Google search tool

# TLDR

**Search Google**

```google "[search query]"```

**Search and open first result**

```google -j "[query]"```

**Search news**

```google -N "[query]"```

**Search images**

```google -I "[query]"```

# SYNOPSIS

**google** [_options_] _query_

# PARAMETERS

_QUERY_
> Search terms.

**-j**, **--lucky**
> Open first result.

**-N**, **--news**
> Search news.

**-I**, **--images**
> Search images.

**-n** _NUM_
> Number of results.

**--help**
> Display help information.

# DESCRIPTION

**google** is a command-line tool for searching Google directly from the terminal. It displays results with titles and URLs, or opens them in a browser.

The tool provides quick access to search without leaving the terminal, with flags for different search types including news and images.

# CAVEATS

May need API key. Rate limits apply. googler is similar alternative.

# HISTORY

Various command-line Google search tools have been created for terminal-centric workflows.

# SEE ALSO

[googler](/man/googler)(1), [ddgr](/man/ddgr)(1)
