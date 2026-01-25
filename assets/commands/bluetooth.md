# TLDR

**Start Bluetooth interactive mode**

```bluetoothctl```

**Power on the Bluetooth adapter**

```bluetoothctl power on```

**Scan for devices**

```bluetoothctl scan on```

**List discovered devices**

```bluetoothctl devices```

**Pair with a device**

```bluetoothctl pair [MAC_address]```

**Connect to a paired device**

```bluetoothctl connect [MAC_address]```

**Trust a device** (auto-connect)

```bluetoothctl trust [MAC_address]```

**Disconnect a device**

```bluetoothctl disconnect [MAC_address]```

**Remove a paired device**

```bluetoothctl remove [MAC_address]```

# SYNOPSIS

**bluetoothctl** [_command_]

# PARAMETERS

**power** _on_|_off_
> Turn Bluetooth adapter on or off.

**scan** _on_|_off_
> Start or stop device discovery.

**devices**
> List discovered devices.

**paired-devices**
> List devices that are paired.

**pair** _MAC_
> Initiate pairing with device.

**trust** _MAC_
> Mark device as trusted (auto-connect).

**untrust** _MAC_
> Remove trusted status from device.

**connect** _MAC_
> Connect to a paired device.

**disconnect** _MAC_
> Disconnect from device.

**remove** _MAC_
> Remove device from known devices.

**info** _MAC_
> Show detailed device information.

**block** / **unblock** _MAC_
> Block or unblock a device.

**discoverable** _on_|_off_
> Make adapter visible to other devices.

**agent** _capability_
> Set agent for pairing (NoInputNoOutput, DisplayOnly, etc.).

# DESCRIPTION

**bluetoothctl** is the command-line interface for managing Bluetooth devices on Linux systems using BlueZ, the official Linux Bluetooth protocol stack. It provides complete control over Bluetooth adapters, device discovery, pairing, and connections.

In interactive mode (run without arguments), bluetoothctl provides a shell with tab completion for exploring commands and devices. Commands can also be executed directly from the shell for scripting.

The tool manages the full device lifecycle: scanning discovers nearby devices, pairing establishes a secure relationship, trusting enables automatic reconnection, and connecting activates the device for use. Multiple adapters are supported via the **select** command.

# CAVEATS

Requires the BlueZ stack and bluetoothd daemon running. Some devices require specific pairing agents or PIN codes. Audio devices need PulseAudio/PipeWire Bluetooth modules configured separately. Not all Bluetooth profiles are supported equally; check device compatibility.

# HISTORY

**BlueZ** is the official Linux Bluetooth protocol stack, originally developed by **Qualcomm** and maintained as an open-source project since the early **2000s**. The **bluetoothctl** utility was introduced in BlueZ 5 (released **2012**) as a replacement for the older hcitool and various other command-line utilities, consolidating Bluetooth management into a single modern interface.

# SEE ALSO

[hciconfig](/man/hciconfig)(1), [rfkill](/man/rfkill)(8), [pulseaudio](/man/pulseaudio)(1)
