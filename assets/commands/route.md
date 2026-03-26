# TAGLINE

Display and manage IP routing table

# TLDR

**Display the routing table with numeric addresses**

```route -n```

**Add a default gateway**

```sudo route add default gw [192.168.1.1]```

**Add a route to a network**

```sudo route add -net [10.0.0.0] netmask [255.0.0.0] gw [192.168.1.1]```

**Add a route to a host**

```sudo route add -host [192.168.2.100] gw [192.168.1.1]```

**Add an IPv6 route**

```sudo route -6 add [2001:db8::/32] gw [fe80::1] dev [eth0]```

**Delete a route to a network**

```sudo route del -net [10.0.0.0] netmask [255.0.0.0]```

**Delete the default gateway**

```sudo route del default```

**Add a reject route to block traffic to a network**

```sudo route add -net [10.0.0.0] netmask [255.0.0.0] reject```

# SYNOPSIS

**route** [**-CFvnNee**] [**-A** _family_|**-4**|**-6**]

**route** [**-v**] [**-A** _family_|**-4**|**-6**] **add**|**del** [**-net**|**-host**] _target_ [**netmask** _mask_] [**gw** _gateway_] [**metric** _N_] [**mss** _M_] [**window** _W_] [**irtt** _I_] [**reject**] [**dev** _interface_]

**route** [**-V**|**--version**] [**-h**|**--help**]

# PARAMETERS

**-n**
> Show numeric addresses instead of resolving hostnames; speeds up display by avoiding DNS lookups

**-v**
> Verbose output

**-e**
> Display routing table in **netstat**(8) format; use **-ee** for extended output including MTU, window, and irtt columns

**-C**
> Operate on the kernel routing cache instead of the FIB

**-N**
> Show symbolic network names rather than CIDR notation (opposite of **-n**)

**-4**
> Operate on IPv4 routes (alias for **-A inet**)

**-6**
> Operate on IPv6 routes (alias for **-A inet6**)

**-A** _family_
> Specify address family (e.g., **inet**, **inet6**)

**-F**
> Operate on the kernel FIB (Forwarding Information Base) routing table (default)

**-V**, **--version**
> Display version information

**add**
> Add a new route

**del**
> Delete a route

**-net**
> Target is a network address

**-host**
> Target is a single host address

**gw** _gateway_
> Route packets via the specified gateway; the gateway must already be reachable

**netmask** _mask_
> Specify the subnet mask for a network route

**dev** _interface_
> Force the route to be associated with the specified network interface

**metric** _N_
> Set the metric (priority) for the route; lower values are preferred

**mss** _M_
> Set the TCP Maximum Segment Size (MSS) in bytes for connections using this route

**window** _W_
> Set the TCP window size in bytes for connections using this route

**irtt** _I_
> Set the initial round-trip time in milliseconds (1–12000) used by TCP for this route

**reject**
> Install a blocking route that causes lookups to fail with "Network unreachable"; useful for preventing traffic to specific destinations

**mod**, **dyn**, **reinstate**
> Diagnostic flags set by routing daemons to mark dynamic or modified routes; not normally used manually

# DESCRIPTION

**route** displays and manipulates the kernel IP routing table. The kernel uses routing tables to determine where to send network packets based on their destination addresses.

Without arguments, **route** displays the current routing table. The **-n** flag shows numeric addresses, avoiding DNS lookups and speeding up display.

Routes can be added for networks (ranges of addresses) or specific hosts. The default route (0.0.0.0/0 for IPv4) handles traffic that doesn't match any more specific route—typically pointing to the internet gateway.

The gateway specified with **gw** must be directly reachable via an existing route before a new route through it can be added. CIDR prefix notation (e.g., **10.0.0.0/8**) is supported for the target, and is equivalent to specifying a target with a **netmask**.

Modern Linux systems prefer **ip route** from the iproute2 package, but **route** remains available for compatibility and is familiar to administrators from older systems.

# OUTPUT COLUMNS

**Destination**: Target network or host address

**Gateway**: Next-hop gateway address; `*` means the destination is directly reachable (no gateway needed)

**Genmask**: Subnet mask for the destination; `255.255.255.255` for host routes, `0.0.0.0` for the default route

**Flags**: Route state flags — **U**=up, **H**=host route, **G**=uses a gateway, **R**=reinstated, **D**=dynamically installed, **M**=modified by routing daemon, **A**=installed by addrconf, **!=**reject route

**Metric**: Distance to the target, typically in hops; lower values are preferred when multiple routes match

**Ref**: Number of references to this route (not used in Linux; always 0)

**Use**: Count of route lookups

**Iface**: Network interface used to send packets on this route

# CAVEATS

Route changes made with **route** are not persistent across reboots. Use network configuration files or a network manager (such as NetworkManager or systemd-networkd) for permanent routes.

The **route** command is deprecated in favor of **ip route** from the iproute2 package, which offers more features and a consistent syntax.

The specified gateway must be reachable before adding a route through it; set up a direct route to the gateway first if necessary.

Modifying routes requires root privileges. Incorrect routing configuration can cause complete loss of network connectivity.

# SEE ALSO

[ip](/man/ip)(8), [ip-route](/man/ip-route)(8), [ifconfig](/man/ifconfig)(8), [netstat](/man/netstat)(8), [traceroute](/man/traceroute)(8)
