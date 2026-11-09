# TAGLINE

Quick Google answers from the terminal

# TLDR

**Search Google for an answer**

```tuxi [search_terms]```

**Quote a query** containing special characters

```tuxi "[what is 2+2?]"```

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

**Read the query from a pipe**

```echo [search_terms] | tuxi```

**Display version**

```tuxi -v```

# SYNOPSIS

**tuxi** [_OPTIONS_] [_SEARCH_TERMS_...]

# PARAMETERS

**-r**
> Raw format output (no colors or formatting).

**-q**
> Only output search results (suppress "Did you mean?", greeting and usage).

**-a**
> Display all valid answers.

**-u**
> Print top URLs for the query. Also printed automatically when no answer is found.

**-b**
> Select best answer based on keywords at the start and end of the query (experimental).

**-t**
> Pick answers to test, given as **tuxi_NAME** words in the query.

**-l**
> Allow a **LANG_** word in the query to override the language (e.g., LANG_en_US, LANG_fr_FR).

**-d**
> Print debug information.

**-s**
> Save HTML results to ~/.cache/tuxi.

**-c**
> Use most recent cached result instead of fetching.

**-p**
> Disable pipe support.

**-v**
> Show version information.

**-h**
> Display help information.

**TUXI_LANG**=_lang_
> Environment variable: default search language.

**TUXI_DELAY**=_int_
> Environment variable: a loop count controlling the delay between answer detection (default 250, not milliseconds). Raise it slightly if several answers are printed.

# DESCRIPTION

**tuxi** is a shell script that scrapes Google search results to provide instant, concise answers to queries. It extracts featured snippets and knowledge panel information to display answers directly in the terminal.

The tool is useful for quick fact-checking and getting answers without opening a web browser. It requires **pup** (HTML parser), **recode** (character set conversion), and **jq** (JSON processor) as dependencies.

# CAVEATS

The upstream repository is **archived** and has not changed since 2022, while the scraping depends on Google's HTML structure, so answers may no longer be extracted. May be blocked by Google rate limiting or CAPTCHA. Results are scraped and may not always be accurate.

# HISTORY

**tuxi** was created by **Bugswriter** in early 2021 as a lightweight way to get answers from Google in the terminal. The GitHub repository has since been archived.

# SEE ALSO

[ddgr](/man/ddgr)(1), [googler](/man/googler)(1), [curl](/man/curl)(1), [jq](/man/jq)(1), [pup](/man/pup)(1)

# RESOURCES

```[Source code](https://github.com/Bugswriter/tuxi)```

<!-- verified: 2026-11-09 -->
