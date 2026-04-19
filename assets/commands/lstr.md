# TAGLINE

Fast minimalist directory tree viewer

# TLDR

**Display directory tree**

```lstr```

**Display tree for a specific path**

```lstr [path/to/directory]```

**Launch interactive TUI mode**

```lstr interactive```

**Show tree with Git status** and respect .gitignore

```lstr -G -g```

**Show sizes, permissions and icons**

```lstr -s -p --icons```

**Limit recursion depth**

```lstr -L [2]```

**Sort by size, directories first**

```lstr --sort size --dirs-first```

# SYNOPSIS

**lstr** [_options_] [_path_]

**lstr interactive** [_options_] [_path_]

# PARAMETERS

**-a**, **--all**
> List all files and directories, including hidden ones.

**-d**, **--dirs-only**
> Show directories only.

**-g**, **--gitignore**
> Respect `.gitignore` and other standard ignore files.

**-G**, **--git-status**
> Show Git status indicators for files and directories.

**--icons**
> Display file-specific icons (requires a Nerd Font).

**--hyperlinks**
> Render paths as clickable hyperlinks in supported terminals.

**-L**, **--level** _DEPTH_
> Limit the depth of the tree.

**-p**, **--permissions**
> Show file permissions (Unix-like systems).

**-s**, **--size**
> Show file sizes.

**--sort** _TYPE_
> Sort by **name**, **size**, **modified**, or **extension**.

**--dirs-first**
> List directories before files.

**--case-sensitive**
> Use case-sensitive sorting.

**--natural-sort**
> Use version-aware ("natural") sort ordering.

**-r**, **--reverse**
> Reverse the sort order.

**--dotfiles-first**
> Sort hidden files and folders first.

**--color** _WHEN_
> Colorize output (**always**, **auto**, **never**).

**--expand-level** _LEVEL_
> Initial expansion depth (interactive mode only).

# DESCRIPTION

**lstr** is a fast, minimalist directory tree viewer written in Rust. It scans directories in parallel and brings modern features to the classic **tree** command: `.gitignore` support, Git status indicators, Nerd Font icons, clickable hyperlinks, and multiple sort modes.

The **interactive** subcommand launches a keyboard-driven TUI (built with ratatui) for browsing the tree. Non-interactive output is designed to pipe cleanly into tools like **fzf**.

# CAVEATS

Icon display requires a Nerd Font installed in the terminal.

# HISTORY

**lstr** was created by **bgreenwell** and is written in **Rust**.

# SEE ALSO

[tree](/man/tree)(1), [ls](/man/ls)(1), [eza](/man/eza)(1)
