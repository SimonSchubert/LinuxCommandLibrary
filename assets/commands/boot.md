# TLDR

**View the boot process documentation**

```man 7 boot```

**View systemd boot process documentation**

```man 7 bootup```

# SYNOPSIS

This is a documentation page describing the Linux boot sequence, not an executable command.

# DESCRIPTION

The **boot**(7) man page documents the Linux system startup process based on UNIX System V Release 4. The boot sequence consists of several phases:

**Hardware Boot (BIOS/UEFI)**
> POST (Power-On Self-Test) runs, hardware is initialized, and firmware locates the bootloader

**OS Loader (GRUB/LILO)**
> The bootloader locates and loads the kernel into memory

**Kernel Startup**
> The kernel initializes devices, starts the swapper process (kswapd), and mounts the root filesystem

**Init Process**
> The first userspace process (PID 1) starts. Modern systems use **systemd**, older systems use **SysVinit**

**Boot Scripts**
> System services are started according to the configured runlevel or systemd target

# CAVEATS

This documentation primarily describes the traditional SysV init boot process. Most modern Linux distributions use **systemd**, which has a different boot architecture documented in **bootup**(7).

The exact boot sequence varies between distributions, hardware platforms, and init systems in use.

# HISTORY

The System V init process originated in **AT&T Unix System V** released in 1983. Linux distributions historically adopted this model before the transition to **systemd** beginning around 2010-2011. Systemd became the default init system in most major distributions by 2015.

# SEE ALSO

[systemctl](/man/systemctl)(1), [journalctl](/man/journalctl)(1), [grub](/man/grub)(8)
