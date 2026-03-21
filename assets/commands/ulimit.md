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

# SYNOPSIS

**ulimit** [_-a_] [_-f_] [_-n_] [_-s_] [_-H_] [_-S_] [_value_]

# PARAMETERS

**-a**
> Display all current limits.

**-c**
> Maximum size of core files (blocks).

**-d**
> Maximum size of a process's data segment (kbytes).

**-f**
> Maximum size of files written by the shell (blocks).

**-l**
> Maximum size that may be locked into memory (kbytes).

**-m**
> Maximum resident set size (kbytes).

**-n**
> Maximum number of open file descriptors.

**-p**
> Pipe buffer size (512-byte blocks).

**-s**
> Maximum stack size (kbytes).

**-t**
> Maximum amount of CPU time (seconds).

**-u**
> Maximum number of user processes.

**-v**
> Maximum amount of virtual memory (kbytes).

**-H**
> Set or display hard limit.

**-S**
> Set or display soft limit (default).

# DESCRIPTION

**ulimit** is a shell builtin that controls resource limits for the current shell session and any processes it spawns. It can set limits on CPU time, memory usage, open file descriptors, process count, file sizes, and other system resources.

Each resource has a soft limit (the effective limit that can be raised by the user up to the hard limit) and a hard limit (the ceiling that only root can raise). Without the **-H** or **-S** flag, ulimit shows and sets the soft limit by default.

These limits are important for preventing runaway processes from consuming all system resources and for configuring applications that need higher limits, such as database servers requiring more open file descriptors.

# CAVEATS

Shell builtin — settings apply only to the current shell session and its child processes. For persistent limits, configure **/etc/security/limits.conf** or systemd unit files. Only root can raise hard limits.

# HISTORY

**ulimit** is a standard Unix shell builtin for controlling resource limits, available in bash, zsh, and other shells.

# SEE ALSO

[limits.conf](/man/limits.conf)(5), [sysctl](/man/sysctl)(8), [getrlimit](/man/getrlimit)(2)
