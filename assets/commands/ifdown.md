# TAGLINE

brings down network interfaces that were previously configured with ifup

# TLDR

**Disable** a specific interface

```ifdown [eth0]```

**Disable all** enabled interfaces

```ifdown -a```

# SYNOPSIS

**ifdown** [_options_] _interface_

# PARAMETERS

**-a**, **--all**
> Disable all interfaces marked as auto in /etc/network/interfaces

**-v**, **--verbose**
> Print verbose information

**--force**
> Force deconfiguration even if interface is not up

**--no-scripts**
> Don't run any pre/post scripts

# DESCRIPTION

**ifdown** brings down network interfaces that were previously configured with ifup. It reads interface definitions from **/etc/network/interfaces** and executes the appropriate commands and scripts to deconfigure the interface.

The command performs any necessary cleanup including removing IP addresses, stopping DHCP clients, and running user-defined scripts defined in the interfaces file.

# CAVEATS

Part of the ifupdown package, primarily used on Debian-based systems. Modern systems often use NetworkManager or systemd-networkd instead. Interface must have been brought up with ifup for ifdown to work correctly.

# HISTORY

ifdown is part of the ifupdown package, the traditional network interface configuration system on Debian and derivatives. It has been used since the early days of Debian but is gradually being replaced by NetworkManager and systemd-networkd on desktop and server systems respectively.

# SEE ALSO

[ifup](/man/ifup)(8), [ip](/man/ip)(8), [interfaces](/man/interfaces)(5)
