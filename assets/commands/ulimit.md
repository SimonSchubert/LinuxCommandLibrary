# TAGLINE

Set or display shell resource limits

# TLDR

**Show all limits**

```ulimit -a```

**Show file size limit**

```ulimit -f```

**Set open files limit**

```ulimit -n [4096]```

**Show stack size**

```ulimit -s```

**Set unlimited stack**

```ulimit -s unlimited```

**Show hard limits**

```ulimit -Ha```

**Raise only the soft** open files limit

```ulimit -Sn [4096]```

**Disable core dumps**

```ulimit -c 0```

# SYNOPSIS

**ulimit** [**-HS**] **-a**

**ulimit** [**-HS**] [**-bcdefiklmnpqrstuvxPRT**] [_limit_]

# PARAMETERS

**-a**
> Display all current limits.

**-b**
> Maximum socket buffer size.

**-c**
> Maximum size of core files (1024-byte units, 512 in POSIX mode).

**-d**
> Maximum size of a process's data segment (kbytes).

**-e**
> Maximum scheduling priority (nice).

**-f**
> Maximum size of files written by the shell and its children (1024-byte units, 512 in POSIX mode). Assumed when no option is given.

**-i**
> Maximum number of pending signals.

**-k**
> Maximum number of kqueues that may be allocated.

**-l**
> Maximum size that may be locked into memory (kbytes).

**-m**
> Maximum resident set size (kbytes).

**-n**
> Maximum number of open file descriptors.

**-p**
> Pipe buffer size (512-byte blocks).

**-q**
> Maximum number of bytes in POSIX message queues.

**-r**
> Maximum real-time scheduling priority.

**-s**
> Maximum stack size (kbytes).

**-t**
> Maximum amount of CPU time (seconds).

**-u**
> Maximum number of user processes.

**-v**
> Maximum amount of virtual memory (kbytes).

**-x**
> Maximum number of file locks.

**-P**
> Maximum number of pseudoterminals.

**-R**
> Maximum time a real-time process can run before blocking (microseconds).

**-T**
> Maximum number of threads.

**-H**
> Set or display hard limit.

**-S**
> Set or display soft limit.

# DESCRIPTION

**ulimit** is a shell builtin that controls resource limits for the current shell session and any processes it spawns. It can set limits on CPU time, memory usage, open file descriptors, process count, file sizes, and other system resources.

Each resource has a soft limit (the effective limit that can be raised by the user up to the hard limit) and a hard limit (the ceiling that only root can raise). Without **-H** or **-S**, ulimit displays the soft limit, but setting a value changes both the soft and the hard limit. The special values **hard**, **soft** and **unlimited** stand for the current hard limit, the current soft limit and no limit.

These limits are important for preventing runaway processes from consuming all system resources and for configuring applications that need higher limits, such as database servers requiring more open file descriptors.

# CAVEATS

Shell builtin: settings apply only to the current shell session and its child processes. For persistent limits, configure **/etc/security/limits.conf** or systemd unit files. Only root can raise hard limits.

# HISTORY

**ulimit** is a standard Unix shell builtin for controlling resource limits, available in bash, zsh, and other shells.

# SEE ALSO

[limits.conf](/man/limits.conf)(5), [sysctl](/man/sysctl)(8), [getrlimit](/man/getrlimit)(2), [prlimit](/man/prlimit)(1)
