# TLDR

**List** bridges and interfaces

```bridge link```

Show **VLAN** info

```bridge vlan```

**Add** VLAN to port

```sudo bridge vlan add dev lan0 vid 100 pvid untagged```

**Remove** VLAN from port

```sudo bridge vlan delete dev lan0 vid 100```

**Monitor** changes

```bridge monitor```

# SYNOPSIS

**bridge** [_OPTIONS_] _OBJECT_ _COMMAND_

# DESCRIPTION

**bridge** shows and manipulates Linux bridge devices and their forwarding database. It manages bridge ports, VLANs, and FDB entries for Layer 2 switching functionality.

# PARAMETERS

**link**
> List bridge interfaces and ports

**vlan**
> Show or manage VLAN configuration

**fdb**
> Forwarding database management

**mdb**
> Multicast group database management

**monitor**
> Watch for changes in bridge configuration

**add**
> Add VLAN or FDB entry

**delete**
> Remove VLAN or FDB entry

**vid** _vlan-id_
> VLAN identifier (1-4094)

**pvid**
> Set as port VLAN ID

**tagged/untagged**
> VLAN tagging mode

# CAVEATS

VLANs require VLAN filtering to be enabled on the bridge. Changes may disrupt existing connections. Requires root privileges for modifications.

# HISTORY

**bridge** is part of **iproute2**, providing Linux bridge management functionality complementing brctl.

# SEE ALSO

[ip](/man/ip)(8), [brctl](/man/brctl)(8), [tc](/man/tc)(8)
