# TAGLINE

Create multiboot USB drives from ISOs

# TLDR

**Install** Ventoy

```sudo ventoy -i [/dev/sdX]```

Install with **GPT** partition

```sudo ventoy -i -g [/dev/sdX]```

Install with **options**

```sudo ventoy -i -g -S -L [LABEL_NAME] [/dev/sdX]```

**Reserve** space at end

```sudo ventoy -i -r [SIZE_MB] [/dev/sdX]```

**Force** install

```sudo ventoy -I [/dev/sdX]```

**Update** Ventoy

```sudo ventoy -u [/dev/sdX]```

Display **info**

```sudo ventoy -l [/dev/sdX]```

**Non-destructive** install

```sudo ventoy -i -n [/dev/sdX]```

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

# SEE ALSO

[dd](/man/dd)(1)
