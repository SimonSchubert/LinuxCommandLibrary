# TAGLINE

GRand Unified Bootloader for Linux systems

# TLDR

**Enter GRUB shell**

```sudo grub```

**Install GRUB to disk**

```sudo grub-install /dev/sda```

**Update GRUB configuration**

```sudo update-grub```

**Generate config file**

```sudo grub-mkconfig -o /boot/grub/grub.cfg```

**Check GRUB version**

```grub-install --version```

# SYNOPSIS

**grub** [_options_]

**grub-install** [_options_] _device_

# PARAMETERS

**--root-directory** _DIR_
> Install to alternate root.

**--boot-directory** _DIR_
> Boot directory location.

**--target** _TARGET_
> Target platform.

**--recheck**
> Probe devices again.

**--removable**
> Install for removable media.

**--help**
> Display help information.

# DESCRIPTION

**GRUB** (GRand Unified Bootloader) is the standard bootloader for Linux systems. It loads the kernel and initrd, presenting a boot menu for system selection.

GRUB 2 supports multiple filesystems, LVM, RAID, and encrypted partitions. It provides rescue mode for system recovery and scripting for advanced configurations.

# CONFIGURATION

**/etc/default/grub**
> Main GRUB configuration file controlling default boot entry, timeout, kernel parameters, and display settings.

**/etc/grub.d/**
> Directory containing scripts that generate the grub.cfg file. Custom entries can be added here.

**/boot/grub/grub.cfg**
> Generated configuration file. Do not edit directly; use grub-mkconfig to regenerate.

# CAVEATS

Misconfiguration can prevent booting. Keep rescue media available. GRUB 2 differs from legacy GRUB.

# HISTORY

GRUB was created as part of the **GNU Project**. GRUB 2 was released in **2002** as a complete rewrite with enhanced features.

# SEE ALSO

[grub-mkconfig](/man/grub-mkconfig)(8), [update-grub](/man/update-grub)(8), [grub-install](/man/grub-install)(8)
