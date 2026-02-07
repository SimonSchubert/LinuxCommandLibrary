# TAGLINE

interactive debugger for compiled programs

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

# CONFIGURATION

**~/.gdbinit**
> User-specific GDB initialization commands executed on startup.

**/etc/gdb/gdbinit**
> System-wide initialization file for all users.

**.gdbinit**
> Project-local initialization file for directory-specific commands.

# DESCRIPTION

**gdb** (GNU Debugger) is the standard debugger for C, C++, and other compiled languages on Unix-like systems. It provides comprehensive facilities for inspecting program state, setting breakpoints, stepping through code, examining variables, and analyzing memory contents during execution.

The debugger operates by controlling program execution, allowing developers to pause at specific points, examine the call stack, modify variable values, and trace execution flow. It can debug running processes by attaching to them, analyze core dumps from crashed programs, and even perform remote debugging across network connections via gdbserver.

gdb supports scripting through its command language and Python integration, enabling automated debugging sessions and custom commands. The Text User Interface (TUI) mode provides a split-screen view of source code, assembly, registers, and command prompt. Debugging symbols (compiled with -g flag) are essential for meaningful source-level debugging, though gdb can still work with stripped binaries at the assembly level.

Common workflows include setting breakpoints at functions or line numbers, examining variables with print and display commands, stepping through code with next/step/continue, and analyzing crashes through backtrace. The tool is indispensable for diagnosing segmentation faults, memory corruption, race conditions, and complex logic errors in native applications.

# CAVEATS

Requires debug symbols (-g). Optimized code may behave unexpectedly. Learning curve for commands.

# HISTORY

gdb was written by **Richard Stallman** in 1986 as part of the GNU Project. It became the standard Unix debugger, supporting numerous architectures and languages.

# SEE ALSO

[gcore](/man/gcore)(1), [gdbserver](/man/gdbserver)(1), [lldb](/man/lldb)(1)
