# TLDR

**Create new session**

```dtach -c [/tmp/session.sock] [command]```

**Attach to existing session**

```dtach -a [/tmp/session.sock]```

**Create session, don't attach**

```dtach -n [/tmp/session.sock] [command]```

**Attach, create if missing**

```dtach -A [/tmp/session.sock] [command]```

**Detach key** (default Ctrl+\)

# SYNOPSIS

**dtach** [_options_] _socket_ [_command_ [_args_]]

# DESCRIPTION

**dtach** provides detachable terminal sessions similar to screen or tmux, but focused solely on the detach/attach functionality. It creates a Unix socket for session communication.

The minimalist approach makes dtach lighter than alternatives when only session detachment is needed, without window management or other features.

# PARAMETERS

**-c** _socket_
> Create new session and attach.

**-n** _socket_
> Create new session without attaching.

**-a** _socket_
> Attach to existing session.

**-A** _socket_
> Attach or create if missing.

**-r** _method_
> Redraw method (none, ctrl_l, winch).

**-e** _char_
> Set detach character.

**-E**
> Disable detach character.

**-z**
> Disable suspend key handling.

# CAVEATS

No window management. No scrollback buffer. Socket files persist after session ends. Single client at a time by default. No built-in session listing.

# HISTORY

**dtach** was created by **Ned T. Crigler** in **2001** as a minimal alternative to GNU Screen. It emerged from the desire for session detachment without screen's complexity. The tool is useful when combining with other terminal multiplexers or for simple session persistence.

# SEE ALSO

[screen](/man/screen)(1), [tmux](/man/tmux)(1), [abduco](/man/abduco)(1), [nohup](/man/nohup)(1)
