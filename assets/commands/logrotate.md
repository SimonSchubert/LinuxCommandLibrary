# TAGLINE

manages log files by rotating, compressing, removing, and mailing them

# TLDR

**Force** rotation manually

```logrotate [path/to/logrotate.conf] --force```

Run with **custom mail** command

```logrotate [path/to/logrotate.conf] --mail /usr/bin/mail```

Run **without state** file

```logrotate [path/to/logrotate.conf] --state /dev/null```

**Skip state** file check

```logrotate [path/to/logrotate.conf] --skip-state-lock```

**Log verbose** output to file

```logrotate [path/to/logrotate.conf] --log [path/to/log]```

# SYNOPSIS

**logrotate** [_options_] _config_file_

# DESCRIPTION

**logrotate** manages log files by rotating, compressing, removing, and mailing them. It prevents logs from consuming excessive disk space and is typically run daily via cron.

# PARAMETERS

**-f, --force**
> Force rotation even if not needed

**--mail COMMAND**
> Command to mail logs

**--state FILE**
> State file path

**--skip-state-lock**
> Skip state file locking

**--log FILE**
> Log verbose output to file

**-d, --debug**
> Debug mode (don't make changes)

**-v, --verbose**
> Verbose output

# CAVEATS

Configuration files in /etc/logrotate.d/ are included by the main config. State file tracks rotation history.

# SEE ALSO

[logger](/man/logger)(1), [journalctl](/man/journalctl)(1)
