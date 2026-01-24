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

**wakeonlan** sends Wake-on-LAN magic packets. It powers on remote computers.

Magic packets contain the target MAC. Repeated 16 times in specific format.

Broadcast address reaches sleeping hosts. Local network or directed broadcast.

Port 9 is standard. Some systems use port 7.

File input enables multiple hosts. One MAC per line.

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
