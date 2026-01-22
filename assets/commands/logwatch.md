# TLDR

Analyze logs for **date range** and detail

```logwatch --range [yesterday|today|all] --detail [low|medium|high]```

Report for **specific service**

```logwatch --range all --service [apache|sshd|pam_unix]```

# SYNOPSIS

**logwatch** [_options_]

# DESCRIPTION

**logwatch** is a log analysis and reporting tool that summarizes logs from various services into a single report. It parses logs from Apache, SSH, PAM, and many other services to highlight important events.

# PARAMETERS

**--range RANGE**
> Date range: yesterday, today, all, or specific dates

**--detail LEVEL**
> Detail level: low, medium, high, or 0-10

**--service SERVICE**
> Analyze specific service only

**--output FORMAT**
> Output format: stdout, file, mail

**--mailto ADDRESS**
> Email report to address

**--filename FILE**
> Output to specific file

# CAVEATS

Requires service-specific filter scripts. Output volume can be large with high detail levels.

# SEE ALSO

[journalctl](/man/journalctl)(1), [logrotate](/man/logrotate)(8)
