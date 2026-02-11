# TAGLINE

Show logged-in users and activity

# TLDR

**Show who is logged in** and what they're doing

```w```

**Show without header**

```w -h```

**Show for specific user**

```w [username]```

**Short format** (no login time, JCPU, PCPU)

```w -s```

**Show IP addresses** instead of hostnames

```w -i```

# SYNOPSIS

**w** [**-hisf**] [_user_]

# PARAMETERS

**-h**, **--no-header**
> Don't print the header line

**-s**, **--short**
> Short format; don't print login time, JCPU, or PCPU

**-f**, **--from**
> Toggle printing the FROM (remote host) field

**-i**, **--ip-addr**
> Display IP addresses instead of hostnames

**-o**, **--old-style**
> Old style output (space-separated)

**-u**, **--no-current**
> Ignore username while calculating current process times

# OUTPUT COLUMNS

**USER**: Username
**TTY**: Terminal name
**FROM**: Remote host (or - for local)
**LOGIN@**: Login time
**IDLE**: Idle time
**JCPU**: Time used by all processes attached to tty
**PCPU**: Time used by current process
**WHAT**: Current process command line

# DESCRIPTION

**w** displays information about currently logged-in users and their processes. The first line shows current time, system uptime, number of users, and load averages (same as **uptime** output).

Each subsequent line shows one logged-in user with their terminal, login time, idle time, CPU usage, and current activity. This gives a quick overview of system usage and user activity.

The "WHAT" column shows the current foreground process for each user, useful for seeing what people are running.

Idle time shows how long since the user's last terminal activity—useful for identifying inactive sessions.

# CAVEATS

The FROM field may be blank or show "-" for local logins or when hostname resolution fails.

CPU time columns (JCPU, PCPU) may not accurately reflect all activity, especially for background processes or when using terminal multiplexers.

Some processes may not appear in WHAT if they detach from the terminal.

# SEE ALSO

[who](/man/who)(1), [uptime](/man/uptime)(1), [users](/man/users)(1), [last](/man/last)(1), [finger](/man/finger)(1)
