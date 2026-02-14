# TAGLINE

Exit the shell

# TLDR

**Exit the current shell** session

```bye```

**Exit with a specific status** code

```bye [exit_code]```

# SYNOPSIS

**bye** [_n_]

# DESCRIPTION

**bye** is a zsh builtin that terminates the current shell session. It is functionally identical to **exit**. When called, it runs any **EXIT** traps and zshexit hooks before closing the shell.

If an optional numeric argument is provided, it is used as the exit status returned to the parent process. Without an argument, the exit status of the last command executed is used.

# CAVEATS

**bye** is specific to zsh and not available in bash or other shells. For portability, use **exit** instead. If there are running background jobs, zsh may warn before exiting on the first attempt.

# HISTORY

**bye** was included in **zsh** as a convenience alias for **exit**, reflecting a common command used in interactive systems like FTP clients and some early Unix shells.

# SEE ALSO

[exit](/man/exit)(1), [logout](/man/logout)(1), [zsh](/man/zsh)(1)
