# TLDR

**Display summary** of AppArmor denials since last login

```aa-notify --since-last```

**Show summary** for the last N days

```aa-notify --since-days [7]```

**Poll logs** and display desktop notifications

```aa-notify --poll --user [username] --display $DISPLAY```

**Search a specific file** for AppArmor messages

```aa-notify --file [/var/log/audit/audit.log]```

**Show verbose messages** with summaries

```aa-notify --since-days [3] --verbose```

**Wait before displaying notifications** (useful at startup)

```aa-notify --poll --wait [10]```

# SYNOPSIS

**aa-notify** [_options_]

# PARAMETERS

**-p**, **--poll**
> Poll AppArmor logs continuously and display desktop notifications for DENIED messages

**-f** _FILE_, **--file=**_FILE_
> Search FILE for AppArmor messages instead of the default log locations

**-l**, **--since-last**
> Show summary of messages since last login

**-s** _NUM_, **--since-days=**_NUM_
> Show summary of messages for the last NUM days

**-u** _USER_, **--user=**_USER_
> Drop privileges to USER when running privileged; required with --poll for desktop notifications

**-w** _NUM_, **--wait=**_NUM_
> Wait NUM seconds before displaying notifications (useful for autostart)

**--display** _$DISPLAY_
> Set the DISPLAY environment variable for desktop notifications

**-v**, **--verbose**
> Show full messages along with summaries

**-h**, **--help**
> Display usage information

# DESCRIPTION

**aa-notify** displays information about logged AppArmor security events, specifically DENIED messages that occur when applications attempt actions blocked by their AppArmor profiles.

The tool operates in two modes: summary mode shows a report of past denials from a specified time period, while poll mode continuously monitors logs and delivers desktop notifications in real-time. This makes it useful for both auditing historical security events and receiving immediate alerts about policy violations.

AppArmor messages are read from the systemd journal, **/var/log/syslog**, **/var/log/kern.log**, or **/var/log/audit/audit.log** when auditd is installed. The tool requires appropriate privileges to read these logs, typically running under sudo.

# CAVEATS

Desktop notifications require a running display server and proper DISPLAY environment variable configuration. When using sudo, the DISPLAY variable may be reset, requiring explicit **--display** specification. For systems with auditd, the log file path must be explicitly set with **--file /var/log/audit/audit.log**.

# HISTORY

**aa-notify** is part of the AppArmor utilities suite. AppArmor originated at Immunix in the late **1990s** and was acquired by Novell in **2005**. It became part of the mainline Linux kernel in version **2.6.36** released in **2010**. The notification daemon was added to help administrators monitor security events in desktop environments.

# SEE ALSO

[apparmor](/man/apparmor)(7), [aa-status](/man/aa-status)(8), [aa-enforce](/man/aa-enforce)(8), [aa-complain](/man/aa-complain)(8), [journalctl](/man/journalctl)(1)
