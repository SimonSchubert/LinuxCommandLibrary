# TAGLINE

Display and manage IP routing table

# TLDR

**Display the routing table**

```route -n```

**Add a default gateway**

```sudo route add default gw [192.168.1.1]```

**Add a route to a network**

```sudo route add -net [10.0.0.0/8] gw [192.168.1.1]```

**Add a route to a host**

```sudo route add -host [192.168.2.100] gw [192.168.1.1]```

**Delete a route**

```sudo route del -net [10.0.0.0/8]```

**Delete the default gateway**

```sudo route del default```

# SYNOPSIS

**route** [**-n**] [**-v**] [**add**|**del**] [**-net**|**-host**] _target_ [**gw** _gateway_] [**netmask** _mask_] [**dev** _interface_]

# PARAMETERS

**-n**
> Show numeric addresses (don't resolve hostnames)

**-v**
> Verbose output

**add**
> Add a new route

**del**
> Delete a route

**-net**
> Target is a network

**-host**
> Target is a host

**gw** _gateway_
> Route packets via specified gateway

**netmask** _mask_
> Specify netmask for network route

**dev** _interface_
> Force route to use specified interface

**metric** _M_
> Set metric (priority) for the route

**reject**
> Install a blocking route

# DESCRIPTION

**route** displays and manipulates the IP routing table. The kernel uses routing tables to determine where to send network packets based on their destination addresses.

Without arguments, route displays the current routing table. The **-n** flag shows numeric addresses, avoiding DNS lookups and speeding up display.

Routes can be added for networks (ranges of addresses) or specific hosts. The default route (0.0.0.0/0) handles traffic that doesn't match any specific route—typically pointing to the internet gateway.

Modern Linux systems prefer **ip route** from iproute2, but route remains available for compatibility and familiarity.

# OUTPUT COLUMNS

**Destination**: Target network or host
**Gateway**: Gateway address (\* means none needed)
**Genmask**: Netmask for the destination
**Flags**: U=up, G=gateway, H=host, !=reject
**Metric**: Route priority (lower = preferred)
**Iface**: Outgoing interface

# CAVEATS

Route changes made with **route** are not persistent across reboots. Use network configuration files or NetworkManager for permanent routes.

The **route** command is deprecated in favor of **ip route** from the iproute2 package, which offers more features and consistent syntax.

Modifying routes requires root privileges. Incorrect routing can cause network connectivity loss.

# SEE ALSO

[ip](/man/ip)(8), [netstat](/man/netstat)(8), [iptables](/man/iptables)(8), [traceroute](/man/traceroute)(8)
