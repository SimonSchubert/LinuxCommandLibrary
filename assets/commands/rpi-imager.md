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

**rpi-imager** writes operating system images to SD cards for Raspberry Pi. It's the official imaging tool from the Raspberry Pi Foundation.

GUI mode provides easy image selection. Official and custom images can be written.

Pre-configuration sets up headless operation. SSH, WiFi, and hostname configured before first boot.

Image verification ensures write integrity. Corruption is detected before use.

Advanced options configure locale and keyboard. First-run customization available.

# CAVEATS

Requires root/admin for device access. Wrong device selection destroys data. Verify target carefully.

# HISTORY

**rpi-imager** was released by the **Raspberry Pi Foundation** in **2020** to replace third-party imaging tools. It simplifies SD card preparation with built-in customization.

# SEE ALSO

[dd](/man/dd)(1), [balena-etcher](/man/balena-etcher)(1), [gnome-disks](/man/gnome-disks)(1)
