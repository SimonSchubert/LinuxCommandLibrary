# TLDR

Start daemon in **background**

```crond```

Start daemon in **foreground**

```crond -n```

Send output to **syslog**

```crond -s```

Accept **custom crontabs** (override limitations)

```crond -p```

Inherit **PATH** from environment

```crond -P```

Enable **clustering** support

```crond -c```

# SYNOPSIS

**crond** [_OPTIONS_]

# DESCRIPTION

**crond** is a daemon that executes scheduled commands from crontab files. It starts automatically at boot and checks crontab files for jobs that need to run each minute. It monitors /var/spool/cron/crontabs (user crontabs), /etc/crontab (system crontab), and /etc/cron.d/ (system cronjobs).

# PARAMETERS

**-n**
> Run in foreground (useful for init systems)

**-s**
> Send job output to syslog instead of email

**-m COMMAND**
> Specify custom mail command or disable with "off"

**-p**
> Override default limitations and accept custom crontabs

**-P**
> Inherit PATH from environment instead of setting default

**-c**
> Enable clustering support for shared crontabs

**-h**
> Display help information

**-V**
> Display version number

# CAVEATS

Job output is mailed to the crontab owner unless redirected to syslog with -s or a custom mail command. Crontab files must be regular files, not executable, and writable only by the owner. Local time changes (like DST) under three hours receive special handling.

# HISTORY

**crond** is the daemon component of cron, a standard Unix job scheduler that has been in use since Version 7 Unix. Modern implementations include Vixie cron and cronie.

# SEE ALSO

[crontab](/man/crontab)(1), [crontab](/man/crontab)(5), [anacron](/man/anacron)(8)
