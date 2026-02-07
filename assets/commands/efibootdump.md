# TAGLINE

UEFI boot entry decoder

# TLDR

Dump boot entries from **file**

```efibootdump -f [/sys/firmware/efi/efivars/Boot0000-8be4df61-93ca-11d2-aa0d-00e098032b8c]```

# SYNOPSIS

**efibootdump** [_options_]

# DESCRIPTION

**efibootdump** dumps EFI boot entries from a variable or file. It decodes and displays the contents of UEFI boot variables in human-readable format.

Useful for debugging UEFI boot configuration.

# PARAMETERS

**-f, --file** _file_
> Read boot entry from file

# CAVEATS

Only works on UEFI systems. Boot variables are stored in /sys/firmware/efi/efivars/. Part of efivar package.

# SEE ALSO

[efibootmgr](/man/efibootmgr)(8), [efivar](/man/efivar)(1)
