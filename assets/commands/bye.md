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

**bye** is a zsh builtin that terminates the current shell session. It is an alias for the **exit** builtin. When called, it runs any **EXIT** traps and zshexit hooks before closing the shell.

If an optional arithmetic expression _n_ is provided, it is used as the exit status returned to the parent process. Without an argument, the exit status of the last command executed is used.

# CAVEATS

**bye** is not available in bash or POSIX sh. For portability, use **exit** instead. If there are running background jobs, zsh may warn before exiting on the first attempt.

# SEE ALSO

[exit](/man/exit)(1), [logout](/man/logout)(1), [zsh](/man/zsh)(1)

# RESOURCES

```[Homepage](https://www.zsh.org)```

```[Documentation](https://zsh.sourceforge.io/Doc/Release/Shell-Builtin-Commands.html)```

<!-- verified: 2026-11-09 -->
