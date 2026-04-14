# TAGLINE

Analyze and explain SELinux denial messages

# TLDR

**Analyze** all recent SELinux denials

```sudo sealert -a /var/log/audit/audit.log```

**Lookup** specific alert ID

```sudo sealert -l alert_id```

Display **summary** of recent alerts

```sudo sealert -b```

Display **all alerts** in HTML format

```sudo sealert -a /var/log/audit/audit.log -H```

# SYNOPSIS

**sealert** [_options_]

# PARAMETERS

**-a**, **--analyze** _file_
> Scan an audit log file for AVCs, analyze them, and write alerts to stdout.

**-l**, **--lookupid** _id_
> Look up a specific alert by ID and write it to stdout. Use `*` to return all alerts.

**-b**, **--browser**
> Launch the alert browser GUI.

**-f**, **--fix** _uuid_
> Execute the fix command for the AVC with the given UUID. Requires **--plugin**.

**-P**, **--plugin** _plugin_
> Specify the plugin name to use with **--fix**.

**-H**
> Output alerts in HTML format instead of plain text (used with **-l** or **-a**).

**-s**, **--service**
> Start the sealert D-Bus service (typically invoked by D-Bus).

**-S**, **--noservice**
> Start sealert as a standalone application without the D-Bus service.

**-u**, **--user** _user_
> Log on as the specified user.

**-p**, **--password** _password_
> Set the user password.

# DESCRIPTION

**sealert** analyzes and explains SELinux AVC (Access Vector Cache) denial messages. It provides human-readable explanations of why access was denied and suggests solutions.

Part of setroubleshoot, it helps administrators understand and resolve SELinux policy violations.

# CAVEATS

Requires SELinux audit logging to be enabled. Solutions are suggestions and should be reviewed before applying.

# HISTORY

Part of **setroubleshoot-server** package, providing user-friendly SELinux troubleshooting.

# SEE ALSO

[audit2why](/man/audit2why)(1), [audit2allow](/man/audit2allow)(1), [ausearch](/man/ausearch)(8)
