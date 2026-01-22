# TLDR

Perform a **dry run** (print what would be done)

```mkinitcpio```

Generate ramdisk environments based on **all existing presets**

```sudo mkinitcpio -P```

Generate a ramdisk environment based on the **linux preset**

```sudo mkinitcpio -p linux```

Generate a ramdisk environment based on the **linux-lts preset**

```sudo mkinitcpio -p linux-lts```

Generate an initramfs image using an **alternative configuration file**

```sudo mkinitcpio -c [path/to/mkinitcpio.conf] -g [path/to/initramfs.img]```

Generate an initramfs image for a **different kernel version**

```sudo mkinitcpio -k [kernel_version] -g [path/to/initramfs.img]```

**List all available hooks**

```mkinitcpio -L```

Display **help for a specific hook**

```mkinitcpio -H [hook_name]```

# SYNOPSIS

**mkinitcpio** [**-p** _preset_] [**-P**] [**-c** _config_] [**-g** _filename_] [**-k** _version_] [**-A** _hooks_] [**-S** _hooks_] [**-L**] [**-H** _hook_] [**-v**]

# PARAMETERS

**-g, --generate _filename_**
> Output CPIO image to specified file

**-U, --uki _filename_**
> Generate unified kernel image for UEFI booting

**-k, --kernel _version_**
> Specify kernel version or path; default is current running kernel

**-c, --config _file_**
> Use custom configuration file; default is /etc/mkinitcpio.conf

**-p, --preset _preset_**
> Build from preset in /etc/mkinitcpio.d/

**-P, --allpresets**
> Process all available presets

**-A, --addhooks _hooks_**
> Add additional hooks (comma-separated)

**-S, --skiphooks _hooks_**
> Skip specified hooks during build

**-L, --listhooks**
> List all available hooks

**-H, --hookhelp _hookname_**
> Display documentation for specified hook

**-d, --generatedir _dir_**
> Set initramfs build location

**-t, --builddir _tmpdir_**
> Use alternate temporary directory for build

**-z, --compress _method_**
> Override compression program (gzip, xz, lz4, zstd)

**-s, --save**
> Retain build directory for debugging

**-v, --verbose**
> Display detailed build information

# DESCRIPTION

**mkinitcpio** creates initial ramdisk environments for booting the Linux kernel. The initramfs loads early in the boot process, providing kernel modules and tools needed to mount the real root filesystem.

The tool uses hooks to modularly include features like encryption support, LVM, RAID, and filesystem drivers. Presets in /etc/mkinitcpio.d/ define standard image generation parameters for installed kernels.

# CAVEATS

Incorrect hook configuration can render a system unbootable. Always keep a working kernel and initramfs as fallback. The tool requires root privileges for most operations. After modifying /etc/mkinitcpio.conf, regenerate images with -P flag.

# HISTORY

**mkinitcpio** was created by the **Arch Linux** development team as a replacement for older initramfs generation tools. It uses a modular hook-based architecture and has been the standard initramfs generator for Arch Linux and derivatives since 2006.

# SEE ALSO

[lsinitcpio](/man/lsinitcpio)(1), [dracut](/man/dracut)(8), [mkinitramfs](/man/mkinitramfs)(8)
