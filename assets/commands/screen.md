# TLDR

**Start a new screen session**

```screen```

**Start a named session**

```screen -S [session_name]```

**List active sessions**

```screen -ls```

**Reattach to a session**

```screen -r [session_name]```

**Detach from current session** (inside screen)

```Ctrl+a d```

**Create a new window** (inside screen)

```Ctrl+a c```

**Switch between windows** (inside screen)

```Ctrl+a n``` (next) or ```Ctrl+a p``` (previous)

**Split screen horizontally**

```Ctrl+a S```

**Kill current window**

```Ctrl+a k```

# SYNOPSIS

**screen** [**-S** _name_] [**-r** [_name_]] [**-ls**] [**-d**] [_command_]

# PARAMETERS

**-S** _name_
> Create session with specified name

**-r** [_name_]
> Reattach to a detached session

**-R**
> Reattach if possible, otherwise start new session

**-d**
> Detach a running session

**-D**
> Detach and logout

**-ls**, **-list**
> List all sessions

**-x**
> Attach to a session that is already attached (multi-display)

**-dm**
> Start in detached mode (for scripts)

**-X** _command_
> Send command to a running session

**-L**
> Enable logging

**-h** _lines_
> Set scrollback buffer size

# KEY BINDINGS

All commands are prefixed with **Ctrl+a** (command character):

**Ctrl+a c**: Create new window
**Ctrl+a n/p**: Next/previous window
**Ctrl+a "**: List windows
**Ctrl+a 0-9**: Switch to window number
**Ctrl+a d**: Detach from session
**Ctrl+a k**: Kill current window
**Ctrl+a S**: Split horizontally
**Ctrl+a |**: Split vertically
**Ctrl+a Tab**: Switch between regions
**Ctrl+a X**: Close current region
**Ctrl+a [**: Enter copy/scrollback mode
**Ctrl+a ]**: Paste
**Ctrl+a ?**: Show key bindings

# DESCRIPTION

**screen** is a terminal multiplexer that allows running multiple terminal sessions within a single window. Sessions can be detached and reattached, making them persistent across disconnections—essential for remote work and long-running processes.

Each screen session can contain multiple windows, each running its own shell or program. Windows can be split into regions to view multiple windows simultaneously.

Sessions persist even when you disconnect, whether intentionally or due to network issues. This makes screen invaluable for running processes on remote servers that must survive connection drops.

Copy mode allows scrolling through terminal history and copying text between windows or to the clipboard.

# CAVEATS

Screen's default configuration may conflict with some terminal features. Customize via **~/.screenrc**.

The command prefix **Ctrl+a** conflicts with readline's beginning-of-line. Remap with **escape** in .screenrc if needed.

Nested screen sessions require pressing the prefix twice (**Ctrl+a a**) to send commands to the inner session.

For modern alternatives with more features, consider **tmux**.

# HISTORY

Screen was originally written by **Oliver Laumann** in **1987** and has been maintained by the GNU project. It was one of the first terminal multiplexers and established the paradigm that tmux and others follow.

# SEE ALSO

[tmux](/man/tmux)(1), [byobu](/man/byobu)(1), [dtach](/man/dtach)(1), [nohup](/man/nohup)(1)
