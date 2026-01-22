# TLDR

**Scan** for Bluetooth devices

```hcitool scan```

Output the **name** of a device by MAC address

```hcitool name [bdaddr]```

Fetch **information** about a remote Bluetooth device

```hcitool info [bdaddr]```

Check the **link quality** to a Bluetooth device

```hcitool lq [bdaddr]```

Modify the **transmit power** level

```hcitool tpl [bdaddr] [0|1]```

Display the **link policy**

```hcitool lp```

Request **authentication** with a specific device

```hcitool auth [bdaddr]```

Display **local devices**

```hcitool dev```

# SYNOPSIS

**hcitool** [_options_] _command_ [_command-parameters_]

# PARAMETERS

**scan**
> Scan for discoverable Bluetooth devices

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

# SEE ALSO

[bluetoothctl](/man/bluetoothctl)(1), [hciconfig](/man/hciconfig)(1), [rfkill](/man/rfkill)(8)
