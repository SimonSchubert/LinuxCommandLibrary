# TLDR

**Exit login shell**

```logout```

# SYNOPSIS

**logout** [_status_]

# PARAMETERS

_STATUS_
> Exit status code (optional).

# DESCRIPTION

**logout** exits a login shell. It terminates the current shell session and returns to the login prompt.

The command is a shell builtin. It only works in login shells, not subshells.

logout exits the login shell.

# CAVEATS

Only works in login shells. Use exit for non-login shells. Shell builtin command.

# HISTORY

logout is a **shell builtin** command available in bash and other shells for terminating login sessions.

# SEE ALSO

[exit](/man/exit)(1), [login](/man/login)(1), [bash](/man/bash)(1)

