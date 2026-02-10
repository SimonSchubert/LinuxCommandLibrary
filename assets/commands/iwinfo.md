# TAGLINE

OpenWrt utility for retrieving wireless interface information

# TLDR

**List** all wireless interfaces

```iwinfo```

Display **detailed information** for an interface

```iwinfo [interface] info```

**Scan** for nearby networks

```iwinfo [interface] scan```

List **connected devices**

```iwinfo [interface] assoclist```

List supported **channels**

```iwinfo [interface] freqlist```

List available **transmit power** levels

```iwinfo [interface] txpowerlist```

# SYNOPSIS

**iwinfo** [_interface_] [_command_]

# PARAMETERS

**info**
> Display detailed interface information

**scan**
> Scan for nearby wireless networks

**assoclist**
> List associated (connected) clients

**freqlist**
> List supported frequencies/channels

**txpowerlist**
> List available transmit power levels

**countrylist**
> List supported country codes

# DESCRIPTION

**iwinfo** is an OpenWrt utility for retrieving wireless interface information. It provides a unified interface to query wireless driver capabilities and status, abstracting differences between various wireless drivers.

The tool displays connection status, signal strength, encryption type, and other wireless parameters. It's particularly useful for monitoring access point clients and scanning for networks.

# CAVEATS

Specific to OpenWrt/LEDE systems. Output format may vary depending on the wireless driver. Some features require specific driver support.

# HISTORY

iwinfo was developed for OpenWrt to provide a consistent interface for wireless information across different hardware and drivers used in router firmware.

# SEE ALSO

[iw](/man/iw)(8), [uci](/man/uci)(1), [wifi](/man/wifi)(1)
