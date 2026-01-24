# TLDR

**Show synchronization status**

```ntpctl -s status```

**Show all peers**

```ntpctl -s peers```

**Show all sensors**

```ntpctl -s sensors```

**Show all information**

```ntpctl -s all```

# SYNOPSIS

**ntpctl** [_-s command_]

# PARAMETERS

**-s status**
> Show synchronization status.

**-s peers**
> Show peer status.

**-s sensors**
> Show sensor status.

**-s all**
> Show all information.

# DESCRIPTION

**ntpctl** queries the OpenNTPD daemon for synchronization status. It displays information about time sources and synchronization state.

The status view shows whether the clock is synchronized, the stratum level, and the offset from the reference time. A synchronized clock means the system time is being corrected.

Peer display lists configured NTP servers with their status, stratum, and offset. This helps identify which servers are reachable and providing good time.

Sensors show hardware time sources like GPS receivers or radio clocks that may be configured. These provide local reference time independent of network.

The tool communicates with ntpd through a control socket. The daemon must be running with control socket enabled for ntpctl to work.

OpenNTPD emphasizes security and simplicity over feature completeness. ntpctl reflects this by providing essential status information without complex queries.

# CAVEATS

OpenNTPD specific - not compatible with ISC ntpd. Control socket must be enabled in ntpd configuration. Limited compared to ntpq.

# HISTORY

**ntpctl** is part of **OpenNTPD**, developed by the **OpenBSD** project starting around **2004**. OpenNTPD was created as a simpler, more secure alternative to the reference NTP implementation.

# SEE ALSO

[ntpd](/man/ntpd)(8), [ntpq](/man/ntpq)(1), [chronyc](/man/chronyc)(1), [timedatectl](/man/timedatectl)(1)
