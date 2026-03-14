# TAGLINE

Simple but flexible terminal text editor

# TLDR

**Open a file**

```ox [path/to/file]```

**Open multiple files**

```ox [file1] [file2]```

# SYNOPSIS

**ox** [_files_...]

# KEY BINDINGS

**Ctrl+Q**: Quit current tab or editor. **Ctrl+S**: Save file. **Alt+S**: Save as. **Ctrl+N**: New tab. **Ctrl+O**: Open file. **Ctrl+F**: Search. **Ctrl+A**: Find and replace all. **Ctrl+Z**: Undo. **Ctrl+Y**: Redo. **Ctrl+Left/Right**: Switch tabs. **Alt+A**: Focus command line.

# DESCRIPTION

**ox** is a text editor written in Rust that runs in the terminal. Unlike modal editors, you can begin typing straight away. It was built from the ground up without being based on any existing editor.

Features include a plug-in system, built-in terminal, file tree for project management, syntax highlighting, and tools to assist with programming. It supports Linux, macOS, and Windows. Configuration is done via a Lua-based configuration file.

# CAVEATS

Not modal like vim -- uses traditional editing keybindings. Plugin ecosystem is still growing. Requires a terminal with Unicode support.

# HISTORY

**ox** was created by **curlpipe** and is written in **Rust**. It can be installed via `cargo install --git https://github.com/curlpipe/ox`.

# SEE ALSO

[nano](/man/nano)(1), [micro](/man/micro)(1), [vim](/man/vim)(1)
