# TAGLINE

Cross-platform TUI Bluetooth manager

# TLDR

**Launch the Bluetooth manager**

```bluetuith```

**Connect to a specific adapter**

```bluetuith --adapter [hci0]```

# SYNOPSIS

**bluetuith** [_options_]

# PARAMETERS

**--adapter** _name_
> Specify the Bluetooth adapter to use

**--no-warning**
> Suppress warning messages

**--confirm-on-quit**
> Ask for confirmation before quitting

# DESCRIPTION

**bluetuith** is a terminal user interface for managing Bluetooth devices. It provides device scanning, pairing, connecting, and file transfer via OBEX, all through an interactive TUI. The interface displays nearby devices, paired devices, and adapter properties, making Bluetooth management possible without a graphical desktop environment.

Written in Go, it aims to be a replacement for most Bluetooth managers like blueman. It supports Linux, macOS, and Windows.

# CAVEATS

Currently in the alpha stage. Requires platform-specific Bluetooth support (BlueZ on Linux, native stack on macOS/Windows). Functionality depends on the capabilities of the Bluetooth adapter hardware.

# SEE ALSO

[bluetoothctl](/man/bluetoothctl)(1), [hcitool](/man/hcitool)(1)
