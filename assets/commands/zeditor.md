# TAGLINE

Launch Zed code editor from terminal

# TLDR

**Open file**

```zeditor [file]```

**Open at line**

```zeditor [file]:[line]```

**Open multiple files**

```zeditor [file1] [file2]```

**New window**

```zeditor --new [file]```

# SYNOPSIS

**zeditor** [_--new_] [_options_] [_files_]

# PARAMETERS

**--new**
> New window.

**--wait**
> Wait for close.

**--help**
> Show help.

# DESCRIPTION

**zeditor** is the command-line launcher for Zed, a modern code editor written in Rust. It opens files and directories in the Zed graphical editor from the terminal.

Files can be opened at specific line numbers using the **file:line** syntax. The **--new** flag opens a new editor window instead of reusing an existing one, and **--wait** blocks the terminal until the editor window is closed, useful for git commit messages and other tools that invoke an editor.

Zed itself is a high-performance editor featuring real-time collaborative editing, integrated AI code assistance, and a minimal interface designed for speed.

# CAVEATS

Zed installation required. Newer editor. Platform support varies.

# HISTORY

**zeditor** is the command-line launcher for **Zed**, a modern code editor built in Rust.

# SEE ALSO

[code](/man/code)(1), [nvim](/man/nvim)(1), [helix](/man/helix)(1)
