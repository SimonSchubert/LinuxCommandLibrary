# TLDR

Create a **bootable ISO** from the current directory

```grub-mkrescue --output [grub.iso] .```

Create an ISO using GRUB files from a **custom directory**

```grub-mkrescue --directory [/usr/lib/grub/i386-pc] --output [grub.iso] [path/to/source]```

Use **compression** for GRUB files when building the image

```grub-mkrescue --compress [xz|gz|lzo|no] --output [grub.iso] [path/to/source]```

**Preload** specific GRUB modules into the image

```grub-mkrescue --modules "[part_gpt iso9660]" --output [grub.iso] [path/to/source]```

Display **help**

```grub-mkrescue --help```

# SYNOPSIS

**grub-mkrescue** [_options_] [_source_]

# PARAMETERS

**--output** _FILE_
> Write the generated image to the specified file

**--directory** _DIR_
> Use GRUB files from the specified directory

**--compress** _TYPE_
> Compress GRUB files using xz, gz, lzo, or disable with no

**--modules** _MODULES_
> Preload specified GRUB modules into the image

**--disable-cli**
> Disable GRUB command-line interface in the generated image

**--version**
> Display version information

# DESCRIPTION

**grub-mkrescue** creates bootable CD, USB, or floppy images using GRUB as the bootloader. It generates hybrid images that can boot from both BIOS and UEFI systems.

The command packages the source directory contents with the necessary GRUB files to create a bootable rescue or installation medium. Additional options can be passed to the underlying xorriso tool using -- separator.

# CAVEATS

Requires xorriso to be installed for ISO creation. The generated images are hybrid by default, suitable for both optical media and USB drives. Some BIOS/UEFI combinations may require specific module preloading.

# HISTORY

grub-mkrescue is part of GRUB 2 (GRand Unified Bootloader), the successor to GNU GRUB Legacy. GRUB 2 development began around **2002** and became the default bootloader in most Linux distributions by 2009.

# SEE ALSO

[grub-install](/man/grub-install)(8), [grub-mkimage](/man/grub-mkimage)(1), [xorriso](/man/xorriso)(1)
