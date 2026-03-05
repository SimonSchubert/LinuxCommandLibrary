# TAGLINE

Hyperextensible Vim-based text editor

# TLDR

**Open a file**

```neovim [path/to/file]```

**Open a file at a specific line**

```neovim +[line_number] [path/to/file]```

**View differences between files**

```neovim -d [file1] [file2]```

**Open in read-only mode**

```neovim -R [path/to/file]```

# SYNOPSIS

**neovim** [_options_] [_files_...]

# DESCRIPTION

**neovim** (usually invoked as **nvim**) is a hyperextensible text editor based on Vim, refactored with modern architecture. It features built-in LSP client, Treesitter-based syntax highlighting, Lua-based configuration and plugin system, embedded terminal emulator, and asynchronous job control.

Neovim maintains backward compatibility with most Vim configurations while providing a more maintainable and extensible codebase. It supports remote plugins via RPC, allowing integration with external tools and GUIs.

# CONFIGURATION

**~/.config/nvim/init.lua**
> Main configuration file (Lua-based, replaces init.vim).

# CAVEATS

Some Vim plugins may not be compatible. The recommended configuration language is Lua rather than Vimscript.

# HISTORY

**Neovim** was started in **2014** by **Thiago de Arruda** as a fork of Vim with the goal of aggressive refactoring and modernization. It is written in **C** and **Lua**.

# SEE ALSO

[nvim](/man/nvim)(1), [vim](/man/vim)(1), [vi](/man/vi)(1)
