# TAGLINE

Search websites from the command line

# TLDR

**Search Google**

```surfraw google [search terms]```

**Search Wikipedia**

```surfraw wikipedia [article]```

**Search DuckDuckGo**

```surfraw duckduckgo [query]```

**List available elvi**

```surfraw -elvi```

**Print URL only**

```surfraw -p google [query]```

**Search with browser**

```surfraw -browser=[firefox] google [query]```

**Search YouTube**

```surfraw youtube [video]```

# SYNOPSIS

**surfraw** [_-elvi_] [_-p_] [_-browser=browser_] _elvi_ _query_

# PARAMETERS

**-elvi**
> List search engines.

**-p**, **--print**
> Print URL only.

**-browser** _BROWSER_
> Use specific browser.

**-g**, **--graphical**
> Use graphical browser.

**-t**, **--text**
> Use text browser.

# ELVI (SEARCH ENGINES)

**google** - Google
**duckduckgo** - DuckDuckGo
**wikipedia** - Wikipedia
**youtube** - YouTube
**github** - GitHub
**amazon** - Amazon
**stack** - Stack Overflow

# DESCRIPTION

**surfraw** (Shell Users' Revolutionary Front Rage Against the Web) provides a command-line interface for searching websites and web services. It uses a plugin system called "elvi" where each elvi defines the search interface for a specific website such as Google, Wikipedia, DuckDuckGo, or GitHub.

The tool constructs search URLs from command-line arguments and opens them in a configured web browser. Print mode outputs the constructed URL instead of opening a browser, enabling piping to other commands or scripts. Both graphical and text-mode browsers are supported.

Custom elvi can be written as simple shell scripts to add support for any website with a query-based URL pattern. The tool ships with dozens of pre-configured elvi for popular search engines, reference sites, and package repositories.

# CAVEATS

Some elvi may be outdated. Sites change their URLs. Browser must be configured.

# HISTORY

**Surfraw** was created by **Julian Assange** and others in **2000**. It embodies Unix philosophy for web searching.

# SEE ALSO

[w3m](/man/w3m)(1), [lynx](/man/lynx)(1), [firefox](/man/firefox)(1)
