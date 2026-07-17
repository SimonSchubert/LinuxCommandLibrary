# TAGLINE

Search Google from the command line (surfraw elvi)

# TLDR

**Search Google** and open the results page in the default browser

```google "[search query]"```

**Feel lucky**: jump straight to the first result

```google -lucky "[search query]"```

**Search images**

```google -images "[search query]"```

**Search news**

```google -news "[search query]"```

**Limit to a number of results**

```google -results=[25] "[search query]"```

**Search a country-specific edition of Google**

```google -country=[uk] "[search query]"```

# SYNOPSIS

**google** [_options_] _words_...

# PARAMETERS

**-l**, **-lucky**
> "I'm Feeling Lucky": jump directly to the first result.

**-i**, **-images**
> Search Google Images (shorthand for **-search=images**).

**-v**, **-videos**
> Search Google Videos.

**-m**, **-maps**
> Search Google Maps.

**-n**, **-news**
> Search Google News.

**-G**, **-groups**
> Search Google Groups.

**-results=**_NUM_
> Number of search results to return.

**-country=**_CODE_
> Regional Google site to query, given as an ISO 3166 alpha-2 country code (default **us**, i.e. google.com).

**-safe=**_LEVEL_
> SafeSearch filtering level: **default**, **off**, **moderate**, or **strict**.

# DESCRIPTION

**google** is one of the "elvi" (search engine profiles) that ship with **surfraw**. Running it builds the appropriate Google search URL from its arguments and opens it in **$BROWSER**, so no query is made without a browser being launched.

With no query words, it opens the relevant Google front page (web, images, news, etc.) instead of a results page. It can also be invoked as **sr google** [_options_] _words_ if the standalone symlink isn't installed.

# CAVEATS

Requires the **surfraw** package and a configured **$BROWSER**. It opens results in a browser rather than printing them to the terminal, unlike googler or ddgr.

# HISTORY

**google** is one of the bundled elvi in **surfraw**, a Unix command-line interface to a variety of web search engines, originally written by **Julian Assange** in the late 1990s and later maintained by the surfraw community.

# SEE ALSO

[googler](/man/googler)(1), [ddgr](/man/ddgr)(1)

# RESOURCES

```[Source code](https://gitlab.com/surfraw/Surfraw)```

```[Homepage](https://surfraw.org/)```

<!-- verified: 2026-07-17 -->
