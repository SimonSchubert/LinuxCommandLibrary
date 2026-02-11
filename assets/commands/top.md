# TAGLINE

Real-time system process monitor

# TLDR

Start **top**

```top```

Do not show any **idle or zombie** processes

```top -i```

Show only processes owned by a **specific user**

```top -u username```

**Sort** processes by a field

```top -o %MEM```

Show individual **threads** of a process

```top -Hp process_id```

Monitor **specific PIDs**

```top -p 1234,5678```

Run in **batch mode** for scripting

```top -b -n 1```

# SYNOPSIS

**top** [_-b_] [_-d delay_] [_-n iterations_] [_-p pid_] [_-u user_] [_-o field_]

# DESCRIPTION

**top** provides a dynamic real-time view of a running system. It displays system summary information and a list of processes or threads currently being managed by the Linux kernel. The display is updated periodically and can be customized interactively.

# PARAMETERS

**-b, --batch**
> Run in batch mode (non-interactive), useful for piping output

**-c, --cmdline-toggle**
> Toggle between command line and program name display

**-d, --delay=SECS**
> Set the delay between screen updates

**-e, --scale-task-mem**
> Scale task memory values (k/m/g/t/p)

**-E, --scale-summary-mem**
> Scale summary memory values (k/m/g/t/p/e)

**-H, --threads-show**
> Display individual threads instead of processes

**-i, --idle-toggle**
> Hide idle and zombie processes

**-n, --iterations=NUMBER**
> Set maximum number of iterations before exit

**-o, --sort-override=FIELD**
> Override the default sort field

**-p, --pid=PIDLIST**
> Monitor only specified process IDs

**-u, --filter-only-euser=USER**
> Show only processes for specified effective user

**-U, --filter-any-user=USER**
> Show processes for specified user (real, effective, saved, filesystem)

# INTERACTIVE COMMANDS

**h or ?**: Display help screen
**q**: Quit top
**d or s**: Change delay between updates
**k**: Kill a process
**r**: Renice a process
**f**: Manage displayed fields
**o**: Add filter expression
**c**: Toggle command line/program name
**V**: Toggle forest view mode
**1**: Toggle single/separate CPU states
**m**: Cycle memory display modes
**t**: Cycle CPU states display modes
**R**: Reverse sort order
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

The configuration file is saved to ~/.config/procps/toprc. Running in batch mode (-b) is recommended for scripting as it disables interactive features and produces parseable output.

# HISTORY

**top** was originally written by Roger Binns and has been part of the **procps** (now **procps-ng**) package. It has been a standard system monitoring tool on Unix-like systems since the 1980s.

# SEE ALSO

[htop](/man/htop)(1), [atop](/man/atop)(1), [ps](/man/ps)(1), [free](/man/free)(1), [uptime](/man/uptime)(1)
