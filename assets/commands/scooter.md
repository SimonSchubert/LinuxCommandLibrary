# TAGLINE

Interactive find-and-replace in the terminal

# TLDR

**Launch interactive search in the current directory**

```scooter```

**Search in a specific directory**

```scooter [../foo/bar]```

**Process text from stdin**

```echo "hello world" | scooter```

**Pre-populate search and replace fields**

```scooter --search-text "[old]" --replace-text "[new]" --immediate-search```

# SYNOPSIS

**scooter** [_options_] [_path_]

# PARAMETERS

**-a**, **--advanced-regex**
> Enable full regex features (slower).

**-U**, **--multiline**
> Enable multiline search.

**-N**, **--no-tui**
> Non-interactive mode.

**--search-text** _TEXT_
> Pre-populate the search field.

**--replace-text** _TEXT_
> Pre-populate the replacement field.

**--fixed-strings**
> Use literal string matching instead of regex.

**--hidden**
> Include hidden files in search.

**--files-to-include** _GLOB_
> Comma-separated glob patterns to include.

**--files-to-exclude** _GLOB_
> Comma-separated glob patterns to exclude.

# DESCRIPTION

**scooter** recursively searches through files in a directory and lets you interactively toggle which matches to replace. It supports fixed strings and regex with capture groups, respects .gitignore and .ignore files, and provides syntax highlighting with customizable themes.

# HISTORY

**scooter** was created by **Thomas Schafer** (thomasschafer) and is written in **Rust**.

# SEE ALSO

[sed](/man/sed)(1), [serpl](/man/serpl)(1), [ripgrep](/man/ripgrep)(1)
