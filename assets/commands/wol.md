# TLDR

Send **WoL** packet

```wol [mac_address]```

Send to different **subnet** by IP

```wol -i [ip_address] [mac_address]```

Send to different **subnet** by hostname

```wol -h [hostname] [mac_address]```

Specify **port**

```wol -p [port_number] [mac_address]```

Read from **file**

```wol -f [path/to/file]```

**Verbose** output

```wol -v [mac_address]```

# SYNOPSIS

**wol** [_OPTIONS_] _MAC_ADDRESS_

# PARAMETERS

**-i, --ipaddr** _IP_
> Send to specified IP address

**-h, --host** _HOSTNAME_
> Send to specified hostname

**-p, --port** _PORT_
> Use specified port

**-f, --file** _FILE_
> Read addresses from file

**-v, --verbose**
> Verbose output

# DESCRIPTION

**wol** sends Wake-on-LAN magic packets to wake up computers remotely. The target computer must have WoL enabled in BIOS and network interface configuration.

Magic packets are broadcast on the local network by default. For remote networks, specify the target IP or hostname.

# CAVEATS

Target machine must support and have WoL enabled. May not work across routers without special configuration. MAC address must be known.

# SEE ALSO

[etherwake](/man/etherwake)(8), [wakeonlan](/man/wakeonlan)(1)
