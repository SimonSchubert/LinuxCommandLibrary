# TAGLINE

TUI for managing Wake-on-LAN devices

# TLDR

**Launch the Wake-on-LAN TUI**

```wakey```

# SYNOPSIS

**wakey**

# DESCRIPTION

**wakey** is a terminal user interface for managing and waking devices using Wake-on-LAN. It lets you organize devices into groups, send magic packets to wake machines, and ping devices to check their online/offline status.

Key bindings: **Tab** to switch between devices and groups view, **n** to add a new device or group, **e** to edit, **d** to delete, **Enter** to wake a device or group, **r** to refresh status, arrow keys or vim motions to navigate, and **Ctrl+H** to display all keybindings.

Configuration is stored in **~/.wakey_config.json**, containing device entries (name, MAC address, IP address) and groups.

# CAVEATS

Wake-on-LAN must be enabled on target devices. Requires network access to send magic packets.

# HISTORY

**wakey** was created by **Jonathan Ruiz** (jonathanruiz) and is written in **Go**.

# SEE ALSO

[wakeonlan](/man/wakeonlan)(1), [etherwake](/man/etherwake)(1), [wol](/man/wol)(1)
