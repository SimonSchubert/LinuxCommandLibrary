# TAGLINE

Map Unix signals on the way to a child process

# TLDR

**Translate SIGWINCH (28) into SIGINT (2)** for sleep

```sigmap -m 28:2 /bin/sleep 30```

**Forward SIGTERM as SIGHUP** to a long-running daemon

```sigmap -m 15:1 [path/to/program] [args]```

**Remap several signals at once** by repeating -m

```sigmap -m 1:15 -m 2:15 [path/to/program]```

# SYNOPSIS

**sigmap** **-m** _from_:_to_ [**-m** _from_:_to_ ...] _program_ [_arguments_]

# PARAMETERS

**-m** _from_:_to_, **--map=**_from_:_to_
> Translate signal _from_ into signal _to_ when forwarding to the child process. Both values are integer signal numbers as listed in **signal(7)**. The option may be repeated to install multiple mappings.

_program_
> Path to the executable to launch. Because **sigmap** uses **execve(2)**, this must be an absolute or relative path; **PATH** lookup is **not** performed.

_arguments_
> Forwarded unchanged to the launched program.

# DESCRIPTION

**sigmap** is a small wrapper that launches a child process and rewrites the signals delivered to it. The wrapper installs a handler for each _from_ signal listed on the command line; when the host kernel delivers _from_ to **sigmap**, the wrapper instead sends the corresponding _to_ signal to the child. Signals not listed pass through unchanged.

This is useful when one process insists on emitting a signal that the wrapped program does not understand, when bridging between shells and applications that disagree on which signal means "reload", or when adapting legacy software to a different supervisor. Because the rewrite happens entirely in the wrapper, the child process sees only the translated signals and needs no modification.

**sigmap** uses **execve(2)** to spawn the child, so the resolved binary must be a real executable file with a full path. Shell built-ins, aliases, and bare program names that rely on **PATH** will not work.

# EXAMPLES

Make a SIGTERM act like a graceful SIGHUP reload for a daemon:

```sigmap -m 15:1 /usr/local/sbin/myd```

Catch terminal-resize events and turn them into SIGINT so a script exits when the window is resized:

```sigmap -m 28:2 /usr/local/bin/myscript```

# CAVEATS

Signal numbers are **not portable** across architectures; **SIGUSR1** is **10** on x86 Linux but **30** on Alpha. Always check **signal(7)** on the target platform before hardcoding numeric values. Real-time signals (**SIGRTMIN**+_n_) can be remapped but the numeric value depends on the C library. **SIGKILL (9)** and **SIGSTOP (19)** cannot be caught and therefore cannot be remapped.

# HISTORY

**sigmap** is an open-source utility published by Martin Jacobsson on GitHub as a minimal Unix signals converter. It is intentionally small and depends only on a POSIX C runtime, making it easy to drop into containers and minimal init systems.

# SEE ALSO

[kill](/man/kill)(1), [trap](/man/trap)(1)
