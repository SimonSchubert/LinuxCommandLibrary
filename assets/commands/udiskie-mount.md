# TLDR

Mount **all** handleable devices

```udiskie-mount -a```

Mount **specific** device

```udiskie-mount [/dev/sdX1]```

Mount with **verbose** output

```udiskie-mount --verbose [/dev/sdX1]```

# SYNOPSIS

**udiskie-mount** [_OPTIONS_] [_DEVICE_...]

# PARAMETERS

**-a, --all**
> Mount all handleable devices

**--verbose**
> Enable verbose output

**--help**
> Display help information

# DESCRIPTION

**udiskie-mount** manually mounts devices using udiskie and udisks2. It provides a command-line interface for mounting removable devices without requiring root privileges.

Devices are mounted to standard locations managed by udisks2, typically under /run/media/USERNAME/.

# CAVEATS

Requires udisks2 daemon. Device must be recognized by udisks2. Some encrypted devices require additional configuration for password prompts.

# SEE ALSO

[udiskie](/man/udiskie)(1), [udiskie-umount](/man/udiskie-umount)(1), [udisksctl](/man/udisksctl)(1)
