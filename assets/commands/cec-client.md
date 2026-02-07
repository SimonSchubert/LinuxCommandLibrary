# TAGLINE

HDMI-CEC device control client

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

**cec-client** manages CEC (Consumer Electronics Control) connections over HDMI using the libCEC library. CEC is a feature of the HDMI specification that allows devices connected via HDMI to control each other, enabling actions like turning on a TV when a media player starts, or controlling volume across devices with a single remote.

The tool provides both interactive and scripted control of CEC-enabled devices. In interactive mode, you can send commands like `on`, `standby`, and `tx` (raw CEC frames) to any device on the HDMI bus. For automation, the `-s` flag processes a single command from stdin and exits, making it suitable for use in scripts and home automation setups.

Devices are addressed by logical address (0-15), where 0 is typically the TV, 1 is a recording device, and 5 is an audio system.

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
