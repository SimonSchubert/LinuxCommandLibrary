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

**users** shows logged in users. It lists usernames.

Simple output. Space-separated names.

Current sessions. Who's logged in.

Reads utmp. Login database.

Minimal information. Names only.

# CAVEATS

Simple output. Use who for details. Current logins only.

# HISTORY

**users** is a standard Unix command that outputs a compact list of users currently logged into the system.

# SEE ALSO

[who](/man/who)(1), [w](/man/w)(1), [last](/man/last)(1), [whoami](/man/whoami)(1)
