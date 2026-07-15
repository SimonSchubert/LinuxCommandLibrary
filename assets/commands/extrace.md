# TAGLINE

trace exec() system calls system-wide

# TLDR

Trace **all** program executions on the system

```sudo extrace```

Trace **descendants** of a command only

```sudo extrace [command]```

Print current working **directory** of each process

```sudo extrace -d```

Resolve **full path** of each executable

```sudo extrace -l```

Display **user** running each process

```sudo extrace -u```

# SYNOPSIS

**extrace** [_options_] [_command_]

# DESCRIPTION

**extrace** traces exec() system calls system-wide to monitor program execution on Linux. It captures every time a program is executed, displaying the command line, process hierarchy, and optionally the user, working directory, and environment variables.

Unlike strace which traces individual processes, extrace monitors all execution activity on the system or within a specific process tree. It's particularly useful for security auditing to detect suspicious process execution, debugging complex scripts that spawn multiple subprocesses, and understanding system behavior during package installations or automated tasks.

The tool subscribes to the Linux kernel's netlink process connector (requires **CONFIG_CONNECTOR** and **CONFIG_PROC_EVENTS**) to receive exec notifications, so it captures activity without attaching a debugger to each process.

# PARAMETERS

**-d**
> Print the working directory of each process

**-e**
> Print the process environment (or '-' if unreadable)

**-f**
> Flat output, without tree indentation

**-l**
> Resolve and show the full path of the executable

**-q**
> Quiet; suppress printing of exec() arguments

**-t**
> Print exit status and duration of each process

**-u**
> Display the user running each process

**-o** _file_
> Write trace output to _file_

**-p** _pid_
> Trace only descendants of the given PID

# CAVEATS

Requires root privileges and a kernel built with the process connector enabled. Linux-only. May impact system performance when tracing heavily.

# SEE ALSO

[strace](/man/strace)(1), [ltrace](/man/ltrace)(1), [auditd](/man/auditd)(8)

# RESOURCES

```[Source code](https://github.com/leahneukirchen/extrace)```

<!-- verified: 2026-07-15 -->
