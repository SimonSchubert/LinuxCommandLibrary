# TAGLINE

Fast minimalist directory tree viewer

# TLDR

**Display directory tree**

```lstr```

**Display tree for a specific path**

```lstr [path/to/directory]```

**Launch interactive TUI mode**

```lstr interactive```

**Show tree with Git status**

```lstr --git```

**Sort by size**

```lstr --sort size```

# SYNOPSIS

**lstr** [_options_] [_path_]

# PARAMETERS

**--git**
> Show Git status for files and directories.

**--sort** _CRITERIA_
> Sort entries by name, size, modified date, or extension.

**--hyperlinks**
> Enable clickable file links in supported terminals.

**-L**, **--level** _DEPTH_
> Limit the depth of the tree display.

# DESCRIPTION

**lstr** is a fast, minimalist directory tree viewer that brings modern features to the classic **tree** command. It respects .gitignore and other standard ignore files, shows Git status for files and directories, and supports file-specific icons with Nerd Fonts.

The interactive TUI mode allows browsing and navigating the directory tree. Output can be piped to other tools like fzf for filtering.

# CAVEATS

Icon display requires a Nerd Font installed in the terminal.

# HISTORY

**lstr** was created by **bgreenwell** and is written in **Rust**.

# SEE ALSO

[tree](/man/tree)(1), [ls](/man/ls)(1), [eza](/man/eza)(1)
