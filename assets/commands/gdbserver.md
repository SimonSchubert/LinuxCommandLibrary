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

**gdbserver** is a remote debugging stub that runs on the target system. It allows GDB to debug programs on a different machine or embedded systems.

The server listens for connections from GDB, relaying debug commands and program state. It enables debugging systems with limited resources or cross-compilation targets.

gdbserver provides lightweight remote debugging infrastructure.

# CAVEATS

Requires network access to target. Security of debug connection. Target needs gdbserver installed.

# HISTORY

gdbserver is part of **GDB** (GNU Debugger), enabling remote debugging scenarios since GDB 4.x. It's essential for embedded development and cross-platform debugging.

# SEE ALSO

[gdb](/man/gdb)(1), [gdbinit](/man/gdbinit)(5)
