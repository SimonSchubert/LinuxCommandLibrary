# TAGLINE

Flash firmware to Rockchip devices via USB

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

**rkdeveloptool** is a Linux utility for flashing firmware to Rockchip ARM SoC devices (RK3399, RK3328, RK3288, and others) via USB. It communicates with the device's bootrom when the device is placed in maskrom mode, a special recovery state entered by shorting specific pins or holding a button during power-on.

The flashing process typically involves two steps: first loading a boot loader with the **db** command, then writing the system image at the appropriate offset with **wl**. The tool can also read back flash contents, query flash chip information, and erase the entire storage. It serves as an open-source Linux alternative to Rockchip's Windows-based flashing tools.

Root or appropriate USB permissions are required to communicate with the device. The **ld** command verifies that the device is detected and in the correct mode before proceeding with write operations.

# CAVEATS

Root required. Device must be in maskrom. Wrong images can brick.

# HISTORY

**rkdeveloptool** is developed by **Rockchip** for flashing firmware to their ARM SoC devices via USB.

# SEE ALSO

[dd](/man/dd)(1), [fastboot](/man/fastboot)(1)
