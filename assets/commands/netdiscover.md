# TLDR

**Scan local network**

```netdiscover```

**Scan specific range**

```netdiscover -r [192.168.1.0/24]```

**Passive mode**

```netdiscover -p```

**Use specific interface**

```netdiscover -i [eth0]```

**Fast scan**

```netdiscover -f```

**Scan from file**

```netdiscover -l [ranges.txt]```

# SYNOPSIS

**netdiscover** [_options_]

# PARAMETERS

**-r** _RANGE_
> IP range to scan.

**-p**
> Passive mode (listen only).

**-i** _IFACE_
> Network interface.

**-f**
> Fast mode.

**-l** _FILE_
> Read ranges from file.

**--help**
> Display help information.

# DESCRIPTION

**netdiscover** discovers network hosts using ARP. It finds active hosts on local network.

The tool sends ARP requests. Shows MAC addresses and vendors.

netdiscover finds hosts via ARP.

# CAVEATS

Requires root. Local network only. May trigger IDS alerts.

# HISTORY

netdiscover was created for **network reconnaissance** and discovering hosts on local networks.

# SEE ALSO

[arp-scan](/man/arp-scan)(1), [nmap](/man/nmap)(1), [arping](/man/arping)(1)

