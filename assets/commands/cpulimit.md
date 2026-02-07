# TAGLINE

throttle process CPU usage

# TLDR

Limit process by **PID** to 25% CPU

```cpulimit -p 1234 -l 25```

Limit by **executable name**

```cpulimit -e program -l 25```

Launch program with **50% limit**

```cpulimit -l 50 -- program arg1 arg2```

Run cpulimit in **background**

```cpulimit -l 50 -b -- program```

**Kill** process if over limit

```cpulimit -l 50 -k -- program```

Throttle process and **child processes**

```cpulimit -l 25 -m -- program```

# SYNOPSIS

**cpulimit** [_TARGET_] [_OPTIONS_...] [**--** _PROGRAM_]

# DESCRIPTION

**cpulimit** limits the CPU usage of a process by sending SIGSTOP and SIGCONT signals to throttle CPU consumption. It can target running processes or launch new ones with CPU limits applied.

# PARAMETERS

**-p, --pid=N**
> Target process by PID

**-e, --exe=FILE**
> Target process by executable name

**-P, --path=PATH**
> Target process by absolute path to executable

**-l, --limit=N**
> CPU percentage limit (1-100 per core, mandatory)

**-b, --background**
> Run cpulimit as a background process

**-f, --foreground**
> Run in foreground while waiting for launched process

**-c, --cpu=N**
> Specify number of CPU cores (for percentage calculation)

**-k, --kill**
> Kill process instead of throttling if over limit

**-m, --monitor-forks**
> Also watch and throttle child processes

**-r, --restore**
> Restore a process previously killed with -k

**-q, --quiet**
> Suppress output messages

**-v, --verbose**
> Display control statistics

**-z, --lazy**
> Exit if target process is absent or terminates

# CAVEATS

Uses SIGSTOP and SIGCONT signals, which may cause misleading job control messages in shells. When using -e or -P, targets the first matching process; use -p with PID for specific instances. The -m flag can cause issues with shell scripts that spawn many processes.

# HISTORY

**cpulimit** was created to provide CPU usage limiting functionality for Linux processes, useful for preventing runaway processes from consuming all CPU resources.

# SEE ALSO

[nice](/man/nice)(1), [renice](/man/renice)(1), [cgroups](/man/cgroups)(7), [kill](/man/kill)(1)
