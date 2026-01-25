# TLDR

**Add URL to Pocket**

```pocket add [url]```

**List saved items**

```pocket list```

**Archive an item**

```pocket archive [item_id]```

**Search saved items**

```pocket search [query]```

# SYNOPSIS

**pocket** _command_ [_options_] [_args_]

# PARAMETERS

**add** _url_
> Add URL to Pocket.

**list**
> List saved items.

**archive** _id_
> Archive an item.

**delete** _id_
> Delete an item.

**search** _query_
> Search saved items.

**favorite** _id_
> Favorite an item.

# DESCRIPTION

**pocket** is a command-line client for the Pocket read-later service. It allows managing your Pocket list from the terminal, including adding, listing, and organizing saved articles.

# EXAMPLES

```bash
# Add article
pocket add https://example.com/article

# List unread items
pocket list

# Archive item
pocket archive 12345

# Search for tag
pocket search --tag programming

# Export list
pocket list --format json > pocket.json
```

# AUTHENTICATION

```bash
# First run requires authentication
pocket auth

# Uses OAuth to get access token
# Token stored in config file
```

# CAVEATS

Requires Pocket account and API authentication. Third-party CLI client - features may vary by implementation.

# HISTORY

Pocket CLI clients are community-developed tools for interacting with the **Pocket** service (originally Read It Later), acquired by **Mozilla** in 2017.

# SEE ALSO

[curl](/man/curl)(1), [wget](/man/wget)(1), [wallabag](/man/wallabag)(1)
