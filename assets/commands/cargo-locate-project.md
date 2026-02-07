# TAGLINE

Print the path to a project's Cargo.toml

# TLDR

**Show manifest path**

```cargo locate-project```

**Show workspace root manifest**

```cargo locate-project --workspace```

**Output as plain path**

```cargo locate-project --message-format plain```

**Output as JSON**

```cargo locate-project --message-format json```

# SYNOPSIS

**cargo locate-project** [_options_]

# DESCRIPTION

**cargo locate-project** prints the path to the Cargo.toml manifest file for the current package. Searches current directory and parent directories for the manifest.

# PARAMETERS

**--workspace**
> Locate workspace root Cargo.toml instead of current package

**--message-format** _format_
> Output format: json (default), plain

**--manifest-path** _path_
> Path to Cargo.toml

**-v**, **--verbose**
> Verbose output

**-q**, **--quiet**
> Suppress log messages

# OUTPUT

**JSON format (default)**
```json
{"root":"/path/to/project/Cargo.toml"}
```

**Plain format**
```
/path/to/project/Cargo.toml
```

# EXIT STATUS

**0**
> Success

**101**
> Failed to locate manifest

# CAVEATS

Useful for scripts and tooling that need to find project root. The -C option (nightly) allows changing working directory before searching.

# SEE ALSO

[cargo](/man/cargo)(1), [cargo-metadata](/man/cargo-metadata)(1)
