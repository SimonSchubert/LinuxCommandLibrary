# TAGLINE

Manage Ethernet bridge interfaces

# TLDR

**Show** all bridges

```sudo brctl show```

**Create** a bridge

```sudo brctl addbr [bridge]```

**Delete** a bridge

```sudo brctl delbr [bridge]```

**Add** an interface to a bridge

```sudo brctl addif [bridge] [eth0]```

**Remove** an interface from a bridge

```sudo brctl delif [bridge] [eth0]```

**Enable** Spanning Tree Protocol on a bridge

```sudo brctl stp [bridge] on```

# SYNOPSIS

**brctl** _command_ [_bridge_] [_interface_]

# DESCRIPTION

**brctl** manages Ethernet bridge interfaces on Linux. Bridges connect multiple network segments at Layer 2, allowing them to act as a single network. This is commonly used for virtualization, containers, and network infrastructure.

It is part of the legacy **bridge-utils** package. No new features are added to it; modern setups should use **ip link** and the **bridge** command from iproute2 instead. For example, **brctl addbr br0** is equivalent to **ip link add br0 type bridge**, and **brctl addif br0 eth0** to **ip link set eth0 master br0**.

# PARAMETERS

**show**
> Display information about existing bridges

**addbr** _bridge_
> Create a new bridge

**delbr** _bridge_
> Delete a bridge

**addif** _bridge_ _interface_
> Add an interface to a bridge

**delif** _bridge_ _interface_
> Remove an interface from a bridge

**stp** _bridge_ _on|off_
> Enable/disable Spanning Tree Protocol

**setageing** _bridge_ _time_
> Set MAC address ageing time

**setfd** _bridge_ _time_
> Set forwarding delay

# CAVEATS

brctl is deprecated in favor of the ip and bridge commands from iproute2. Interfaces must be up to participate in bridging. STP should be enabled in complex topologies to prevent loops.

# HISTORY

**brctl** is part of the **bridge-utils** package, being replaced by the iproute2 bridge command.

# SEE ALSO

[bridge](/man/bridge)(8), [ip](/man/ip)(8), [ifconfig](/man/ifconfig)(8), [iptables](/man/iptables)(8)

# RESOURCES

```[Source code](https://kernel.googlesource.com/pub/scm/network/bridge/bridge-utils/)```

```[Documentation](https://www.man7.org/linux/man-pages/man8/brctl.8.html)```

<!-- verified: 2026-06-19 -->
