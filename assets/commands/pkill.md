# TLDR

**Kill all processes** matching a name

```pkill [process_name]```

**Kill processes with exact name match**

```pkill -x [exact_name]```

**Kill processes owned by a specific user**

```pkill -u [username] [process_name]```

**Send a specific signal** to processes

```pkill -[SIGTERM] [process_name]```

**Kill processes matching a pattern** (case-insensitive)

```pkill -i [pattern]```

**Kill the most recently started** matching process

```pkill -n [process_name]```

**Kill the oldest** matching process

```pkill -o [process_name]```

# SYNOPSIS

**pkill** [_-signal_] [_-fvx_] [_-n|-o_] [_-P ppid,..._] [_-g pgrp,..._] [_-s sid,..._] [_-u euid,..._] [_-U uid,..._] [_-G gid,..._] [_-t term,..._] [_pattern_]

# PARAMETERS

**-** _signal_, **--signal** _signal_
> Signal to send (default: SIGTERM). Can be name or number

**-f**, **--full**
> Match against the full command line, not just process name

**-x**, **--exact**
> Require exact match of the process name

**-n**, **--newest**
> Select only the most recently started matching process

**-o**, **--oldest**
> Select only the oldest matching process

**-P** _ppid_, **--parent** _ppid_
> Match only processes whose parent is specified

**-u** _euid_, **--euid** _euid_
> Match only processes with specified effective user ID

**-U** _uid_, **--uid** _uid_
> Match only processes with specified real user ID

**-g** _pgrp_, **--pgroup** _pgrp_
> Match only processes in specified process group

**-G** _gid_, **--group** _gid_
> Match only processes with specified real group ID

**-t** _term_, **--terminal** _term_
> Match only processes on specified terminal

**-i**, **--ignore-case**
> Case-insensitive pattern matching

**-v**, **--inverse**
> Invert matching (exclude matched processes)

# DESCRIPTION

**pkill** sends signals to processes based on their names and other attributes. Unlike **kill** which requires process IDs, pkill uses pattern matching to identify target processes, making it more convenient for common process management tasks.

By default, pkill sends SIGTERM (signal 15) to terminate processes gracefully. The pattern is matched against the process name (the executable name), but with **-f** it matches against the full command line including arguments.

The command is particularly useful in scripts and for quickly terminating processes without first looking up their PIDs using **ps** or **pgrep**. Multiple selection criteria can be combined to precisely target specific processes.

# CAVEATS

Pattern matching can accidentally kill unintended processes. Use **pgrep** with the same pattern first to verify which processes will be affected. The **-f** option may match the pkill command itself if not careful. Processes in uninterruptible sleep (D state) cannot be killed even with SIGKILL. Regular users can only kill their own processes.

# HISTORY

**pkill** was introduced in **Solaris 7** in **1998** as part of a set of process utilities alongside **pgrep**. It was subsequently ported to other Unix-like systems, with the Linux implementation provided by the **procps** (or **procps-ng**) package. The command has become a standard tool on modern Unix-like systems, valued for its convenience over the traditional **ps | grep | kill** pipeline approach.

# SEE ALSO

[pgrep](/man/pgrep)(1), [kill](/man/kill)(1), [killall](/man/killall)(1), [ps](/man/ps)(1), [top](/man/top)(1)
