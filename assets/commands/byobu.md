# TAGLINE

Terminal multiplexer with enhanced status bar and keybindings

# TLDR

**Start** byobu session

```byobu```

**Create** new window

```Ctrl-A c```

**Switch** windows

```Ctrl-A n```

**Detach** session

```Ctrl-A d```

**List** sessions

```byobu-select-session```

# SYNOPSIS

**byobu** [_options_]

# DESCRIPTION

**byobu** is a text-based window manager and terminal multiplexer. It's a wrapper around tmux or screen that adds a status bar, keybindings, and configuration for easier terminal session management.

The tool is popular on Ubuntu and provides an accessible interface for managing multiple terminal sessions.

# PARAMETERS

**-S** _name_
> Create named session

**-ls**
> List sessions

**-r**
> Reattach to session

**-d**
> Detach session

# KEYBINDINGS

**F2** - New window
**F3/F4** - Previous/next window
**F6** - Detach
**F7** - Scrollback mode
**F8** - Rename window
**F9** - Configuration menu
**Shift-F2** - Horizontal split
**Ctrl-F2** - Vertical split

**Ctrl-A** prefix:
- **c** - Create window
- **n/p** - Next/previous window
- **d** - Detach
- **[** - Copy mode

# FEATURES

- Pre-configured tmux/screen
- Informative status bar
- F-key bindings
- Session management
- UTF-8 support
- Color schemes
- Notification system

# STATUS BAR

Shows:
- Hostname
- Load average
- Memory usage
- CPU usage
- Disk space
- Network activity
- Date/time

# WORKFLOW

```bash
# Start session
byobu

# Create windows (F2)
# Switch windows (F3/F4)
# Split panes (Shift-F2, Ctrl-F2)

# Detach (F6)
# Reattach
byobu attach
```

# CAVEATS

F-keys may conflict with terminal emulator. Backend (tmux vs screen) affects features. Status bar uses some resources. Learning curve for advanced features. Default keybindings differ from plain tmux.

# HISTORY

**Byobu** was created by Dustin Kirkland around **2008** to provide a more user-friendly interface to GNU screen, later adding tmux support.

# CONFIGURATION

**~/.byobu/**
> User configuration directory containing keybindings, status bar settings, and profile preferences

**~/.byobu/keybindings**
> Custom keybinding definitions

**~/.byobu/status**
> Status bar configuration (which elements to display)

**~/.byobu/statusrc**
> Status bar refresh rate and display options

**~/.byobu/.tmux.conf**
> Byobu-specific tmux configuration overrides

# SEE ALSO

[tmux](/man/tmux)(1), [screen](/man/screen)(1), [zellij](/man/zellij)(1)
