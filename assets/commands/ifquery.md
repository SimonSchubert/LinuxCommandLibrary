# TLDR

**Query interface config**

```ifquery [eth0]```

**List configured interfaces**

```ifquery --list```

**Show all options**

```ifquery --all [eth0]```

**State file query**

```ifquery --state [eth0]```

# SYNOPSIS

**ifquery** [_options_] _interface_

# PARAMETERS

_INTERFACE_
> Network interface.

**--list**
> List interfaces.

**--all**
> Show all details.

**--state**
> Query state file.

**--allow** _CLASS_
> Filter by class.

**--help**
> Display help information.

# DESCRIPTION

**ifquery** queries network interface configuration. It reads /etc/network/interfaces and shows interface settings.

The tool is part of ifupdown package on Debian systems. It helps verify network configuration without changes.

ifquery shows interface configuration.

# CAVEATS

Debian/Ubuntu specific. Part of ifupdown. Reads config only.

# HISTORY

ifquery is part of **ifupdown** for Debian-style network configuration.

# SEE ALSO

[ifup](/man/ifup)(8), [ifdown](/man/ifdown)(8), [interfaces](/man/interfaces)(5)
