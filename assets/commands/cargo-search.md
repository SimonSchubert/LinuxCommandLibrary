# TAGLINE

Search for crates on a registry

# TLDR

**Search for crate**

```cargo search [serde]```

**Search with more results**

```cargo search [async] --limit [50]```

**Search specific registry**

```cargo search [package] --registry [my-registry]```

# SYNOPSIS

**cargo search** [_options_] [_query_...]

# DESCRIPTION

**cargo search** performs a textual search for crates on crates.io or another registry. Results are displayed in a TOML-compatible format showing the package name, latest version, and description, making them easy to copy directly into a Cargo.toml dependencies section.

By default, up to 10 results are returned, sorted by relevance. The `--limit` flag can increase this up to 100. For more advanced browsing, the crates.io website or tools like `cargo-seek` provide richer filtering and categorization.

# PARAMETERS

**--limit** _n_
> Number of results (default: 10, max: 100)

**--registry** _name_
> Registry to search

**--index** _url_
> Registry index URL

**-v**, **--verbose**
> Verbose output

**-q**, **--quiet**
> Suppress output

# OUTPUT FORMAT

Results display package name, version, and description:

```
serde = "1.0.130"     # A generic serialization/deserialization framework
serde_json = "1.0.68" # JSON serialization format
```

# CAVEATS

Searches crates.io by default. For interactive TUI search, consider cargo-seek. Results sorted by relevance.

# SEE ALSO

[cargo](/man/cargo)(1), [cargo-add](/man/cargo-add)(1), [cargo-info](/man/cargo-info)(1)
