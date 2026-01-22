# TLDR

**Traceroute to host**

```lft [hostname]```

**Use specific port**

```lft -d [80] [hostname]```

**TCP mode**

```lft -T [hostname]```

**UDP mode**

```lft -U [hostname]```

**Show ASN info**

```lft -A [hostname]```

**Set max TTL**

```lft -m [30] [hostname]```

# SYNOPSIS

**lft** [_options_] _host_

# PARAMETERS

_HOST_
> Target hostname or IP.

**-d** _PORT_
> Destination port.

**-T**
> TCP mode.

**-U**
> UDP mode.

**-A**
> Show AS numbers.

**-m** _TTL_
> Maximum TTL.

**-n**
> No DNS resolution.

**--help**
> Display help information.

# DESCRIPTION

**lft** is Layer Four Traceroute. It traces routes using TCP, UDP, or ICMP at layer 4.

The tool bypasses many firewalls that block ICMP. It shows AS numbers for network analysis.

lft traces using layer 4.

# CAVEATS

May need root. Firewall-friendly. Network diagnostic tool.

# HISTORY

LFT was created by **Victor Oppleman** as a firewall-friendly alternative to traditional traceroute.

# SEE ALSO

[traceroute](/man/traceroute)(1), [mtr](/man/mtr)(1), [tcptraceroute](/man/tcptraceroute)(1)
