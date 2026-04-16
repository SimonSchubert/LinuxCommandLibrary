# TAGLINE

creates and manages TUN/TAP virtual network interfaces

# TLDR

Show all **TUN/TAP** devices

```ip tuntap```

Create a **TUN** device

```sudo ip tuntap add dev [tun0] mode tun```

Create a **TAP** device

```sudo ip tuntap add dev [tap0] mode tap```

**Delete** a TUN/TAP device

```sudo ip tuntap delete dev [tun0] mode tun```

Create device with specific **owner**

```sudo ip tuntap add dev [tun0] mode tun user [username]```

Create device with **owner and group**

```sudo ip tuntap add dev [tun0] mode tun user [username] group [groupname]```

# SYNOPSIS

**ip tuntap** [_command_] [_options_]

# PARAMETERS

**add** **dev** _NAME_ **mode** _MODE_
> Create a TUN or TAP device.

**delete** **dev** _NAME_ **mode** _MODE_
> Remove a TUN or TAP device.

**show** | **list**
> List existing TUN/TAP devices.

**mode** _tun|tap_
> Device mode: tun (layer 3, IP packets) or tap (layer 2, Ethernet frames).

**user** _USERNAME_
> Set device owner by username or UID.

**group** _GROUPNAME_
> Set device group by name or GID.

**one_queue**
> Use the old single-queue TUN/TAP driver.

**pi**
> Enable packet information (prepend a 4-byte header to each packet).

**vnet_hdr**
> Include a virtio-net header (used with vhost-net).

**multi_queue**
> Create a multi-queue TUN/TAP device.

# DESCRIPTION

**ip tuntap** creates and manages TUN/TAP virtual network interfaces. TUN devices operate at layer 3 (IP packets) while TAP devices operate at layer 2 (Ethernet frames).

These virtual interfaces are commonly used by VPN software, virtualization (QEMU/KVM), and network testing tools. Setting user/group ownership allows non-root processes to use the device.

# CAVEATS

Requires root privileges to create devices. Devices persist until deleted or reboot. Applications using the device must be configured to match the device name. Mode must match between add and delete operations.

# HISTORY

TUN/TAP support has been in the Linux kernel since version 2.4. The ip tuntap command provides a modern interface for managing these devices, replacing older methods using openvpn or tunctl.

# SEE ALSO

[ip](/man/ip)(8), [ip-link](/man/ip-link)(8), [openvpn](/man/openvpn)(8)
