# TAGLINE

Quick Google answers from the terminal

# TLDR

**Search** using Google

```tuxi [search_terms]```

Display **raw** output

```tuxi -r [search_terms]```

Display **quiet** results only

```tuxi -q [search_terms]```

Display **help**

```tuxi -h```

# SYNOPSIS

**tuxi** [_OPTIONS_] [_SEARCH_TERMS_...]

# PARAMETERS

**-r**
> Raw format output (no colors or formatting)

**-q**
> Quiet mode (results only, no extra messages)

**-h**
> Display help information

# DESCRIPTION

**tuxi** is a command-line tool that scrapes Google search results to provide instant, concise answers to queries. It extracts featured snippets and knowledge panel information to display answers directly in the terminal.

The tool is useful for quick fact-checking and getting answers without opening a web browser.

# CAVEATS

Depends on Google's HTML structure which may change. May be blocked by Google rate limiting. Requires internet connection. Results are scraped and may not always be accurate.

# HISTORY

**tuxi** was created by **Bugswriter** as a fast, lightweight way to get answers from Google directly in the terminal without browser overhead.

# SEE ALSO

[ddgr](/man/ddgr)(1), [googler](/man/googler)(1)
