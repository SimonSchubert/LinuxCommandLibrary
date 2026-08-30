# TAGLINE

probe device and filesystem information for GRUB

# TLDR

Name the **filesystem module** GRUB needs for a path

```sudo grub-probe --target fs [/boot]```

Name the **device** that holds a path

```sudo grub-probe --target device [/boot]```

Translate a system device into **GRUB's own drive name**

```sudo grub-probe --device --target drive [/dev/sda1]```

Read the filesystem **UUID**

```sudo grub-probe --target fs_uuid [/boot]```

Read the filesystem **label**

```sudo grub-probe --target fs_label [/boot]```

Report the **partition table type**

```sudo grub-probe --target partmap [/boot]```

Report the **MBR partition type byte**

```sudo grub-probe --device --target msdos_parttype [/dev/sda1]```

Report **abstractions** such as LVM or RAID in the path

```sudo grub-probe --target abstraction [/boot]```

Report the UUID of an **encrypted container**

```sudo grub-probe --target cryptodisk_uuid [/boot]```

Emit the **hint strings** used in generated GRUB config

```sudo grub-probe --target hints_string [/boot]```

Probe through a **custom device map**

```sudo grub-probe --device-map [path/to/device.map] --target drive [/boot]```

Show **what it is doing** while probing

```sudo grub-probe --verbose --target fs [/boot]```

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

# INSTALL

```apt: sudo apt install grub-common```

```pacman: sudo pacman -S grub```

```apk: sudo apk add grub```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[grub-install](/man/grub-install)(8), [grub-mkconfig](/man/grub-mkconfig)(8), [grub-mkdevicemap](/man/grub-mkdevicemap)(8), [blkid](/man/blkid)(8)
