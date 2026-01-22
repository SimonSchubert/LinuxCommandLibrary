# TLDR

**Show interface status**

```mii-tool [eth0]```

**Show all interfaces**

```mii-tool```

**Verbose output**

```mii-tool -v [eth0]```

**Watch status**

```mii-tool -w [eth0]```

**Force speed**

```mii-tool -F [100baseTx-FD] [eth0]```

**Reset interface**

```mii-tool -R [eth0]```

# SYNOPSIS

**mii-tool** [_options_] [_interface_]

# PARAMETERS

_INTERFACE_
> Network interface.

**-v**
> Verbose output.

**-w**
> Watch for changes.

**-F** _MEDIA_
> Force media type.

**-R**
> Restart negotiation.

**--help**
> Display help information.

# DESCRIPTION

**mii-tool** checks network link status. It shows speed, duplex, and link state.

The tool uses MII (Media Independent Interface) to query Ethernet adapters.

mii-tool shows network link status.

# CAVEATS

Deprecated, use ethtool. Not for all adapters. Requires root.

# HISTORY

mii-tool was a **net-tools** utility for checking Ethernet link status, now superseded by ethtool.

# SEE ALSO

[ethtool](/man/ethtool)(8), [ifconfig](/man/ifconfig)(8), [ip](/man/ip)(8)

