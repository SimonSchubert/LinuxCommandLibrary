# TAGLINE

GRand Unified Bootloader for Linux systems

# TLDR

**Install GRUB to disk**

```sudo grub-install /dev/sda```

**Update GRUB configuration** (Debian/Ubuntu)

```sudo update-grub```

**Generate config file directly**

```sudo grub-mkconfig -o /boot/grub/grub.cfg```

**Set the default boot entry**

```sudo grub-set-default 0```

**Check GRUB version**

```grub-install --version```

# SYNOPSIS

**grub-install** [_options_] _device_

**grub-mkconfig** [**-o** _file_]

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

Unlike GRUB Legacy, GRUB 2 has no single unified **grub** command; its functionality is split across separate utilities such as **grub-install**, **grub-mkconfig**, **grub-set-default**, and **grub-editenv**. An interactive GRUB command line is available from the boot menu itself (press **c**), not from a running Linux shell.

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

# INSTALL

```pacman: sudo pacman -S grub```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[grub-mkconfig](/man/grub-mkconfig)(8), [update-grub](/man/update-grub)(8), [grub-install](/man/grub-install)(8)

# RESOURCES

```[Homepage](https://www.gnu.org/software/grub/)```

```[Source code](https://git.savannah.gnu.org/cgit/grub.git)```

```[Documentation](https://www.gnu.org/software/grub/manual/grub/grub.html)```

<!-- verified: 2026-07-17 -->
