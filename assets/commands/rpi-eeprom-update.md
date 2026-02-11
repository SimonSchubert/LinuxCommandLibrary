# TAGLINE

Update Raspberry Pi bootloader EEPROM firmware

# TLDR

Print **current EEPROM** information

```sudo rpi-eeprom-update```

**Update** the EEPROM

```sudo rpi-eeprom-update -a```

**Cancel** pending update

```sudo rpi-eeprom-update -r```

Display **help**

```rpi-eeprom-update -h```

# SYNOPSIS

**rpi-eeprom-update** [_options_]

# PARAMETERS

**-a**
> Apply update if newer version available

**-r**
> Cancel pending update

**-h**
> Display help

# DESCRIPTION

**rpi-eeprom-update** manages the EEPROM firmware on Raspberry Pi 4 and later models. The EEPROM contains boot code that initializes the system before the operating system loads.

Updates improve boot reliability, add features, and fix bugs in the low-level boot firmware.

# CAVEATS

EEPROM updates are applied at next reboot. Interrupted updates may require recovery. Only use official update sources.

# HISTORY

Introduced for **Raspberry Pi 4** which uses EEPROM-based boot instead of the SD card boot used in earlier models.

# SEE ALSO

[rpi-otp-private-key](/man/rpi-otp-private-key)(1), [vcgencmd](/man/vcgencmd)(1)
