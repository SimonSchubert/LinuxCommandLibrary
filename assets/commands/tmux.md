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

# KEY BINDINGS (after Ctrl-b)

**d**: Detach from session
**c**: Create new window
**n/p**: Next/previous window
**0-9**: Switch to window number
**"**: Split pane horizontally
**%**: Split pane vertically
**o**: Switch pane
**x**: Kill pane
**z**: Zoom pane (toggle)
**[**: Enter copy mode
**?**: List all key bindings

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
