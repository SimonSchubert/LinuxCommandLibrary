# TAGLINE

Samba Windows event log manager

# TLDR

**Create event log** database

```eventlogadm -o addsource [Application] [/var/lib/samba/eventlog]```

**Dump event log**

```eventlogadm -o dump [Application]```

**Write event** to log

```eventlogadm -o write [Application] [message]```

# SYNOPSIS

**eventlogadm** [_options_] _operation_ [_args_]

# PARAMETERS

_OPERATION_
> Operation: addsource, dump, write.

**-o** _OP_
> Operation to perform.

**-s** _CONF_
> Samba config file.

**addsource** _NAME_ _PATH_
> Create event log source.

**dump** _NAME_
> Dump log contents.

**write** _NAME_ _MSG_
> Write event.

# DESCRIPTION

**eventlogadm** is a Samba utility for managing Windows-compatible event logs on Unix systems. It allows creating, reading, and writing event log databases that Windows clients can access.

The tool works with Samba's implementation of the Windows Event Log service. Event logs are stored in TDB (Trivial Database) format and can be viewed from Windows Event Viewer.

eventlogadm is useful for integrating Unix logging with Windows-centric management tools.

# CONFIGURATION

**/etc/samba/smb.conf**
> Samba server configuration that defines event log paths and settings.

# CAVEATS

Requires Samba configured. Event log format specific to Windows compatibility. Storage location depends on Samba config.

# HISTORY

eventlogadm is part of **Samba**, providing Windows event log compatibility for the Unix implementation of Windows networking protocols.

# SEE ALSO

[smbd](/man/smbd)(8), [nmbd](/man/nmbd)(8), [samba](/man/samba)(7)
