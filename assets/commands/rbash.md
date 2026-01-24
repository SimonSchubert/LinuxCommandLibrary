# TLDR

**Start restricted shell**

```rbash```

**Run command in restricted mode**

```rbash -c "[command]"```

**Run script restricted**

```rbash [script.sh]```

# SYNOPSIS

**rbash** [_options_] [_script_]

# PARAMETERS

**-c** _STRING_
> Execute command string.

**-i**
> Interactive mode.

**-l**
> Login shell.

**-r**
> Restricted mode (default).

# DESCRIPTION

**rbash** is restricted bash. It limits user actions.

Cannot change directory. cd command disabled.

Cannot modify PATH. Environment locked.

Cannot redirect output. No > or >> allowed.

Cannot use slash in commands. No /bin/command.

Used for limited accounts. Secure shell access.

# RESTRICTIONS

- No cd command
- No PATH changes
- No output redirection
- No exec command
- No command substitution assignment

# CAVEATS

Can be escaped via scripts. Not security boundary. Use with other controls.

# HISTORY

**rbash** is bash started as restricted shell. It provides a limited environment for untrusted users.

# SEE ALSO

[bash](/man/bash)(1), [chroot](/man/chroot)(1), [sudo](/man/sudo)(1)
