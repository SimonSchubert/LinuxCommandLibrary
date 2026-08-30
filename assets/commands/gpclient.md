# TAGLINE

GlobalProtect VPN client for Linux

# TLDR

**Connect** through a GlobalProtect portal

```gpclient connect [vpn.example.com]```

**Disconnect** from the current session

```gpclient disconnect```

Open the **graphical interface**

```gpclient launch-gui```

Generate a **HIP report**, which some portals require before granting access

```gpclient hip```

Work around **legacy TLS renegotiation**, which many portals still need

```gpclient connect --fix-openssl [vpn.example.com]```

Proceed despite **certificate errors**

```gpclient connect --ignore-tls-errors [vpn.example.com]```

Show the **version**

```gpclient --version```

Read the **help for one subcommand**

```gpclient help [connect]```

# SYNOPSIS

**gpclient** _command_ [_options_]

# PARAMETERS

**connect** _URL_
> Connect to GlobalProtect VPN gateway

**disconnect**
> Disconnect from current VPN session

**launch-gui**
> Open graphical interface

**hip**
> Generate a HIP (Host Integrity Protection) report

**--fix-openssl**
> Apply workaround for OpenSSL legacy renegotiation

**--ignore-tls-errors**
> Skip TLS certificate validation

**-g**, **--gateway** _URL_
> Connect directly to this gateway instead of prompting

**--auto-gateway**
> Automatically try gateways in priority order without prompting

**-u**, **--user** _USERNAME_
> Specify username for authentication

**--browser** [_BROWSER_]
> Use external browser for SSO authentication (chrome, firefox, default, or remote)

**--as-gateway**
> Treat the server argument as a gateway instead of a portal

# DESCRIPTION

**gpclient** is a Linux client for Palo Alto Networks GlobalProtect VPN, built on top of OpenConnect. It provides both command-line and graphical interfaces for connecting to corporate VPN gateways that use GlobalProtect.

The client supports SAML authentication, two-factor authentication, and both portal and gateway connections. It is an open-source alternative to the official GlobalProtect client, which has limited Linux support.

# CAVEATS

Requires OpenConnect with GlobalProtect support. Some authentication methods (like hardware tokens) may have limited support. The **--ignore-tls-errors** option should only be used for testing as it bypasses security.

# HISTORY

**gpclient** is part of the **GlobalProtect-openconnect** project, created as an open-source solution for Linux users needing to connect to GlobalProtect VPNs. It leverages OpenConnect's GlobalProtect protocol support (added in OpenConnect 8.0). The project was rewritten from Python/Qt to **Rust** and **Tauri** in its 2.x series.

# INSTALL

```nix: nix profile install nixpkgs#gpclient```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[openconnect](/man/openconnect)(8), [openvpn](/man/openvpn)(8), [nmcli](/man/nmcli)(1)

# RESOURCES

```[Source code](https://github.com/yuezk/GlobalProtect-openconnect)```

<!-- verified: 2026-07-17 -->
