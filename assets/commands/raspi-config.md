# TAGLINE

Raspberry Pi system configuration utility

# TLDR

Start **raspi-config** utility

```sudo raspi-config```

**Enable SSH** non-interactively (0 enables, 1 disables)

```sudo raspi-config nonint do_ssh 0```

**Enable I2C** non-interactively

```sudo raspi-config nonint do_i2c 0```

**Set the hostname** non-interactively

```sudo raspi-config nonint do_hostname [name]```

**Query SSH state** (0 means enabled)

```sudo raspi-config nonint get_ssh```

# SYNOPSIS

**raspi-config**

**raspi-config** **nonint** _function_ [_arguments_]

# DESCRIPTION

**raspi-config** is the official configuration utility for Raspberry Pi running Raspberry Pi OS. It provides an ncurses-based menu interface for common system settings.

Configuration options include network settings, display options, interface enabling (SSH, VNC, SPI, I2C), performance tuning, localization, and system updates. Many settings that would require manual file editing are accessible through this tool.

# MENU CATEGORIES

- **System Options**: wireless LAN, audio, password, hostname, boot, auto login, splash screen, power LED, browser
- **Display Options**: underscan, screen blanking, VNC resolution, composite output
- **Interface Options**: SSH, Raspberry Pi Connect, VNC, SPI, I2C, serial port, 1-Wire, remote GPIO
- **Performance Options**: overclock, overlay file system, fan, USB current
- **Localisation Options**: locale, timezone, keyboard, WLAN country
- **Advanced Options**: expand filesystem, network interface names, network proxy, boot order, bootloader version, Wayland, audio config, PCIe speed

Available entries depend on the Pi model and OS version.

# CONFIGURATION

**/boot/firmware/config.txt**
> Hardware configuration file controlling GPU memory, display settings, overlays, and boot parameters modified by raspi-config.

**/etc/default/locale**
> System locale settings managed through the localization menu.

# CAVEATS

Raspberry Pi specific, not available on other systems. Requires root privileges. Some changes require reboot. The **nonint** functions are internal to the script and may change between releases.

# HISTORY

**raspi-config** began as a project by **Alex Bradbury** and is now maintained as part of Raspberry Pi OS to simplify configuration for users unfamiliar with Linux command-line administration.

# SEE ALSO

[pinout](/man/pinout)(1), [vcgencmd](/man/vcgencmd)(1), [raspi-gpio](/man/raspi-gpio)(1)

# RESOURCES

```[Source code](https://github.com/RPi-Distro/raspi-config)```

```[Documentation](https://www.raspberrypi.com/documentation/computers/configuration.html)```

<!-- verified: 2026-11-08 -->
