# TLDR

**Analyze** all recent SELinux denials

```sudo sealert -a /var/log/audit/audit.log```

**Lookup** specific alert ID

```sudo sealert -l alert_id```

Display **summary** of recent alerts

```sudo sealert -b```

**Monitor** audit log in real-time

```sudo tail -f /var/log/audit/audit.log | sealert -l -```

# SYNOPSIS

**sealert** [_options_]

# PARAMETERS

**-a**, **--analyze** _file_
> Analyze audit log file

**-l**, **--lookupid** _id_
> Lookup specific alert

**-b**, **--browser**
> Display alert summary browser

# DESCRIPTION

**sealert** analyzes and explains SELinux AVC (Access Vector Cache) denial messages. It provides human-readable explanations of why access was denied and suggests solutions.

Part of setroubleshoot, it helps administrators understand and resolve SELinux policy violations.

# CAVEATS

Requires SELinux audit logging to be enabled. Solutions are suggestions and should be reviewed before applying.

# HISTORY

Part of **setroubleshoot-server** package, providing user-friendly SELinux troubleshooting.

# SEE ALSO

[audit2why](/man/audit2why)(1), [audit2allow](/man/audit2allow)(1), [ausearch](/man/ausearch)(8)
