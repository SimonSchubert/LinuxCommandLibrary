# TAGLINE

Update Raspberry Pi bootloader EEPROM firmware

# TLDR

Print **current EEPROM** version and update status

```sudo rpi-eeprom-update```

**Apply** update if newer firmware is available

```sudo rpi-eeprom-update -a```

**Cancel** a pending update

```sudo rpi-eeprom-update -r```

Update using a specific **firmware directory**

```sudo rpi-eeprom-update -d [/lib/firmware/raspberrypi/bootloader/stable]```

Display **help**

```rpi-eeprom-update -h```

# SYNOPSIS

**rpi-eeprom-update** [_options_]

# PARAMETERS

**-a**
> Apply update if newer version is available. The update is installed at next reboot.

**-d** _directory_
> Use the specified firmware image directory instead of the default.

**-j** _file_
> Write output in JSON format to file (use /dev/stdout for stdout).

**-l**
> Display the update status without checking for newer firmware.

**-m**
> Display information about the recovery.bin bootloader update file.

**-r**
> Cancel a pending update and revert to the current EEPROM contents.

**-h**
> Display help.

# DESCRIPTION

**rpi-eeprom-update** manages the bootloader EEPROM firmware on Raspberry Pi 4, 400, Compute Module 4, and Pi 5 models. The EEPROM contains the boot code that initializes the system before the operating system loads, including USB boot, network boot, and NVMe boot support.

Firmware images are provided in **/lib/firmware/raspberrypi/bootloader/** under release channels: **critical** (rarely updated, highest stability), **stable** (default, recommended), **beta** (new features, less tested), and **latest** (most recent).

Updates improve boot reliability, add features like new boot modes, and fix bugs in the low-level boot firmware.

# CAVEATS

EEPROM updates are applied at next reboot. A power failure during the update process may require SD card recovery using recovery.bin. Only use official update sources. The update channel can be changed by editing **/etc/default/rpi-eeprom-update**.

# HISTORY

Introduced for **Raspberry Pi 4** (2019) which uses EEPROM-based boot instead of the SD card boot used in earlier models. Extended to support the Raspberry Pi 5 and Compute Module variants.

# SEE ALSO

[raspi-config](/man/raspi-config)(1), [vcgencmd](/man/vcgencmd)(1), [rpi-otp-private-key](/man/rpi-otp-private-key)(1)
