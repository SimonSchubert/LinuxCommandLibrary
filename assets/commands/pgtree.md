# TAGLINE

Unix process hierarchy tree for specific processes

# TLDR

**Show parents and children** of matching processes

```pgtree [process_name]```

Show matching processes and **their children only**

```pgtree -c [process_name]```

Show the tree for **specific PIDs**

```pgtree -p [pid1,pid2]```

Show everything below **PID 1**

```pgtree -1```

**Watch** the tree, updating every 2 seconds

```pgtree -W [process_name]```

**Kill** a user's matching processes and their children

```pgtree -k -u [user] -x [process_name]```

**Force kill** without asking for confirmation

```pgtree -K -y [process_name]```

Show **custom ps fields**

```pgtree -O [%cpu,stime] [process_name]```

# SYNOPSIS

**pgtree** [**-W**] [**-RIya**] [**-C** _when_] [**-O** _psfield_] [**-c**|**-k**|**-K**] [**-1**|**-p** _pids_|_pgrep_args_]

# PARAMETERS

**-c**
> Display matching processes and their children only.

**-k**
> Send SIGTERM to the processes and their children.

**-K**
> Send SIGKILL to the processes and their children.

**-y**
> Do not ask for confirmation to kill.

**-p** _PIDS_
> Comma-separated process IDs to display the hierarchy for.

**-1**
> Display the children of PID 1, not including PID 0.

**-W**
> Watch and follow the process tree every 2 seconds.

**-T**
> Display threads, where ps supports it.

**-O** _FIELDS_
> Comma-separated ps fields to display instead of stime.

**-C** _WHEN_
> Color preference: y/yes/always or n/no/never. Default: auto.

**-w** _WRAP_
> TTY text wrapping: y/yes or n/no. Default: y.

**-a**
> Use ASCII characters.

**-I**
> Use uid instead of user in the ps command.

**-R**
> Force use of the internal pgrep.

_pgrep_args_
> Remaining arguments select processes through pgrep: **-f**, **-x**, **-v**, **-i**, **-n**, **-o**, **-u**, **-U**, **-g**, **-G**, **-P**, **-s**, **-t**, **-F**, **--ns** and **--nslist**.

# DESCRIPTION

**pgtree** is a Unix process hierarchy tree display that combines pgrep and pstree functionality. It finds processes matching a pattern and displays their full process tree (parents and children), and can send kill signals to matched processes and all their children. Found PIDs are marked with a triangle. It works out of the box on any Unix system using the default OS Python installation.

Default options can be set in the **PGTREE** environment variable.

# CAVEATS

**-T** only works if **ps ax -T** and **pgrep -w** are available on the system. **-s** is passed to pgrep as a session filter, it does not send a signal.

# HISTORY

**pgtree** was created by **joknarf** and is written in **Python**, compatible with both Python 2 and 3.

# SEE ALSO

[pstree](/man/pstree)(1), [pgrep](/man/pgrep)(1), [ps](/man/ps)(1), [kill](/man/kill)(1)

# RESOURCES

```[Source code](https://github.com/joknarf/pgtree)```

<!-- verified: 2026-11-09 -->
