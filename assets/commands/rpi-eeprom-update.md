# TAGLINE

Update Raspberry Pi bootloader EEPROM firmware

# TLDR

Print **current EEPROM** version and update status

```sudo rpi-eeprom-update```

**Apply** update if newer firmware is available

```sudo rpi-eeprom-update -a```

**Cancel** a pending update

```sudo rpi-eeprom-update -r```

**Flash a specific image** with the configuration stored in that image

```sudo rpi-eeprom-update -d -f [./pieeprom.bin]```

Print the path of the **latest available** image

```rpi-eeprom-update -l```

Write update status as **JSON** to a file

```sudo rpi-eeprom-update -j -m [status.json]```

Display **help**

```rpi-eeprom-update -h```

# SYNOPSIS

**rpi-eeprom-update** [_options_]... [_file_]

# PARAMETERS

**-a**
> Automatically install bootloader and USB (VL805) EEPROM updates. The update is installed at next reboot.

**-A** _bootloader_|_vl805_
> Automatically update only the given EEPROM type.

**-b**
> Print the path that pending EEPROM updates will be written to.

**-d**
> Use the default bootloader configuration, or the configuration of the file given with **-f**, instead of keeping the current one.

**-f** _file_
> Install the given bootloader image instead of the latest applicable update.

**-u** _file_
> Install the given VL805 USB EEPROM image.

**-j**
> Write status information in JSON format (requires **-m**).

**-l**
> Print the full path to the latest available EEPROM image.

**-m** _file_
> Write status information to the given file when run without **-a** or **-f**.

**-r**
> Remove temporary update files from the boot partition, cancelling a pending update.

**-s**
> Skip silent automatic upgrades for default releases if the current bootloader is newer than the minimum auto-update version.

**-y**
> Install an older bootloader without confirmation.

**-h**
> Display help.

# DESCRIPTION

**rpi-eeprom-update** manages the bootloader EEPROM firmware on Raspberry Pi 4 and Raspberry Pi 5 family boards. The EEPROM contains the boot code that initializes the system before the operating system loads, including USB boot, network boot, and NVMe boot support.

Firmware images are provided in **/lib/firmware/raspberrypi/bootloader-2711/** (Pi 4 family) and **bootloader-2712/** (Pi 5 family) under the release directories **default** (recommended, proven stable) and **latest** (new features and fixes). The older names **critical** and **stable** map to these directories.

Updates improve boot reliability, add features like new boot modes, and fix bugs in the low-level boot firmware.

# CAVEATS

EEPROM updates are applied at next reboot by recovery.bin on the boot partition. A power failure during the update process may require SD card recovery. Only use official update sources. The release directory is selected by **FIRMWARE_RELEASE_STATUS** in **/etc/default/rpi-eeprom-update**.

# HISTORY

Introduced for **Raspberry Pi 4** (2019) which uses EEPROM-based boot instead of the SD card boot used in earlier models. Extended to support the Raspberry Pi 5 and Compute Module variants.

# SEE ALSO

[raspi-config](/man/raspi-config)(1), [vcgencmd](/man/vcgencmd)(1), [rpi-otp-private-key](/man/rpi-otp-private-key)(1)

# RESOURCES

```[Source code](https://github.com/raspberrypi/rpi-eeprom)```

<!-- verified: 2026-11-09 -->
