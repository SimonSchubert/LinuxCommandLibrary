# TAGLINE

Send Wake-on-LAN magic packets

# TLDR

**Wake computer**

```wakeonlan [00:11:22:33:44:55]```

**Wake with broadcast address**

```wakeonlan -i [192.168.1.255] [00:11:22:33:44:55]```

**Wake on specific port**

```wakeonlan -p [9] [00:11:22:33:44:55]```

**Wake from file**

```wakeonlan -f [hosts.txt]```

**Verbose output**

```wakeonlan -v [00:11:22:33:44:55]```

# SYNOPSIS

**wakeonlan** [_-i address_] [_-p port_] [_-f file_] [_options_] _mac_

# PARAMETERS

**-i** _ADDRESS_
> Broadcast address.

**-p** _PORT_
> UDP port (default 9).

**-f** _FILE_
> Read MACs from file.

**-v**
> Verbose output.

# DESCRIPTION

**wakeonlan** sends Wake-on-LAN (WoL) magic packets to power on remote computers over the network. A magic packet is a specially formatted UDP broadcast containing the target machine's MAC address repeated 16 times, which the network interface card recognizes even while the system is powered off.

The tool sends packets to the network broadcast address on UDP port 9 by default, reaching sleeping hosts on the local subnet. A custom broadcast address can be specified for directed broadcasts across subnets, and an alternative port can be used for systems configured on port 7.

Multiple machines can be woken at once by reading MAC addresses from a file with one address per line. The target computer must have WoL support enabled in its BIOS/UEFI settings and network interface driver, and must remain physically connected to the network.

# REQUIREMENTS

- Target NIC supports WoL
- WoL enabled in BIOS/UEFI
- WoL enabled in OS
- Computer connected to network

# CAVEATS

Only works on local network (unless forwarded). BIOS settings required. Some NICs need driver config.

# HISTORY

**Wake-on-LAN** was developed by AMD and HP in **1996**. wakeonlan provides command-line access to this power management feature.

# SEE ALSO

[etherwake](/man/etherwake)(1), [ethtool](/man/ethtool)(8)
