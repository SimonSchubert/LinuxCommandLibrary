# TAGLINE

Screen-style terminal multiplexer built on libghostty

# TLDR

**Create a new session** (named after the current directory by default)

```boo new [session_name]```

**Create a detached session** running a command

```boo new [session_name] -d -- [command]```

**List** all sessions

```boo ls```

**Reattach** to a session

```boo attach [session_name]```

**Open the full-screen session manager**

```boo ui```

**Send text to a detached session** and submit it

```boo send [session_name] --text '[make]' --enter```

**Wait until a session's output settles**, then read its screen

```boo wait [session_name] --idle && boo peek [session_name]```

**Kill** a session

```boo kill [session_name]```

# SYNOPSIS

**boo** \<command\> [options] [arguments]

# COMMANDS

**new [NAME]**

> Create a new session. Defaults to the current directory name. With **-d** the session starts detached, and a command to run can be passed after **--**.

**attach NAME**

> Reattach to a session and restore its screen contents, styles, cursor and scrollback. Aliases: **at**, **a**. Attaching steals the session from any other attached client.

**ls**

> List sessions. **--json** prints machine-readable output.

**ui**

> Full-screen session manager with keybindings for switching, creating, resizing and killing sessions.

**send NAME**

> Send input to a session without attaching. **--text TEXT** sends literal text, **--enter** submits it, **--key KEY1,KEY2** sends control keys such as Enter, C-c or Up.

**peek NAME**

> Print the session's rendered screen state. **--scrollback** includes history, **--json** adds size, cursor and title.

**wait NAME**

> Block until a condition is met: **--text TEXT** waits for the text to appear on screen, **--idle** waits until output has been quiet for 2 seconds, **--timeout DUR** sets a maximum wait (500ms, 2s, 1m, 4h, 1d).

**rename OLD NEW**

> Rename a session.

**kill NAME**

> End a session. **--all** ends all sessions.

**help [command]**

> Show the overview, details for one command, or all help pages with **--all**.

# KEY BINDINGS

The prefix key is **Ctrl-a**, following GNU screen defaults.

**C-a d**

> Detach from the current session; it keeps running in the background.

**C-a l**

> Redraw the screen.

**C-a a**

> Send a literal Ctrl-a to the program in the session.

# DESCRIPTION

**boo** is a terminal multiplexer in the spirit of GNU screen: one window per session, a Ctrl-a prefix key, and sessions that survive disconnects. Its distinguishing feature is that all session output is parsed through **libghostty-vt**, the terminal emulation core of the Ghostty terminal, so the full screen state - contents, SGR styles, cursor position, scrolling regions, terminal modes and window title - is reconstructed faithfully when reattaching instead of being approximated.

A client/daemon architecture keeps sessions alive: the client manages the TTY while a per-session daemon owns the PTY-attached child process and feeds its output into a persistent ghostty-vt terminal stream. Terminal queries are answered even while detached, which prevents TUI programs from hanging in background sessions.

Every command except **attach** works without a terminal, making boo scriptable for automation and AI agents: **send** types into a session, **wait** blocks until output settles or a text appears, and **peek** reads the rendered screen, optionally as JSON.

Exit codes: 0 success, 1 error, 2 usage error, 3 session not found, 4 wait timeout.

# CAVEATS

Only one client can be attached to a session at a time; attaching steals the session, and there is no equivalent of screen's multi-display mode. Each session has exactly one window - there are no splits or tabs, the intended model is one session per task juggled via **boo ui**. The **Ctrl-a** prefix is not yet configurable, and sessions always run with TERM=xterm-256color. The project is young and not a drop-in replacement for screen.

# HISTORY

boo was released by Coder in 2026, written in Zig and built on libghostty-vt, the MIT-licensed terminal emulation library extracted from the Ghostty terminal emulator. It revives the GNU screen model of simple persistent sessions while adding accurate modern terminal emulation and automation primitives aimed at scripted and agent-driven workflows.

# SEE ALSO

[screen](/man/screen)(1), [tmux](/man/tmux)(1), [zellij](/man/zellij)(1), [abduco](/man/abduco)(1), [dtach](/man/dtach)(1), [ghostty](/man/ghostty)(1)

# RESOURCES

```[Source code](https://github.com/coder/boo)```

<!-- verified: 2026-06-12 -->
