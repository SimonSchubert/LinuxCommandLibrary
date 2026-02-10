# TAGLINE

console network traffic monitor

# TLDR

**Monitor all interfaces**

```nload```

**Monitor specific interface**

```nload [eth0]```

**Monitor multiple interfaces**

```nload [eth0] [wlan0]```

**Set refresh interval**

```nload -t [500]```

**Show in bits** instead of bytes

```nload -u b```

# SYNOPSIS

**nload** [_options_] [_devices_...]

# DESCRIPTION

**nload** is a console network traffic monitor. It displays incoming and outgoing traffic using graphs and provides real-time bandwidth usage information.

The tool shows current, average, minimum, and maximum traffic rates, making it easy to monitor network activity.

# PARAMETERS

**-a** _period_
> Average calculation period (seconds).

**-t** _interval_
> Refresh interval (milliseconds).

**-u** _unit_
> Unit for display (h=human, b=bits, B=bytes, k=KB, m=MB, g=GB).

**-U** _unit_
> Unit for total traffic.

**-m**
> Don't use multiple units.

**devices**
> Devices to monitor.

# KEYS

**Left/Right**: Switch devices
**F2**: Options
**F5**: Save options
**F6**: Reload options
**q**: Quit

# CAVEATS

Shows instantaneous rates which may fluctuate. Total counts reset on restart. Device names must be exact. VPN interfaces may need configuration.

# HISTORY

**nload** was created by **Roland Riegel** as a simple network load monitor. It fills the niche for quick bandwidth visualization without the complexity of full network analyzers.

# SEE ALSO

[iftop](/man/iftop)(1), [bmon](/man/bmon)(1), [vnstat](/man/vnstat)(1), [nethogs](/man/nethogs)(1)
