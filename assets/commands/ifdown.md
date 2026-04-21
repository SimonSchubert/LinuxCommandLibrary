# TAGLINE

Bring down network interfaces previously configured with ifup

# TLDR

**Disable** a specific interface

```ifdown [eth0]```

**Disable all** enabled interfaces

```ifdown -a```

**Show** commands without running them (dry run)

```ifdown -n [eth0]```

**Force** deconfiguration even if interface state says it is down

```ifdown --force [eth0]```

**Verbose** output

```ifdown -v [eth0]```

**Use an alternate** interfaces file

```ifdown -i [/path/to/interfaces] [eth0]```

# SYNOPSIS

**ifdown** [_options_] _interface_

# PARAMETERS

**-a**, **--all**
> Affect all defined interfaces, brought down in the order listed in the state file.

**--allow** _CLASS_
> Only act on interfaces listed in an `allow-CLASS` stanza in /etc/network/interfaces (e.g. `allow-hotplug`).

**-i** _FILE_, **--interfaces**=_FILE_
> Read interface definitions from _FILE_ instead of /etc/network/interfaces.

**--state-dir**=_DIR_
> Keep interface state in _DIR_ instead of /run/network.

**-X** _PATTERN_, **--exclude**=_PATTERN_
> Exclude interfaces matching _PATTERN_.

**-o** _OPTION=VALUE_
> Set _OPTION_ to _VALUE_ as if defined in /etc/network/interfaces.

**-n**, **--no-act**
> Don't configure any interfaces or run up/down commands (dry run).

**-v**, **--verbose**
> Show commands as they are executed.

**-f**, **--force**
> Force deconfiguration even if ifupdown believes the interface is not up.

**--ignore-errors**
> Continue even if a command or script fails.

**--no-mappings**
> Do not run mappings during deconfiguration.

**--no-scripts**
> Don't run any scripts under /etc/network/if-*.d/.

**-V**, **--version**
> Show copyright and version information.

**-h**, **--help**
> Show summary of options.

# DESCRIPTION

**ifdown** brings down network interfaces that were previously configured with ifup. It reads interface definitions from **/etc/network/interfaces** and executes the appropriate commands and scripts to deconfigure the interface.

The command performs any necessary cleanup including removing IP addresses, stopping DHCP clients, and running user-defined scripts defined in the interfaces file.

# CAVEATS

Part of the ifupdown package, primarily used on Debian-based systems. Modern systems often use NetworkManager or systemd-networkd instead. Interface must have been brought up with ifup for ifdown to work correctly.

# HISTORY

ifdown is part of the ifupdown package, the traditional network interface configuration system on Debian and derivatives. It has been used since the early days of Debian but is gradually being replaced by NetworkManager and systemd-networkd on desktop and server systems respectively.

# SEE ALSO

[ifup](/man/ifup)(8), [ip](/man/ip)(8), [interfaces](/man/interfaces)(5)
