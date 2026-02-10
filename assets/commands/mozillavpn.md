# TAGLINE

mozilla's VPN client

# TLDR

**Connect to VPN**

```mozillavpn activate```

**Disconnect from VPN**

```mozillavpn deactivate```

**Check connection status**

```mozillavpn status```

**Select server location**

```mozillavpn select [us-ny]```

**List available servers**

```mozillavpn servers```

**Login to account**

```mozillavpn login```

# SYNOPSIS

**mozillavpn** [_command_] [_options_]

# PARAMETERS

_COMMAND_
> Action to perform.

**activate**
> Connect to VPN.

**deactivate**
> Disconnect from VPN.

**status**
> Show connection status.

**select** _SERVER_
> Choose server location.

**servers**
> List available servers.

**--help**
> Display help information.

# DESCRIPTION

**mozillavpn** is Mozilla's VPN client. It provides secure network connection through WireGuard protocol.

The tool encrypts internet traffic. Offers multiple server locations worldwide.

# CAVEATS

Requires subscription. WireGuard kernel module. Limited to 5 devices.

# HISTORY

mozillavpn was launched by **Mozilla** in 2020 as a privacy-focused VPN service using WireGuard technology.

# SEE ALSO

[wg](/man/wg)(1), [wireguard](/man/wireguard)(1), [openvpn](/man/openvpn)(1)

