# TAGLINE

interactive TUI tree viewer for structured data

# TLDR

**View a JSON file**

```otree [path/to/file.json]```

**View YAML from stdin**

```cat [file.yaml] | otree```

**View a TOML file**

```otree [path/to/file.toml]```

**View an XML file**

```otree [path/to/file.xml]```

# SYNOPSIS

**otree** [_options_] [_file_]

# PARAMETERS

**--debug**
> Write debug logs to a file.

**-h**, **--help**
> Display help message.

**-V**, **--version**
> Display version information.

# DESCRIPTION

**otree** is a command-line tool for viewing structured data objects (JSON, YAML, TOML, XML) in an interactive TUI tree widget. It was designed to handle deeply nested Kubernetes YAML files and similar complex configurations. It supports root-changing, scaling, and clipboard operations.

Navigation keys and colors are configurable via **~/.config/otree.toml**.

# CAVEATS

Only supports structured data formats (JSON, YAML, TOML, XML). Plain text files cannot be displayed.

# HISTORY

**otree** was created by **fioncat** and is written in **Rust**.

# SEE ALSO

[jq](/man/jq)(1), [yq](/man/yq)(1), [jnv](/man/jnv)(1), [fx](/man/fx)(1)
