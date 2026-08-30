# TAGLINE

bluetooth Host Controller Interface tool for monitoring, configuring

# TLDR

List the **local Bluetooth adapters**

```hcitool dev```

**Discover** nearby devices

```hcitool scan```

Inquire, showing **device class and clock offset** as well

```hcitool inq```

Scan for **Bluetooth Low Energy** devices

```hcitool lescan```

Read the **friendly name** of a remote device

```hcitool name [00:11:22:33:44:55]```

Dump a remote device's **features and firmware version**

```hcitool info [00:11:22:33:44:55]```

Show the adapter's **active connections**

```hcitool con```

Read the **signal strength** of a connection

```hcitool rssi [00:11:22:33:44:55]```

Check the **link quality** of a connection

```hcitool lq [00:11:22:33:44:55]```

Work with a **specific adapter** when more than one is present

```hcitool -i [hci0] scan```

# SYNOPSIS

**hcitool** [_options_] _command_ [_command-parameters_]

# PARAMETERS

**-i** _hciX_
> Use the specified HCI device instead of the first available one.

**scan**
> Scan for discoverable Bluetooth devices

**lescan**
> Scan for Bluetooth Low Energy (BLE) devices

**dev**
> List local Bluetooth adapters

**name** _bdaddr_
> Get remote device name

**info** _bdaddr_
> Get remote device information

**lq** _bdaddr_
> Get link quality

**tpl** _bdaddr_ _type_
> Get/set transmit power level

**lp**
> Display link policy

**auth** _bdaddr_
> Request authentication

**con**
> Display active connections

**cc** _bdaddr_
> Create connection

**dc** _bdaddr_
> Disconnect

# DESCRIPTION

**hcitool** is a Bluetooth Host Controller Interface tool for monitoring, configuring connections, and sending commands to Bluetooth devices. It provides low-level access to Bluetooth functionality for diagnostics and advanced configuration.

The tool can discover nearby devices, query device information, manage connections, and configure link parameters. It operates at the HCI layer, below the higher-level profiles like A2DP or HFP.

# CAVEATS

Deprecated in favor of bluetoothctl in modern BlueZ versions. May require root privileges for some operations. Some features depend on Bluetooth adapter capabilities.

# HISTORY

hcitool is part of the BlueZ Bluetooth protocol stack for Linux. While functional, it's considered legacy and bluetoothctl from BlueZ 5 is recommended for most operations on modern systems.

# INSTALL

```apt: sudo apt install bluez```

```dnf: sudo dnf install bluez```

```pacman: sudo pacman -S bluez```

```apk: sudo apk add bluez-deprecated```

```zypper: sudo zypper install bluez```

```brew: brew install bluez```

```nix: nix profile install nixpkgs#bluez```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[bluetoothctl](/man/bluetoothctl)(1), [hciconfig](/man/hciconfig)(1), [rfkill](/man/rfkill)(8)

# RESOURCES

```[Source code](https://github.com/bluez/bluez/blob/master/tools/hcitool.c)```

<!-- verified: 2026-07-17 -->
