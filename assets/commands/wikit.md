# TAGLINE

Wikipedia summaries from the terminal

# TLDR

**Search Wikipedia**

```wikit [topic]```

**Multiple word query**

```wikit "[linux kernel]"```

**Specific language**

```wikit -l [es] [topic]```

**Open in browser**

```wikit -b [topic]```

**Show full article**

```wikit -a [topic]```

**Disable line breaks**

```wikit -n [topic]```

# SYNOPSIS

**wikit** [_-l lang_] [_-b_] [_-a_] [_options_] _query_

# PARAMETERS

**-l**, **--lang** _LANG_
> Wikipedia language.

**-b**, **--browser**
> Open in browser.

**-a**, **--all**
> Full article.

**-n**, **--line**
> No line breaks.

**-d**, **--disambig**
> Show disambiguation.

# DESCRIPTION

**wikit** is a command-line tool that fetches Wikipedia article summaries directly in the terminal. By default it displays the first paragraph of the matching article, providing a quick overview of any topic without leaving the command line.

The full article mode displays extended content beyond the opening summary. Language selection allows querying any of Wikipedia's language editions, and browser mode opens the complete article in a web browser for full reading. When a query matches multiple articles, disambiguation mode lists all possible meanings so you can refine your search.

# CAVEATS

Requires internet. Wikipedia API limits. Not all languages complete.

# HISTORY

**wikit** was created for quick Wikipedia lookups from the terminal. It provides instant access to encyclopedia knowledge.

# SEE ALSO

[curl](/man/curl)(1), [w3m](/man/w3m)(1)
