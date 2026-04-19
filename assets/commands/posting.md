# TAGLINE

Modern API client that lives in your terminal

# TLDR

**Launch the HTTP client TUI**

```posting```

**Open a specific collection directory**

```posting --collection [path/to/collection]```

**Load environment variable files**

```posting --env [dev.env] --env [secrets.env]```

**Import a Postman v2.1 collection**

```posting import [postman_collection.json]```

**Display help**

```posting --help```

# SYNOPSIS

**posting** [_options_] [_subcommand_]

# PARAMETERS

**--collection** _PATH_
> Use the given directory as the request collection.

**--env** _FILE_
> Load environment variables from a .env file (may be repeated).

**--config** _FILE_
> Use an alternate configuration file.

**import** _FILE_
> Import a Postman v2.1 collection into a Posting collection.

**--help**
> Display help information.

**--version**
> Display version information.

# DESCRIPTION

**posting** is a terminal-based HTTP client similar to Postman and Insomnia. Requests are stored locally as YAML files for easy version control. Features include jump-mode navigation, environments and variables, syntax highlighting with tree-sitter, Vim keys, customizable keybindings, pre/post-request Python scripts, curl import/export, and import from Postman and OpenAPI specs.

# CAVEATS

Designed for keyboard-centric workflows. Usable over SSH.

# HISTORY

**posting** was created by **Darren Burns** (darrenburns) and is written in **Python**.

# SEE ALSO

[curl](/man/curl)(1), [httpie](/man/httpie)(1), [slumber](/man/slumber)(1)
