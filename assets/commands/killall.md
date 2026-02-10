# TAGLINE

sends a signal to all processes running the specified command

# TLDR

**Terminate all processes** with a specific name

```killall [process_name]```

**Force kill processes** (SIGKILL)

```killall -9 [process_name]```

**Send a specific signal**

```killall -s [SIGTERM] [process_name]```

**Kill only processes owned by you**

```killall -u $(whoami) [process_name]```

**Interactive mode** (confirm before killing)

```killall -i [process_name]```

**Kill processes matching regex**

```killall -r "[pattern]"```

**Show what would be killed** without killing

```killall -v [process_name]```

**Wait for processes to terminate**

```killall -w [process_name]```

# SYNOPSIS

**killall** [_-signal_] [_-eiIqrvw_] [_-u user_] [_-g group_] [_-o time_] [_-y time_] [_name ..._]

# PARAMETERS

**-e**, **--exact**
> Require exact name match (including path length).

**-I**, **--ignore-case**
> Case-insensitive matching.

**-i**, **--interactive**
> Ask for confirmation before killing.

**-l**, **--list**
> List known signal names.

**-q**, **--quiet**
> Don't complain if no processes were killed.

**-r**, **--regexp**
> Interpret names as extended regular expressions.

**-s**, **--signal** _signal_
> Send specified signal (name or number).

**-u**, **--user** _user_
> Kill only processes owned by user.

**-g**, **--process-group**
> Kill the process group instead of process.

**-v**, **--verbose**
> Report if signal was successfully sent.

**-w**, **--wait**
> Wait for killed processes to terminate.

**-o**, **--older-than** _time_
> Kill processes older than specified time.

**-y**, **--younger-than** _time_
> Kill processes younger than specified time.

**-Z**, **--context** _pattern_
> Kill only processes with matching SELinux context.

# COMMON SIGNALS

**SIGTERM (15)**
> Graceful termination (default).

**SIGKILL (9)**
> Force kill (cannot be caught).

**SIGHUP (1)**
> Hangup (often triggers reload).

**SIGINT (2)**
> Interrupt (like Ctrl+C).

**SIGSTOP (19)**
> Pause process.

**SIGCONT (18)**
> Resume paused process.

# DESCRIPTION

**killall** sends a signal to all processes running the specified command. Unlike **kill** which requires process IDs, killall works with process names, making it convenient for terminating multiple instances of a program.

By default, killall sends SIGTERM (signal 15), which requests graceful termination. Processes can catch this signal and clean up before exiting. Use SIGKILL (-9) when processes don't respond to SIGTERM, but be aware this prevents cleanup.

Name matching compares against the command name (visible in ps). The -r flag enables regex matching for flexible patterns. With -i, you're prompted before each process is killed.

The -w flag makes killall wait until all processes are actually terminated before returning. This is useful in scripts where you need to ensure processes are stopped before proceeding.

Time-based filtering (-o, -y) allows killing only processes that have been running longer or shorter than specified duration (e.g., "1h" for one hour, "30m" for 30 minutes).

# CAVEATS

Behavior differs between Linux (psmisc) and BSD/macOS versions. On macOS, syntax and options differ significantly. Be careful with common names - killall java might kill more than intended. Root can kill any process; users can only kill their own.

# HISTORY

**killall** originated in BSD Unix. The Linux version is part of the **psmisc** package, maintained separately and with different features than the BSD version. The command has been a standard Unix utility for decades, though the implementation differences between systems require attention for portable scripts.

# SEE ALSO

[kill](/man/kill)(1), [pkill](/man/pkill)(1), [pgrep](/man/pgrep)(1), [ps](/man/ps)(1), [signal](/man/signal)(7)
