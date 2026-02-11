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
> All limits.

**-f**
> File size.

**-n**
> Open files.

**-s**
> Stack size.

**-H**
> Hard limit.

**-S**
> Soft limit.

# DESCRIPTION

**ulimit** is a shell builtin that controls resource limits for the current shell session and any processes it spawns. It can set limits on CPU time, memory usage, open file descriptors, process count, file sizes, and other system resources.

Each resource has a soft limit (the effective limit that can be raised by the user up to the hard limit) and a hard limit (the ceiling that only root can raise). Without the **-H** or **-S** flag, ulimit shows and sets the soft limit by default.

These limits are important for preventing runaway processes from consuming all system resources and for configuring applications that need higher limits, such as database servers requiring more open file descriptors.

# CAVEATS

Shell builtin. Settings not persistent. Root for hard limits.

# HISTORY

**ulimit** is a standard Unix shell builtin for controlling resource limits, available in bash, zsh, and other shells.

# SEE ALSO

[limits.conf](/man/limits.conf)(5), [sysctl](/man/sysctl)(8), [getrlimit](/man/getrlimit)(2)
