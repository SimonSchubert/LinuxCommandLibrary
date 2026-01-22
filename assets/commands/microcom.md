# TLDR

Open a **serial port** using the specified baud rate

```microcom -p [/dev/ttyXYZ] -s [baud_rate]```

Establish a **telnet connection** to the specified host

```microcom -t [hostname]:[port]```

# SYNOPSIS

**microcom** [_options_]

# PARAMETERS

**-p, --port _device_**
> Serial port device to connect to (e.g., /dev/ttyUSB0)

**-s, --speed _baud_**
> Baud rate for serial communication (e.g., 9600, 115200)

**-t, --telnet _host:port_**
> Connect via telnet to the specified host and port

**-c, --can _interface_**
> Connect to a CAN bus interface

**-l, --logfile _file_**
> Log session to a file

# DESCRIPTION

**microcom** is a minimalistic terminal program for accessing remote devices via serial ports, CAN bus, or telnet connections from the console. It provides a simple, lightweight alternative to programs like minicom for basic serial communication needs.

The program passes data between the terminal and the remote device, useful for accessing embedded systems, routers, network equipment, and other devices with serial console interfaces.

Exit microcom by pressing **Ctrl+\\** followed by **q** (or the configured escape sequence).

# CAVEATS

Serial port access typically requires appropriate permissions (membership in the **dialout** group on most Linux systems). The device must be configured for the correct baud rate, parity, and stop bits to match the remote device. No built-in file transfer protocols like XMODEM or ZMODEM.

# SEE ALSO

[minicom](/man/minicom)(1), [screen](/man/screen)(1), [picocom](/man/picocom)(1), [cu](/man/cu)(1)
