# TAGLINE

Show logged-in users

# TLDR

**Show who is logged in**

```who```

**Show current user** only

```who am i```

**Show with column headers**

```who -H```

**Show login time and idle time**

```who -u```

**Show all available information**

```who -a```

**Count logged in users**

```who -q```

**Show system boot time**

```who -b```

# SYNOPSIS

**who** [_options_] [_file_] [**am i**]

# PARAMETERS

**-a**, **--all**
> Print all available information

**-b**, **--boot**
> Time of last system boot

**-d**, **--dead**
> Print dead processes

**-H**, **--heading**
> Print column headers

**-l**, **--login**
> Print system login processes

**-q**, **--count**
> Only usernames and count of logged-in users

**-r**, **--runlevel**
> Print current runlevel

**-p**, **--process**
> Print active processes spawned by init

**-s**, **--short**
> Print only name, line, and time (default)

**-t**, **--time**
> Print last system clock change

**-T**, **-w**, **--mesg**
> Add user's message status (+, -, ?)

**-u**, **--users**
> List users logged in

**--lookup**
> Attempt to canonicalize hostnames via DNS

**am i**
> Print only current terminal's user info

# DESCRIPTION

**who** displays information about users currently logged into the system. It reads from **/var/run/utmp** (or another specified file) which tracks login sessions.

The basic output shows username, terminal line, and login time. Additional options reveal idle time, process IDs, and message status (whether the user accepts write/talk messages).

**who am i** shows information about the original login session. Unlike **whoami** (which shows the effective user), **who am i** displays the user who originally logged in, even after **su** to another account.

The command can read historical login data from **/var/log/wtmp** to show past logins.

# CAVEATS

Who shows login sessions, not all user processes. Users may have processes running without active login sessions.

Remote connections may show as pseudo-terminals (pts/N) rather than physical terminals (tty).

The utmp file format varies between Unix systems. Some information may not be available on all platforms.

# SEE ALSO

[w](/man/w)(1), [whoami](/man/whoami)(1), [users](/man/users)(1), [last](/man/last)(1), [finger](/man/finger)(1)
