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

**surfraw** (Shell Users' Revolutionary Front Rage Against the Web) searches websites from CLI.

Elvi are search plugins. Each defines a search engine interface.

Print mode outputs URLs. Pipe to other commands or scripts.

Browser selection controls destination. Text or graphical browsers.

Custom elvi extend functionality. Write scripts for any site.

# CAVEATS

Some elvi may be outdated. Sites change their URLs. Browser must be configured.

# HISTORY

**Surfraw** was created by **Julian Assange** and others in **2000**. It embodies Unix philosophy for web searching.

# SEE ALSO

[w3m](/man/w3m)(1), [lynx](/man/lynx)(1), [firefox](/man/firefox)(1)
