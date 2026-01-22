# TLDR

**Run a command with a time limit** (30 seconds)

```timeout 30s [command]```

**Run with time limit** in minutes

```timeout 5m [command]```

**Send specific signal** when timeout occurs

```timeout --signal=SIGKILL 10s [command]```

**Kill after additional time** if command doesn't terminate

```timeout --kill-after=10s 30s [command]```

**Preserve exit status** of timed-out command

```timeout --preserve-status 5s [command]```

**Run with timeout** in foreground (for interactive commands)

```timeout --foreground 30s [command]```

# SYNOPSIS

**timeout** [_options_] _duration_ _command_ [_args_...]

# PARAMETERS

**-k** _duration_, **--kill-after**=_duration_
> Send SIGKILL after additional duration if command still running

**-s** _signal_, **--signal**=_signal_
> Signal to send on timeout (default: SIGTERM)

**--preserve-status**
> Return command's exit status even on timeout

**--foreground**
> Don't create new process group (for terminal interaction)

**-v**, **--verbose**
> Diagnose signal sent to stderr

# DURATION FORMAT

**s**: Seconds (default)
**m**: Minutes
**h**: Hours
**d**: Days

Numbers can be floating-point: **1.5m** = 90 seconds

# DESCRIPTION

**timeout** runs a command with a specified time limit. If the command doesn't complete within the duration, timeout sends a signal (SIGTERM by default) to terminate it.

The default signal (SIGTERM) allows processes to clean up before exiting. For processes that ignore SIGTERM, use **--kill-after** to send SIGKILL after an additional grace period.

Exit status is 124 if the command times out, 137 if killed by SIGKILL, or the command's own exit status if it completes within the limit. Use **--preserve-status** to return the signal number + 128 on timeout.

# CAVEATS

Timeout creates a new process group by default, which can interfere with interactive commands or terminal I/O. Use **--foreground** for such cases.

Commands that spawn child processes may leave orphaned children. Timeout only signals the direct child, not grandchildren.

Very short timeouts (sub-second) may not be reliable due to scheduling overhead.

# SEE ALSO

[time](/man/time)(1), [watch](/man/watch)(1), [kill](/man/kill)(1), [sleep](/man/sleep)(1)
