# TAGLINE

manages NetworkManager connection profiles

# TLDR

List all **NetworkManager connections**

```nmcli connection```

**Activate** a connection

```nmcli connection up uuid```

**Deactivate** a connection

```nmcli connection down uuid```

Create an **auto-configured** connection

```nmcli connection add ifname eth0 type ethernet ipv4.method auto ipv6.method auto```

Create a **static IPv4** connection

```nmcli connection add ifname eth0 type ethernet ip4 10.0.0.7/8 gw4 10.0.0.1 ipv4.dns 10.0.0.1```

Create a **static IPv6** connection

```nmcli connection add ifname eth0 type ethernet ip6 2001:db8::2/64 gw6 2001:db8::1```

Import a **VPN** connection from file

```nmcli connection import type openvpn file vpn_config.ovpn```

# SYNOPSIS

**nmcli connection** {_show_|_up_|_down_|_add_|_edit_|_modify_|_clone_|_delete_|_monitor_|_reload_|_load_|_migrate_|_import_|_export_} [_ARGUMENTS_]

# DESCRIPTION

**nmcli connection** manages NetworkManager connection profiles. It can list, activate, deactivate, create, modify, and delete network connection configurations including Ethernet, Wi-Fi, VPN, and other connection types.

# COMMANDS

**show [id]**
> List connections or show details of a specific connection

**up id|uuid**
> Activate a connection

**down id|uuid**
> Deactivate a connection

**add**
> Create a new connection profile

**edit [id|uuid]**
> Launch the interactive connection editor

**modify id|uuid**
> Change connection properties. Property values support `+`/`-` prefixes to append or remove list items

**clone id|uuid NEW_NAME**
> Duplicate an existing profile under a new name

**delete id|uuid**
> Remove a connection profile

**monitor [id|uuid]**
> Watch activity changes for all or a specific profile in real time

**reload**
> Reload all connection files from disk

**load filename**
> Load a single connection file on disk into NetworkManager

**migrate**
> Migrate profiles from legacy keyfile/ifcfg locations into the default store

**import type TYPE file FILE**
> Import an external connection (e.g., VPN)

**export id**
> Export a connection profile

# COMMON ADD OPTIONS

**ifname**: Interface name to bind the connection
**type**: Connection type (ethernet, wifi, vpn, bridge, etc.)
**con-name**: Custom connection name
**ip4**: IPv4 address with prefix
**gw4**: IPv4 gateway address
**ip6**: IPv6 address with prefix
**gw6**: IPv6 gateway address
**ipv4.method**: auto, manual, or disabled
**ipv6.method**: auto, manual, or ignore
**ipv4.dns**: DNS server addresses

# COMMON GLOBAL OPTIONS

**--ask**
> Interactively prompt for any required but missing argument. Not suitable for scripts.

**--wait** _seconds_
> Override the default timeout when waiting on an operation such as **up**.

**--active**
> On **show**, list only currently active connections.

**--offline**
> Edit connection files without going through the running NetworkManager daemon.

**--temporary**
> On **modify**, keep the change in memory only — discarded at daemon restart.

# CAVEATS

Connection names with spaces require quoting. Use UUIDs when multiple connections share the same name. Changes made with **modify** take effect on the next activation unless **--temporary** is used.

# HISTORY

Part of the **nmcli** command-line interface for **NetworkManager**. Provides scriptable network configuration management.

# SEE ALSO

[nmcli](/man/nmcli)(1), [nmcli-device](/man/nmcli)(1), [nmtui](/man/nmtui)(1)
