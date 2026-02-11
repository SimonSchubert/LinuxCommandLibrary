# TAGLINE

Interactive wireless network connection dialog

# TLDR

Connect **interactively**

```wifi-menu```

Connect with **obscured** password

```wifi-menu -o```

Display **help**

```wifi-menu -h```

# SYNOPSIS

**wifi-menu** [_OPTIONS_] [_INTERFACE_]

# PARAMETERS

**-o, --obscure**
> Obscure the wireless passphrase

**-h, --help**
> Display help information

# DESCRIPTION

**wifi-menu** provides an interactive text-based interface for connecting to wireless networks. It scans for available networks and allows selection and configuration through a dialog menu.

Part of the netctl package for Arch Linux, it creates and manages netctl profiles for wireless connections.

# CAVEATS

Arch Linux specific (netctl). Requires root privileges. Creates profile files in /etc/netctl/. May conflict with NetworkManager.

# SEE ALSO

[netctl](/man/netctl)(1), [nmcli](/man/nmcli)(1), [iwctl](/man/iwctl)(1)
