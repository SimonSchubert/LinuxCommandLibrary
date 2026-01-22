# TLDR

**Open the file manager** in the current directory

```spf```

**Open a specific directory**

```spf [/path/to/directory]```

**Open with a file selected**

```spf [/path/to/file.txt]```

**Print configuration file paths**

```spf path-list```

**Use a custom configuration file**

```spf -c [/path/to/config.toml]```

**Show version information**

```spf --version```

**Show help**

```spf --help```

# SYNOPSIS

**spf** [_options_] [_path_...]

# PARAMETERS

**-c**, **--config-file** _path_
> Use a custom configuration file instead of the default

**--version**
> Display version information

**--help**
> Show help message

**path-list**, **pl**
> Print paths of all configuration files

# DESCRIPTION

**spf** (Superfile) is a modern terminal file manager with a focus on aesthetics and usability. It provides a multi-panel interface for efficient file navigation and operations, supporting keyboard-driven workflows similar to vim.

The interface displays file listings with icons (requires Nerd Font), metadata previews, and supports multiple panels for working across directories simultaneously. Operations include copying, moving, renaming, deleting files, and creating new files and directories.

Key navigation uses vim-style bindings by default: **h/j/k/l** for movement, **y** to copy, **p** to paste, **d** to delete, and **enter** to open. Press **>** to open the command prompt for SPF-specific commands like **split** to open additional panels.

Configuration files control hotkeys, themes, and behavior. Files are stored in **~/.config/superfile/** on Linux and macOS. Themes and border styles are fully customizable.

# CAVEATS

Superfile requires a **Nerd Font** to display file and directory icons correctly. Windows support is partial. The default keybindings may conflict with existing terminal shortcuts; a vim-specific configuration is available for vim/nvim users.

# HISTORY

**Superfile** was created by **yorukot** and first released in **2024**. Written in **Go** using the **Bubble Tea** framework for terminal UI, it was designed as a modern, visually appealing alternative to traditional file managers like ranger, mc, and nnn.

# SEE ALSO

[ranger](/man/ranger)(1), [mc](/man/mc)(1), [nnn](/man/nnn)(1), [lf](/man/lf)(1), [vifm](/man/vifm)(1)
