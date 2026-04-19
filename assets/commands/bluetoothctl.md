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

**-a**, **--agent** _capability_
> Register an agent handler with the specified capability.

**-e**, **--endpoints**
> Register media endpoints.

**-m**, **--monitor**
> Enable monitor output.

**-t**, **--timeout** _seconds_
> Timeout for non-interactive mode.

**-v**, **--version**
> Display version.

**-h**, **--help**
> Display help.

**list**
> List available controllers

**show** [_ctrl_]
> Show controller information

**select** _ctrl_
> Set the default controller

**devices** [_filter_]
> List known devices (filter: Paired, Bonded, Trusted, Connected)

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

**untrust** _address_
> Remove trust from device

**info** _address_
> Show device information

**block** _address_
> Block a device from connecting

**unblock** _address_
> Unblock a previously blocked device

**discoverable** _on|off_
> Set controller discoverability

**agent** _on|off|capability_
> Register or unregister agent

**help**
> Show available commands

# CAVEATS

Requires the bluetooth service to be running. Some operations require devices to be in pairing mode. MAC addresses are in format AA:BB:CC:DD:EE:FF.

# HISTORY

**bluetoothctl** is part of **BlueZ**, the official Linux Bluetooth protocol stack.

# SEE ALSO

[hcitool](/man/hcitool)(1), [rfkill](/man/rfkill)(8)
