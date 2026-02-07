# TAGLINE

interactive cross-platform process killer

# TLDR

**Interactive process killer**

```fkill```

**Kill by name**

```fkill [process_name]```

**Kill by port**

```fkill :[port]```

**Kill by PID**

```fkill [pid]```

**Force kill**

```fkill -f [process_name]```

**Kill silently**

```fkill -s [process_name]```

# SYNOPSIS

**fkill** [_options_] [_target_...]

# PARAMETERS

**-f**, **--force**
> Force kill (SIGKILL instead of SIGTERM).

**-s**, **--silent**
> Silent mode.

**-v**, **--verbose**
> Verbose output.

# DESCRIPTION

**fkill** is a cross-platform process killer with an interactive interface. It provides fuzzy search for selecting processes to terminate, supporting multiple selection methods.

The tool can kill processes by name, PID, or port number. In interactive mode, it displays a searchable list of running processes with resource usage information, allowing users to select targets with arrow keys and fuzzy matching.

Written in Node.js, fkill works consistently across Linux, macOS, and Windows platforms.

# SEE ALSO

[kill](/man/kill)(1), [pkill](/man/pkill)(1)

