# TAGLINE

probe device and filesystem information for GRUB

# TLDR

Get GRUB **filesystem module** for a path

```sudo grub-probe -t fs /boot/grub```

Get the **system device** containing a path

```sudo grub-probe -t device /boot/grub```

Get the **underlying disk** for a system device

```sudo grub-probe -t disk /dev/sdX -d```

Get **filesystem UUID**

```sudo grub-probe -t fs_uuid /boot/grub```

Get **filesystem label**

```sudo grub-probe -t fs_label /boot/grub```

Get **MBR partition type** code

```sudo grub-probe -t msdos_parttype /dev/sdX```

Get the **partition map type**

```sudo grub-probe -t partmap /boot/grub```

Probe using a **custom device map**

```sudo grub-probe -t fs /boot/grub -m [path/to/custom_device.map]```

# SYNOPSIS

**grub-probe** [_options_] **-t** _target_ _path_|_device_

# PARAMETERS

**-t**, **--target** _TARGET_
> Information to probe: fs, fs_uuid, fs_label, device, disk, drive, partmap, partuuid, abstraction, cryptodisk_uuid, msdos_parttype, gpt_parttype, hints_string, zero_check (default: fs)

**-d**, **--device**
> Treat argument as a system device, not a path

**-m**, **--device-map** _FILE_
> Use custom device map file (default: /boot/grub/device.map)

**-0**
> Separate items in output using ASCII NUL characters

**-v**, **--verbose**
> Enable verbose output (pass twice for debug printing)

# DESCRIPTION

**grub-probe** extracts device and filesystem information in GRUB's naming format. It is primarily used internally by GRUB tools but is useful for debugging boot configuration.

Target types include **fs** (filesystem module), **device** (system device path), **disk** (system disk path), **drive** (GRUB drive name like hd0), **fs_uuid** (filesystem UUID), **fs_label** (filesystem label), **partmap** (partition map type), **partuuid** (partition UUID), **abstraction** (abstraction module like lvm), **cryptodisk_uuid**, **msdos_parttype**, **gpt_parttype**, and various boot hint targets.

This tool bridges Linux device names to GRUB's naming conventions, which is essential for generating correct boot configurations.

# CAVEATS

Requires root privileges for most operations. Device mapping can change between boots, especially with removable media. GRUB drive naming may differ from Linux device names.

# HISTORY

grub-probe is part of GRUB 2's toolset, providing the device detection logic used by grub-install and grub-mkconfig. It replaced simpler detection methods used in GRUB Legacy.

# SEE ALSO

[grub-install](/man/grub-install)(8), [grub-mkconfig](/man/grub-mkconfig)(8), [grub-mkdevicemap](/man/grub-mkdevicemap)(8), [blkid](/man/blkid)(8)
