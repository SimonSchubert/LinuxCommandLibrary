# TAGLINE

Interactive TUI wrapper for arduino-cli

# TLDR

**Launch the interactive interface**

```aci```

# SYNOPSIS

**aci**

# DESCRIPTION

**arduino-cli-interactive** (invoked as **aci**) is a Bash-based terminal user interface that wraps the official arduino-cli tool with interactive menus. Instead of memorizing board FQBNs and command-line arguments, users can select boards, ports, and operations from scrollable menus powered by Charm's gum library.

The tool supports board management and selection, sketch creation/editing/compiling/uploading, library management, core installation for ESP8266/ESP32 and third-party boards, a built-in serial monitor, and beginner example code.

# CAVEATS

Requires **arduino-cli** and **gum** to be installed. Initial setup requires installing the Arduino AVR core. Written as a Bash shell script so it primarily targets Linux and macOS.

# HISTORY

**arduino-cli-interactive** was created by **Vaishnav-Sabari-Girish**, an ECE student in India, out of frustration with the Arduino IDE on Linux. Licensed under Apache 2.0 and first released in December 2024.

# SEE ALSO

[arduino-cli](/man/arduino-cli)(1), [screen](/man/screen)(1), [minicom](/man/minicom)(1)
