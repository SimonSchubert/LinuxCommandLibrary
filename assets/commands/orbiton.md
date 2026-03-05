# TAGLINE

Configuration-free terminal text editor and minimal IDE

# TLDR

**Open a file**

```o [path/to/file]```

**Open at a specific line**

```o [path/to/file]:[line_number]```

# SYNOPSIS

**o** [_options_] [_file_[:_line_]]

# DESCRIPTION

**orbiton** (command: **o**) is a snappy, configuration-free terminal text editor that ships as a single self-contained executable. It supports syntax highlighting, jump-to-error, rainbow parentheses, macros, cut/paste portals, a simple gdb front-end, image preview in terminal, and a built-in spellchecker.

No configuration files are needed — it works out of the box with sensible defaults.

# CAVEATS

Not intended to replace full IDEs. Advanced LSP features are limited compared to Neovim or VS Code.

# HISTORY

**orbiton** was created by **Alexander F. Rodseth** (xyproto) and is written in **Go**.

# SEE ALSO

[micro](/man/micro)(1), [nano](/man/nano)(1), [ox](/man/ox)(1)
