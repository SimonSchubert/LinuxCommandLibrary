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

```picocom -y e [/dev/ttyUSB0]```

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

**-b**, **--baud** _baud_
> Baud rate (default 9600).

**-f**, **--flow** _x|h|n_
> Flow control: x=xon/xoff (software), h=hardware (RTS/CTS), n=none.

**-y**, **--parity** _e|o|n_
> Parity: e=even, o=odd, n=none.

**-d**, **--databits** _5-8_
> Data bits (5, 6, 7, or 8).

**-p**, **--stopbits** _1|2_
> Stop bits (1 or 2).

**-e**, **--escape** _char_
> Escape character (default: a, meaning C-a).

**-c**, **--echo**
> Enable local echo.

**-g**, **--logfile** _file_
> Log serial I/O to file.

**-t**, **--initstring** _str_
> Send initialization string after opening port.

**-i**, **--noinit**
> Skip port initialization on startup.

**-r**, **--noreset**
> Don't reset the port on exit.

**-q**, **--quiet**
> Quiet mode.

**-s**, **--send-cmd** _cmd_
> External program for file sending (default: sz -vv).

**-v**, **--receive-cmd** _cmd_
> External program for file receiving (default: rz -vv).

# ESCAPE COMMANDS

Default escape prefix is **C-a** (Ctrl-A).

**C-a C-x**: Exit (reset port)
**C-a C-q**: Quit (no reset)
**C-a C-h** / **C-a C-k**: Help
**C-a C-s**: Send (upload) file
**C-a C-r**: Receive (download) file
**C-a C-b**: Set baud rate interactively
**C-a C-u** / **C-a C-d**: Increase / decrease baud rate
**C-a C-f**: Cycle flow control modes
**C-a C-y**: Cycle parity modes
**C-a C-i**: Cycle data bits
**C-a C-j**: Cycle stop bits
**C-a C-v**: Show current port settings
**C-a C-c**: Toggle local echo
**C-a C-\\**: Send break

# CAVEATS

Device permissions may need configuration. Hardware flow control needs proper wiring. Exit via escape sequence, not Ctrl+C.

# HISTORY

**picocom** was created by **Nick Patavalis** as a minimal alternative to minicom. It aims to be simple and reliable for basic serial communication without the complexity of full terminal emulators.

# SEE ALSO

[minicom](/man/minicom)(1), [screen](/man/screen)(1), [cu](/man/cu)(1), [microcom](/man/microcom)(1)
