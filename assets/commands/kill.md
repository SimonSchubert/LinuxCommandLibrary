# TAGLINE

sends a signal to a process, usually to stop it

# TLDR

**Terminate** a program using the default SIGTERM signal

```kill [process_id]```

**List** available signal names

```kill -l```

Terminate a **background job**

```kill %[job_id]```

Send **SIGHUP** signal (reload for many daemons)

```kill -HUP [process_id]```

Send **SIGINT** signal (like Ctrl+C)

```kill -INT [process_id]```

**Force kill** a program (SIGKILL)

```kill -9 [process_id]```

**Pause** a program (SIGSTOP)

```kill -STOP [process_id]```

Send signal to all processes with a **group ID**

```kill -SIGUSR1 -[group_id]```

# SYNOPSIS

**kill** [_-signal_] _pid_...

**kill** _-l_

# DESCRIPTION

**kill** sends a signal to a process, usually to stop it. All signals except SIGKILL and SIGSTOP can be intercepted by the process to perform a clean exit. By default, SIGTERM is sent.

# PARAMETERS

**-l, -L, --table**
> List signal names and numbers

**-s signal**
> Specify signal to send

**-signal**
> Specify signal by name or number (e.g., -9, -KILL, -SIGKILL)

**pid**
> Process ID to signal

**%job_id**
> Job ID from shell job control

# COMMON SIGNALS

**SIGTERM (15)**: Request termination (default)
**SIGKILL (9)**: Force immediate termination (cannot be caught)
**SIGHUP (1)**: Hang up; often used to reload configuration
**SIGINT (2)**: Interrupt (Ctrl+C)
**SIGSTOP (19)**: Pause process (cannot be caught)
**SIGCONT (18)**: Continue paused process

# CAVEATS

SIGKILL (-9) should be used as a last resort as it doesn't allow the process to clean up. Use SIGTERM first and give the process time to exit gracefully.

# HISTORY

Part of standard Unix since early versions. The **kill** command has been available since **Version 4 AT&T UNIX** (1973).

# SEE ALSO

[killall](/man/killall)(1), [pkill](/man/pkill)(1), [ps](/man/ps)(1), [signal](/man/signal)(7)
