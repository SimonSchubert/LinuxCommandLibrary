# TAGLINE

minimal serial port terminal emulator

# TLDR

**Connect to serial port**

```picocom [/dev/ttyUSB0]```

**Connect with baud rate**

```picocom -b [115200] [/dev/ttyUSB0]```

**Connect with flow control**

```picocom -f h [/dev/ttyUSB0]```

**Connect with parity**

```picocom -p e [/dev/ttyUSB0]```

**Enable local echo**

```picocom -c [/dev/ttyUSB0]```

**Log session to file**

```picocom -g [log.txt] [/dev/ttyUSB0]```

# SYNOPSIS

**picocom** [_options_] _device_

# DESCRIPTION

**picocom** is a minimal serial port terminal emulator. It provides basic communication with serial devices like microcontrollers, routers, and embedded systems.

The tool focuses on simplicity and reliability, useful for debugging and configuring serial devices.

# PARAMETERS

**-b** _baud_
> Baud rate (default 9600).

**-f** _flow_
> Flow control (h=hw, s=sw, n=none).

**-p** _parity_
> Parity (e=even, o=odd, n=none).

**-d** _bits_
> Data bits (5-8).

**-c**
> Local echo.

**-g** _file_
> Log file.

**-q**, **--quiet**
> Quiet mode.

**-r**, **--noreset**
> Don't reset on exit.

**--send-cmd** _cmd_
> Send file command.

**--receive-cmd** _cmd_
> Receive file command.

# ESCAPE COMMANDS

**C-a C-x**: Exit
**C-a C-h**: Help
**C-a C-s**: Send file
**C-a C-r**: Receive file
**C-a C-b**: Change baud

# CAVEATS

Device permissions may need configuration. Hardware flow control needs proper wiring. Exit via escape sequence, not Ctrl+C.

# HISTORY

**picocom** was created by **Nick Patavalis** as a minimal alternative to minicom. It aims to be simple and reliable for basic serial communication without the complexity of full terminal emulators.

# SEE ALSO

[minicom](/man/minicom)(1), [screen](/man/screen)(1), [cu](/man/cu)(1), [microcom](/man/microcom)(1)
