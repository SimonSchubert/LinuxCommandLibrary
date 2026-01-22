# TLDR

**Watch file descriptors**

```peekfd [pid]```

**Watch specific fd**

```peekfd -d [fd] [pid]```

**Watch with timestamps**

```peekfd -t [pid]```

**Binary output**

```peekfd -8 [pid]```

# SYNOPSIS

**peekfd** [_options_] _pid_ [_fd_...]

# PARAMETERS

_PID_
> Process ID to monitor.

_FD_
> File descriptor numbers.

**-d** _FD_
> Specific descriptor.

**-t**
> Add timestamps.

**-8**
> 8-bit clean output.

**-c**
> Use colors.

# DESCRIPTION

**peekfd** monitors file descriptor activity. Shows process I/O.

The tool intercepts fd operations. Part of psmisc.

peekfd watches process I/O.

# CAVEATS

Part of psmisc. Requires ptrace. May miss rapid operations.

# HISTORY

peekfd is part of **psmisc** for monitoring process file descriptors.

# SEE ALSO

[strace](/man/strace)(1), [lsof](/man/lsof)(1), [fuser](/man/fuser)(1)

