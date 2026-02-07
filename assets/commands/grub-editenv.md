# TAGLINE

manage GRUB environment block variables

# TLDR

Set a **default boot entry**

```grub-editenv /boot/grub/grubenv set default=Ubuntu```

Display all GRUB **environment variables**

```grub-editenv /boot/grub/grubenv list```

**Reset** the saved_entry variable to the default

```grub-editenv /boot/grub/grubenv unset saved_entry```

# SYNOPSIS

**grub-editenv** _file_ _command_

# PARAMETERS

**list**
> List all variables in the environment file

**set** _NAME=VALUE_
> Set a variable to a value

**unset** _NAME_
> Remove a variable

**create**
> Create a new empty environment file

# DESCRIPTION

**grub-editenv** manages GRUB's environment block (grubenv), which stores persistent variables across boots. The environment file is typically located at /boot/grub/grubenv or /boot/grub2/grubenv.

Common variables include **saved_entry** (the boot entry to use when GRUB_DEFAULT=saved), **next_entry** (entry for next boot only, used by grub-reboot), and **recordfail** (set when a boot fails).

This tool enables scripted management of boot configuration without regenerating grub.cfg.

# CONFIGURATION

**/boot/grub/grubenv**
> The GRUB environment block file storing persistent boot variables.

**/etc/default/grub**
> Must contain GRUB_DEFAULT=saved for grub-editenv settings to take effect.

# CAVEATS

The grubenv file has a fixed size (1024 bytes). Variables and values must fit within this space. Some bootloader configurations may not use grubenv. Changes require GRUB_DEFAULT=saved in /etc/default/grub.

# HISTORY

grub-editenv is part of GRUB 2's saved default mechanism, allowing boot preferences to persist without modifying the main configuration file. This enables features like "boot once" and remembering the last successful boot.

# SEE ALSO

[grub-set-default](/man/grub-set-default)(8), [grub-reboot](/man/grub-reboot)(8), [grub-mkconfig](/man/grub-mkconfig)(8)
