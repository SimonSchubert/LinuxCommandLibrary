# TAGLINE

Cross-platform tabular data pretty-printer

# TLDR

**Pretty-print a CSV file**

```tidy-viewer [path/to/file.csv]```

**Pretty-print data piped from stdin**

```cat [path/to/file.csv] | tidy-viewer```

**Use a custom delimiter**

```tidy-viewer -s "|" [path/to/file.psv]```

**Tab-separated input** via delimiter

```tidy-viewer -s $'\t' [path/to/file.tsv]```

**Display with a specific color palette**

```tidy-viewer -c [3] [path/to/file.csv]```

**Print all rows with color and page through output**

```tidy-viewer -af [path/to/file.csv] | less -RS```

# SYNOPSIS

**tidy-viewer** [_options_] [_file_]

# PARAMETERS

**-s**, **--delimiter** _DELIM_
> Field separator. Default: comma. Use a tab character for TSV.

**-c**, **--color** _N_
> Color palette: 1 (nord), 2 (one_dark), 3 (gruvbox), 4 (dracula), 5 (solarized light).

**-n**, **--number-of-rows-to-output** _ROWS_
> Number of rows to display. Default: 25.

**-t**, **--title** _TITLE_
> Optional table title.

**-a**, **--color-always**
> Force color output even when not a TTY.

**-f**, **--force-all-rows**
> Print every row instead of the default preview limit.

**-e**, **--extend-width-and-length**
> Extend output beyond terminal width/length for paging with **less**.

**-g**, **--sigfig** _N_
> Significant digits for numbers (default 3, max 7).

**-C**, **--config-details**
> Show the active configuration.

**-h**, **--help**
> Show help and example configuration.

# DESCRIPTION

**tidy-viewer** is a cross-platform CLI tool for pretty-printing tabular data in the terminal. It reads CSV, TSV, PSV, Parquet, Arrow IPC, and Feather files from paths or stdin, then renders column-aligned tables with color styling, significant-figure formatting, and NA highlighting for missing values.

The tool prints row and column dimensions first, truncates long strings to preserve alignment, and skips columns that do not fit the terminal width (listing extras in a footer). Large files stream automatically for memory efficiency. Output is optimized for readability rather than literal fidelity.

Commonly aliased as **tv**; the installed binary name is **tidy-viewer**.

# CONFIGURATION

Settings live in a TOML dotfile. Location depends on OS:

> Linux: **$XDG_CONFIG_HOME/tv.toml** or **~/.config/tv.toml**
> macOS: **~/Library/Application Support/tv.toml**
> Windows: **%AppData%\tv.toml**

Every key must be present or the file is ignored. Run **tidy-viewer --help** for a full example template. Use **tidy-viewer --config-details** to inspect active settings.

# CAVEATS

Multiple unrelated tools share the short name **tv**. This entry documents the Rust **tidy-viewer** binary. Partial config files are silently ignored.

# INSTALL

```brew: brew install tidy-viewer```

```nix: nix profile install nixpkgs#tidy-viewer```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[tv](/man/tv)(1), [column](/man/column)(1), [csvlook](/man/csvlook)(1), [miller](/man/miller)(1)

# RESOURCES

```[Source code](https://github.com/alexhallam/tv)```

```[Documentation](https://docs.rs/tidy-viewer-core)```

<!-- verified: 2026-07-11 -->