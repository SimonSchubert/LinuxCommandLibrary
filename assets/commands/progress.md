# TAGLINE

Show progress of running coreutils commands

# TLDR

**Show progress of running coreutils commands**

```progress```

**Monitor continuously**

```progress -M```

**Wait for processes to finish**

```progress -w```

**Monitor specific command**

```progress -c [cp]```

**Monitor specific PID**

```progress -p [12345]```

**Update every N seconds**

```progress -i [1]```

**Show only specific process**

```progress -p $(pidof [dd])```

# SYNOPSIS

**progress** [_-M_] [_-w_] [_-c command_] [_-p pid_] [_-i interval_]

# PARAMETERS

**-M**, **--monitor**
> Continuous monitoring mode.

**-w**, **--wait**
> Wait for processes to complete.

**-c** _CMD_, **--command** _CMD_
> Monitor only specified command.

**-p** _PID_, **--pid** _PID_
> Monitor specific PID.

**-i** _SEC_, **--interval** _SEC_
> Update interval in seconds.

**-a**, **--additional-command** _CMD_
> Add custom command to monitor.

**-o**, **--open-mode**
> Monitor all open files (experimental).

**-q**, **--quiet**
> Quieter output.

**-v**, **--version**
> Show version.

**-h**, **--help**
> Show help.

# DESCRIPTION

**progress** (formerly cv - coreutils viewer) shows the progress of running coreutils commands. It displays file operations progress for cp, mv, dd, tar, gzip, and similar tools that don't have built-in progress indicators.

The tool works by reading /proc filesystem to find file descriptors and position information. It calculates progress by comparing current position to total file size, then displays percentage and throughput.

Supported commands include: cp, mv, dd, tar, cat, rsync, gzip, gunzip, bzip2, xz, lzma, and many others. The -a flag adds custom commands to monitor.

Monitor mode (-M) continuously updates the display like top. Wait mode (-w) blocks until all monitored processes complete - useful in scripts to know when operations finish.

For dd specifically, progress provides the ETA and throughput that dd traditionally lacked (before dd's native status=progress option).

# CAVEATS

Only works with commands that read/write files via standard syscalls. Network operations may not show correctly. Requires read access to /proc. Some compression tools don't expose progress information. File size must be known for percentage calculation.

# HISTORY

**progress** was created by **Xfennec** around **2013**, originally named "cv" (coreutils viewer). It addressed the long-standing complaint that cp and dd don't show progress. The tool became popular especially for monitoring dd during disk operations. It was renamed to "progress" for clarity.

# SEE ALSO

[pv](/man/pv)(1), [dd](/man/dd)(1), [rsync](/man/rsync)(1), [watch](/man/watch)(1)
