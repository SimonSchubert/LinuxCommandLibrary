# TAGLINE

TUI playground to experiment with jq

# TLDR

**Open a JSON file** in the playground

```jqp -f [path/to/file.json]```

**Pipe JSON from stdin**

```cat [path/to/file.json] | jqp```

**Start with an initial query**

```jqp -f [path/to/file.json] -q '.[0]'```

**Use a specific theme**

```jqp -f [path/to/file.json] -t [monokai]```

**Use a custom config file**

```jqp -f [path/to/file.json] --config [path/to/.jqp.yaml]```

# SYNOPSIS

**jqp** [_query_] [_flags_]

# PARAMETERS

**-f**, **--file** _FILE_
> Path to the JSON or NDJSON input file.

**-q**, **--query** _QUERY_
> Initial jq query to execute on startup.

**-t**, **--theme** _THEME_
> Color theme name. Light themes work best with light terminal backgrounds, dark themes with dark backgrounds.

**--config** _FILE_
> Path to config file (default: **$HOME/.jqp.yaml**).

**-h**, **--help**
> Display help information.

**-v**, **--version**
> Display version information.

# DESCRIPTION

**jqp** is a TUI playground for exploring and experimenting with **jq** queries. It provides an interactive interface where you can type jq filters and see results update in real time against your JSON data. The tool internally uses **gojq**, a Go implementation of jq, and supports both JSON and **newline-delimited JSON** (NDJSON) input.

Features include query history, auto-completion, customizable themes (light and dark), and the ability to start with a pre-defined query. Configuration can be provided via **$HOME/.jqp.yaml** or the **--config** flag; command-line options take precedence over the config file.

# CAVEATS

Large JSON files may impact the responsiveness of live preview updates. Input must be valid JSON or NDJSON.

# HISTORY

**jqp** was created by **Noah Gorstein** and is written in **Go**. It was designed as a terminal-native alternative to web-based jq playgrounds.

# SEE ALSO

[jq](/man/jq)(1), [jnv](/man/jnv)(1), [fx](/man/fx)(1)
