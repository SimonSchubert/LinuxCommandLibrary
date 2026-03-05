# TAGLINE

TUI for browsing and running OpenAPI-defined APIs

# TLDR

**Open a local spec file**

```openapi-tui -i [path/to/spec.yaml]```

**Open a spec from URL**

```openapi-tui -i [https://example.com/openapi.json]```

# SYNOPSIS

**openapi-tui** [_options_]

# PARAMETERS

**-i**, **--input** _PATH_OR_URL_
> OpenAPI spec file path or URL (JSON or YAML).

# DESCRIPTION

**openapi-tui** is a terminal UI for listing, browsing, and running APIs defined with OpenAPI v3.0 and v3.1 specifications. It supports loading specs from local files or URLs in both JSON and YAML formats, adding query strings and headers, and making API calls directly from the terminal.

# CAVEATS

Only supports OpenAPI v3.0 and v3.1 specifications. Swagger v2 specs must be converted first.

# HISTORY

**openapi-tui** was created by **zaghaghi** and is written in **Rust** using the ratatui library.

# SEE ALSO

[curl](/man/curl)(1), [httpie](/man/httpie)(1)
