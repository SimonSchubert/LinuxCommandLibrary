# TLDR

**Forward local port 2222 to port 22** on USB-connected iOS device

```iproxy 2222 22```

**Forward port to a specific device** by UDID

```iproxy 2222 22 -u [device_udid]```

**Forward to a network-connected device**

```iproxy 2222 22 -n```

**Create tunnel for SSH** access to iOS device

```iproxy 2222 22 & ssh -p 2222 root@localhost```

**Forward port for debugging** (e.g., lldb debugserver)

```iproxy 1234 1234```

# SYNOPSIS

**iproxy** [_-u UDID_] [_-n_] [_-d_] [_-h_] _LOCAL_PORT_ _DEVICE_PORT_

# PARAMETERS

**-u** _UDID_
> Target device by its unique device identifier

**-n**
> Connect to network device instead of USB

**-d**
> Enable debug logging

**-h**
> Display help information

**-s** _SOURCE_
> Source address to bind to

# DESCRIPTION

**iproxy** creates a TCP proxy that forwards connections from a local port to a port on an iOS device connected via USB or network. It uses the usbmuxd protocol to communicate with iOS devices, bypassing the need for network configuration.

This tool is essential for SSH access to jailbroken iOS devices, remote debugging, and development workflows that require TCP connectivity to iOS. The most common use case is forwarding port 22 for SSH access.

# CAVEATS

Requires **usbmuxd** to be running for USB connections. SSH access requires a jailbroken device with OpenSSH installed. The device must be paired/trusted with the computer. Network mode requires the device to be on the same network.

# HISTORY

**iproxy** is part of the **libusbmuxd** project, which is part of the **libimobiledevice** suite. Libimobiledevice was created around **2009** as a cross-platform library to communicate with iOS devices, providing open-source alternatives to Apple's proprietary protocols.

# SEE ALSO

[usbmuxd](/man/usbmuxd)(8), [idevice_id](/man/idevice_id)(1), [ideviceinfo](/man/ideviceinfo)(1), [ssh](/man/ssh)(1)
