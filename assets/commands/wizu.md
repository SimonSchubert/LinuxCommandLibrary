# TAGLINE

Fast interactive directory tree viewer

# TLDR

**Display current directory tree**

```wisu```

**Interactive mode with file icons**

```wisu -i --icons```

**Sort by size descending with gitignore support**

```wisu -g --sort size --reverse```

# SYNOPSIS

**wisu** [_path_] [_options_]

# PARAMETERS

_PATH_
> Root directory to display (defaults to the current directory).

**-i**, **--interactive**
> Launch the interactive TUI browser.

**--icons**
> Render file-type emoji icons next to entries.

**-g**, **--gitignore**
> Respect `.gitignore` files when walking.

**--sort** _KEY_
> Sort entries by `name`, `size`, `mtime`, etc.

**--reverse**
> Reverse the sort order.

**--export** _FORMAT_
> Export the tree to `csv`, `xml`, or `json`.

# DESCRIPTION

**wizu** (binary name **wisu**) is a directory tree viewer offering both a classic tree-like display and a fully interactive TUI. Features include dual display modes, search, theme-aware coloring via LS_COLORS, emoji file icons, gitignore support, multiple sort modes, time-based filtering, and export to CSV, XML, and JSON formats.

# HISTORY

**wizu** was created by **Andrea Frolli** (sh1zen) and is written in **Rust**.

# SEE ALSO

[tree](/man/tree)(1), [eza](/man/eza)(1), [broot](/man/broot)(1)
