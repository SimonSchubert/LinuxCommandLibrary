# TAGLINE

manages Raspberry Pi Pico and RP2040 devices

# TLDR

**Show device info**

```picotool info```

**Load binary**

```picotool load [firmware.uf2]```

**Save flash contents**

```picotool save -a [backup.bin]```

**Verify binary**

```picotool verify [firmware.uf2]```

**Reboot device**

```picotool reboot```

**Show binary info**

```picotool info [firmware.elf]```

**Erase flash**

```picotool load --erase```

# SYNOPSIS

**picotool** _command_ [_options_] [_file_]

# PARAMETERS

**info**
> Show device/file info.

**load**
> Load binary to device.

**save**
> Save from device.

**verify**
> Verify device contents.

**reboot**
> Reboot device.

**version**
> Show version.

**-a**, **--all**
> All flash contents.

**-x**, **--execute**
> Execute after load.

**-f**, **--force**
> Force operation.

# DESCRIPTION

**picotool** manages Raspberry Pi Pico and RP2040 devices. It loads firmware, reads device info, and controls boot mode.

Device info shows chip details and running program. Binary info displays embedded metadata.

Loading writes firmware to flash. UF2 and ELF formats are supported.

Save extracts flash contents for backup. The entire flash or specific regions can be dumped.

Verification compares device contents to a file. Useful for confirming successful programming.

# CAVEATS

Device must be in BOOTSEL mode for many operations. USB connection required. Some operations erase existing firmware.

# HISTORY

**picotool** was created by **Raspberry Pi** for their RP2040 microcontroller. Released with the Pico in **2021**, it provides official tooling for device management.

# SEE ALSO

[openocd](/man/openocd)(1), [gdb](/man/gdb)(1), [stlink](/man/stlink)(1)
