# TAGLINE

controls OpenNTPD

# TLDR

**Show NTP status**

```ntpctl -s status```

**Show peers**

```ntpctl -s peers```

**Show all information**

```ntpctl -s all```

**Show sensors**

```ntpctl -s sensors```

# SYNOPSIS

**ntpctl** [_options_]

# PARAMETERS

**-s** _TYPE_
> Show information type.

**status**
> Display sync status.

**peers**
> Display configured peers.

**sensors**
> Display time sensors.

**all**
> Display all information.

**--help**
> Display help information.

# DESCRIPTION

**ntpctl** controls OpenNTPD. Queries time synchronization status.

The tool monitors NTP daemon state. Read-only control interface.

# CAVEATS

OpenBSD specific. Works with OpenNTPD. Read-only queries.

# HISTORY

ntpctl was developed as the **control interface** for OpenNTPD on OpenBSD systems.

# SEE ALSO

[ntpd](/man/ntpd)(1), [ntpq](/man/ntpq)(1), [chronyc](/man/chronyc)(1)

