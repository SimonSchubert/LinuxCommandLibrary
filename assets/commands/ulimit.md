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

**ulimit** controls resource limits. It's a shell builtin.

Process limits. CPU, memory, files.

Soft and hard limits. User vs system.

Per-session settings. Shell scope.

Security control. Resource management.

# CAVEATS

Shell builtin. Settings not persistent. Root for hard limits.

# HISTORY

**ulimit** is a standard Unix shell builtin for controlling resource limits, available in bash, zsh, and other shells.

# SEE ALSO

[limits.conf](/man/limits.conf)(5), [sysctl](/man/sysctl)(8), [getrlimit](/man/getrlimit)(2)
