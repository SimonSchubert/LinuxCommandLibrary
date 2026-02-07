# TAGLINE

Control Bluetooth devices from the command line

# TLDR

Enter **interactive** shell

```bluetoothctl```

List **devices**

```bluetoothctl devices```

**Power** controller on/off

```bluetoothctl power on```

**Pair** with device

```bluetoothctl pair AA:BB:CC:DD:EE:FF```

**Connect** to device

```bluetoothctl connect AA:BB:CC:DD:EE:FF```

**Disconnect** device

```bluetoothctl disconnect AA:BB:CC:DD:EE:FF```

**Remove** device

```bluetoothctl remove AA:BB:CC:DD:EE:FF```

# SYNOPSIS

**bluetoothctl** [_OPTIONS_] [_COMMAND_]

# DESCRIPTION

**bluetoothctl** manages Bluetooth devices on Linux. It provides an interactive shell for discovering, pairing, connecting, and managing Bluetooth devices.

# PARAMETERS

**devices**
> List known devices

**power** _on|off_
> Turn Bluetooth controller on or off

**scan** _on|off_
> Start or stop device discovery

**pair** _address_
> Pair with device by MAC address

**connect** _address_
> Connect to paired device

**disconnect** _address_
> Disconnect from device

**remove** _address_
> Remove device from known list

**trust** _address_
> Mark device as trusted

**help**
> Show available commands

# CAVEATS

Requires the bluetooth service to be running. Some operations require devices to be in pairing mode. MAC addresses are in format AA:BB:CC:DD:EE:FF.

# HISTORY

**bluetoothctl** is part of **BlueZ**, the official Linux Bluetooth protocol stack.

# SEE ALSO

[hcitool](/man/hcitool)(1), [rfkill](/man/rfkill)(8)
