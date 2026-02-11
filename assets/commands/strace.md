# TAGLINE

Trace system calls and signals

# TLDR

**Attach** to a running process

```sudo strace -p 1234```

Trace process with **filtered** system calls

```sudo strace -p 1234 -e read,write```

Show **summary** of calls and errors

```sudo strace -p 1234 -c```

Show **time spent** in each call

```sudo strace -p 1234 -T -s 32```

**Trace** a program from start

```strace ./program```

Trace **file operations** only

```strace -e trace=file ./program```

Trace **network** operations with child processes

```strace -f -e trace=network -o trace.txt ./program```

# SYNOPSIS

**strace** [_-e expr_] [_-o file_] [_-p pid_] [_-f_] [_-c_] [_command_ [_args_]]

# DESCRIPTION

**strace** intercepts and records system calls made by a process and the signals received by it. It is invaluable for debugging, diagnostics, and understanding system behavior without requiring source code access.

# PARAMETERS

**-p, --attach pid**
> Attach to running process with given PID

**-f, --follow-forks**
> Trace child processes created by fork/vfork/clone

**-e trace=set**
> Trace only specified system calls (file, network, process, etc.)

**-e signal=set**
> Trace only specified signals

**-o, --output file**
> Write trace output to file

**-c, --summary-only**
> Display summary statistics at exit

**-C, --summary**
> Display summary along with normal output

**-t, -tt, -ttt**
> Add timestamps (relative, absolute, absolute with usec)

**-T, --syscall-times**
> Show time spent in each system call

**-s, --string-limit size**
> Maximum string size to print (default 32)

**-v, --no-abbrev**
> Display unabbreviated output

**-y, --decode-fds**
> Print file paths associated with file descriptors

**-z, --successful-only**
> Show only successful system calls

**-Z, --failed-only**
> Show only failed system calls

**-u, --user username**
> Run command as specified user

# TRACE EXPRESSIONS

**%file**: File operations (open, stat, chmod, etc.)
**%network**: Network operations (socket, connect, etc.)
**%process**: Process operations (fork, exec, etc.)
**%memory**: Memory mapping operations
**%signal**: Signal-related calls

# CAVEATS

Tracing significantly slows down the traced process. Do not use on production systems without care. Use **-f** to trace forked children or some calls may be missed.

# HISTORY

**strace** was originally written for SunOS by Paul Kranenburg in 1991. It has become an essential debugging tool on Linux systems.

# SEE ALSO

[ltrace](/man/ltrace)(1), [ptrace](/man/ptrace)(2), [perf](/man/perf)(1)
