# TLDR

**List devices**

```rkdeveloptool ld```

**Download boot**

```rkdeveloptool db [loader.bin]```

**Write image**

```rkdeveloptool wl [0] [image.img]```

**Read flash info**

```rkdeveloptool rfi```

**Reboot device**

```rkdeveloptool rd```

**Read partition**

```rkdeveloptool rl [0] [size] [output.img]```

# SYNOPSIS

**rkdeveloptool** _command_ [_options_]

# PARAMETERS

**ld**
> List devices.

**db** _FILE_
> Download boot loader.

**wl** _OFFSET FILE_
> Write image at offset.

**rl** _OFFSET SIZE FILE_
> Read to file.

**rfi**
> Read flash info.

**rd**
> Reboot device.

**ef**
> Erase flash.

# DESCRIPTION

**rkdeveloptool** flashes Rockchip devices. It communicates via USB.

Development tool for SoCs. RK3399, RK3328, etc.

Maskrom mode required. Device in special state.

Boot loader must load first. Then write images.

Linux alternative to rkflashtool. Open source.

# CAVEATS

Root required. Device must be in maskrom. Wrong images can brick.

# HISTORY

**rkdeveloptool** is developed by **Rockchip** for flashing firmware to their ARM SoC devices via USB.

# SEE ALSO

[dd](/man/dd)(1), [fastboot](/man/fastboot)(1)
