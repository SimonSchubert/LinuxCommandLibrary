# TAGLINE

Fast terminal UI for Git written in Rust

# TLDR

**Start GitUI**

```gitui```

**Start in specific directory**

```gitui -d [path]```

**Use custom theme**

```gitui --theme [theme.ron]```

**Use a file-system watcher** instead of polling

```gitui --watcher```

**Generate a bug report**

```gitui --bugreport```

# SYNOPSIS

**gitui** [_options_]

# PARAMETERS

**-d** _PATH_, **--directory** _PATH_
> Set the git directory (defaults to `.` or `$GIT_DIR`).

**-w** _PATH_, **--workdir** _PATH_
> Set the working directory (defaults to the current directory or `$GIT_WORK_TREE`).

**-t** _FILE_, **--theme** _FILE_
> Set the color theme filename, loaded from the config directory (default: `theme.ron`).

**-f** _FILE_, **--file** _FILE_
> Select a file in the file tab on startup.

**-k** _FILE_, **--key-bindings** _FILE_
> Use a custom keybindings file.

**-s** _FILE_, **--key-symbols** _FILE_
> Use a custom symbols file.

**-l**, **--logging**
> Store logging output into a file in the cache directory.

**--logfile** _FILE_
> Store logging output into the specified file (implies **--logging**).

**--watcher**
> Use a notify-based file system watcher instead of the default tick-based polling.

**--bugreport**
> Generate a bug report.

**-h**, **--help**
> Display help information.

**-V**, **--version**
> Display version information.

# DESCRIPTION

**gitui** is a fast terminal UI for Git. It provides a keyboard-driven interface for staging, committing, branching, and viewing diffs, all within the terminal.

Written in Rust, **gitui** is lightweight and responsive. It displays status, log, diff, and staging information in a split-pane interface with vim-like key bindings.

# CONFIGURATION

**~/.config/gitui/theme.ron**
> Theme configuration file in RON format for customizing colors and appearance.

**~/.config/gitui/key_bindings.ron**
> Key binding customization file.

# CAVEATS

Terminal UI needs appropriate terminal. Some features limited compared to full GUI. Themes require RON format. By default, gitui polls the working directory for changes every few seconds; pass **--watcher** for faster, notify-based change detection on platforms where it works reliably.

# HISTORY

gitui was created by **Stephan Dilly** as a fast, keyboard-centric terminal UI for git written in Rust.

# INSTALL

```dnf: sudo dnf install gitui```

```pacman: sudo pacman -S gitui```

```apk: sudo apk add gitui```

```zypper: sudo zypper install gitui```

```brew: brew install gitui```

```nix: nix profile install nixpkgs#gitui```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[tig](/man/tig)(1), [lazygit](/man/lazygit)(1), [git-gui](/man/git-gui)(1)

# RESOURCES

```[Source code](https://github.com/gitui-org/gitui)```

```[FAQ](https://github.com/gitui-org/gitui/blob/master/FAQ.md)```

<!-- verified: 2026-07-17 -->
