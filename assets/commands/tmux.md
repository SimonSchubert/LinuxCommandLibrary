# TAGLINE

Terminal multiplexer with session persistence

# TLDR

**Start a new session**

```tmux```

**Start a named session**

```tmux new -s [session_name]```

**List sessions**

```tmux ls```

**Attach to last session**

```tmux attach```

**Attach to named session**

```tmux attach -t [session_name]```

**Kill a session**

```tmux kill-session -t [session_name]```

**Detach from session** (inside tmux)

```Ctrl-b d```

**Create new window** (inside tmux)

```Ctrl-b c```

**Split pane horizontally**

```Ctrl-b "```

**Split pane vertically**

```Ctrl-b %```

# SYNOPSIS

**tmux** [_command_] [_flags_]

# DESCRIPTION

**tmux** (terminal multiplexer) enables multiple terminal sessions within a single window. Sessions persist when disconnected, allowing users to detach and reattach later, making it essential for remote work.

A tmux session contains windows (like tabs), and windows contain panes (splits). The prefix key (default Ctrl-b) followed by a command key triggers actions. Configuration is stored in ~/.tmux.conf.

tmux is widely used for remote server administration, pair programming, and managing complex terminal workflows. Sessions survive SSH disconnections, preventing work loss.

# PARAMETERS

**new** [**-s** _name_]
> Create new session.

**attach** [**-t** _target_]
> Attach to existing session.

**ls**, **list-sessions**
> List sessions.

**kill-session** [**-t** _target_]
> Kill a session.

**kill-server**
> Kill tmux server and all sessions.

**detach**
> Detach from session.

**send-keys**
> Send keys to a pane.

**source-file** _file_
> Load configuration file.

**swap-window** [**-s** _src_] [**-t** _dst_]
> Swap two windows.

**resize-pane** [**-UDLR**] [_amount_]
> Resize pane in given direction.

**-f** _file_
> Specify alternative configuration file.

**-L** _socket-name_
> Use named socket (allows independent servers).

**-S** _socket-path_
> Specify full path to server socket.

# KEY BINDINGS (after Ctrl-b)

**?**: List all key bindings

## Session Commands

**d**: Detach from session
**$**: Rename current session

## Window Commands

**,**: Rename current window
**&**: Kill current window
**c**: Create new window
**n/p**: Next/previous window
**0-9**: Switch to window number
**l**: Move to previously selected window

## Pane Commands

**!**: Transform current pane into a new window
**x**: Kill current pane
**z**: Zoom pane (toggle)
**"**: Split pane horizontally
**%**: Split pane vertically
**o**: Switch pane
**Pg Up/Down/Left/Right**: Change to pane above, below, left, or right of current pane.
**Space**: Arrange current window by one of seven pane layouts (see M-1 to M-7 in **?** command)


**:**: Input a `tmux` parameter from within a session
**[**: Enter copy mode

# CONFIGURATION

**~/.tmux.conf**
> User configuration file for key bindings, status bar customization, default options, and plugin settings. Loaded automatically on server start.

**/etc/tmux.conf**
> System-wide configuration applied to all users.

# CAVEATS

Default prefix (Ctrl-b) conflicts with some applications. Scrolling requires copy mode. Some terminal features may not work identically. Nested tmux requires different prefix handling.

# HISTORY

**tmux** was created by **Nicholas Marriott** in **2007** as a replacement for GNU Screen with a cleaner codebase and more features. It was included in OpenBSD in **2009** and quickly became the preferred terminal multiplexer for many Unix users. The project continues active development with regular feature additions.

# SEE ALSO

[screen](/man/screen)(1), [byobu](/man/byobu)(1), [dtach](/man/dtach)(1)
