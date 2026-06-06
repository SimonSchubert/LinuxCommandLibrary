# TAGLINE

prints the user's login name

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

**logname** prints the name of the user who originally logged in on the controlling terminal. It uses the `getlogin` system call, which determines the login name from the session's utmp record rather than from environment variables (which cannot be trusted).

Unlike **whoami**, which reports the current effective user, **logname** keeps showing the original login name after **su** or **sudo** switch the effective user.

# CAVEATS

Fails with "no login name" when there is no controlling terminal (for example in some cron jobs or daemons). Differs from **whoami** after **su**. POSIX standard command.

# HISTORY

logname is a traditional **Unix** command from POSIX, showing the name used to log into the system.

# SEE ALSO

[whoami](/man/whoami)(1), [who](/man/who)(1), [id](/man/id)(1)

