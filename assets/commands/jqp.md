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

```jqp -f [path/to/file.json] --theme [monokai]```

# SYNOPSIS

**jqp** [**-f** _file_] [**-q** _query_] [**--theme** _theme_]

# DESCRIPTION

**jqp** is a TUI playground for exploring and experimenting with **jq** queries. It provides an interactive interface where you can type jq filters and see results update in real time against your JSON data. The tool supports both JSON and **newline-delimited JSON** (NDJSON) input.

Features include query history, auto-completion, customizable themes (light and dark), and the ability to start with a pre-defined query.

# CAVEATS

Requires **jq** to be installed on the system. Large JSON files may impact the responsiveness of live preview updates.

# HISTORY

**jqp** was created by **Noah Gorstein** (noahgorstein) and is written in **Go**. It was designed as a terminal-native alternative to web-based jq playgrounds.

# SEE ALSO

[jq](/man/jq)(1), [jnv](/man/jnv)(1), [fx](/man/fx)(1)
