# TAGLINE

Quick Google answers from the terminal

# TLDR

**Search Google for an answer**

```tuxi [search_terms]```

**Display raw output without formatting**

```tuxi -r [search_terms]```

**Display all valid answers**

```tuxi -a [search_terms]```

**Print top URLs for a query**

```tuxi -u [search_terms]```

**Suppress suggestions and show results only**

```tuxi -q [search_terms]```

**Search in a specific language**

```tuxi -l LANG_[language_code] [search_terms]```

**Display version**

```tuxi -v```

# SYNOPSIS

**tuxi** [_OPTIONS_] [_SEARCH_TERMS_...]

# PARAMETERS

**-r**
> Raw format output (no colors or formatting).

**-q**
> Quiet mode (suppress "Did you mean?" suggestions and greeting).

**-a**
> Display all valid answers.

**-u**
> Print top URLs for the query.

**-b**
> Select best answer based on query keywords (experimental).

**-l** _LANG_code_
> Override search language (e.g., LANG_en_US, LANG_fr_FR).

**-d**
> Print debug information.

**-s**
> Save HTML results to cache.

**-c**
> Use most recent cached result instead of fetching.

**-p**
> Disable pipe support.

**-v**
> Show version information.

**-h**
> Display help information.

# DESCRIPTION

**tuxi** is a command-line tool that scrapes Google search results to provide instant, concise answers to queries. It extracts featured snippets and knowledge panel information to display answers directly in the terminal.

The tool is useful for quick fact-checking and getting answers without opening a web browser. It requires **pup** (HTML parser), **recode** (character set conversion), and **jq** (JSON processor) as dependencies.

# ENVIRONMENT

**TUXI_LANG**=_lang_
> Set default search language.

**TUXI_DELAY**=_int_
> Adjust delay between answer detection (default: 250ms).

# CAVEATS

Depends on Google's HTML structure which may change without notice. May be blocked by Google rate limiting or CAPTCHA. Requires internet connection. Results are scraped and may not always be accurate. Requires **pup**, **recode**, and **jq** to be installed.

# HISTORY

**tuxi** was created by **Bugswriter** as a fast, lightweight way to get answers from Google directly in the terminal without browser overhead.

# SEE ALSO

[ddgr](/man/ddgr)(1), [googler](/man/googler)(1), [curl](/man/curl)(1), [jq](/man/jq)(1)
