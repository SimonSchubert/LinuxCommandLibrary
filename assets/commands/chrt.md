# TAGLINE

Manipulate real-time scheduling attributes of processes

# TLDR

Display **scheduling attributes** of a process

```chrt -p PID```

Display attributes of **all threads** of a process

```chrt -a -p PID```

Show **min/max** priority values

```chrt -m```

Set **scheduling priority** of a process

```chrt -p priority PID```

Set **FIFO** scheduling policy

```chrt --fifo -p priority PID```

Set **round-robin** scheduling policy

```chrt --rr -p priority PID```

Run command with **idle** scheduling

```chrt --idle 0 command```

# SYNOPSIS

**chrt** [_options_] _priority_ _command_ [_argument_...]

**chrt** [_options_] **-p** [_priority_] _PID_

# DESCRIPTION

**chrt** sets or retrieves the real-time scheduling attributes of an existing process, or runs a command with specified scheduling attributes. It supports various Linux scheduling policies including FIFO, round-robin, batch, idle, and deadline.

Real-time scheduling policies (SCHED_FIFO, SCHED_RR) give processes priority over normal tasks, which is critical for time-sensitive applications like audio processing, industrial control, and high-frequency trading. Non-real-time policies (SCHED_BATCH, SCHED_IDLE) are useful for background workloads that should yield to interactive processes.

The tool is part of the **util-linux** package and operates via the **sched_setscheduler**(2) and **sched_setattr**(2) system calls.

# PARAMETERS

**-p, --pid**
> Operate on an existing PID without launching a new task

**-a, --all-tasks**
> Set or retrieve scheduling attributes for all threads of a PID

**-m, --max**
> Show minimum and maximum valid priorities for each policy

**-v, --verbose**
> Show status information

**-R, --reset-on-fork**
> Children do not inherit privileged scheduling policies

**-o, --other**
> Set SCHED_OTHER policy (default Linux time-sharing)

**-f, --fifo**
> Set SCHED_FIFO policy (first in-first out)

**-r, --rr**
> Set SCHED_RR policy (round-robin, default when no policy given)

**-b, --batch**
> Set SCHED_BATCH policy for batch processing (priority must be 0)

**-i, --idle**
> Set SCHED_IDLE policy for very low priority tasks (priority must be 0)

**-d, --deadline**
> Set SCHED_DEADLINE policy for sporadic deadline scheduling (priority must be 0)

# CAVEATS

Users require CAP_SYS_NICE capability to modify scheduling attributes. SCHED_BATCH, SCHED_IDLE, and SCHED_DEADLINE policies require priority 0. Only SCHED_FIFO, SCHED_OTHER, and SCHED_RR are part of POSIX 1003.1b.

# HISTORY

**chrt** is part of the **util-linux** package, providing real-time process scheduling control since Linux 2.6.

# SEE ALSO

[nice](/man/nice)(1), [renice](/man/renice)(1), [taskset](/man/taskset)(1), [sched](/man/sched)(7)
