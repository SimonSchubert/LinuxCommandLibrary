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

**extrace** traces exec() system calls to monitor program execution on Linux. It shows what programs are being started, by whom, and with what arguments.

Useful for security auditing, debugging, and understanding system behavior.

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
