# TAGLINE

Build a standalone GRUB image with a memdisk

# TLDR

Build a UEFI image that embeds **grub.cfg**

```grub-mkstandalone -O x86_64-efi -o [path/to/grub.efi] boot/grub/grub.cfg=[path/to/grub.cfg]```

**Pre-load** modules before the config runs

```grub-mkstandalone -O x86_64-efi --modules "part_gpt ext2" -o [path/to/grub.efi] boot/grub/grub.cfg=[path/to/grub.cfg]```

Print **verbose** progress

```grub-mkstandalone -v -O x86_64-efi -o [path/to/grub.efi] boot/grub/grub.cfg=[path/to/grub.cfg]```

Show **help**

```grub-mkstandalone --help```

# SYNOPSIS

**grub-mkstandalone** [_OPTION_]... [_SOURCE_]...

# PARAMETERS

**-O**, **--format** _FORMAT_
> Image format, for example **x86_64-efi** or **i386-pc**. **--help** lists the formats this build supports.

**-o**, **--output** _FILE_
> Write the image to FILE. This option is required.

**-d**, **--directory** _DIR_
> Read GRUB images and modules from DIR. The default is **/usr/lib/grub/** followed by the platform name.

**--modules** _MODULES_
> Pre-load these modules in the core image, before the memdisk is used.

**--install-modules** _MODULES_
> Put only these modules and their dependencies in the memdisk. The default is every module.

**--compress** _no|xz|gz|lzo_
> Compress files stored in the image.

**--fonts** _FONTS_
> Fonts to install. The default is **unicode**.

**--locales** _LOCALES_
> Locales to install. The default is all of them.

**--themes** _THEMES_
> Themes to install. The default is **starfield**.

**-k**, **--pubkey** _FILE_
> Embed FILE as a public key for signature checking.

**-v**, **--verbose**
> Print verbose messages.

**-?**, **--help**
> Show the full option list and exit.

**-V**, **--version**
> Print the version and exit.

_SOURCE_
> A file to place in the memdisk, written as a graft point: the path inside the image, an equals sign, and the file to embed. Example: **boot/grub/grub.cfg=./grub.cfg**.

# DESCRIPTION

**grub-mkstandalone** builds one GRUB 2 image that contains the modules it needs (and any files you graft in) inside a memdisk. The firmware can boot that single file without a separate **/boot/grub** tree. Typical uses are a USB stick, a custom UEFI application, and an image that must carry its own **grub.cfg**.

The tool is a front end to **grub-mkimage**. Output is a format-specific binary such as an EFI application or a BIOS core image. It does not register the image with the firmware.

# CAVEATS

**--output** is mandatory. A graft path is the location inside the memdisk, not a second output file. The format must match the machine that will boot the image. Building from a GRUB install for a different platform requires **--directory** to point at that platform's modules.

# INSTALL

```apt: sudo apt install grub-common```

```pacman: sudo pacman -S grub```

```apk: sudo apk add grub```

<!-- packages: 2026-11-26 -->

# SEE ALSO

[grub-mkimage](/man/grub-mkimage)(1), [grub-install](/man/grub-install)(8), [grub-mkconfig](/man/grub-mkconfig)(8)

# RESOURCES

```[Source code](https://git.savannah.gnu.org/git/grub.git)```

```[Homepage](https://www.gnu.org/software/grub/)```

```[Documentation](https://www.gnu.org/software/grub/manual/)```

<!-- verified: 2026-11-26 -->
