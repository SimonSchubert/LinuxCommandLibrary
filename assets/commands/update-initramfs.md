# TLDR

**Create** a new initramfs for a specific kernel version

```sudo update-initramfs -c -k [kernel_version]```

**Create** initramfs for all installed kernel versions

```sudo update-initramfs -c -k all```

**Update** an existing initramfs

```sudo update-initramfs -u```

**Remove** an existing initramfs

```sudo update-initramfs -d -k [kernel_version]```

# SYNOPSIS

**update-initramfs** [_options_]

# PARAMETERS

**-c**
> Create a new initramfs

**-u**
> Update an existing initramfs

**-d**
> Delete an existing initramfs

**-k _version_**
> Specify kernel version (or "all" for all versions)

**-v**
> Verbose mode

**-b _directory_**
> Set alternate boot directory

# DESCRIPTION

**update-initramfs** manages the initial RAM filesystem (initramfs) images used during Linux boot. The initramfs contains essential drivers and scripts needed to mount the root filesystem.

This tool is typically used after installing new kernel modules, changing boot configuration, or when the initramfs becomes corrupted. It uses **initramfs-tools** on Debian-based systems.

# CAVEATS

Requires root privileges. Be careful when using "all" with the delete option. A corrupted or missing initramfs may prevent the system from booting. Debian/Ubuntu specific; other distributions use **mkinitcpio** or **dracut**.

# SEE ALSO

[mkinitramfs](/man/mkinitramfs)(8), [initramfs-tools](/man/initramfs-tools)(7), [dracut](/man/dracut)(8), [mkinitcpio](/man/mkinitcpio)(8)
