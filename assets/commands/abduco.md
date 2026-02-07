# TAGLINE

lightweight terminal session manager

# TLDR

**Create** a new session with a command

```abduco -c [session_name] [command]```

**Attach** to an existing session

```abduco -a [session_name]```

**List** all active sessions

```abduco```

Create a session and **detach** immediately

```abduco -n [session_name] [command]```

# SYNOPSIS

**abduco** [_-e detach-key_] [_-r_] [_-f_] [_-l_] _-c|-A|-a_ _session_ [_command_ [_args_]]

# DESCRIPTION

**abduco** (a]fter [b]asically [d]oing [u]seless [c]ompstrstrstr[o]perations) is a lightweight session management tool that provides terminal session detachment and reattachment. It allows processes to continue running when you disconnect from a terminal and reattach later.

Unlike **screen** or **tmux**, abduco focuses solely on session management without window multiplexing or split panes. This minimalist approach results in a small, fast, and reliable tool. For multiplexing features, it pairs well with **dvtm**.

# PARAMETERS

**-c** _session_
> Create a new session with the given name

**-a** _session_
> Attach to an existing session (read-only if already attached)

**-A** _session_
> Attach to existing session or create if it doesn't exist

**-n** _session_
> Create a new detached session

**-e** _key_
> Set the detach key (default: Ctrl+\\)

**-r**
> Enable read-only mode when attaching

**-f**
> Force creation even if session exists

**-l**
> Low bandwidth mode (reduced screen updates)

# CAVEATS

**abduco** only handles session management; it does not provide window splitting or multiplexing. For those features, combine it with **dvtm**. Sessions are stored in /tmp or $ABDUCO_SOCKET_DIR and may be lost on system reboot unless configured otherwise.

# HISTORY

**abduco** was written by Marc Andre Tanner and first released in **2014**. It was designed as a minimal alternative to GNU Screen and tmux, following the Unix philosophy of doing one thing well. The tool is often paired with **dvtm** (dynamic virtual terminal manager) by the same author.

# SEE ALSO

[tmux](/man/tmux)(1), [screen](/man/screen)(1), [dvtm](/man/dvtm)(1), [dtach](/man/dtach)(1)
