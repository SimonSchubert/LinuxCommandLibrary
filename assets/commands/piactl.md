# TLDR

**Connect to VPN**

```piactl connect```

**Disconnect VPN**

```piactl disconnect```

**Show connection status**

```piactl get connectionstate```

**Set region**

```piactl set region [us-east]```

**List regions**

```piactl get regions```

**Get current region**

```piactl get region```

**Enable kill switch**

```piactl set killswitch on```

**Show public IP**

```piactl get vpnip```

# SYNOPSIS

**piactl** _command_ [_args_]

# PARAMETERS

**connect**
> Connect to VPN.

**disconnect**
> Disconnect VPN.

**get** _PROPERTY_
> Get setting or status.

**set** _PROPERTY_ _VALUE_
> Set configuration.

**login**
> Authenticate.

**logout**
> Log out.

**reset**
> Reset to defaults.

# PROPERTIES

**connectionstate**
> Connection status.

**region**
> VPN region.

**regions**
> Available regions.

**vpnip**
> VPN IP address.

**publicip**
> Current public IP.

**killswitch**
> Kill switch state.

**protocol**
> VPN protocol.

# DESCRIPTION

**piactl** controls Private Internet Access VPN from the command line. It manages connections and settings.

Connection commands handle VPN state. Quick connect uses last region or auto-selects.

Region selection chooses exit location. List available regions to see options.

Kill switch blocks traffic when disconnected. This prevents IP leaks during connection issues.

Settings configure protocol, port, and features. DNS and split tunneling are configurable.

# CAVEATS

Requires PIA daemon running. Subscription required. Some features need GUI configuration first.

# HISTORY

**piactl** is the command-line interface for **Private Internet Access** VPN service. It provides scriptable control over the PIA client for automation and headless systems.

# SEE ALSO

[openvpn](/man/openvpn)(1), [wg](/man/wg)(1), [nmcli](/man/nmcli)(1)
