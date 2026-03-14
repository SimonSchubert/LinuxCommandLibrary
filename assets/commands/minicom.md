# TAGLINE

text-based serial port communication program for Unix-like systems

# TLDR

Open **serial port**

```sudo minicom -D /dev/ttyUSB0```

Open with **baud rate**

```sudo minicom -D /dev/ttyUSB0 -b 115200```

Open **configuration** menu

```sudo minicom -D /dev/ttyUSB0 --setup```

**Capture** output to file

```sudo minicom -D /dev/ttyUSB0 -C [path/to/file]```

Display **help**

```minicom --help```

# SYNOPSIS

**minicom** [_options_]

# DESCRIPTION

**minicom** is a text-based serial port communication program for Unix-like systems. It is commonly used to communicate with embedded devices, routers, and other serial-enabled hardware.

# PARAMETERS

**-D, --device DEVICE**
> Serial device to open

**-b, --baudrate BAUD**
> Baud rate (e.g., 9600, 115200)

**-s, --setup**
> Enter configuration menu

**-C, --capturefile FILE**
> Capture output to file

**-o, --noinit**
> Skip modem initialization

**-w, --wrap**
> Enable line wrapping

**-H, --displayhex**
> Display output in hexadecimal

**-S, --script SCRIPT**
> Run script at startup

**-7, --7bit**
> Force 7bit mode

**-8, --8bit**
> Force 8bit mode

**-h, --help**
> Display help information

# KEYBOARD SHORTCUTS

**Ctrl+A X**: Exit minicom
**Ctrl+A Z**: Help menu
**Ctrl+A S**: Send file
**Ctrl+A L**: Log capture toggle
**Ctrl+A O**: Configure minicom
**Ctrl+A W**: Toggle line wrap

# CAVEATS

Requires root or dialout group membership. Configuration stored in /etc/minicom/ or ~/.minirc.*.

# SEE ALSO

[screen](/man/screen)(1), [picocom](/man/picocom)(1), [cu](/man/cu)(1)
