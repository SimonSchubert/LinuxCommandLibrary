# TAGLINE

Interactive TUI tree viewer for structured data

# TLDR

**View a JSON file**

```otree [path/to/file.json]```

**View YAML from stdin**

```cat [file.yaml] | otree```

**View TOML**

```otree [path/to/file.toml]```

# SYNOPSIS

**otree** [_options_] [_file_]

# DESCRIPTION

**otree** is a command-line tool for viewing structured data objects (JSON, YAML, TOML, XML) in an interactive TUI tree widget. It was designed to handle deeply nested Kubernetes YAML files and similar complex configurations.

Navigation keys and colors are configurable.

# CAVEATS

Only supports structured data formats. Plain text files cannot be displayed.

# HISTORY

**otree** was created by **fioncat** and is written in **Rust**.

# SEE ALSO

[jq](/man/jq)(1), [yq](/man/yq)(1), [jnv](/man/jnv)(1)
