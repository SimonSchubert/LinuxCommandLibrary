# TLDR

Wait for **processes** to exit

```waitpid [pid1] [pid2]```

Wait with **timeout**

```waitpid -t [n] [pid1] [pid2]```

Ignore already **exited** processes

```waitpid -e [pid1] [pid2]```

Wait for **N** processes

```waitpid -c [n] [pid1] [pid2]```

Display **help**

```waitpid -h```

# SYNOPSIS

**waitpid** [_OPTIONS_] _PID_...

# PARAMETERS

**-t, --timeout** _SECONDS_
> Maximum time to wait

**-e, --exited**
> Don't error if PIDs have already exited

**-c, --count** _N_
> Wait until N processes have exited

**-h, --help**
> Display help information

# DESCRIPTION

**waitpid** waits for the termination of arbitrary processes by their PIDs. Unlike the shell built-in wait, it can wait for any process, not just children of the current shell.

The command blocks until all specified processes have terminated or the timeout expires.

# CAVEATS

Part of util-linux. Can only monitor processes visible to the current user. Requires appropriate permissions to monitor processes.

# SEE ALSO

[wait](/man/wait)(1), [kill](/man/kill)(1)
