# TLDR

**Connect** with config file

```sudo vpnc [config_file]```

**Disconnect** VPN

```sudo vpnc-disconnect```

# SYNOPSIS

**vpnc** [_OPTIONS_] [_CONFIG_FILE_]

# PARAMETERS

**--gateway** _HOST_
> VPN gateway address

**--id** _ID_
> IPSec group ID

**--secret** _SECRET_
> IPSec group secret

**--username** _USER_
> Username for authentication

# DESCRIPTION

**vpnc** is a VPN client for Cisco 3000 VPN Concentrator, IOS, and PIX devices. It establishes IPSec connections compatible with Cisco VPN hardware.

Configuration files typically contain gateway address, group ID, group secret, and user credentials.

# CAVEATS

Requires root privileges. Configuration files may contain sensitive credentials. Some features may not work with all Cisco VPN devices.

# SEE ALSO

[openconnect](/man/openconnect)(8), [openvpn](/man/openvpn)(8)
