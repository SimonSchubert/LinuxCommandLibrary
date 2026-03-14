# TAGLINE

manages log files by rotating, compressing, removing, and mailing them

# TLDR

**Force** rotation manually

```sudo logrotate --force [/etc/logrotate.conf]```

**Debug mode** - show what would happen without making changes

```logrotate --debug [/etc/logrotate.conf]```

**Verbose** rotation

```sudo logrotate --verbose [/etc/logrotate.conf]```

Use a **custom state** file

```sudo logrotate --state [/var/lib/logrotate/status] [/etc/logrotate.conf]```

**Log verbose** output to file

```sudo logrotate --verbose --log [/var/log/logrotate.log] [/etc/logrotate.conf]```

# SYNOPSIS

**logrotate** [_options_] _config_file_

# DESCRIPTION

**logrotate** manages log files by rotating, compressing, removing, and mailing them. It prevents logs from consuming excessive disk space and is typically run daily via cron.

# PARAMETERS

**-f**, **--force**
> Force rotation even if conditions are not met

**-d**, **--debug**
> Debug mode; show what would happen without making changes

**-v**, **--verbose**
> Verbose output

**-s**, **--state** _FILE_
> Use alternate state file (default: /var/lib/logrotate/status)

**-l**, **--log** _FILE_
> Log verbose output to file

**--mail** _COMMAND_
> Use specified command to mail logs

# CAVEATS

Configuration files in /etc/logrotate.d/ are included by the main config. The state file tracks when each log was last rotated. Typically run daily via cron or systemd timer.

# SEE ALSO

[logger](/man/logger)(1), [journalctl](/man/journalctl)(1)
