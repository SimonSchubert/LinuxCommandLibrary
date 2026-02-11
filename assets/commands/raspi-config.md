# TAGLINE

Raspberry Pi system configuration utility

# TLDR

Start **raspi-config** utility

```sudo raspi-config```

# SYNOPSIS

**raspi-config** [_nonint_options_]

# DESCRIPTION

**raspi-config** is the official configuration utility for Raspberry Pi running Raspberry Pi OS. It provides an ncurses-based menu interface for common system settings.

Configuration options include network settings, display options, interface enabling (SSH, VNC, SPI, I2C), performance tuning, localization, and system updates. Many settings that would require manual file editing are accessible through this tool.

# MENU CATEGORIES

- **System Options**: hostname, password, boot behavior, network boot
- **Display Options**: resolution, overscan, pixel doubling
- **Interface Options**: SSH, VNC, SPI, I2C, Serial, 1-Wire, GPIO remote
- **Performance Options**: GPU memory, fan control, overlay filesystem
- **Localization Options**: locale, timezone, keyboard, WLAN country
- **Advanced Options**: expand filesystem, network proxy, boot order

# CONFIGURATION

**/boot/firmware/config.txt**
> Hardware configuration file controlling GPU memory, display settings, overlays, and boot parameters modified by raspi-config.

**/etc/default/locale**
> System locale settings managed through the localization menu.

# CAVEATS

Raspberry Pi specific, not available on other systems. Requires root privileges. Some changes require reboot. Non-interactive mode available for scripting.

# HISTORY

**raspi-config** was developed by the Raspberry Pi Foundation as part of Raspberry Pi OS to simplify configuration for users unfamiliar with Linux command-line administration.

# SEE ALSO

[pinout](/man/pinout)(1), [vcgencmd](/man/vcgencmd)(1), [raspi-gpio](/man/raspi-gpio)(1)
