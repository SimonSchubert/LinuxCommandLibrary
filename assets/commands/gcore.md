# TAGLINE

generates process core dumps

# TLDR

**Generate core dump**

```gcore [pid]```

**Specify output file**

```gcore -o [corefile] [pid]```

**Generate for all** threads

```gcore -a [pid]```

# SYNOPSIS

**gcore** [_options_] _pid_

# PARAMETERS

_PID_
> Process ID to dump.

**-o** _FILE_
> Output filename prefix.

**-a**
> Dump all threads.

**--help**
> Display help information.

# DESCRIPTION

**gcore** generates a core dump of a running process without terminating it. It captures the process memory state for debugging or analysis while the process continues running.

The tool attaches to the target process temporarily to create the dump. The resulting core file can be analyzed with debuggers like GDB to examine program state.

gcore is useful for debugging production systems without causing downtime.

# CAVEATS

Requires ptrace permissions. Large processes create large dumps. May briefly pause target process.

# HISTORY

gcore is part of **GDB** (GNU Debugger), providing non-destructive core dump generation for debugging running processes without interrupting service.

# SEE ALSO

[gdb](/man/gdb)(1), [kill](/man/kill)(1), [core](/man/core)(5)
