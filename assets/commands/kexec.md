# TLDR

**Load** a new kernel

```kexec -l [path/to/kernel] --initrd=[path/to/initrd] --command-line=[arguments]```

Load kernel with **current boot parameters**

```kexec -l [path/to/kernel] --initrd=[path/to/initrd] --reuse-cmdline```

**Execute** the loaded kernel

```kexec -e```

**Unload** current kexec target kernel

```kexec -u```

# SYNOPSIS

**kexec** [_options_]

# PARAMETERS

**-l**, **--load** _KERNEL_
> Load a new kernel into memory

**-e**, **--exec**
> Execute the currently loaded kernel

**-u**, **--unload**
> Unload the loaded kernel

**--initrd** _FILE_
> Specify initramfs/initrd image

**--command-line** _ARGS_
> Kernel command line arguments

**--reuse-cmdline**
> Use current kernel's command line

**-p**, **--load-panic**
> Load kernel for crash dump (kdump)

# DESCRIPTION

**kexec** allows the system to boot directly into a new kernel without going through the BIOS/UEFI and bootloader. This enables faster reboots and is essential for kdump (kernel crash dumping).

The process involves loading a kernel into memory with -l, then executing it with -e. This bypasses hardware initialization, significantly reducing reboot time.

# CAVEATS

Requires CONFIG_KEXEC in the kernel. Some hardware may not work correctly after kexec due to missing initialization. Not all drivers handle kexec transitions properly.

# HISTORY

kexec was developed to enable fast reboots and kernel crash dumping. It was merged into the Linux kernel in version 2.6.13 (**2005**) and has become essential for kdump functionality.

# SEE ALSO

[kdump](/man/kdump)(8), [systemctl](/man/systemctl)(1), [reboot](/man/reboot)(8)
