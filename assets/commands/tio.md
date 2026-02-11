# TAGLINE

Simple serial device terminal emulator

# TLDR

**Connect to serial device**

```tio [/dev/ttyUSB0]```

**Connect with baud rate**

```tio -b [115200] [/dev/ttyUSB0]```

**Connect with settings**

```tio -b [9600] -d [8] -s [1] -p [none] [/dev/ttyUSB0]```

**Enable local echo**

```tio -e [/dev/ttyUSB0]```

**Log session to file**

```tio -l [session.log] [/dev/ttyUSB0]```

# SYNOPSIS

**tio** [_options_] _device_

# PARAMETERS

**-b** _rate_
> Baud rate (default 115200).

**-d** _bits_
> Data bits (5, 6, 7, 8).

**-s** _bits_
> Stop bits (1, 2).

**-p** _parity_
> Parity (none, odd, even).

**-e**
> Enable local echo.

**-l** _file_
> Log to file.

**-t**
> Enable timestamps.

**-m** _map_
> Map special characters.

# DESCRIPTION

**tio** is a simple serial device terminal emulator designed as a modern, user-friendly alternative to minicom and screen for serial communication. It connects to serial ports with sensible defaults (115200 baud, 8N1) and supports automatic reconnection when a device is plugged in or becomes available.

The tool provides essential serial communication features including configurable baud rates, data bits, stop bits, parity settings, local echo, session logging, and timestamps. The prefix key **Ctrl+t** provides access to in-session commands, with **Ctrl+t q** to quit.

# CAVEATS

Press **Ctrl+t q** to quit the terminal session.

# SEE ALSO

[minicom](/man/minicom)(1), [screen](/man/screen)(1), [picocom](/man/picocom)(1)

