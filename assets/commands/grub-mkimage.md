# TAGLINE

Build a bootable GRUB image

# TLDR

Build an **EFI** image with the modules it needs

```grub-mkimage -O x86_64-efi -p /boot/grub -o [path/to/grub.efi] part_gpt ext2```

Build a **BIOS** core image

```grub-mkimage -O i386-pc -p /boot/grub -o [path/to/core.img] biosdisk part_msdos ext2```

Embed an early **config** file

```grub-mkimage -O x86_64-efi -p /boot/grub -c [path/to/embedded.cfg] -o [path/to/grub.efi] part_gpt ext2```

Take modules from a **directory**

```grub-mkimage -d /usr/lib/grub/x86_64-efi -O x86_64-efi -o [path/to/grub.efi] part_gpt ext2```

Print the **version**

```grub-mkimage --version```

# SYNOPSIS

**grub-mkimage** [_OPTION_]... [_MODULES_]

# PARAMETERS

**-O**, **--format** _FORMAT_
> Image format. Common values are **i386-pc** for BIOS and **x86_64-efi** for 64-bit UEFI. **--help** lists every format this build supports.

**-o**, **--output** _FILE_
> Write the image to FILE. The default is standard output.

**-p**, **--prefix** _DIR_
> GRUB prefix directory stored in the image, usually **/boot/grub**.

**-c**, **--config** _FILE_
> Embed FILE as the early configuration the image runs before it reads the normal config.

**-d**, **--directory** _DIR_
> Read GRUB images and modules from DIR. The default is the platform directory under **/usr/lib/grub**.

**-m**, **--memdisk** _FILE_
> Embed FILE as a memdisk. This implies a prefix inside that memdisk and overrides a prefix given earlier.

**-C**, **--compression** _xz|none|auto_
> Compression for the core image.

**-k**, **--pubkey** _FILE_
> Embed FILE as a public key for signature checking.

**-v**, **--verbose**
> Print verbose messages.

**-?**, **--help**
> Show the full option list and exit.

**-V**, **--version**
> Print the version and exit.

_MODULES_
> GRUB module names to build into the image, such as **part_gpt** and **ext2**. Names are separated by spaces.

# DESCRIPTION

**grub-mkimage** builds a single bootable GRUB 2 image for one platform and writes it to a file or to standard output. The image contains the GRUB kernel plus the modules named on the command line, so it can start from firmware that has no separate module directory yet.

**grub-install** calls this tool when it installs a boot loader. Run it directly to build a custom EFI binary, a PXE image, or a core image for a partition that GRUB's installer does not cover. For an image that also packs every module and extra files such as a config into a memdisk, use **grub-mkstandalone**.

# CAVEATS

The format must match the firmware. An **x86_64-efi** image does not boot on BIOS, and an **i386-pc** image does not boot as a UEFI application. Modules that are not listed are unavailable until GRUB can read its prefix directory from disk. The command does not install the image into firmware; copy it to the EFI system partition or hand it to the boot setup you are building.

# INSTALL

```apt: sudo apt install grub-common```

```pacman: sudo pacman -S grub```

```apk: sudo apk add grub```

<!-- packages: 2026-11-26 -->

# SEE ALSO

[grub-install](/man/grub-install)(8), [grub-mkstandalone](/man/grub-mkstandalone)(1), [grub-mkconfig](/man/grub-mkconfig)(8)

# RESOURCES

```[Source code](https://git.savannah.gnu.org/git/grub.git)```

```[Homepage](https://www.gnu.org/software/grub/)```

```[Documentation](https://www.gnu.org/software/grub/manual/)```

<!-- verified: 2026-11-26 -->
