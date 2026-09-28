# TAGLINE

exits a login shell

# TLDR

**Exit login shell**

```logout```

Exit the login shell with a specific **status code**

```logout [1]```

# SYNOPSIS

**logout** [_status_]

# PARAMETERS

_STATUS_
> Exit status code (optional). Defaults to the status of the last command executed.

# DESCRIPTION

**logout** exits a login shell. It terminates the current shell session and returns to the login prompt.

The command is a shell builtin. It only works in login shells, not subshells or other non-login shells, where bash reports "not login shell" and suggests **exit** instead.

When a bash login shell exits, it runs **~/.bash_logout** if it exists (zsh runs **~/.zlogout**). Pressing **Ctrl+D** on an empty prompt has the same effect unless **ignoreeof** is set.

# CAVEATS

Only works in login shells. Use exit for non-login shells. Shell builtin command.

# HISTORY

logout is a **shell builtin** that originated in the **C shell** (csh) of BSD Unix and was adopted by bash, zsh and tcsh for terminating login sessions. It is not specified by POSIX, so plain sh implementations such as dash do not provide it.

# SEE ALSO

[exit](/man/exit)(1), [login](/man/login)(1), [bash](/man/bash)(1), [zsh](/man/zsh)(1)

