# TAGLINE

Modern modular TUI hex editor

# TLDR

**Open a file** in the hex editor

```hexabyte [path/to/file]```

**Open in split view** with two files

```hexabyte --split [path/to/file1] [path/to/file2]```

**Open in diff mode** to compare files

```hexabyte --diff [path/to/file1] [path/to/file2]```

# SYNOPSIS

**hexabyte** [**--split**|**--diff**] [_options_] _file_ [_file2_]

# DESCRIPTION

**hexabyte** is a modern, modular, and robust TUI hex editor designed for modifying file contents at the byte level. It supports viewing and editing in hexadecimal and ASCII with multiple display modes: **single** file editing, **split** view for side-by-side file comparison, and **diff** mode for highlighting differences between two files.

The editor features a plugin architecture for extensibility and provides standard hex editing operations including inserting, deleting, and replacing bytes, as well as selecting and copy/pasting byte ranges.

# CAVEATS

Requires Python 3.10+. Very large files may impact performance. The diff mode highlights byte-level differences, which may produce noisy output for structurally different files.

# HISTORY

**hexabyte** was created by **thetacom** and is written in **Python**. It was designed to provide a modern, extensible alternative to traditional terminal hex editors.

# SEE ALSO

[hexyl](/man/hexyl)(1), [xxd](/man/xxd)(1), [heh](/man/heh)(1)
