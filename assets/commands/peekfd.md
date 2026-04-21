# TAGLINE

monitors file descriptor activity

# TLDR

**Watch all file descriptors of a process**

```peekfd [pid]```

**Watch a specific file descriptor (e.g. stdout=1)**

```peekfd [pid] [1]```

**Remove duplicate read/write output (useful for terminals with echo)**

```peekfd -d [pid]```

**Suppress per-chunk headers**

```peekfd -n [pid]```

**Follow newly created child processes**

```peekfd -c [pid]```

**8-bit clean output (no post-processing of bytes)**

```peekfd -8 [pid]```

# SYNOPSIS

**peekfd** [_options_] _pid_ [_fd_...]

# PARAMETERS

_PID_
> Process ID to monitor (required).

_FD_
> One or more file descriptor numbers to restrict output to (e.g. 0, 1, 2). If omitted, all fds are shown.

**-8**, **--eight-bit-clean**
> Do no post-processing on the bytes being read or written. Output is raw binary.

**-n**, **--no-headers**
> Do not display headers that indicate the source (pid/fd) of the dumped bytes.

**-c**, **--follow**
> Also dump file-descriptor activity in any child processes created by the target.

**-d**, **--duplicates-removed**
> Remove duplicate read/writes from the output. Useful when watching a terminal with local echo enabled.

**-V**, **--version**
> Display version information.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**peekfd** attaches to a running process using ptrace and prints the bytes it reads from and writes to the specified file descriptors. It can be used to spy on stdin/stdout/stderr or on arbitrary open files and sockets without restarting the process.

By default every tracked fd is shown, with a header preceding each chunk of data that identifies the pid and fd. The -8, -n, -d, and -c flags tune formatting and child-process handling.

# CAVEATS

Part of **psmisc**. Requires kernel ptrace support and sufficient privileges (usually the same user or CAP_SYS_PTRACE; distros with Yama may require disabling `ptrace_scope`). Very fast I/O bursts can lead to dropped bytes. Tracing slows the target process slightly.

# HISTORY

**peekfd** ships with the **psmisc** package alongside utilities such as fuser, killall, and pstree. It was originally written by Trent Waddington.

# SEE ALSO

[strace](/man/strace)(1), [ltrace](/man/ltrace)(1), [lsof](/man/lsof)(1), [fuser](/man/fuser)(1), [pstree](/man/pstree)(1)

