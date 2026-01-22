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

**cargo search** performs textual search for crates on crates.io. Results are displayed in TOML format suitable for copying into Cargo.toml.

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
