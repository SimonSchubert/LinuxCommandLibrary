# TAGLINE

Read IETF RFCs from the terminal

# TLDR

**Open** an RFC by number

```rfc [791]```

**Search** RFCs by keyword (if supported by build)

```rfc [search-term]```

# SYNOPSIS

**rfc** *number*|*query*

# DESCRIPTION

**rfc** fetches and displays IETF Request for Comments documents in the terminal, so you can read protocol specifications without a browser. Implementations commonly page through text via **$PAGER**. The widely packaged tool from **bfontaine/rfc** is a small shell wrapper around remote RFC text sources.

# PARAMETERS

*number*

> RFC number to retrieve (e.g. **7231**).

Behavior for keyword search, local caching, and offline mirrors depends on the version—run **rfc -h** or read the script header.

# CAVEATS

Requires network access unless a local RFC collection is configured. Formatting is plain text; some RFCs are better read as PDF/HTML on the IETF site.

# SEE ALSO

[curl](/man/curl)(1), [less](/man/less)(1), [man](/man/man)(1)

# RESOURCES

```[Source code](https://github.com/bfontaine/rfc)```

<!-- verified: 2026-07-19 -->
