# TAGLINE

Configure compatible Tamron lenses over USB on Linux

# TLDR

**List** connected Tamron lenses

```tlc devices```

Show **lens info** for the default device

```tlc info```

Target a lens by **serial number or port**

```tlc --device [SERIAL|/dev/ttyUSB0] info```

**Get** focus ring settings

```tlc ring get```

**Reverse** the focus ring direction

```tlc ring set direction reverse```

**Get** Focus Set Button / Custom Switch assignments

```tlc button get```

**Save** all current settings to a backup file

```tlc settings save [file.tlc]```

**Load** settings from a backup (same lens model only)

```tlc settings load [file.tlc]```

# SYNOPSIS

**tlc** [**-v**|**-vv**] [**--device** _SERIAL_|_PORT_] _command_ [_subcommand_] [_args_]

# DESCRIPTION

**tlc** (Tamron Lens Control) is a Linux-only command-line utility for viewing and changing settings on compatible Tamron lenses connected over USB. It aims to cover the same ground as the official Tamron Lens Utility on platforms where that app is unavailable.

Each invocation connects to the lens, performs one action, and disconnects. Subcommands cover focus ring configuration, button/switch assignments, focus calibration, device listing, lens info, and settings backup/restore. A given lens model may support only a subset of operations; use **tlc** _command_ **--help** for accepted values and model-specific requirements.

The lens must appear as a USB serial device (cp210x). Vendor/product IDs used by compatible hardware include **2cd1:0002** and **2cd1:0005**. If the lens shows up in **lsusb** but not in **tlc devices**, load **cp210x** and bind those IDs (see project README for one-shot and persistent udev rules). Access to the serial node may require **dialout** group membership or **uaccess** udev tags.

This is an independent community project (GPL-3.0-or-later), not affiliated with Tamron Co., Ltd. Firmware updates and online firmware checks are not supported yet.

# PARAMETERS

**devices**
> List connected compatible lenses and their ports/serials.

**info**
> Show information about the selected lens.

**ring** **get** | **set** ...
> Read or change focus ring settings (e.g. direction).

**button** **get** | **set** ...
> Read or change Focus Set Button and Custom Switch assignments.

**focus-calibration** **set** _value_
> Fine-tune autofocus accuracy (model-dependent range).

**settings** **save**|_load_ _file_
> Backup or restore all current settings. Restores only work on the same lens model.

**--device** _SERIAL_|_PORT_
> Select which lens to use when more than one is connected.

**-v**
> Verbose: show each operation sent to the lens.

**-vv**
> More verbose: also print raw transmitted and received bytes in hex.

**--help**
> Show help (also after any subcommand).

# CAVEATS

Linux-only; requires a direct USB connection to a compatible Tamron lens and a working serial port (often **/dev/ttyUSB***). Wrong or partial driver setup is a common failure mode.

Changing lens settings can affect AF behavior; review with **get** before **set**, keep the lens connected until the command finishes, and **settings save** before bulk changes or resets. Use at your own risk — misconfiguration or bugs could leave the lens in a bad state.

Backup files are model-specific and must not be loaded onto a different model.

# SEE ALSO

[gphoto2](/man/gphoto2)(1), [lsusb](/man/lsusb)(1), [exiftool](/man/exiftool)(1)

# RESOURCES

```[Source code](https://github.com/yikerman/tamron-lens-control)```

<!-- verified: 2026-08-08 -->
