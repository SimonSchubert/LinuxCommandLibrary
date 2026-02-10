# TAGLINE

intercepts and records dynamic library calls made by a process and signals

# TLDR

**Trace** library calls

```ltrace [path/to/program]```

**Count** library calls with summary

```ltrace -c [path/to/program]```

Trace **specific functions**

```ltrace -e malloc+free-@libc.so* [path/to/program]```

Write trace to **file**

```ltrace -o [file] [path/to/program]```

# SYNOPSIS

**ltrace** [_options_] [_command_ [_args_]]

# DESCRIPTION

**ltrace** intercepts and records dynamic library calls made by a process and signals received. It is useful for debugging and understanding how programs interact with shared libraries.

# PARAMETERS

**-c**
> Count library calls and print summary

**-e EXPR**
> Filter specific library calls

**-o, --output FILE**
> Write output to file

**-p PID**
> Attach to running process

**-f**
> Follow child processes

**-t**
> Print timestamps

**-T**
> Show time spent in calls

**-S**
> Also trace system calls

# CAVEATS

May significantly slow down traced programs. Not all library calls may be intercepted on all architectures. Requires debug symbols for detailed output.

# SEE ALSO

[strace](/man/strace)(1), [ldd](/man/ldd)(1), [gdb](/man/gdb)(1)
