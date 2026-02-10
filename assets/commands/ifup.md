# TAGLINE

brings up network interfaces configured in **/etc/network/interfaces**

# TLDR

**Enable** a specific interface

```ifup [eth0]```

Enable **all** interfaces marked as auto

```ifup -a```

# SYNOPSIS

**ifup** [_options_] _interface_

# PARAMETERS

**-a**, **--all**
> Bring up all interfaces marked as auto in /etc/network/interfaces

**-v**, **--verbose**
> Print verbose information

**--force**
> Force configuration even if interface seems to be up

**--no-scripts**
> Don't run any pre/post scripts

# DESCRIPTION

**ifup** brings up network interfaces configured in **/etc/network/interfaces**. It reads the interface definition and executes the appropriate commands and scripts to configure the interface, including setting IP addresses, running DHCP clients, and executing user-defined scripts.

The command handles the complete interface initialization sequence, including any dependencies or prerequisites defined in the configuration file.

# CAVEATS

Part of the ifupdown package, primarily used on Debian-based systems. Modern systems often use NetworkManager or systemd-networkd instead. Requires the interface to be defined in /etc/network/interfaces.

# HISTORY

ifup is part of the ifupdown package, the traditional network interface configuration system on Debian and derivatives. While still widely used, it is gradually being replaced by NetworkManager for desktop systems and systemd-networkd for servers.

# SEE ALSO

[ifdown](/man/ifdown)(8), [ip](/man/ip)(8), [interfaces](/man/interfaces)(5)
