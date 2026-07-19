# TAGLINE

Dump MQTT-SN UDP packets on a port

# TLDR

**Listen** on the default MQTT-SN port

```mqtt-sn-dump -p [1883]```

**Dump all** packet types

```mqtt-sn-dump -p [1883] -a```

**Verbose** dump

```mqtt-sn-dump -p [1883] -v```

**Debug**

```mqtt-sn-dump -p [1883] -d```

# SYNOPSIS

**mqtt-sn-dump** [*opts*] **-p** *port*

# DESCRIPTION

**mqtt-sn-dump** is a diagnostic tool from **mqtt-sn-tools** that displays MQTT-SN packets sent to a local UDP port. It is especially useful for observing QoS **-1** publishes from constrained clients that talk MQTT-SN without a full session.

Build with **make** on POSIX systems. Related tools: **mqtt-sn-pub**, **mqtt-sn-sub**, **mqtt-sn-serial-bridge**.

# PARAMETERS

**-p** *port*

> UDP port to listen on (default **1883**).

**-a**

> Dump all packet types (not only the default subset).

**-v**

> Verbose messages, including topic name when available.

**-d**

> Increase debug level (repeatable).

# CAVEATS

Needs permission to bind the chosen UDP port. Shows traffic delivered to this host/port only; it is not a full network sniffer. MQTT-SN specific: not for MQTT TCP traffic (**tcpdump** / **mosquitto** tools cover that).

# SEE ALSO

[mqtt-sn-pub](/man/mqtt-sn-pub)(1), [mqtt-sn-sub](/man/mqtt-sn-sub)(1), [tcpdump](/man/tcpdump)(1)

# RESOURCES

```[Source code](https://github.com/njh/mqtt-sn-tools)```

<!-- verified: 2026-07-19 -->
