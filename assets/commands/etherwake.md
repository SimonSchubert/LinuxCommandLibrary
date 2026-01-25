# TLDR

**Wake computer by MAC address**

```sudo etherwake [00:11:22:33:44:55]```

**Wake using specific interface**

```sudo etherwake -i [eth0] [00:11:22:33:44:55]```

**Wake with broadcast**

```sudo etherwake -b [00:11:22:33:44:55]```

**Wake with password**

```sudo etherwake -p [password] [00:11:22:33:44:55]```

**Debug mode**

```sudo etherwake -D [00:11:22:33:44:55]```

# SYNOPSIS

**etherwake** [_options_] _mac-address_

# PARAMETERS

**-i** _interface_
> Network interface to use.

**-b**
> Use broadcast address.

**-D**
> Debug mode; show packet contents.

**-p** _password_
> SecureOn password (6 bytes).

**-V**
> Show version.

_mac-address_
> Target MAC address (XX:XX:XX:XX:XX:XX).

# DESCRIPTION

**etherwake** sends Wake-on-LAN (WoL) magic packets to wake computers from sleep, hibernation, or powered-off state. The target computer must have WoL enabled in BIOS/UEFI and on the network interface.

The magic packet contains a sync stream followed by the target MAC address repeated 16 times. When the network card detects this pattern, it signals the computer to power on.

# REQUIREMENTS

- Target must have WoL enabled in BIOS/UEFI
- Network interface must support WoL
- Target must be on same network segment (or use directed broadcast)
- Target's NIC must have power in standby

# CAVEATS

Requires root or CAP_NET_RAW capability. Works on local network only; WoL over internet needs port forwarding or VPN. Some NICs need specific driver configuration. Wireless usually doesn't support WoL.

# HISTORY

Wake-on-LAN was developed in **1996** by AMD and HP as part of the Advanced Manageability Alliance. etherwake is one of several Linux implementations of WoL sending tools.

# SEE ALSO

[wol](/man/wol)(1), [wakeonlan](/man/wakeonlan)(1), [ethtool](/man/ethtool)(8)
