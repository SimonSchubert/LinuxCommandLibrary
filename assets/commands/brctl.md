# TAGLINE

Manage Ethernet bridge interfaces

# TLDR

**Show** all bridges

```sudo brctl show```

**Create** bridge

```sudo brctl add bridge_name```

**Delete** bridge

```sudo brctl del bridge_name```

**Add** interface to bridge

```sudo brctl addif bridge_name eth0```

**Remove** interface

```sudo brctl delif bridge_name eth0```

# SYNOPSIS

**brctl** _command_ [_bridge_] [_interface_]

# DESCRIPTION

**brctl** manages Ethernet bridge interfaces on Linux. Bridges connect multiple network segments at Layer 2, allowing them to act as a single network. This is commonly used for virtualization, containers, and network infrastructure.

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

[bridge](/man/bridge)(8), [ip](/man/ip)(8)
