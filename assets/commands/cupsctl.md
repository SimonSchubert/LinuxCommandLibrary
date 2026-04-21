# TAGLINE

configure cupsd.conf options for the CUPS scheduler

# TLDR

**Show the current CUPS** server settings

```cupsctl```

**Enable remote administration**

```cupsctl --remote-admin```

**Enable shared printers and** allow access from any address

```cupsctl --share-printers --remote-any```

**Turn on debug logging** to error_log

```cupsctl --debug-logging```

**Disable printer sharing**

```cupsctl --no-share-printers```

**Talk to a remote scheduler** with encryption

```cupsctl -E -h [server:631] --no-remote-admin```

**Set an arbitrary** cupsd.conf directive

```cupsctl [MaxJobs=500]```

# SYNOPSIS

**cupsctl** [**-E**] [**-U** _username_] [**-h** _server_[:_port_]] [**--**[**no-**]**debug-logging**] [**--**[**no-**]**remote-admin**] [**--**[**no-**]**remote-any**] [**--**[**no-**]**share-printers**] [**--**[**no-**]**user-cancel-any**] [_name_=_value_ ...]

# PARAMETERS

**-E**
> Enable encryption on the connection to the scheduler.

**-U** _username_
> Authenticate as _username_ instead of the current user.

**-h** _server_[:_port_]
> Connect to the scheduler on the given host and optional port.

**--debug-logging** / **--no-debug-logging**
> Enable or disable debug logging to the error_log file.

**--remote-admin** / **--no-remote-admin**
> Enable or disable remote administration.

**--remote-any** / **--no-remote-any**
> Enable or disable printing from any address, including the Internet.

**--share-printers** / **--no-share-printers**
> Enable or disable sharing of local printers with other computers.

**--user-cancel-any** / **--no-user-cancel-any**
> Allow or prevent users from cancelling jobs owned by other users.

_name_=_value_
> Set an arbitrary **cupsd.conf** directive directly.

# DESCRIPTION

**cupsctl** updates the **cupsd.conf** file used by the CUPS scheduler. Running it with no arguments prints the current settings as _name_=_value_ pairs; passing options or _name_=_value_ arguments modifies the configuration and asks **cupsd** to reload.

Because **cupsctl** communicates with **cupsd** over IPP rather than editing the file directly, it can be used to administer local or remote schedulers without requiring shell access to the server.

# CAVEATS

Modifying server settings typically requires administrator (root) privileges or membership in the **lpadmin** group. Unknown or misspelled _name_=_value_ directives are silently accepted; verify the result with a plain **cupsctl** call. Some settings require a full **cupsd** restart to fully take effect.

# HISTORY

**cupsctl** was added to **CUPS** by Apple around the **CUPS 1.3** release (2007) as a convenience wrapper over direct **cupsd.conf** editing. CUPS itself was created by Michael Sweet in 1999 and is now developed by the OpenPrinting project.

# SEE ALSO

[cupsd](/man/cupsd)(8), [cups-config](/man/cups-config)(1), [lpadmin](/man/lpadmin)(8), [lpinfo](/man/lpinfo)(8), [lpstat](/man/lpstat)(1), [lp](/man/lp)(1)
