# TAGLINE

main configuration file for NetworkManager

# TLDR

**Basic configuration**

```[main]\nplugins=ifupdown,keyfile```

**Set DNS mode**

```[main]\ndns=dnsmasq```

**Disable MAC randomization**

```[device]\nwifi.scan-rand-mac-address=no```

**Set hostname mode**

```[main]\nhostname-mode=dhcp```

# SYNOPSIS

**/etc/NetworkManager/NetworkManager.conf**

# PARAMETERS

**[main]**
> Main configuration section.

**plugins**
> System settings plugin names (keyfile is always appended).

**dns**
> DNS processing mode (default, dnsmasq, systemd-resolved, dnsconfd, none).

**rc-manager**
> How **/etc/resolv.conf** is written.

**dhcp**
> DHCP client to use (internal, dhcpcd).

**hostname-mode**
> How the transient hostname is managed (default, dhcp, none).

**no-auto-default**
> Devices for which no automatic default connection is created.

**[keyfile]**
> Keyfile plugin-specific settings.

**[ifupdown]**
> Settings for the ifupdown plugin (Debian/Ubuntu).

**managed**
> Whether devices listed in /etc/network/interfaces are managed by NetworkManager (true/false).

**[connection]**
> Default values for connection properties.

**[device]**
> Per-device persistent configuration.

**[logging]**
> Controls logging output.

**level**
> Log verbosity level (OFF, ERR, WARN, INFO, DEBUG, TRACE).

**domains**
> Filter log messages by topic (PLATFORM, WIFI, DHCP4, DNS, VPN, etc.).

**[connectivity]**
> Optional internet connectivity checking.

**uri**
> URL to check for connectivity.

**interval**
> Check frequency in seconds (default: 300). Set to 0 to disable checking.

**[global-dns]**
> System-wide DNS configuration that overrides per-connection settings.

# DESCRIPTION

**NetworkManager.conf** is the main configuration file for NetworkManager. It controls DNS handling, plugins, device management, and various global settings. The file uses an ini-style key file format with sections of key-value pairs.

Additional configuration can be placed in /etc/NetworkManager/conf.d/ as drop-in files, which are read in order with later files overriding earlier ones. If the distribution ships a NetworkManager.conf, prefer drop-ins, since package updates may overwrite changes to it.

# EXAMPLE CONFIG

```ini
[main]
plugins=ifupdown,keyfile
dns=systemd-resolved

[ifupdown]
managed=false

[device]
wifi.scan-rand-mac-address=yes

[connection]
wifi.powersave=2

[logging]
level=WARN
```

# DNS MODES

```
default          - Update resolv.conf directly
dnsmasq          - Run local dnsmasq instance
systemd-resolved - Use systemd-resolved
dnsconfd         - Push DNS configuration to dnsconfd
none             - No DNS management
```

# CAVEATS

Syntax errors may prevent NetworkManager from starting. Use conf.d/ for drop-in files. Apply changes with `nmcli general reload` or `systemctl restart NetworkManager`.

# SEE ALSO

[NetworkManager](/man/NetworkManager)(8), [nmcli](/man/nmcli)(1), [nmtui](/man/nmtui)(1), [nm-settings](/man/nm-settings)(5)

# RESOURCES

```[Source code](https://gitlab.freedesktop.org/NetworkManager/NetworkManager)```

```[Homepage](https://networkmanager.dev/)```

```[Documentation](https://networkmanager.dev/docs/api/latest/NetworkManager.conf.html)```

<!-- verified: 2026-11-09 -->
