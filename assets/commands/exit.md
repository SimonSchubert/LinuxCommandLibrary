# TAGLINE

shell builtin that terminates the current shell or script

# TLDR

**Exit shell with** success status

```exit```

**Exit with specific** status code

```exit [1]```

**Exit on error** in scripts

```set -e; exit```

# SYNOPSIS

**exit** [_status_]

# PARAMETERS

_STATUS_
> Exit status code (0-255). 0 indicates success.

# DESCRIPTION

**exit** is a shell builtin that terminates the current shell or script. An optional exit status is passed to the parent process; 0 conventionally indicates success.

In scripts, exit immediately stops execution. In interactive shells, it closes the session. The exit status is available to the parent process via $? in shell scripts.

Exit codes have conventional meanings: 0 for success, 1 for general errors, 2 for misuse, 126-127 for execution issues.

# CAVEATS

Non-zero exits may trigger set -e termination. Status limited to 0-255. Subshells have separate exit. Traps may run before actual exit.

# HISTORY

exit is a fundamental POSIX shell builtin, present since the original Bourne shell. Its semantics are consistent across all Unix shells.

# SEE ALSO

[return](/man/return)(1), [bash](/man/bash)(1), [trap](/man/trap)(1)
