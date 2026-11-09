# TAGLINE

automated kernel compilation and installation for Gentoo

# TLDR

Automatically **compile and install** a generic kernel

```sudo genkernel all```

Build and install only **bzImage**, **initramfs**, **kernel**, or **ramdisk**

```sudo genkernel [bzImage|initramfs|kernel|ramdisk]```

Apply changes to the kernel **configuration** before compiling

```sudo genkernel --menuconfig all```

Append a **custom suffix** to the kernel version

```sudo genkernel --kernel-append-localversion=[-custom] all```

Use a kernel source **outside** the default directory

```sudo genkernel --kerneldir=[path/to/directory] all```

# SYNOPSIS

**genkernel** [_options_] _action_

# PARAMETERS

**all**
> Build kernel, modules, and initramfs.

**bzImage**
> Build only the compressed kernel image.

**initramfs**
> Build only the ramdisk/initramfs.

**kernel**
> Build only the kernel and modules.

**ramdisk**
> Same as **initramfs**.

**--menuconfig**
> Run menuconfig before compilation.

**--nconfig**
> Run nconfig (ncurses-based) before compilation.

**--kernel-append-localversion=**_VALUE_
> Append _VALUE_ to the kernel local version, giving a separate kernel image, initramfs, and modules directory.

**--kernel-config=**_FILE_
> Kernel configuration file to use, or **default** to start from genkernel defaults.

**--kerneldir=**_DIR_
> Use kernel source from _DIR_ instead of /usr/src/linux.

**--makeopts=**_OPTS_
> Pass options to make (e.g., -j4).

**--no-clean**
> Skip `make clean` before compilation. Implies **--no-mrproper**.

**--no-mrproper**
> Skip `make mrproper` before compilation, preserving the existing kernel config.

**--no-install**
> Do not install the kernel to /boot after building.

**--lvm**
> Add LVM support to initramfs.

**--luks**
> Add LUKS encryption support to initramfs.

# CONFIGURATION

**/etc/genkernel.conf**
> Main configuration file controlling default build options, paths, and features.

# DESCRIPTION

**genkernel** is a Gentoo Linux utility that automates the kernel compilation and installation process. It builds a generic kernel with broad hardware support, similar to kernels found in binary distributions.

The tool handles configuring, compiling, and installing the kernel along with generating an initramfs (initial ramdisk) required for booting. The kernel is set up similarly to the Gentoo LiveCD kernels, which auto-detect hardware.

genkernel reads configuration from **/etc/genkernel.conf** and supports various filesystem, encryption, and boot features through command-line options.

# CAVEATS

Generic kernels are larger and may boot slower than custom-configured kernels. Compilation requires significant time and disk space. The /usr/src/linux symlink must point to the correct kernel source.

# HISTORY

genkernel was developed for Gentoo Linux to provide an alternative to manual kernel configuration. While Gentoo traditionally emphasizes custom compilation, genkernel enables users to quickly generate working kernels without deep kernel configuration knowledge.

# SEE ALSO

[make](/man/make)(1), [emerge](/man/emerge)(1), [eselect](/man/eselect)(1), [dracut](/man/dracut)(8), [mkinitcpio](/man/mkinitcpio)(8)

# RESOURCES

```[Source code](https://gitweb.gentoo.org/proj/genkernel.git)```

```[Documentation](https://wiki.gentoo.org/wiki/Genkernel)```

<!-- verified: 2026-11-09 -->
