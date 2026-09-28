# TAGLINE

BIND 8 name daemon controller

# TLDR

**Reload BIND configuration** and zones

```ndc reload```

**Show BIND status**

```ndc status```

**Stop BIND server**

```ndc stop```

**Start BIND server**

```ndc start```

**Restart BIND**

```ndc restart```

**Dump the cache** to named_dump.db

```ndc dumpdb```

**Toggle query logging**

```ndc querylog```

List the commands the **server supports**

```ndc help```

# SYNOPSIS

**ndc** [**-c** _channel_] [**-l** _localsock_] [**-p** _pidfile_] [**-d**] [**-q**] [**-s**] [**-t**] [_command_]

# PARAMETERS

**-c** _CHANNEL_
> Control channel rendezvous point: a UNIX socket path (default /var/run/ndc) or an address/port.

**-l** _LOCALSOCK_
> Bind the client side of the control channel to this address.

**-p** _PIDFILE_
> Use signal-based control with the given PID file (older servers; smaller command set).

**-d**
> Enable debugging output.

**-q**
> Suppress prompts and result text.

**-s**
> Suppress nonfatal error announcements.

**-t**
> Enable protocol and system tracing.

# COMMANDS

**status**
> Show server status.

**reload** [_zone_]
> Reload configuration and zones, or only the named zone.

**reconfig**
> Reread the configuration, loading only new zones.

**dumpdb**
> Dump the cache and zones to named_dump.db.

**stats**
> Write statistics to named.stats.

**trace** [_level_] / **notrace**
> Increase the debug level, or turn debugging off.

**querylog**
> Toggle query logging.

**start**, **stop**, **restart**
> Start, stop or restart named.

**help**
> List the commands supported by the running server.

# DESCRIPTION

**ndc** is the name daemon control program of **BIND 8**. It sends commands to a running **named** over a control channel (or via signals) to reload zones, dump the cache, change logging and start or stop the server.

Without a command, ndc runs interactively and reads commands until EOF. Built-in interactive commands start with a slash: /help, /exit, /trace, /debug, /quiet, /silent.

# CAVEATS

Obsolete: ndc only works with BIND 8 and earlier. BIND 9 uses **rndc**, which has a different, authenticated protocol; commands such as flush exist only in rndc. The exact command set depends on the running server; use help to discover it.

# HISTORY

ndc was the original **BIND** control utility, originally a shell script that signalled named, rewritten as a control-channel client for BIND 8. It was replaced by **rndc** in BIND 9 (2000); BIND 8 itself reached end of life in 2007.

# SEE ALSO

[rndc](/man/rndc)(8), [named](/man/named)(8), [bind](/man/bind)(1)

# RESOURCES

```[Homepage](https://www.isc.org/bind/)```

<!-- verified: 2026-09-29 -->
