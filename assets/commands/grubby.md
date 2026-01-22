# TLDR

Add kernel boot **arguments** to all kernel menu entries

```sudo grubby --update-kernel=ALL --args 'quiet console=ttyS0'```

**Remove** existing arguments from the default kernel entry

```sudo grubby --update-kernel=DEFAULT --remove-args quiet```

**List** all kernel menu entries

```sudo grubby --info=ALL```

# SYNOPSIS

**grubby** [_options_]

# PARAMETERS

**--info=**_KERNEL_
> Display boot information for specified kernel (or ALL)

**--update-kernel=**_KERNEL_
> Update specified kernel (ALL, DEFAULT, or path)

**--args=**_ARGS_
> Add kernel arguments

**--remove-args=**_ARGS_
> Remove kernel arguments

**--set-default=**_KERNEL_
> Set default boot kernel

**--default-kernel**
> Display path of default kernel

**--default-index**
> Display index of default kernel

**--add-kernel=**_PATH_
> Add a new kernel entry

**--remove-kernel=**_PATH_
> Remove a kernel entry

**--title=**_TITLE_
> Set title for new kernel entry

# DESCRIPTION

**grubby** is a command-line tool for updating and modifying bootloader configuration on Red Hat-based systems. It works with GRUB, GRUB2, and zipl (for s390 systems), providing a unified interface for boot configuration changes.

The tool modifies kernel command-line arguments, manages boot entries, and sets default kernels without directly editing configuration files. This is particularly useful for scripted configuration management.

On modern Fedora/RHEL systems using GRUB2 with BLS (Boot Loader Specification), grubby modifies the individual kernel entry files in /boot/loader/entries/.

# CAVEATS

Behavior varies between GRUB Legacy, GRUB2, and BLS configurations. Some options may not work with all bootloader configurations. Changes take effect on next boot. Always verify configuration after changes.

# HISTORY

grubby was developed by Red Hat to simplify bootloader management across different configurations. It became essential for automated system management and kernel updates on Red Hat-based distributions.

# SEE ALSO

[grub-mkconfig](/man/grub-mkconfig)(8), [grub-set-default](/man/grub-set-default)(8), [kernel-install](/man/kernel-install)(8)
