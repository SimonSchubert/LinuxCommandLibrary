# TAGLINE

Control EFI firmware boot settings and systemd-boot

# TLDR

Show **firmware and bootloader** information

```bootctl```

List available **bootloader entries**

```bootctl list```

Set flag to **boot into firmware** on next boot

```sudo bootctl reboot-to-firmware true```

Specify **EFI system partition** path

```bootctl --esp-path /boot/efi/```

**Install** systemd-boot

```sudo bootctl install```

**Update** systemd-boot

```sudo bootctl update```

**Remove** systemd-boot

```sudo bootctl remove```

Set **default boot entry**

```sudo bootctl set-default entry_id```

# SYNOPSIS

**bootctl** [_OPTIONS_] _COMMAND_

# DESCRIPTION

**bootctl** controls EFI firmware boot settings and manages the systemd-boot boot loader. It can install, update, and remove systemd-boot, and control boot entries and firmware settings.

# COMMANDS

**status**
> Show firmware and bootloader status (default)

**list**
> List available boot entries

**install**
> Install systemd-boot to EFI system partition

**update**
> Update systemd-boot in EFI system partition

**remove**
> Remove systemd-boot from EFI system partition

**is-installed**
> Check if systemd-boot is installed

**random-seed**
> Initialize random seed in ESP

**systemd-efi-options [STRING]**
> Get/set systemd.* EFI options

**reboot-to-firmware [BOOL]**
> Get/set reboot-to-firmware flag

**set-default ID**
> Set default boot entry

**set-oneshot ID**
> Set one-time boot entry

**set-timeout SECS**
> Set boot menu timeout

**set-timeout-oneshot SECS**
> Set one-time boot menu timeout

# PARAMETERS

**--esp-path PATH**
> Path to EFI system partition

**--boot-path PATH**
> Path to $BOOT partition

**-p, --print-esp-path**
> Print ESP path and exit

**-x, --print-boot-path**
> Print boot partition path and exit

**--no-variables**
> Do not touch EFI variables

**--graceful**
> Ignore errors for operations

**--make-entry-directory**
> Create entry directory during install

# CAVEATS

Requires an EFI system partition. The default ESP paths checked are /efi/, /boot/, and /boot/efi/. On non-EFI systems, bootctl has limited functionality.

# HISTORY

**bootctl** is part of **systemd**, managing the systemd-boot EFI boot loader as an alternative to GRUB.

# SEE ALSO

[systemd-boot](/man/systemd-boot)(7), [kernel-install](/man/kernel-install)(8), [loader.conf](/man/loader.conf)(5)
