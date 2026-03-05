# TAGLINE

Ranger-like terminal file manager written in Rust

# TLDR

**Launch joshuto** in the current directory

```joshuto```

**Launch in a specific directory**

```joshuto [path/to/directory]```

# SYNOPSIS

**joshuto** [_options_] [_path_]

# DESCRIPTION

**joshuto** is a terminal file manager inspired by **ranger**, written in Rust. It features a three-pane layout showing the parent directory, current directory, and a file preview pane. Navigation uses **Vim-like** key bindings, and the tool supports file previews via customizable preview scripts similar to ranger's.

Key features include mouse support (enabled by default), clipboard integration (via xsel/xclip/wl-clipboard), **fzf** integration for fuzzy finding, **zoxide** integration for directory jumping, bulk rename operations, and fully customizable key bindings and themes through TOML configuration files.

# CONFIGURATION

Configuration files are stored in **$XDG_CONFIG_HOME/joshuto/** and include **joshuto.toml** (general settings), **keymap.toml** (key bindings), **mimetype.toml** (file associations), and **theme.toml** (colors and styles).

# CAVEATS

Requires Rust 1.67+ for building from source. File preview scripts need to be configured separately for rich previews. Clipboard support requires external clipboard tools.

# HISTORY

**joshuto** was created by **kamiyaa** and is written in **Rust**. It was designed as a modern, fast alternative to ranger that leverages Rust's performance while maintaining a familiar file manager workflow.

# SEE ALSO

[ranger](/man/ranger)(1), [lf](/man/lf)(1), [nnn](/man/nnn)(1), [yazi](/man/yazi)(1)
