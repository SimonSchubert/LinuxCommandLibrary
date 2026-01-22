# TLDR

**List** devices

```rfkill```

Filter **columns**

```rfkill -o ID,TYPE,DEVICE```

**Block** device type

```rfkill block wifi```

**Unblock** device type

```rfkill unblock bluetooth```

Output **JSON**

```rfkill -J```

# SYNOPSIS

**rfkill** [_OPTIONS_] [_command_] [_identifier_]

# DESCRIPTION

**rfkill** enables and disables wireless communication devices (WiFi, Bluetooth, GPS, NFC, etc.) through the kernel's rfkill subsystem. It can soft-block devices in software while respecting hardware kill switches.

# PARAMETERS

**list**
> List all devices (default action)

**block** _type|id_
> Disable specified device type or ID

**unblock** _type|id_
> Enable specified device type or ID

**toggle** _type|id_
> Toggle the state of device

**-o, --output** _columns_
> Specify output columns

**-J, --json**
> Output in JSON format

**-n, --noheadings**
> Don't print column headers

# CAVEATS

Hardware kill switches cannot be overridden by software. Blocking may affect multiple devices if they share the same rfkill switch. Some devices may require reboot to fully reset.

# HISTORY

**rfkill** is part of **util-linux**, providing control over the kernel's rfkill subsystem for wireless devices.

# SEE ALSO

[iw](/man/iw)(8), [bluetoothctl](/man/bluetoothctl)(1)
