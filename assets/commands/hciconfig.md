# TAGLINE

configures Bluetooth devices

# TLDR

**Show all Bluetooth interfaces**

```hciconfig```

**Show specific interface**

```hciconfig [hci0]```

**Bring interface up**

```sudo hciconfig [hci0] up```

**Bring interface down**

```sudo hciconfig [hci0] down```

**Enable device scanning**

```sudo hciconfig [hci0] piscan```

**Reset interface**

```sudo hciconfig [hci0] reset```

**Show detailed info**

```hciconfig -a```

# SYNOPSIS

**hciconfig** [_options_] [_device_] [_command_]

# DESCRIPTION

**hciconfig** configures Bluetooth devices. It displays and modifies HCI (Host Controller Interface) device settings, similar to ifconfig for network interfaces.

The tool manages Bluetooth adapter state, visibility, and various parameters like name, class, and scan modes.

# PARAMETERS

**-a**
> Show all information.

**up**
> Bring device up.

**down**
> Bring device down.

**reset**
> Reset device.

**piscan**
> Enable page and inquiry scan.

**noscan**
> Disable scanning.

**iscan**
> Enable inquiry scan only.

**pscan**
> Enable page scan only.

**name** _name_
> Set local name.

**class** _class_
> Set device class.

**auth**
> Enable authentication.

**noauth**
> Disable authentication.

# CAVEATS

Deprecated in favor of bluetoothctl. Requires root for configuration. Changes may not persist after reboot. Interface naming may vary.

# HISTORY

**hciconfig** is part of **BlueZ**, the official Linux Bluetooth stack. BlueZ was created by **Maxim Krasnyansky** and **Marcel Holtmann**, and is maintained by the community with Intel contributions. While hciconfig is being phased out, it remains useful for low-level Bluetooth configuration.

# SEE ALSO

[bluetoothctl](/man/bluetoothctl)(1), [hcitool](/man/hcitool)(1), [btmgmt](/man/btmgmt)(1), [rfkill](/man/rfkill)(1)
