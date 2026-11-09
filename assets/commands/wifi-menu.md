# TAGLINE

Interactive wireless network connection dialog

# TLDR

Connect **interactively**

```wifi-menu```

Connect with **obscured** password

```wifi-menu -o```

Connect using a **specific interface**

```wifi-menu [wlan0]```

Display **help**

```wifi-menu -h```

# SYNOPSIS

**wifi-menu** [_OPTIONS_] [_INTERFACE_]

# PARAMETERS

**-o, --obscure**
> Show asterisks for the characters of the password and store it as a hexadecimal string

**-h, --help**
> Display help information

_INTERFACE_
> Wireless interface to use; can be omitted if only one is available

# DESCRIPTION

**wifi-menu** provides an interactive text-based interface for connecting to wireless networks. It scans for available networks and allows selection and configuration through a dialog menu.

Part of the netctl package for Arch Linux, it creates and manages netctl profiles for wireless connections.

# CAVEATS

Arch Linux specific (netctl). Requires root privileges and the **dialog** and **wpa_supplicant** packages. Creates profile files in /etc/netctl/. May conflict with NetworkManager.

# SEE ALSO

[netctl](/man/netctl)(1), [nmcli](/man/nmcli)(1), [iwctl](/man/iwctl)(1)

# RESOURCES

```[Source code](https://github.com/joukewitteveen/netctl)```

```[Documentation](https://wiki.archlinux.org/title/Netctl)```

<!-- verified: 2026-11-09 -->
