# TAGLINE

locate a MEMDISK instance in memory

# TLDR

**Find MEMDISK and print parameters** for phram

```memdiskfind```

**Load MEMDISK image via phram**

```modprobe phram phram=memdisk,$(memdiskfind)```

**Expose MEMDISK image as a block device**

```modprobe mtdblock```

# SYNOPSIS

**memdiskfind**

# DESCRIPTION

**memdiskfind** searches physical memory for a MEMDISK instance (a disk image loaded by SYSLINUX's MEMDISK boot loader) and, if found, prints the address and length of the image in a format understood by the Linux **phram** (physical-memory-as-MTD) driver.

Typical usage is inside an initramfs: once memdiskfind locates the image, phram exposes it as an MTD device and mtdblock turns that into a /dev/mtdblock0 block device that can be mounted (for example, an ISO image booted via MEMDISK).

memdiskfind is part of the syslinux-utils package. It can also be compiled with klibc to produce a smaller static binary suitable for initramfs images.

# OUTPUT

The output is a single line of the form _address,size_ (both in hex, with 0x prefix) suitable for passing directly to `modprobe phram`.

# CAVEATS

Requires that the system was booted via MEMDISK. Must typically run as root to read /proc/iomem or scan physical memory. Intended for use before the root filesystem is mounted, i.e. from an initramfs.

# HISTORY

**memdiskfind** is part of the **SYSLINUX** project's utilities, created by H. Peter Anvin and contributors to aid booting of ISO/floppy images loaded into memory by MEMDISK.

# SEE ALSO

[syslinux](/man/syslinux)(1), [modprobe](/man/modprobe)(8), [losetup](/man/losetup)(8)
