# TAGLINE

adds entries to the system log

# TLDR

Log a **message**

```logger [message]```

Log from **stdin**

```echo [message] | logger```

Log to **remote server**

```echo [message] | logger -n [hostname] -P [port]```

Log with **custom tag**

```echo [message] | logger -t [tag]```

Log with **priority**

```echo [message] | logger -p user.warning```

# SYNOPSIS

**logger** [_options_] [_message_]

# DESCRIPTION

**logger** adds entries to the system log (syslog). It is useful for logging from shell scripts or adding custom messages to system logs for debugging and monitoring.

# PARAMETERS

**-n, --server HOST**
> Send to remote syslog server

**-P, --port PORT**
> Remote server port (default: 514)

**-t, --tag TAG**
> Mark messages with tag (default: username)

**-p, --priority PRIORITY**
> Log priority (facility.level, default: user.notice)

**-s, --stderr**
> Also output to stderr

**-f, --file FILE**
> Log contents of file

**-i**
> Include process ID

# PRIORITY LEVELS

Facilities: auth, cron, daemon, kern, local0-7, mail, news, syslog, user, uucp
Levels: emerg, alert, crit, err, warning, notice, info, debug

# SEE ALSO

[journalctl](/man/journalctl)(1), [syslog](/man/syslog)(3), [rsyslog](/man/rsyslog)(8)
