# TAGLINE

List currently logged-in usernames

# TLDR

**Show logged in users**

```users```

**From specific file**

```users [/var/log/wtmp]```

# SYNOPSIS

**users** [_file_]

# PARAMETERS

_file_
> Alternate utmp file.

**--help**
> Show help.

**--version**
> Show version.

# DESCRIPTION

**users** prints a compact, space-separated list of usernames currently logged into the system. If a user has multiple login sessions, their name appears once for each session.

The command reads from /var/run/utmp by default to determine who is logged in. An alternate utmp-format file can be specified as an argument, such as /var/log/wtmp to see historical logins.

Unlike **who** and **w**, which provide detailed information about each session, users produces minimal output suitable for quick checks or scripting where only the list of logged-in usernames is needed.

# CAVEATS

Simple output. Use who for details. Current logins only.

# HISTORY

**users** is a standard Unix command that outputs a compact list of users currently logged into the system.

# SEE ALSO

[who](/man/who)(1), [w](/man/w)(1), [last](/man/last)(1), [whoami](/man/whoami)(1)
