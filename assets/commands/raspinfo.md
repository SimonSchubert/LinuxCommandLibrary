# TLDR

Display **system information**

```raspinfo```

# SYNOPSIS

**raspinfo**

# DESCRIPTION

**raspinfo** displays comprehensive system information for Raspberry Pi devices. It collects and presents hardware details, OS version, memory usage, CPU information, and other diagnostic data.

The output includes Raspberry Pi model identification, firmware versions, temperature readings, and configuration settings. It's useful for troubleshooting and system documentation.

# OUTPUT

Displays:
- Raspberry Pi model and revision
- OS and kernel version
- CPU and memory information
- Video configuration
- Network interfaces
- USB devices
- Temperature and voltage

# CAVEATS

Raspberry Pi specific tool. Output format designed for support tickets. Some information requires root for full details.

# HISTORY

**raspinfo** is part of the Raspberry Pi utilities package, created by the Raspberry Pi Foundation to help users gather system information for troubleshooting and support purposes.

# SEE ALSO

[raspi-config](/man/raspi-config)(1), [vcgencmd](/man/vcgencmd)(1), [pinout](/man/pinout)(1)
