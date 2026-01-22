# TLDR

Search for **SELinux AVC** denials

```sudo ausearch -m avc```

Search by **executable**

```sudo ausearch -c httpd```

Search by **user**

```sudo ausearch -ui 1000```

Search **recent** events

```sudo ausearch -ts recent```

Search **failed logins**

```sudo ausearch -m user_login -sv no```

Search by **file**

```sudo ausearch -f path/to/file```

Output **raw** format

```sudo ausearch -m avc --raw```

# SYNOPSIS

**ausearch** [_OPTIONS_]

# DESCRIPTION

**ausearch** queries the Linux audit log for events. It can search by message type, user, process, file, time range, and other criteria, making it essential for security analysis and incident investigation.

# PARAMETERS

**-m, --message** _type_
> Search for specific message types (avc, user_login, etc.)

**-c, --comm** _name_
> Search by command/executable name

**-ui, --uid** _uid_
> Search by user ID

**-f, --file** _path_
> Search for events related to a specific file

**-ts, --start** _time_
> Start time for search (recent, today, or timestamp)

**-te, --end** _time_
> End time for search

**-sv, --success** _yes|no_
> Filter by success or failure

**--raw**
> Output in raw format for further processing

**-i, --interpret**
> Interpret numeric values (UIDs, syscalls, etc.)

# CAVEATS

Requires root privileges to access audit logs. The audit daemon must be running and logging events. Large audit logs may slow searches; use time filters to narrow results.

# HISTORY

**ausearch** is part of the **audit** package, providing search capabilities for the Linux Audit Framework.

# SEE ALSO

[aureport](/man/aureport)(8), [auditctl](/man/auditctl)(8), [audit2why](/man/audit2why)(1)
