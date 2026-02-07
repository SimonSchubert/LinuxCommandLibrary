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

The tool uses Linux kernel tracing facilities (ftrace or similar) to capture exec calls with minimal overhead compared to attaching a debugger to each process.

# PARAMETERS

**-d**
> Print working directory

**-l**
> Resolve full executable path

**-u**
> Display user running process

**-e**
> Print environment variables

**-p** _pid_
> Trace only specific PID tree

# CAVEATS

Requires root privileges. Uses kernel tracing facilities. May impact system performance when tracing heavily.

# SEE ALSO

[strace](/man/strace)(1), [ltrace](/man/ltrace)(1), [auditd](/man/auditd)(8)
