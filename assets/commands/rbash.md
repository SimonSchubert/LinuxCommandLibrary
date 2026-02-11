# TAGLINE

Restricted mode of the Bash shell

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

**rbash** is a restricted mode of the Bash shell that limits user actions to prevent unauthorized system access. When invoked as rbash (or via **bash -r**), it disables directory changes with cd, prevents modification of PATH, SHELL, ENV, and BASH_ENV variables, and blocks output redirection with >, >>, and related operators.

The restrictions also prevent commands containing slashes (blocking direct paths like /bin/command), use of the exec builtin, and importing of functions from the environment. This makes it useful for providing limited shell access to untrusted users when combined with a carefully controlled PATH containing only approved commands.

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
