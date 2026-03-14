# TAGLINE

Minimal file lister with Vim key bindings

# TLDR

**Launch jjj** in the current directory

```jjj```

**Launch jjj** in a specific directory

```jjj [path/to/directory]```

**Navigate and select a file** to pipe to another command

```jjj | xargs [command]```

**Change to a selected directory**

```cd $(jjj .)```

# SYNOPSIS

**jjj** [_path_]

# DESCRIPTION

**jjj** is a minimal and fast terminal-based file navigation tool that uses **Vim** key bindings for browsing and listing files. You can quickly navigate directories using **j/k** keys and pipe the selected file to other command-line utilities for further processing.

The tool is designed for fast filesystem navigation directly from the command line with minimal overhead.

# KEY BINDINGS

**j/k** or **Arrow keys** — Move down/up
**h** — Go to parent directory
**l** — Enter directory
**Enter** or **Spacebar** — Exit and return selected path
**r** — Refresh current folder view
**q** or **Esc** — Quit

# CAVEATS

Minimal feature set by design. Does not support file operations like copy, move, or delete.

# HISTORY

**jjj** was created by **Simone Poggiali** (gibbok) and is written in **C** using the ncurses library.

# SEE ALSO

[ls](/man/ls)(1), [lf](/man/lf)(1), [ranger](/man/ranger)(1), [nnn](/man/nnn)(1), [vifm](/man/vifm)(1)
