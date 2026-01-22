# TLDR

**Debug an executable**

```dlv exec [./binary]```

**Debug with arguments**

```dlv exec [./binary] -- [arg1] [arg2]```

**Debug a Go package**

```dlv debug [package]```

**Attach to process**

```dlv attach [pid]```

**Debug a test**

```dlv test [package]```

**Start headless server**

```dlv debug --headless --listen=:[2345]```

**Connect to remote**

```dlv connect [localhost:2345]```

# SYNOPSIS

**dlv** _command_ [_options_] [_args_]

# PARAMETERS

_COMMAND_
> Operation: debug, exec, test, attach, connect, etc.

**debug** [_PACKAGE_]
> Build and debug Go package.

**exec** _BINARY_
> Debug prebuilt binary.

**test** [_PACKAGE_]
> Debug tests.

**attach** _PID_
> Attach to running process.

**connect** _ADDR_
> Connect to headless server.

**--headless**
> Run in headless mode.

**--listen** _ADDR_
> Listen address for headless mode.

**--help**
> Display help information.

# DESCRIPTION

**dlv** (Delve) is a debugger for the Go programming language. It provides source-level debugging with support for goroutines, breakpoints, variable inspection, and expression evaluation.

Delve understands Go's runtime, correctly handling goroutine scheduling, garbage collection, and other Go-specific features. It supports both local debugging and remote debugging through its headless mode.

The debugger integrates with editors and IDEs via the Debug Adapter Protocol (DAP), enabling graphical debugging in VS Code, GoLand, and other editors.

# CAVEATS

Requires Go binaries with debug info (default). Some optimizations may affect debugging. Attaching to processes needs appropriate permissions. Core dumps require compatible Go version.

# HISTORY

Delve was created by **Derek Parker** and released in **2014**. It was developed to provide Go developers with a debugger that understands Go's concurrency model and runtime, replacing GDB for most Go debugging tasks.

# SEE ALSO

[go](/man/go)(1), [gdb](/man/gdb)(1)
