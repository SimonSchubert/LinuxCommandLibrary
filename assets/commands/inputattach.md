# TAGLINE

attaches serial line input devices to the Linux input layer

# TLDR

Attach a **Pulse8 CEC** device

```inputattach --pulse8-cec [/dev/ttyACM0]```

Display **help** and list supported devices

```inputattach --help```

# SYNOPSIS

**inputattach** [_options_] _device_

# PARAMETERS

**--pulse8-cec**
> Pulse8 HDMI CEC adapter

**--wacom_iv**
> Wacom tablet (protocol IV)

**--w8001**
> Wacom W8001 tablet

**--touchit213**
> TouchIT 213 touchscreen

**--elo**
> ELO touchscreen

**--mtouch**
> MicroTouch touchscreen

**--daemon**
> Run in background as daemon

**--baud** _RATE_
> Set serial port baud rate

# DESCRIPTION

**inputattach** attaches serial line input devices to the Linux input layer. It allows various input devices connected via serial ports (including USB serial adapters) to be recognized as standard Linux input devices.

Once attached, devices appear in /dev/input/ and work with standard input APIs. This is useful for touchscreens, tablets, and other specialized input devices that communicate via serial protocols.

# CAVEATS

Requires appropriate permissions on the serial device. Device-specific options must match the connected hardware. May need to run as daemon for persistent attachment.

# HISTORY

inputattach has been part of the Linux input utilities for many years, providing support for legacy serial input devices. It remains useful for specialized hardware that uses serial communication protocols.

# SEE ALSO

[evtest](/man/evtest)(1), [libinput](/man/libinput)(1), [udev](/man/udev)(7)
