# TLDR

**List connected devices**

```fastboot devices```

**Flash partition**

```fastboot flash [boot] [boot.img]```

**Flash all partitions** from factory image

```fastboot flashall```

**Unlock bootloader**

```fastboot oem unlock```

**Reboot device**

```fastboot reboot```

**Reboot to recovery**

```fastboot reboot recovery```

**Erase partition**

```fastboot erase [cache]```

**Boot temporary image**

```fastboot boot [recovery.img]```

# SYNOPSIS

**fastboot** [_options_] _command_ [_args_]

# DESCRIPTION

**fastboot** is an Android tool for flashing firmware and modifying device partitions. It communicates with devices in fastboot/bootloader mode for low-level operations.

The tool enables installing custom ROMs, recovery images, and performing maintenance on Android devices. It's part of the Android SDK platform tools.

# PARAMETERS

**devices**
> List connected devices.

**flash** _partition_ _image_
> Flash image to partition.

**flashall**
> Flash all partitions.

**erase** _partition_
> Erase partition.

**reboot** [_target_]
> Reboot (bootloader, recovery).

**boot** _image_
> Boot temporary image.

**oem** _command_
> OEM-specific commands.

**getvar** _variable_
> Get bootloader variable.

**-s** _serial_
> Target specific device.

**-w**
> Wipe userdata.

# CAVEATS

Device must be in fastboot mode. Wrong images can brick device. Unlocking bootloader may void warranty. USB drivers needed on Windows.

# HISTORY

**fastboot** is part of Android SDK platform tools, developed by **Google**. It emerged with Android's development in the late **2000s** as a standard way to flash devices. The protocol allows manufacturers to customize behavior while maintaining compatibility.

# SEE ALSO

[adb](/man/adb)(1), [heimdall](/man/heimdall)(1), [odin](/man/odin)(1)
