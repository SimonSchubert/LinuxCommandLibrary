# TAGLINE

Create multiboot USB drives from ISOs

# TLDR

Show what is **already on a drive** before touching it

```sudo ventoy -l [/dev/sdb]```

**Install** Ventoy onto a USB stick, erasing it

```sudo ventoy -i [/dev/sdb]```

Install using a **GPT** layout instead of MBR

```sudo ventoy -i -g [/dev/sdb]```

Install with **secure boot support disabled**

```sudo ventoy -i -S [/dev/sdb]```

Give the data partition a **custom label**

```sudo ventoy -i -L [MYSTICK] [/dev/sdb]```

Leave **space free at the end** of the disk for another partition

```sudo ventoy -i -r [4096] [/dev/sdb]```

Install **without reformatting**, where the existing layout allows it

```sudo ventoy -i -n [/dev/sdb]```

**Reinstall** over an existing Ventoy installation

```sudo ventoy -I [/dev/sdb]```

**Upgrade** Ventoy in place, keeping the stored ISOs

```sudo ventoy -u [/dev/sdb]```

# SYNOPSIS

**ventoy** [_OPTIONS_] _DEVICE_

# PARAMETERS

**-i**
> Install Ventoy to device

**-I**
> Force install (overwrites existing)

**-u**
> Update existing Ventoy installation

**-l**
> Display Ventoy information

**-g**
> Use GPT partition style instead of MBR

**-S**
> Disable secure boot support

**-L** _LABEL_
> Set custom partition label

**-r** _SIZE_
> Reserve space in MB at end of disk

**-n**
> Try non-destructive installation

# DESCRIPTION

**ventoy** creates bootable USB drives that can boot ISO files directly without extraction. Simply copy ISO images to the USB drive and Ventoy presents a boot menu to select which one to boot.

It supports UEFI and Legacy BIOS, secure boot, persistence, and hundreds of different ISO images.

# CAVEATS

Installation destroys existing data on the drive. Some ISOs may not be compatible. Secure boot requires additional setup on some systems.

# INSTALL

```nix: nix profile install nixpkgs#ventoy```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[dd](/man/dd)(1)
