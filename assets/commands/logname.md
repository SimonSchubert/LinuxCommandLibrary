# TLDR

**Print login name**

```logname```

# SYNOPSIS

**logname** [_options_]

# PARAMETERS

**--help**
> Display help information.

**--version**
> Display version information.

# DESCRIPTION

**logname** prints the user's login name. It reads from the utmp file to determine the original login.

Unlike whoami, logname shows the login name even after su or sudo commands.

logname shows the login name.

# CAVEATS

May fail if not run from a terminal. Differs from whoami after su. POSIX standard command.

# HISTORY

logname is a traditional **Unix** command from POSIX, showing the name used to log into the system.

# SEE ALSO

[whoami](/man/whoami)(1), [who](/man/who)(1), [id](/man/id)(1)

