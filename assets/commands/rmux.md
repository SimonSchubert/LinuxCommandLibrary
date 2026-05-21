# TAGLINE

Programmable, tmux-compatible terminal multiplexer

# TLDR

**Create a new detached session** named **ci**

```rmux new-session -d -s [ci]```

**Send a command** to a session as if typed

```rmux send-keys -t [ci] "[printf 'ok\n']" Enter```

**Capture the current pane** output

```rmux capture-pane -p -t [ci]```

**Attach** to an existing session

```rmux attach -t [ci]```

**List** all sessions

```rmux list-sessions```

**Wait for** a named signal to fire

```rmux wait-for [ci-done]```

**Kill** a session

```rmux kill-session -t [ci]```

# SYNOPSIS

**rmux** _command_ [_command-options_]

**rmux** [**-t** _target_] [**-s** _name_] [**-d**] ...

# PARAMETERS

**new-session**, **new**
> Create a session. **-d** detaches it; **-s** _NAME_ names it; **-c** _DIR_ sets the working directory.

**attach-session**, **attach**
> Attach the current terminal to an existing session given by **-t** _TARGET_.

**list-sessions**, **ls**
> Print all known sessions with their IDs and status.

**send-keys**
> Send keystrokes or literal text to a target pane. Special keys (**Enter**, **C-c**, **Escape**, **Up**, ...) are recognized as separate arguments.

**capture-pane**
> Dump the visible buffer of a pane. **-p** prints to stdout; **-S** _LINE_ / **-E** _LINE_ select a history range.

**wait-for**
> Block until a named signal is fired with **rmux wait-for -S** _NAME_.

**kill-session**, **kill-server**
> Terminate a session or the whole server.

**-t** _TARGET_
> Target pane or session (e.g. **ci**, **ci:0.1**).

**-s** _NAME_
> Session name when creating.

**-d**
> Detach (do not attach the terminal to the new session).

**-c** _DIR_
> Set the working directory for a new session or window.

# DESCRIPTION

**rmux** is a Rust-implemented terminal multiplexer with a tmux-compatible command surface (all 90 commands implemented) and a typed SDK for driving sessions from code. It targets agent automation, headless CI workflows, and interactive use, running natively on Linux, macOS, and Windows (including Windows Named Pipes as a local transport).

Sessions are persistent: a process started inside a session keeps running after the controlling terminal disconnects, and can be reattached, inspected, or driven later. Each session is a tree of windows and panes addressable by name or ID, mirroring tmux semantics so existing tmux configurations and muscle memory mostly carry over.

Beyond classic multiplexing, **rmux** exposes structured snapshots and terminal-native locators that let an SDK or CLI consumer treat a TUI as an addressable surface, sending keystrokes and reading back stable representations of the screen. This makes it usable as a backing engine for AI agents or test harnesses that need to drive interactive programs deterministically.

# CAVEATS

While the command surface aims for tmux parity, edge-case behaviors and configuration semantics may diverge; existing **.tmux.conf** files are not parsed. The project is young (v0.2.0 in mid-2026); APIs and on-disk session formats may still shift. Sessions are local to the **rmux** server process and are lost if the server is killed.

# HISTORY

**rmux** is developed by **Helvesec** (**github.com/helvesec/rmux**), with v0.2.0 released **18 May 2026**. It is distributed as cross-platform binaries via a shell script (macOS/Linux), a PowerShell installer (Windows), and as a Cargo crate, and ships alongside a typed Rust SDK.

# SEE ALSO

[tmux](/man/tmux)(1), [screen](/man/screen)(1), [zellij](/man/zellij)(1), [abduco](/man/abduco)(1)
