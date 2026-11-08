# TAGLINE

Modern terminal file manager

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

**-hf**, **--hotkey-file** _path_
> Use a custom hotkey file

**-fh**, **--fix-hotkeys**
> Add any missing hotkeys to the hotkey file

**-fch**, **--fix-config-file**
> Add any missing fields to the config file

**-pld**, **--print-last-dir**
> Print the last directory to stdout on exit, for use with cd

**-cf**, **--chooser-file** _path_
> On opening a file, write its path to this file and exit

**--version**
> Display version information

**--help**
> Show help message

**path-list**, **pl**
> Print paths of all configuration files

**debug-info**, **di**
> Print debug information

# DESCRIPTION

**spf** (Superfile) is a modern terminal file manager with a focus on aesthetics and usability. It provides a multi-panel interface for efficient file navigation and operations, supporting keyboard-driven workflows similar to vim.

The interface displays file listings with icons (requires Nerd Font), metadata previews, and supports multiple panels for working across directories simultaneously. Operations include copying, moving, renaming, deleting files, and creating new files and directories.

By default, **j/k** or the arrow keys move, **Ctrl+c** copies, **Ctrl+x** cuts, **Ctrl+v** pastes, **Ctrl+d** deletes, **Ctrl+r** renames, and **enter** or **l** opens. Press **:** for a shell command line, or **>** for the prompt with SPF-specific commands like **split** to open additional panels. Vim-style bindings such as **y**, **p** and **d** ship in **vimHotkeys.toml**.

Configuration files control hotkeys, themes, and behavior. Files are stored in **~/.config/superfile/** on Linux and **~/Library/Application Support/superfile/** on macOS. Themes and border styles are fully customizable.

# CONFIGURATION

**~/.config/superfile/config.toml**
> Main configuration file controlling keybindings, default sort order, display options, and panel behavior.

**~/.config/superfile/theme/**
> Directory of theme TOML files defining colors, selected with the **theme** key in **config.toml**.

**~/.config/superfile/hotkeys.toml**
> Custom keybinding overrides for navigation and file operations.

# CAVEATS

Superfile requires a **Nerd Font** to display file and directory icons correctly. Windows support is partial. The default keybindings may conflict with existing terminal shortcuts; a vim-specific configuration is available for vim/nvim users.

# HISTORY

**Superfile** was created by **yorukot** and first released in **2024**. Written in **Go** using the **Bubble Tea** framework for terminal UI, it was designed as a modern, visually appealing alternative to traditional file managers like ranger, mc, and nnn.

# SEE ALSO

[ranger](/man/ranger)(1), [mc](/man/mc)(1), [nnn](/man/nnn)(1), [lf](/man/lf)(1), [vifm](/man/vifm)(1)

# RESOURCES

```[Source code](https://github.com/yorukot/superfile)```

```[Homepage](https://superfile.dev/)```

<!-- verified: 2026-11-08 -->
