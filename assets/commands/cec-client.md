# TLDR

**List** all CEC adapters

```cec-client -l```

Start an **interactive** CEC session

```sudo cec-client```

Set the **On-Screen Display** name

```sudo cec-client -o [name]```

**Send a single command**

```echo [on 0] | sudo cec-client -s```

Set a device to **standby** (interactive mode)

```standby [0]```

**Turn on** a device (interactive mode)

```on [0]```

# SYNOPSIS

**cec-client** [_options_]

# DESCRIPTION

**cec-client** manages CEC (Consumer Electronics Control) connections over HDMI. CEC allows devices connected via HDMI to control each other, enabling features like turning on a TV when a media player starts.

The tool provides both interactive and scripted control of CEC-enabled devices.

# PARAMETERS

**-l, --list-devices**
> List available CEC adapters

**-o, --osd-name** _name_
> Set the On-Screen Display name

**-s, --single-command**
> Execute a single command from stdin and exit

**-d** _device_
> Use specific CEC device

# INTERACTIVE COMMANDS

**on** _address_
> Turn on device at address

**standby** _address_
> Put device into standby

**tx** _bytes_
> Transmit raw CEC frame

**scan**
> Scan the CEC bus for devices

# CAVEATS

Requires a USB CEC adapter (like Pulse-Eight). Device addresses are 0-15 where 0 is typically the TV. Root privileges required for device access.

# SEE ALSO

[cec-ctl](/man/cec-ctl)(1)
