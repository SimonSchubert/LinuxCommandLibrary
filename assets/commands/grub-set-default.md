# TLDR

Set the **default boot entry** permanently

```sudo grub-set-default [entry_number]```

Set default for an **alternative boot directory**

```sudo grub-set-default --boot-directory /[path/to/boot_directory] [entry_number]```

# SYNOPSIS

**grub-set-default** [_options_] _entry_

# PARAMETERS

_entry_
> Menu entry number (0-indexed), name, or identifier

**--boot-directory** _DIR_
> Use alternative boot directory instead of /boot

# DESCRIPTION

**grub-set-default** sets the permanent default boot entry for GRUB. Unlike **grub-reboot**, this setting persists across all subsequent boots until changed.

The entry can be specified as a number (0 for first entry), the full entry name from grub.cfg, or a menu entry identifier. Submenu entries use notation like "1>2" for the third item in the second submenu.

Use **awk -F\' '/menuentry / {print $2}' /boot/grub/grub.cfg** to list menu entry names.

# CAVEATS

Requires GRUB_DEFAULT=saved in /etc/default/grub and regenerating the configuration with grub-mkconfig. Without this, the setting in grubenv is ignored. Entry numbers can change when kernels are added or removed.

# HISTORY

grub-set-default is part of GRUB 2's saved default functionality. It provides a way to change the boot default without editing configuration files, storing the selection in the grubenv file.

# SEE ALSO

[grub-reboot](/man/grub-reboot)(8), [grub-mkconfig](/man/grub-mkconfig)(8), [grub-editenv](/man/grub-editenv)(1)
