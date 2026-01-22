# TLDR

**Connect to process**

```manhole [pid]```

**Connect to Unix socket**

```manhole [/var/run/manhole.sock]```

**Connect with timeout**

```manhole -t [30] [pid]```

**Verbose connection**

```manhole -v [pid]```

# SYNOPSIS

**manhole** [_options_] _target_

# PARAMETERS

_TARGET_
> Process ID or socket path.

**-t** _SECONDS_
> Connection timeout.

**-v**
> Verbose output.

**--help**
> Display help information.

# DESCRIPTION

**manhole** provides remote debugging access to Python processes. It opens an interactive Python shell.

The tool connects to processes running the manhole library. Useful for debugging live applications.

manhole debugs Python processes.

# CAVEATS

Target must use manhole library. Security considerations for production. Python-specific.

# HISTORY

manhole was created to provide runtime debugging access to **Python** applications without restart.

# SEE ALSO

[gdb](/man/gdb)(1), [strace](/man/strace)(1), [python](/man/python)(1)

