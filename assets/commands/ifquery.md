# TAGLINE

queries network interface configuration

# TLDR

**Query configuration** for an interface

```ifquery [eth0]```

**List** all configured interfaces

```ifquery --list```

List interfaces that **are currently up** (from state file)

```ifquery --state```

Query configuration for a specific **class** of interfaces (e.g. hotplug)

```ifquery --list --allow [hotplug]```

Check the **running state** of an interface against its configuration

```ifquery --check [eth0]```

# SYNOPSIS

**ifquery** [_options_] _interface_

# PARAMETERS

_INTERFACE_
> Network interface name to query.

**-a**, **--all**
> Query all interfaces marked **auto** in the configuration.

**--list**
> List matching interface names instead of printing their configuration. Combine with **--all** or **--allow** to filter.

**--state**
> Query the state file (**/run/network/ifstate**) for currently active interfaces rather than the configuration file.

**--check**
> Compare running interface state against its configuration and report differences (ifupdown2 only).

**--allow** _CLASS_
> Only match interfaces in the given allow class (e.g. **auto**, **hotplug**).

**-i**, **--interfaces** _FILE_
> Read configuration from _FILE_ instead of **/etc/network/interfaces**.

**--force**
> Force the operation (used with some queries in ifupdown2).

**-V**, **--version**
> Display version information.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**ifquery** queries network interface configuration as defined in **/etc/network/interfaces** and its **interfaces.d/** drop-in directory. It is read-only and never modifies interface state.

When called without **--state**, it parses the configuration file and prints the stanzas matching the given interface(s). With **--state**, it reads **/run/network/ifstate** to show which interfaces are currently marked as up.

On systems using **ifupdown2** (common on newer Debian/Ubuntu), additional features are available including **--check** to compare running state against configuration and JSON output.

# CAVEATS

Debian/Ubuntu specific; part of the **ifupdown** (or **ifupdown2**) package. Only reads configuration and state files; never changes anything. The **--check** flag is only available in ifupdown2. Systems using NetworkManager or systemd-networkd may not use **/etc/network/interfaces** at all.

# SEE ALSO

[ifup](/man/ifup)(8), [ifdown](/man/ifdown)(8)
