# TAGLINE

remote debugging stub for GDB

# TLDR

**Start debug server**

```gdbserver :[port] [program]```

**Attach to process**

```gdbserver --attach :[port] [pid]```

**Multi-process mode**

```gdbserver --multi :[port]```

**Debug with arguments**

```gdbserver :[port] [program] [arg1] [arg2]```

# SYNOPSIS

**gdbserver** _comm_ [_program_] [_args_...]

# PARAMETERS

_COMM_
> Connection: :port or host:port.

_PROGRAM_
> Program to debug.

**--attach** _PID_
> Attach to running process.

**--multi**
> Multi-process mode.

**--once**
> Exit after client disconnects.

**--debug**
> Enable debug output.

**--help**
> Display help information.

# DESCRIPTION

**gdbserver** is a lightweight remote debugging stub that runs on the target system, allowing a full GDB debugger running on a different machine to control and debug programs remotely. This architecture is essential for embedded development, cross-compilation workflows, and debugging on resource-constrained devices.

The server component runs on the target system (embedded device, remote server, or different architecture), while the full GDB client runs on the developer's workstation. Communication occurs over TCP/IP or serial connections, with gdbserver translating GDB's debugging protocol into system-level debugging operations.

This split architecture minimizes the footprint on the target system, as gdbserver is much smaller than full GDB and requires fewer dependencies. It's particularly valuable for embedded Linux systems, IoT devices, and scenarios where the target lacks sufficient resources for a complete debugging environment.

Typical workflows involve starting gdbserver on the target with the program to debug, then connecting from a GDB client using commands like "target remote host:port". The full power of GDB is available remotely, including breakpoints, single-stepping, memory inspection, and core file generation.

# CAVEATS

Requires network access to target. Security of debug connection. Target needs gdbserver installed.

# HISTORY

gdbserver is part of **GDB** (GNU Debugger), enabling remote debugging scenarios since GDB 4.x. It's essential for embedded development and cross-platform debugging.

# SEE ALSO

[gdb](/man/gdb)(1), [gdbinit](/man/gdbinit)(5)
