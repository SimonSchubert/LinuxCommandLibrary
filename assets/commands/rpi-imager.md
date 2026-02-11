# TAGLINE

Write OS images to SD cards for Raspberry Pi

# TLDR

**Start Raspberry Pi Imager**

```rpi-imager```

**Write image to device**

```rpi-imager --cli [image.img] [/dev/sdX]```

**Enable SSH during imaging**

```rpi-imager --cli --enable-ssh [image.img] [/dev/sdX]```

**Set hostname**

```rpi-imager --cli --hostname [mypi] [image.img] [/dev/sdX]```

**Configure WiFi**

```rpi-imager --cli --wifi-ssid [network] --wifi-password [pass] [image.img] [/dev/sdX]```

# SYNOPSIS

**rpi-imager** [_--cli_] [_options_] [_image_] [_device_]

# PARAMETERS

**--cli**
> Command-line mode.

**--enable-ssh**
> Enable SSH.

**--hostname** _NAME_
> Set hostname.

**--wifi-ssid** _SSID_
> WiFi network.

**--wifi-password** _PASS_
> WiFi password.

**--first-run-script** _FILE_
> Custom setup script.

**--locale** _LOCALE_
> System locale.

**--timezone** _TZ_
> Timezone.

# DESCRIPTION

**rpi-imager** is the official Raspberry Pi Foundation tool for writing operating system images to SD cards and USB drives. It offers both a graphical interface for interactive use and a **--cli** mode for scripted, headless image writing.

A key feature is pre-boot configuration: options like **--enable-ssh**, **--hostname**, **--wifi-ssid**, and **--wifi-password** inject settings into the image before first boot, enabling headless Raspberry Pi setup without ever connecting a monitor or keyboard. Additional customization includes locale, timezone, and first-run scripts for automated provisioning.

The tool downloads and caches official Raspberry Pi OS images along with third-party operating systems, and verifies write integrity by comparing checksums after writing to detect SD card corruption.

# CAVEATS

Requires root/admin for device access. Wrong device selection destroys data. Verify target carefully.

# HISTORY

**rpi-imager** was released by the **Raspberry Pi Foundation** in **2020** to replace third-party imaging tools. It simplifies SD card preparation with built-in customization.

# SEE ALSO

[dd](/man/dd)(1), [balena-etcher](/man/balena-etcher)(1), [gnome-disks](/man/gnome-disks)(1)
