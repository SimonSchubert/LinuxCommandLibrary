# TAGLINE

Manage initial RAM filesystem images

# TLDR

**Create** a new initramfs for a specific kernel version

```sudo update-initramfs -c -k [kernel_version]```

**Create** initramfs for all installed kernel versions

```sudo update-initramfs -c -k all```

**Update** an existing initramfs for the newest kernel

```sudo update-initramfs -u```

**Update** the initramfs of all kernels that have one

```sudo update-initramfs -u -k all```

**Remove** an existing initramfs

```sudo update-initramfs -d -k [kernel_version]```

# SYNOPSIS

**update-initramfs** {**-c**|**-d**|**-u**} [**-k** _version_] [**-v**] [**-b** _directory_] [**-s** _timestamp_]

# PARAMETERS

**-c**
> Create a new initramfs

**-u**
> Update an existing initramfs

**-d**
> Delete an existing initramfs

**-k** _version_
> Kernel version. Optional for **-u** and **-d** (default: latest), required for **-c**. Use "all" for all installed kernels (with **-c**) or all kernels that already have an initramfs (with **-d** or **-u**).

**-v**
> Verbose mode

**-b** _directory_
> Set alternate boot directory

**-s** _timestamp_
> With **-u**, only update an initramfs that is not newer than this Unix timestamp

**-h, --help**
> Print help and exit.

**--version**
> Print version of the underlying initrd generation tool.

# DESCRIPTION

**update-initramfs** manages the initial RAM filesystem (initramfs) images used during Linux boot. The initramfs contains essential drivers and scripts needed to mount the root filesystem.

This tool is typically used after installing new kernel modules, changing boot configuration, or when the initramfs becomes corrupted. It is part of **initramfs-tools** on Debian-based systems and builds images with **mkinitramfs**. Settings are read from **/etc/initramfs-tools/update-initramfs.conf**.

# CAVEATS

Requires root privileges. Be careful when using "all" with the delete option. A corrupted or missing initramfs may prevent the system from booting. Debian/Ubuntu specific; other distributions use **mkinitcpio** or **dracut**. The former **-t** (takeover) option is still accepted but ignored.

# SEE ALSO

[mkinitramfs](/man/mkinitramfs)(8), [initramfs-tools](/man/initramfs-tools)(7), [dracut](/man/dracut)(8), [mkinitcpio](/man/mkinitcpio)(8)

# RESOURCES

```[Source code](https://salsa.debian.org/kernel-team/initramfs-tools)```

```[Documentation](https://manpages.debian.org/unstable/initramfs-tools/update-initramfs.8.en.html)```

<!-- verified: 2026-11-09 -->
