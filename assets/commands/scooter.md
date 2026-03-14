# TAGLINE

Interactive find-and-replace in the terminal

# TLDR

**Launch interactive find-and-replace in the current directory**

```scooter```

**Search in a specific directory**

```scooter [path/to/directory]```

**Pre-populate search and replace fields and start searching immediately**

```scooter --search-text "[old]" --replace-text "[new]" --immediate-search```

**Search using literal strings instead of regex**

```scooter --fixed-strings```

**Include hidden files in the search**

```scooter --hidden```

**Search only specific file types**

```scooter --files-to-include "[*.py,*.js]"```

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

**--immediate-search**
> Start searching immediately when combined with --search-text.

# DESCRIPTION

**scooter** recursively searches through files in a directory and lets you interactively toggle which matches to replace. It supports fixed strings and regex with capture groups, respects .gitignore and .ignore files, and provides syntax highlighting with customizable themes.

# HISTORY

**scooter** was created by **Thomas Schafer** (thomasschafer) and is written in **Rust**.

# SEE ALSO

[sed](/man/sed)(1), [serpl](/man/serpl)(1), [ripgrep](/man/ripgrep)(1)
