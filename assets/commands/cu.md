# TLDR

**Open** a serial port

```sudo cu -l [/dev/ttyXYZ]```

Open serial port with **specific baud rate**

```sudo cu -l [/dev/ttyXYZ] -s [115200]```

Open with **half-duplex** mode (local echo)

```sudo cu -l [/dev/ttyXYZ] -s [115200] -h```

Open with **parity** and no flow control

```sudo cu -l [/dev/ttyXYZ] -s [115200] --parity=[even] -f --nostop```

**Exit** the cu session

```<Enter><~><.>```

# SYNOPSIS

**cu** [_options_] [_system_|_phone_|_host_]

# DESCRIPTION

**cu** (Call Up) connects to another system acting as a dial-in terminal. It's commonly used for serial console access to embedded devices, routers, switches, and other hardware.

The escape sequence to disconnect is: press Enter, then ~ (tilde), then . (period).

# PARAMETERS

**-l, --line** _device_
> Serial device to use

**-s, --speed** _baud_
> Baud rate (e.g., 9600, 115200)

**-h, --halfduplex**
> Echo characters locally

**--parity** _type_
> Parity: even, odd, or none

**-f, --nortscts**
> Disable hardware flow control

**--nostop**
> Disable software flow control

# CAVEATS

Usually requires root or membership in dialout/uucp groups. The escape character (~) must be at the start of a line. Part of the UUCP package or GNU coreutils.

# SEE ALSO

[screen](/man/screen)(1), [minicom](/man/minicom)(1), [picocom](/man/picocom)(1)
