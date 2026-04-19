# TAGLINE

Modern modular TUI hex editor

# TLDR

**Open a file** in the hex editor

```hexabyte [path/to/file]```

**Open a single file** in split screen view

```hexabyte -s [path/to/file]```

**Open two files** side-by-side for diff

```hexabyte [path/to/file1] [path/to/file2]```

**Use a custom config file**

```hexabyte -c [path/to/config.toml] [path/to/file]```

# SYNOPSIS

**hexabyte** [_options_] _file_ [_file2_]

# PARAMETERS

**-s**, **--split**
> Display a single file in two split-screen editors.

**-c**, **--config** _FILE_
> Use a custom config file (default: `~/.config/hexabyte/config.toml`).

**-h**, **--help**
> Show help message and exit.

# DESCRIPTION

**hexabyte** is a modern, modular, and robust TUI hex editor designed for modifying file contents at the byte level. It supports viewing and editing in hexadecimal, UTF-8 text, and binary with multiple display modes: **single** file editing, **split** view for side-by-side panes on one file, and **diff** mode when two files are opened together.

The editor features a plugin architecture for extensibility and provides standard hex editing operations including inserting, deleting, and replacing bytes, as well as selecting and copy/pasting byte ranges.

# CAVEATS

Requires Python 3.10+. Very large files may impact performance. The diff mode highlights byte-level differences, which may produce noisy output for structurally different files.

# HISTORY

**hexabyte** was created by **thetacom** and is written in **Python**. It was designed to provide a modern, extensible alternative to traditional terminal hex editors.

# SEE ALSO

[hexyl](/man/hexyl)(1), [xxd](/man/xxd)(1), [heh](/man/heh)(1)
