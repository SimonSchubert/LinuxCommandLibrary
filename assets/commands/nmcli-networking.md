# TAGLINE

controls the overall networking state managed by NetworkManager

# TLDR

Show the **networking status** of NetworkManager

```nmcli networking```

**Enable or disable** networking and all interfaces managed by NetworkManager

```nmcli networking [on|off]```

Show the **last known connectivity** state

```nmcli networking connectivity```

Show the **current connectivity** state (performs a check)

```nmcli networking connectivity check```

# SYNOPSIS

**nmcli networking** [_command_]

# PARAMETERS

**on**
> Enable networking and all NetworkManager-managed interfaces

**off**
> Disable networking and deactivate all connections

**connectivity**
> Show connectivity state without performing a check

**connectivity check**
> Perform a connectivity check and show the result

# DESCRIPTION

**nmcli networking** controls the overall networking state managed by NetworkManager. It provides a master switch to enable or disable all network interfaces at once.

The connectivity states are:
- **full**: Connected with full internet access
- **limited**: Connected to a network but no internet (captive portal, firewall)
- **portal**: Behind a captive portal requiring login
- **none**: No network connection

The **connectivity check** actively probes connectivity by accessing a known URL, while without "check" it reports the cached state from the last probe.

# CAVEATS

Disabling networking affects all NetworkManager-managed connections but not interfaces managed by other tools. The connectivity check depends on network accessibility to connectivity check servers (configurable in NetworkManager.conf). Some networks block these probes.

# SEE ALSO

[nmcli](/man/nmcli)(1), [nmcli-general](/man/nmcli-general)(1), [nmcli-radio](/man/nmcli-radio)(1), [NetworkManager](/man/NetworkManager)(8)
