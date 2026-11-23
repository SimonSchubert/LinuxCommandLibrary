# TAGLINE

Fast interactive directory tree viewer

# TLDR

**Display current directory tree**

```wisu```

**Interactive mode with file icons**

```wisu -i --icons```

**Interactive mode** that refreshes on filesystem changes

```wisu -i --watch```

**Limit depth** and include hidden files

```wisu -a -L [2] [path/to/directory]```

**Sort by size descending with gitignore support**

```wisu -g --sort size --reverse```

Show **sizes and permissions**

```wisu -s -p```

Show only files **modified in the last** 2 days

```wisu -t [2d]```

**Export** the tree to JSON

```wisu -o json```

# SYNOPSIS

**wisu** [_options_] [_path_]

# PARAMETERS

_PATH_
> Root directory to display (defaults to the current directory).

**-i**, **--interactive**
> Launch the interactive TUI browser.

**--watch**
> Auto-refresh on filesystem changes (interactive mode only).

**-a**, **--all**
> Include hidden files and directories.

**-d**, **--dirs-only**
> List directories only.

**-g**, **--gitignore**
> Respect `.gitignore` and other ignore files.

**-e**, **--exclude** _EXTS_
> Exclude files by extension (comma-separated, e.g. `log,tmp`).

**--exclude-dirs** _DIRS_
> Exclude directories by name (comma-separated, e.g. `node_modules,target`).

**-t**, **--time** _FILTER_
> Filter by modification time: relative (`30m`, `5d`, `2w`, `3M`, `1y`) or absolute date (`2024-06-01`, prefix `<` for before).

**-L**, **--level** _N_
> Maximum depth to descend.

**-F**, **--files** _N_
> Show at most N files per directory.

**--expand-level** _N_
> Initial expansion depth in interactive mode.

**--sort** _KEY_
> Sort entries by `name` (default), `size`, `accessed`, `created`, `modified` or `extension`.

**-r**, **--reverse**
> Reverse the sort order.

**--dirs-first**
> Sort directories before files.

**--natural-sort**
> Natural/version sorting (file2 before file10).

**--icons**
> Render file-type icons next to entries.

**-l**, **--hyperlinks**
> Render paths as clickable terminal hyperlinks.

**-s**, **--size**
> Show file sizes.

**-p**, **--permissions**
> Show file permissions.

**-x**, **--info**
> Show extended file and directory info.

**-o** _FORMAT_
> Export the tree to `csv`, `xml`, or `json`.

**--config** _FILE_
> Load options from a TOML file (a `wisu.toml` in the target directory is used automatically).

# DESCRIPTION

**wizu** (binary name **wisu**) is a directory tree viewer offering both a classic tree-like display and a fully interactive TUI. Features include dual display modes, search (`/`, or `/r:` for regex), theme-aware coloring via LS_COLORS, file icons, gitignore support, multiple sort modes, time-based filtering, and export to CSV, XML, and JSON formats.

In interactive mode, **Enter** opens a file in **$EDITOR** or toggles a directory, **Ctrl+s** quits and prints the selected path (useful for a visual `cd` shell function) and **Ctrl+t** opens a terminal in the selected directory.

# HISTORY

**wisu** was created by **Andrea Frolli** (sh1zen) in 2025, is written in **Rust**, and was inspired by **lstr**.

# SEE ALSO

[tree](/man/tree)(1), [lstr](/man/lstr)(1), [eza](/man/eza)(1), [broot](/man/broot)(1), [fzf](/man/fzf)(1)

# RESOURCES

```[Source code](https://github.com/sh1zen/wisu)```

<!-- verified: 2026-11-23 -->
