# TLDR

**Debug program**

```gdb [program]```

**Debug with core** file

```gdb [program] [core]```

**Attach to process**

```gdb -p [pid]```

**Run with arguments**

```gdb --args [program] [arg1] [arg2]```

**Execute commands**

```gdb -x [commands.gdb] [program]```

# SYNOPSIS

**gdb** [_options_] [_program_] [_core_|_pid_]

# PARAMETERS

_PROGRAM_
> Executable to debug.

_CORE_
> Core dump file.

**-p** _PID_
> Attach to running process.

**--args**
> Pass arguments to program.

**-x** _FILE_
> Execute GDB commands from file.

**-q**, **--quiet**
> Suppress startup messages.

**--tui**
> Enable text user interface.

**--help**
> Display help information.

# DESCRIPTION

**gdb** (GNU Debugger) is the standard debugger for C, C++, and other compiled languages. It provides inspection of program state, breakpoints, stepping, and memory examination.

The debugger controls program execution, allowing pausing at specific points, examining variables, and tracing execution flow. It supports remote debugging and core dump analysis.

gdb is essential for diagnosing crashes, memory issues, and logic errors in native applications.

# CAVEATS

Requires debug symbols (-g). Optimized code may behave unexpectedly. Learning curve for commands.

# HISTORY

gdb was written by **Richard Stallman** in 1986 as part of the GNU Project. It became the standard Unix debugger, supporting numerous architectures and languages.

# SEE ALSO

[gcore](/man/gcore)(1), [gdbserver](/man/gdbserver)(1), [lldb](/man/lldb)(1)
