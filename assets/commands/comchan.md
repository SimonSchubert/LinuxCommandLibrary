# TAGLINE

Minimal serial monitor for the terminal

# TLDR

**Connect** to a serial port at 9600 baud

```comchan -p /dev/ttyUSB0 -r 9600```

**Auto-detect** the serial port and connect at 115200 baud

```comchan --auto -r 115200```

**Connect** with real-time plotting enabled

```comchan -p /dev/ttyACM0 -r 9600 --plot```

**Enable** verbose output and logging

```comchan -p /dev/ttyUSB0 -r 9600 -v -l```

**Generate** a default configuration file

```comchan --generate-config```

# SYNOPSIS

**comchan** [_OPTIONS_]

# PARAMETERS

**-p**, **--port** _PORT_
> Specify the serial port (e.g., /dev/ttyUSB0, /dev/ttyACM0, COM3).

**-r**, **--baud** _RATE_
> Set the baud rate (e.g., 9600, 115200).

**--auto**
> Auto-detect the connected serial port.

**-v**, **--verbose**
> Show detailed connection info.

**-l**, **--log**
> Save output to a log file.

**--plot**
> Enable real-time terminal-based graphing of sensor data.

**--generate-config**
> Generate a default configuration file at ~/.config/comchan/comchan.toml.

**--help**
> Display help information.

# DESCRIPTION

**comchan** (Communication Channel) is a fast, minimal serial monitor written in Rust for communicating with serial-connected devices such as Arduino, ESP32, Teensy, and Raspberry Pi from the terminal. It supports reading and writing serial data, auto-detecting connected devices, real-time terminal-based plotting for sensor data with multiple sensor visualization, colorized log output, and cross-platform operation on Linux, macOS, and Windows.

# CONFIGURATION

Configuration stored at **~/.config/comchan/comchan.toml**. Supports **port** (or "auto"), **baud** (default: 9600), **data_bits**, **stop_bits**, **parity** (none/odd/even), **flow_control** (none/software/hardware), **timeout_ms**, **reset_delay_ms**, **verbose**, and **plot**. Command-line flags override config file values.

# CAVEATS

On Linux, users may need appropriate permissions to access serial ports (typically membership in the **dialout** or **uucp** group). The **--plot** feature expects numeric data from the serial device to graph correctly.

# HISTORY

**comchan** was created by **Vaishnav Sabari Girish** and is written in Rust under the MIT license. It is available via cargo, AUR, and Homebrew, and follows the Unix philosophy of doing one thing well.

# SEE ALSO

[minicom](/man/minicom)(1), [picocom](/man/picocom)(1), [screen](/man/screen)(1), [tio](/man/tio)(1), [cu](/man/cu)(1)
