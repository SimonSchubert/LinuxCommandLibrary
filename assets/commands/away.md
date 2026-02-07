# TAGLINE

Lock terminal with an away message

# TLDR

**Lock terminal** and set an away message

```away [message]```

Lock terminal and **enable mail check**

```away -c [message]```

Lock terminal and **disable mail check**

```away -C [message]```

Lock terminal and **sleep background tasks** for seconds

```away -t [seconds] [message]```

Lock terminal and **check mail persistently**

```away -p [message]```

# SYNOPSIS

**away** [_options_] _message_

# DESCRIPTION

**away** locks the terminal and displays an away message to anyone who sees the screen. It optionally monitors for new mail and can manage background task timing.

The terminal remains locked until the user authenticates. The away message is visible to other users who may access the terminal.

# PARAMETERS

**-c, --mail**
> Enable mail checking

**-C, --nomail**
> Disable mail checking

**-t, --time** _seconds_
> Sleep background tasks for the specified number of seconds

**-p, --persist**
> Check mail until at least one inbox receives new mail

**-P, --nopersist**
> Check mail even if no new mail has arrived

**-h, --help**
> Display help information

**-v, --version**
> Display version information

# CAVEATS

The lock mechanism relies on system authentication. Mail checking requires properly configured mail spool directories. The away message is visible to anyone with physical access to the terminal.

# SEE ALSO

[vlock](/man/vlock)(1), [lock](/man/lock)(1), [screen](/man/screen)(1)
