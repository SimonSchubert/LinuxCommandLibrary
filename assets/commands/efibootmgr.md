# TAGLINE

UEFI boot manager configuration tool

# TLDR

**List** all boot options with verbose details

```efibootmgr -v```

**Add** a new UEFI boot entry

```sudo efibootmgr -c -d [/dev/sda] -p [1] -l "[\EFI\boot\bootx64.efi]" -L "[My Entry]"```

**Change** current boot order

```sudo efibootmgr -o [0002,0008,0001,001A]```

**Set** boot entry for next boot only

```sudo efibootmgr -n [0002]```

**Delete** a boot option

```sudo efibootmgr -b [0008] -B```

**Set** boot manager timeout in seconds

```sudo efibootmgr -t [10]```

**Set** a boot entry as inactive

```sudo efibootmgr -b [0002] -A```

# SYNOPSIS

**efibootmgr** [_options_]

# DESCRIPTION

**efibootmgr** manipulates the UEFI Boot Manager by modifying EFI variables stored in NVRAM. It can create, delete, and modify boot entries, change boot order, and set the next boot device.

Essential for managing dual-boot systems and UEFI boot configuration.

# PARAMETERS

**-c, --create**
> Create a new boot entry.

**-d, --disk** _disk_
> Disk containing the loader (defaults to /dev/sda).

**-p, --part** _part_
> Partition number on the disk (defaults to 1).

**-l, --loader** _name_
> EFI loader filename (defaults to \EFI\arch\grub.efi).

**-L, --label** _label_
> Boot entry display label (defaults to "Linux").

**-o, --bootorder** _order_
> Set boot order (comma-separated hex boot numbers).

**-b, --bootnum** _num_
> Boot entry number (hex) to operate on.

**-B, --delete-bootnum**
> Delete the entry specified by -b.

**-n, --bootnext** _num_
> Set the boot entry to be used on next boot only. Supersedes BootOrder for one boot.

**-N, --delete-bootnext**
> Delete the BootNext setting.

**-a, --active**
> Set the boot entry specified by -b as active.

**-A, --inactive**
> Set the boot entry specified by -b as inactive.

**-t, --timeout** _seconds_
> Set the boot manager timeout in seconds.

**-T, --delete-timeout**
> Delete the boot manager timeout variable.

**-u, --unicode**
> Pass extra command line arguments in Unicode.

**-v, --verbose**
> Print additional information including device paths.

# CAVEATS

Requires root privileges. Modifies UEFI NVRAM variables. Use with caution as incorrect settings can prevent system boot. Backup boot entries before making changes. Only works on systems booted in UEFI mode, not legacy BIOS.

# SEE ALSO

[efivar](/man/efivar)(1), [grub-install](/man/grub-install)(8), [mokutil](/man/mokutil)(1)
