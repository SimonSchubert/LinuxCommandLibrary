# TAGLINE

interactive JSON viewer and jq filter editor

# TLDR

**Open a JSON file** for interactive filtering

```jnv [path/to/data.json]```

**Filter JSON from stdin**

```cat [path/to/data.json] | jnv```

**Open with a default filter applied**

```jnv --default-filter '.[0]' [path/to/data.json]```

**Use a custom configuration file**

```jnv -c [path/to/config.toml] [path/to/data.json]```

**Write the filtered result to stdout on exit**

```jnv --write-to-stdout [path/to/data.json]```

# SYNOPSIS

**jnv** [_OPTIONS_] [_INPUT_]

# PARAMETERS

_INPUT_
> Path to a JSON file. If omitted or "-", reads from stdin.

**-c**, **--config** _file_
> Path to a TOML configuration file.

**--default-filter** _filter_
> Default jq filter to apply to input data.

**--write-to-stdout**
> Write the current JSON result to stdout when exiting.

**-h**, **--help**
> Print help information.

**-V**, **--version**
> Print version.

# DESCRIPTION

**jnv** is an interactive JSON viewer and **jq** filter editor. It provides a split-pane interface with a filter editor at the top and a syntax-highlighted JSON view below that updates in real time as you type your jq filter. Inspired by **jid** and **jiq**, jnv uses **jaq** internally to apply filters, eliminating the need to install jq separately.

The tool supports JSON files and JSON Lines input, configurable UI through TOML configuration, hint message toggling, and adjustable reactivity including debounce times.

# CAVEATS

Uses jaq (not jq) internally, so some advanced jq features or edge cases may behave differently. Large JSON files may impact responsiveness of the live preview. Supports JSON and JSON Lines input.

# HISTORY

**jnv** was created by **ynqa** and is written in **Rust**. It was designed to provide a more polished and self-contained interactive JSON exploration experience compared to earlier tools like jid and jiq.

# SEE ALSO

[jq](/man/jq)(1), [jaq](/man/jaq)(1), [fx](/man/fx)(1), [jiq](/man/jiq)(1)
