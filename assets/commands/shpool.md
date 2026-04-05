# TAGLINE

Persistent shell session manager

# TLDR

**Attach to a named session** (creates it if it doesn't exist)

```shpool attach [session_name]```

**List all active sessions**

```shpool list```

**Detach from the current session**

```shpool detach```

**Kill a named session**

```shpool kill [session_name]```

**Start the daemon** manually

```shpool daemon```

**Attach with a session timeout**

```shpool attach --ttl [2h] [session_name]```

# SYNOPSIS

**shpool** [_options_] _subcommand_ [_args_]

# SUBCOMMANDS

**daemon**
> Start the shpool daemon, listening for connections and managing shell sessions. Usually started via systemd or autodaemonization.

**attach** _name_
> Connect to a named shell session. If the session does not exist, a new shell is created. If it already exists, reattach to it and redraw the screen.

**list**
> Display all active shell sessions managed by the daemon.

**detach** [_name_]
> Disconnect from one or more sessions without terminating them. Without arguments, detaches the current session.

**kill** _name_
> Terminate a named shell session.

# PARAMETERS

**-f**
> Force-attach to a session, detaching any existing client first. Used with **attach**.

**--ttl** _duration_
> Set a session timeout. The session is automatically killed after this duration. Used with **attach**.

**-d**
> Enable autodaemonization (default behavior).

**-D**
> Disable autodaemonization; run daemon in the foreground.

# DESCRIPTION

**shpool** is a lightweight shell session persistence tool. It allows named shell sessions to survive disconnections and be reattached later, similar to **tmux** or **screen**, but without terminal multiplexing features like window splitting or tiling.

Shpool preserves native terminal behavior including scrollback and copy-paste by sending raw shell output directly to the local terminal emulator. It maintains an in-memory terminal state using VT100 emulation, allowing it to redraw the screen upon reattachment so users can see output generated while disconnected.

The daemon auto-detects bash, zsh, and fish shells, injecting a prompt prefix showing the session name for easy identification. Each session supports a single client at a time.

# CONFIGURATION

Configuration file at **~/.config/shpool/config.toml**. Options include:

**nodaemonize**
> Disable automatic daemon startup when running attach.

**keybinding**
> Customize the detach keybinding (default: **Ctrl-Space Ctrl-q**).

Bash users should add **shopt -s huponexit** to **~/.bashrc** to prevent background processes from accumulating in the daemon's process tree.

# CAVEATS

Single-client-per-session model means only one terminal can be attached to a given session at a time. Does not provide window splitting, pane management, or session sharing. On macOS, some features may not work fully. Requires the daemon to be running (via systemd, homebrew services, or autodaemonization) before sessions can be created.

# HISTORY

**shpool** was created as a simpler alternative to **tmux** and **GNU screen**, focusing exclusively on session persistence without terminal multiplexing. Written in **Rust**, it is developed by the shell-pool community on GitHub. The project emphasizes preserving native terminal feel while providing reliable reconnection for remote work.

# SEE ALSO

[tmux](/man/tmux)(1), [screen](/man/screen)(1), [dtach](/man/dtach)(1), [abduco](/man/abduco)(1), [mosh](/man/mosh)(1)
