# TLDR

**Ping a Bluetooth device**

```l2ping [AA:BB:CC:DD:EE:FF]```

**Send specific number of packets**

```l2ping -c [5] [AA:BB:CC:DD:EE:FF]```

**Set packet size**

```l2ping -s [1024] [AA:BB:CC:DD:EE:FF]```

**Use specific Bluetooth adapter**

```l2ping -i [hci0] [AA:BB:CC:DD:EE:FF]```

**Set timeout**

```l2ping -t [10] [AA:BB:CC:DD:EE:FF]```

# SYNOPSIS

**l2ping** [_options_] _bd_addr_

# PARAMETERS

**-i** _hciX_
> Use specific Bluetooth adapter.

**-c** _count_
> Number of packets to send.

**-s** _size_
> Size of data packets in bytes.

**-t** _timeout_
> Response timeout in seconds.

**-d** _delay_
> Delay between pings in seconds.

**-f**
> Flood ping mode (use with care).

**-r**
> Reverse ping mode.

# DESCRIPTION

**l2ping** sends L2CAP echo requests to a Bluetooth device, similar to ping for IP networks. Measures round-trip time, detects packet loss, and tests Bluetooth connectivity. Part of the BlueZ Bluetooth stack.

# CAVEATS

Requires root privileges. Not all Bluetooth devices respond to L2CAP pings. The Bluetooth adapter must be up and enabled.

# SEE ALSO

[hcitool](/man/hcitool)(1), [bluetoothctl](/man/bluetoothctl)(1)

