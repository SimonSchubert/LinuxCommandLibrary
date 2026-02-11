# TLDR

# TAGLINE

Share USB devices over IP networks

# TLDR

List **local** devices

```usbip list -l```

**Bind** device on server

```sudo usbip bind -b [bus_id]```

Load **kernel module** on client

```sudo modprobe vhci-hcd```

**Attach** to remote device

```sudo usbip attach -r [ip_address] -b [bus_id]```

List **attached** devices

```usbip port```

**Detach** from device

```sudo usbip detach -p [port]```

**Unbind** device

```usbip unbind -b [bus_id]```

# SYNOPSIS

**usbip** _COMMAND_ [_OPTIONS_]

# COMMANDS

**list**
> List USB devices

**bind**
> Bind device for remote sharing

**unbind**
> Unbind device from sharing

**attach**
> Attach to remote USB device

**detach**
> Detach from remote device

**port**
> Show attached remote devices

# PARAMETERS

**-l, --local**
> List local devices

**-r, --remote** _IP_
> Remote server address

**-b, --busid** _ID_
> Device bus ID

**-p, --port** _PORT_
> Port number for detach

# DESCRIPTION

**usbip** enables sharing USB devices over IP networks. Devices can be exported from a server and attached to clients as if they were locally connected.

The server runs the usbipd daemon and binds devices for sharing. Clients load the vhci-hcd kernel module and attach to remote devices.

# CAVEATS

Requires kernel modules on both server and client. Network latency affects device performance. Not suitable for high-bandwidth devices. Security depends on network configuration.

# SEE ALSO

[lsusb](/man/lsusb)(8)
