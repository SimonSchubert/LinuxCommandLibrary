# TAGLINE

Send ARP requests to discover and test network hosts.

# TLDR

**Ping** host using ARP

```sudo arping [192.168.1.1]```

Ping with **specific interface**

```sudo arping -I [eth0] [192.168.1.1]```

Send **count** requests

```sudo arping -c [5] [192.168.1.1]```

**Detect duplicate** IP addresses

```sudo arping -D [192.168.1.1]```

Find **MAC address** of IP

```sudo arping -c 1 [192.168.1.1]```

# SYNOPSIS

**arping** [_-c count_] [_-I interface_] [_-D_] _destination_

# DESCRIPTION

**arping** sends ARP requests to a target host and displays responses. Unlike ICMP ping, ARP operates at layer 2 and cannot be blocked by IP firewalls.

The tool is useful for verifying layer 2 connectivity, finding MAC addresses, and detecting duplicate IP addresses on a network.

# PARAMETERS

**-c** _count_
> Stop after count replies

**-I** _interface_
> Network interface

**-D**
> Duplicate address detection mode

**-A**
> ARP answer mode (gratuitous ARP)

**-U**
> Unsolicited ARP mode

**-b**
> Keep broadcasting

**-q**
> Quiet mode

**-s** _source_
> Source IP address

**-w** _timeout_
> Timeout in seconds

**-f**
> Quit after first reply

# CAVEATS

Requires root/sudo for raw socket access. Only works on local network segment. Cannot ping across routers.

# HISTORY

**arping** has existed in various forms since the early **2000s**. There are two common implementations: one by Thomas Habets and one in iputils.

# SEE ALSO

[ping](/man/ping)(8), [arp](/man/arp)(8), [arp-scan](/man/arp-scan)(1)
