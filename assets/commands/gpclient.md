# TAGLINE

GlobalProtect VPN client for Linux

# TLDR

**Connect** to a GlobalProtect VPN using a portal server

```gpclient connect [vpn_gateway_url]```

**Disconnect** from the currently connected VPN server

```gpclient disconnect```

Launch the **graphical user interface** for VPN management

```gpclient launch-gui```

Use **OpenSSL workaround** to bypass legacy renegotiation errors

```gpclient connect --fix-openssl [vpn_gateway_url]```

**Ignore TLS errors** during connection

```gpclient connect --ignore-tls-errors [vpn_gateway_url]```

Display **version**

```gpclient --version```

Display **help** for any command

```gpclient help [command]```

# SYNOPSIS

**gpclient** _command_ [_options_]

# PARAMETERS

**connect** _URL_
> Connect to GlobalProtect VPN gateway

**disconnect**
> Disconnect from current VPN session

**launch-gui**
> Open graphical interface

**--fix-openssl**
> Apply workaround for OpenSSL legacy renegotiation

**--ignore-tls-errors**
> Skip TLS certificate validation

**--gateway** _URL_
> Specify gateway URL directly

**--user** _USERNAME_
> Specify username for authentication

# DESCRIPTION

**gpclient** is a Linux client for Palo Alto Networks GlobalProtect VPN, built on top of OpenConnect. It provides both command-line and graphical interfaces for connecting to corporate VPN gateways that use GlobalProtect.

The client supports SAML authentication, two-factor authentication, and both portal and gateway connections. It is an open-source alternative to the official GlobalProtect client, which has limited Linux support.

# CAVEATS

Requires OpenConnect with GlobalProtect support. Some authentication methods (like hardware tokens) may have limited support. The **--ignore-tls-errors** option should only be used for testing as it bypasses security.

# HISTORY

gpclient (GlobalProtect-openconnect) was created as an open-source solution for Linux users needing to connect to GlobalProtect VPNs. It leverages OpenConnect's GlobalProtect protocol support, which was added in OpenConnect 8.0.

# SEE ALSO

[openconnect](/man/openconnect)(8), [openvpn](/man/openvpn)(8), [nmcli](/man/nmcli)(1)
