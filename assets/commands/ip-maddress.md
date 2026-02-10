# TAGLINE

manages link-layer multicast addresses

# TLDR

**List** all multicast addresses

```ip maddress```

List multicast addresses for a **specific device**

```ip maddress show dev [eth0]```

**Join** a multicast group statically

```sudo ip maddress add [33:33:00:00:00:02] dev [eth0]```

**Leave** a multicast group

```sudo ip maddress delete [33:33:00:00:00:02] dev [eth0]```

Display **help**

```ip maddress help```

# SYNOPSIS

**ip maddress** [_command_] [_options_]

# PARAMETERS

**show** [**dev** _DEVICE_]
> Display multicast addresses (optionally for specific device)

**add** _ADDRESS_ **dev** _DEVICE_
> Join a multicast group on specified device

**delete** _ADDRESS_ **dev** _DEVICE_
> Leave a multicast group on specified device

**help**
> Display help information

# DESCRIPTION

**ip maddress** manages link-layer multicast addresses. It displays which multicast groups a device is subscribed to and allows manual addition or removal of static multicast memberships.

Multicast addresses enable one-to-many communication, where a single packet can be received by multiple hosts that have joined the multicast group. This is commonly used for service discovery, streaming, and cluster communication.

# CAVEATS

Adding and deleting multicast addresses requires root privileges. Changes are not persistent across reboots. Application-level multicast (IGMP) is handled separately.

# HISTORY

The ip maddress command is part of iproute2, the modern replacement for the older net-tools package. iproute2 was developed by Alexey Kuznetsov starting in **1999** to provide a unified interface to Linux networking features.

# SEE ALSO

[ip](/man/ip)(8), [ip-link](/man/ip-link)(8), [ip-address](/man/ip-address)(8)
