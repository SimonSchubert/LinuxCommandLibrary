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

**fkill** is a cross-platform process killer with an interactive interface. Can kill processes by name, PID, or port number. Provides fuzzy search in interactive mode.

# SEE ALSO

[kill](/man/kill)(1), [pkill](/man/pkill)(1)

