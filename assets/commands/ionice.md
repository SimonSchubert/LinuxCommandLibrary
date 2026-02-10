# TAGLINE

gets or sets the I/O scheduling class and priority for a process

# TLDR

Run command with specific I/O **class and priority**

```ionice -c [1|2|3] -n [0-7] [command]```

Set I/O class of a running process by **PID**

```ionice -c [class] -p [pid]```

**Print** I/O scheduling class and priority of a process

```ionice -p [pid]```

Run with **idle** priority (only uses I/O when no other process needs it)

```ionice -c 3 [command]```

**Ignore** failure to set priority

```ionice -t -n [priority] -p [pid]```

# SYNOPSIS

**ionice** [_options_] [_command_]

# PARAMETERS

**-c**, **--class** _CLASS_
> Scheduling class: 1 (realtime), 2 (best-effort), 3 (idle)

**-n**, **--classdata** _LEVEL_
> Priority level within class: 0 (highest) to 7 (lowest)

**-p**, **--pid** _PID_
> Apply to process with given PID

**-P**, **--pgid** _PGID_
> Apply to process group

**-u**, **--uid** _UID_
> Apply to all processes owned by user

**-t**, **--ignore**
> Ignore failures to set priority

# DESCRIPTION

**ionice** gets or sets the I/O scheduling class and priority for a process. This controls how disk I/O requests are scheduled relative to other processes.

**Scheduling classes:**
- **Realtime (1)** - Highest priority, guaranteed I/O access (requires root)
- **Best-effort (2)** - Default class, shares I/O fairly based on priority
- **Idle (3)** - Only gets I/O time when no other process needs it

# CAVEATS

Only works with the CFQ (Completely Fair Queuing) I/O scheduler. Realtime class requires root privileges. BFQ and mq-deadline schedulers have different priority semantics.

# HISTORY

ionice was introduced as part of util-linux to provide user control over the CFQ I/O scheduler's prioritization features, which were added to the Linux kernel in version 2.6.13 (**2005**).

# SEE ALSO

[nice](/man/nice)(1), [renice](/man/renice)(1), [schedtool](/man/schedtool)(8)
