# TAGLINE

set default boot entry for next reboot only

# TLDR

Set the **default boot entry** for the next boot only

```sudo grub-reboot [entry_number]```

Set default for an **alternative boot directory** for next boot

```sudo grub-reboot --boot-directory=/[path/to/boot_directory] [entry_number]```

Set default for a **submenu entry** (use > to separate submenu and entry titles)

```sudo grub-reboot "[submenu_title]>[entry_title]"```

# SYNOPSIS

**grub-reboot** [_options_] _entry_

# PARAMETERS

_entry_
> Menu entry number (0-indexed), full entry name, or identifier.

**--boot-directory**=_DIR_
> Find GRUB images under DIR/grub instead of the default /boot/grub.

**-h**, **--help**
> Print help message and exit.

**-V**, **--version**
> Print version information and exit.

**-v**, **--verbose**
> Print verbose messages.

# DESCRIPTION

**grub-reboot** sets the default boot entry for the next boot only. After booting once, GRUB reverts to the permanent default set by **grub-set-default** or the configuration file.

The entry can be specified as a number (0 for first entry), the full entry name from grub.cfg, or a menu entry identifier. For entries within submenus, use the greater-than character (>) to separate the submenu title and the entry title, with no extra spaces (e.g., "Advanced options>Ubuntu, with Linux 5.15"). Use **grep menuentry /boot/grub/grub.cfg** to see available entries.

This is useful for one-time boots into recovery mode, alternative kernels, or other operating systems without permanently changing the boot order.

# CONFIGURATION

**/etc/default/grub**
> Must contain GRUB_DEFAULT=saved for grub-reboot to function.

# CAVEATS

Requires **GRUB_DEFAULT=saved** in /etc/default/grub and a subsequent **grub-mkconfig** run to function. The setting is stored in grubenv, which must be writable. Only affects the immediate next boot. When GRUB cannot write to the environment block (e.g., on MDRAID or LVM), the chosen entry may remain the default even after reboot.

# HISTORY

grub-reboot is part of GRUB 2, providing the "boot once" functionality that was present in GRUB Legacy. It enables safe testing of alternative boot configurations with automatic fallback.

# SEE ALSO

[grub-set-default](/man/grub-set-default)(8), [grub-mkconfig](/man/grub-mkconfig)(8), [grub-editenv](/man/grub-editenv)(1)
