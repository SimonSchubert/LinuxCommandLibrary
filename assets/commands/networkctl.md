# TAGLINE

queries and controls the state of network links as seen by systemd-networkd

# TLDR

List all network **links** with status

```networkctl list```

Show overall **network status**

```networkctl status```

**Bring up** network devices

```networkctl up eth0```

**Bring down** network devices

```networkctl down eth0```

**Renew** DHCP leases

```networkctl renew eth0```

**Reload** network configuration files

```networkctl reload```

**Reconfigure** network interfaces

```networkctl reconfigure eth0```

# SYNOPSIS

**networkctl** [_OPTIONS_] _COMMAND_ [_LINK_...]

# DESCRIPTION

**networkctl** queries and controls the state of network links as seen by systemd-networkd. It provides administrative control over network interfaces managed by the systemd networking daemon.

# COMMANDS

**list [PATTERN]**
> Display existing links with status; supports pattern matching

**status [LINK]**
> Show detailed link information including type, state, DNS, and IPs

**lldp [LINK]**
> Display discovered LLDP neighbor information

**label**
> Show numerical address labels for address selection

**delete LINK**
> Remove virtual network devices

**up LINK**
> Activate network devices

**down LINK**
> Deactivate network devices

**renew LINK**
> Refresh dynamic configurations (DHCP addresses)

**forcerenew LINK**
> Trigger DHCP reconfiguration on connected clients

**reconfigure LINK**
> Reapply network interface settings

**reload**
> Reload .netdev and .network configuration files

**edit FILE**
> Modify network configuration files

**cat FILE**
> Display network configuration file contents

# PARAMETERS

**-a, --all**
> Show all links with status

**-s, --stats**
> Include link statistics

**-l, --full**
> Disable output truncation

**-n, --lines=NUM**
> Control journal output lines (default: 10)

**--json=MODE**
> Format output as JSON (short/pretty/off)

**--drop-in=NAME**
> Edit drop-in configuration files

**--no-reload**
> Skip service reload after editing

# CAVEATS

This tool manages interfaces through systemd-networkd, not NetworkManager. Configuration files are stored in /etc/systemd/network/. Changes made with **reload** require **reconfigure** to take effect on running interfaces.

# HISTORY

Part of **systemd**, networkctl was introduced to provide command-line management of systemd-networkd network configuration, offering an alternative to NetworkManager for server and embedded systems.

# SEE ALSO

[systemd-networkd](/man/systemd-networkd.service)(8), [systemd.network](/man/systemd.network)(5), [systemd.netdev](/man/systemd.netdev)(5), [ip](/man/ip)(8)
