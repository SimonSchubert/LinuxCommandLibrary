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

**tio** is a simple serial terminal emulator. Connects to serial devices with auto-connect on device discovery. Modern alternative to minicom and screen for serial communication.

# CAVEATS

Press **Ctrl+t q** to quit the terminal session.

# SEE ALSO

[minicom](/man/minicom)(1), [screen](/man/screen)(1), [picocom](/man/picocom)(1)

