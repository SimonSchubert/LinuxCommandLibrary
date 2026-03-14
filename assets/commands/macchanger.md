# TAGLINE

manipulates the MAC address of network interfaces

# TLDR

**Show** current and permanent MAC addresses

```macchanger -s [eth0]```

Set **random** MAC address

```sudo macchanger -r [eth0]```

Set random MAC with **burned-in address** flag

```sudo macchanger -r -b [eth0]```

Set a **specific** MAC address

```sudo macchanger -m [XX:XX:XX:XX:XX:XX] [eth0]```

Set a random MAC from the **same vendor**

```sudo macchanger -a [eth0]```

**Reset** to permanent hardware MAC

```sudo macchanger -p [eth0]```

List known **vendor** MAC prefixes

```macchanger -l```

# SYNOPSIS

**macchanger** [_OPTIONS_] _interface_

# DESCRIPTION

**macchanger** manipulates the MAC address of network interfaces. It can set random addresses, vendor-specific addresses, or restore the original hardware address. Useful for privacy, testing, and network troubleshooting.

# PARAMETERS

**-s, --show**
> Show current and permanent MAC addresses

**-r, --random**
> Set a completely random MAC address

**-b, --bia**
> Pretend to be a burned-in address (vendor bit)

**-m, --mac** _address_
> Set a specific MAC address

**-p, --permanent**
> Reset to the permanent hardware MAC

**-l, --list**
> Print known vendor MAC prefixes

**-a, --another**
> Set random vendor MAC of same kind

**-A**
> Set random vendor MAC of any kind

# CAVEATS

The interface must be down before changing MAC on most systems. Changes are not persistent across reboots. Some networks detect and block MAC address changes.

# HISTORY

**macchanger** was written by **Alvaro Lopez Ortega** and is commonly used for privacy and network testing on Linux systems.

# SEE ALSO

[ip-link](/man/ip-link)(8), [ifconfig](/man/ifconfig)(8)
