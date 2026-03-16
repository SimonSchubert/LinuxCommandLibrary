# TAGLINE

Real-time system process monitor

# TLDR

Start **top**

```top```

Do not show any **idle or zombie** processes

```top -i```

Show only processes owned by a **specific user**

```top -u [username]```

**Sort** processes by a field

```top -o %MEM```

Show individual **threads** of a process

```top -Hp [process_id]```

Monitor **specific PIDs**

```top -p [1234],[5678]```

Run in **batch mode** for scripting (single snapshot)

```top -b -n 1```

Set **update interval** to 5 seconds

```top -d 5```

Show **full command lines** instead of program names

```top -c```

# SYNOPSIS

**top** [_-b_] [_-c_] [_-d delay_] [_-H_] [_-i_] [_-n iterations_] [_-o field_] [_-p pid_] [_-S_] [_-u user_] [_-w width_]

# DESCRIPTION

**top** provides a dynamic real-time view of a running system. It displays system summary information and a list of processes or threads currently being managed by the Linux kernel. The display is updated periodically and can be customized interactively.

# PARAMETERS

**-b**, **--batch**
> Run in batch mode (non-interactive), useful for piping output.

**-c**, **--cmdline-toggle**
> Toggle between command line and program name display.

**-d** _SECS_, **--delay=SECS**
> Set the delay between screen updates (default: 3.0 seconds).

**-e**, **--scale-task-mem**
> Scale task memory values (k/m/g/t/p).

**-E**, **--scale-summary-mem**
> Scale summary memory values (k/m/g/t/p/e).

**-H**, **--threads-show**
> Display individual threads instead of processes.

**-i**, **--idle-toggle**
> Hide idle and zombie processes.

**-n** _NUMBER_, **--iterations=NUMBER**
> Set maximum number of iterations before exit.

**-o** _FIELD_, **--sort-override=FIELD**
> Override the default sort field. Prefix with + or - for ascending/descending.

**-p** _PIDLIST_, **--pid=PIDLIST**
> Monitor only specified process IDs (comma-separated).

**-S**, **--accum-time-toggle**
> Toggle cumulative time mode, showing CPU time used by each process and its dead children.

**-s**, **--secure-mode**
> Start top in secure mode, disabling potentially dangerous interactive commands.

**-u** _USER_, **--filter-only-euser=USER**
> Show only processes for specified effective user.

**-U** _USER_, **--filter-any-user=USER**
> Show processes for specified user (real, effective, saved, filesystem).

**-w** _WIDTH_, **--width=WIDTH**
> Override screen width in batch mode (minimum 80 characters).

# INTERACTIVE COMMANDS

**h or ?**: Display help screen
**q**: Quit top
**d or s**: Change delay between updates
**k**: Kill a process (prompts for PID and signal)
**r**: Renice a process (prompts for PID and nice value)
**f**: Manage displayed fields
**o**: Add filter expression
**c**: Toggle command line/program name
**V**: Toggle forest view mode
**1**: Toggle single/separate CPU states
**m**: Cycle memory display modes
**t**: Cycle CPU states display modes
**R**: Reverse sort order
**P**: Sort by CPU usage
**M**: Sort by memory usage
**T**: Sort by cumulative time
**< or >**: Move sort column left/right
**W**: Write configuration file

# PROCESS STATUS CODES

**D**: Uninterruptible sleep
**I**: Idle kernel thread
**R**: Running
**S**: Sleeping (interruptible)
**T**: Stopped by job control signal
**t**: Stopped by debugger
**Z**: Zombie

# CAVEATS

The configuration file is saved to ~/.config/procps/toprc. Running in batch mode (-b) is recommended for scripting as it disables interactive features and produces parseable output. The default delay between updates is 3.0 seconds.

# HISTORY

**top** was originally written by Roger Binns and has been part of the **procps** (now **procps-ng**) package. It has been a standard system monitoring tool on Unix-like systems since the 1980s.

# SEE ALSO

[htop](/man/htop)(1), [atop](/man/atop)(1), [ps](/man/ps)(1), [free](/man/free)(1), [uptime](/man/uptime)(1), [vmstat](/man/vmstat)(1), [kill](/man/kill)(1)
