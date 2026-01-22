# TLDR

Set up a device to **boot with GRUB**

```grub-bios-setup /dev/sdX```

Install even if **problems are detected**

```grub-bios-setup -f /dev/sdX```

Install GRUB in a **specific directory**

```grub-bios-setup -d /boot/grub /dev/sdX```

# SYNOPSIS

**grub-bios-setup** [_options_] _device_

# PARAMETERS

**-d**, **--directory** _DIR_
> Use GRUB files from _DIR_ instead of default

**-f**, **--force**
> Install even if problems are detected

**-m**, **--device-map** _FILE_
> Use device map from _FILE_

**-s**, **--skip-fs-probe**
> Skip filesystem probing

**-v**, **--verbose**
> Enable verbose output

# DESCRIPTION

**grub-bios-setup** is a low-level tool that writes the GRUB boot code to a disk's Master Boot Record (MBR) or BIOS Boot Partition for BIOS/legacy boot systems.

> **Note**: In most cases, you should use **grub-install** instead, which handles both copying GRUB files and running grub-bios-setup automatically.

This tool is typically used for advanced scenarios like installing GRUB to a different device than where the GRUB files are located, or when grub-install's automatic handling isn't suitable.

# CAVEATS

For BIOS systems only; UEFI systems use different methods. Incorrect use can make a system unbootable. Requires GRUB files to already be in place (use grub-install for normal installations).

# HISTORY

grub-bios-setup is part of GRUB 2, providing the low-level MBR installation that was previously handled by a single grub-install command. The separation allows more flexibility in complex installation scenarios.

# SEE ALSO

[grub-install](/man/grub-install)(8), [grub-mkconfig](/man/grub-mkconfig)(8)
