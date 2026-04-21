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

**Kill silently** (always exit 0)

```fkill -s [process_name]```

**Kill multiple targets** (name, PID, and port)

```fkill [process_name] [pid] :[port]```

**Force kill after timeout** if SIGTERM fails

```fkill -t [5] [process_name]```

# SYNOPSIS

**fkill** [_options_] [_target_...]

# PARAMETERS

**-f**, **--force**
> Force kill (SIGKILL instead of SIGTERM).

**-s**, **--silent**
> Silently kill and always exit with code 0.

**-v**, **--verbose**
> Show process arguments alongside names in the interactive list.

**-t** _N_, **--force-timeout** _N_
> Force kill processes that didn't exit after _N_ seconds.

**--smart-case**
> Case-insensitive matching unless the pattern contains uppercase letters.

**--case-sensitive**
> Force case-sensitive matching of process names.

# DESCRIPTION

**fkill** is a cross-platform process killer with an interactive interface. It provides fuzzy search for selecting processes to terminate, supporting multiple selection methods.

The tool can kill processes by name, PID, or port number (prefix the port with **:**, e.g. `:8080`). Multiple targets can be passed at once. In interactive mode, it displays a searchable list of running processes with CPU and memory usage, allowing users to select targets with arrow keys and fuzzy matching.

Written in Node.js and distributed via npm (`npm install --global fkill-cli`), fkill works consistently across Linux, macOS, and Windows.

# CAVEATS

Requires Node.js. On Unix, killing system processes usually requires **sudo**. Matching is fuzzy, so double-check the selected process before confirming — especially in interactive mode where the top match is chosen by default.

# SEE ALSO

[kill](/man/kill)(1), [pkill](/man/pkill)(1)

