# TLDR

**Update initramfs for current kernel**

```sudo update-initramfs -u```

**Create new initramfs**

```sudo update-initramfs -c -k [$(uname -r)]```

**Update all initramfs images**

```sudo update-initramfs -u -k all```

**Delete initramfs for kernel**

```sudo update-initramfs -d -k [5.10.0-1]```

**Show verbose output**

```sudo update-initramfs -u -v```

# SYNOPSIS

**update-initramfs** [_options_]

# PARAMETERS

**-c**
> Create new initramfs.

**-u**
> Update existing initramfs.

**-d**
> Delete initramfs.

**-k** _version_
> Kernel version (or "all").

**-v**
> Verbose output.

**-b** _directory_
> Set boot directory.

# CONFIGURATION

```
/etc/initramfs-tools/initramfs.conf    Main config
/etc/initramfs-tools/modules           Modules to include
/etc/initramfs-tools/hooks/            Hook scripts
/etc/initramfs-tools/scripts/          Boot scripts
```

# DESCRIPTION

**initramfs-tools** manages the initial RAM filesystem (initramfs) on Debian-based systems. The initramfs contains the minimal filesystem loaded before the real root filesystem is mounted.

It includes drivers, scripts, and tools needed for early boot, such as filesystem drivers, LVM, RAID, or encryption setup.

# CAVEATS

Debian/Ubuntu specific. Incorrect configuration may prevent boot. Always keep a working backup. Custom modules need manual configuration.

# HISTORY

initramfs-tools replaced the older initrd mechanism on Debian. It provides a modular, scriptable framework for building the initial filesystem, developed by the Debian project.

# SEE ALSO

[mkinitramfs](/man/mkinitramfs)(8), [initramfs.conf](/man/initramfs.conf)(5), [dracut](/man/dracut)(8)
