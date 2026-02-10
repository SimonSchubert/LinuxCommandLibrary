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
> Connection plugins to use.

**dns**
> DNS processing mode.

**[connection]**
> Default connection settings.

**[device]**
> Device-specific settings.

**[logging]**
> Logging configuration.

# DESCRIPTION

**NetworkManager.conf** is the main configuration file for NetworkManager. It controls DNS handling, plugins, device management, and various global settings.

Additional configuration can be placed in /etc/NetworkManager/conf.d/.

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
default      - Use resolv.conf
dnsmasq      - Local dnsmasq
systemd-resolved - Use resolved
none         - No DNS management
```

# CAVEATS

Syntax errors may prevent NM from starting. Use conf.d/ for drop-in files. Restart NM after changes.

# SEE ALSO

[NetworkManager](/man/NetworkManager)(8), [nmcli](/man/nmcli)(1), [nm-settings](/man/nm-settings)(5)
