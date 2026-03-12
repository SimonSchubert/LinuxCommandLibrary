# TAGLINE

Terminal interface for Stack Overflow

# TLDR

**Search with default settings**

```so [how do i reverse a list in python]```

**Search a specific StackExchange site**

```so --site [tex] [how to put tilde over character]```

**Search multiple sites using Google**

```so -e google -s [askubuntu] -s [unix] [how do i install linux]```

# SYNOPSIS

**so** [_options_] _query_

# PARAMETERS

**--site**, **-s** _SITE_
> StackExchange site to search. Can be specified multiple times.

**-e** _ENGINE_
> Search backend: stackexchange, google, or duckduckgo.

# DESCRIPTION

**so** is a TUI that lets you search and browse answers across the entire StackExchange network directly from your terminal. It supports multiple search backends (StackExchange API, Google, DuckDuckGo), simultaneous multi-site queries, configurable themes, and system clipboard integration.

# HISTORY

**so** was created by **Sam Tay** and is written in **Rust**.

# SEE ALSO

[howdoi](/man/howdoi)(1), [how2](/man/how2)(1)
