# TLDR

**List** all boot options with their numbers

```efibootmgr [-u|--unicode]```

**Add** UEFI Shell v2 as a boot option

```sudo efibootmgr -c -d [/dev/sda] -p [1] -l "[\path\to\shell.efi]" -L "[UEFI Shell]"```

**Add** Linux as a boot option

```sudo efibootmgr -c -d [/dev/sda] -p [1] -l "[\vmlinuz]" -u "[kernel_cmdline]" -L "[Linux]"```

**Change** current boot order

```sudo efibootmgr -o [0002,0008,0001,001A]```

**Delete** a boot option

```sudo efibootmgr -b [0008] -B```

# SYNOPSIS

**efibootmgr** [_options_]

# DESCRIPTION

**efibootmgr** manipulates the UEFI Boot Manager by modifying EFI variables stored in NVRAM. It can create, delete, and modify boot entries, change boot order, and set the next boot device.

Essential for managing dual-boot systems and UEFI boot configuration.

# PARAMETERS

**-c, --create**
> Create a new boot entry

**-d, --disk** _disk_
> Disk containing the loader

**-p, --part** _part_
> Partition number on the disk

**-l, --loader** _name_
> EFI loader filename

**-L, --label** _label_
> Boot entry label

**-o, --bootorder** _order_
> Set boot order (comma-separated)

**-b, --bootnum** _num_
> Boot entry number to operate on

**-B, --delete-bootnum**
> Delete the entry specified by -b

**-u, --unicode**
> Pass command line in Unicode

# CAVEATS

Requires root privileges. Modifies UEFI NVRAM variables. Use with caution as incorrect settings can prevent system boot. Backup boot entries before making changes.

# SEE ALSO

[efivar](/man/efivar)(1), [grub-install](/man/grub-install)(8), [mokutil](/man/mokutil)(1)
