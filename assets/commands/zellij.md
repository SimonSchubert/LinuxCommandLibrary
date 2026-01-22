# TLDR

**Start a new session**

```zellij```

**Start a named session**

```zellij -s [session_name]```

**List existing sessions**

```zellij list-sessions```

**Attach to existing session**

```zellij attach [session_name]```

**Run with specific layout**

```zellij --layout [layout_name]```

**Detach from session (keybinding)**

```Ctrl+o d```

# SYNOPSIS

**zellij** [_options_] [_command_]

# PARAMETERS

**-s**, **--session** _name_
> Name for the new session

**--layout** _layout_
> Use specified layout file

**-l**, **--layout-path** _path_
> Path to layout file

**-c**, **--config** _file_
> Path to config file

**--config-dir** _dir_
> Path to config directory

**-n**, **--new-session-with-layout** _layout_
> Create new session with layout

# SUBCOMMANDS

**attach** _name_
> Attach to an existing session

**list-sessions**, **ls**
> List active sessions

**kill-session** _name_
> Kill specified session

**kill-all-sessions**
> Kill all sessions

**setup**
> Setup wizard and shell integration

**options**
> Change session options

# DESCRIPTION

**zellij** is a terminal workspace manager (multiplexer) similar to tmux and screen, but with a modern approach. It provides panes, tabs, and sessions with a discoverable keyboard-driven interface.

Key features include floating panes, a plugin system (WebAssembly-based), built-in layouts for common workflows, and a status bar showing available keybindings.

Default keybindings use modes accessed via **Ctrl+key**: **Ctrl+p** for pane mode, **Ctrl+t** for tab mode, **Ctrl+n** for resize mode, **Ctrl+h** for move mode, **Ctrl+s** for scroll mode, **Ctrl+o** for session mode.

Configuration is in **~/.config/zellij/config.kdl** using KDL format. Layouts define pane arrangements for reusable workspace setups.

# CAVEATS

Some key combinations may conflict with shell or application bindings. Zellij's mode system helps avoid conflicts.

Plugin development requires Rust and WebAssembly knowledge.

Sessions persist until explicitly killed, potentially consuming resources if forgotten.

# SEE ALSO

[tmux](/man/tmux)(1), [screen](/man/screen)(1), [byobu](/man/byobu)(1)
