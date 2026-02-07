# TAGLINE

dm-crypt and LUKS encrypted volume manager

# TLDR

Initialize **LUKS** volume

```cryptsetup luksFormat /dev/sda1```

**Open** LUKS volume

```cryptsetup open /dev/sda1 mapping_name```

Show mapping **status**

```cryptsetup status mapping_name```

**Close** mapping

```cryptsetup close mapping_name```

**Change** passphrase

```cryptsetup luksChangeKey /dev/sda1```

# SYNOPSIS

**cryptsetup** _action_ [_OPTIONS_] _device_ [_name_]

# DESCRIPTION

**cryptsetup** manages dm-crypt and LUKS (Linux Unified Key Setup) encrypted volumes. It provides disk encryption for protecting data at rest, supporting multiple key slots, strong encryption algorithms, and header backup/restore.

# PARAMETERS

**luksFormat** _device_
> Initialize a LUKS encrypted volume (destroys all data)

**open** _device_ _name_
> Open encrypted device and create mapping at /dev/mapper/name

**close** _name_
> Remove an existing mapping

**status** _name_
> Display information about an active mapping

**luksChangeKey** _device_
> Change the passphrase for a LUKS volume

**luksAddKey** _device_
> Add a new passphrase to a key slot

**luksRemoveKey** _device_
> Remove a passphrase from a key slot

**luksDump** _device_
> Display LUKS header information

**luksHeaderBackup** _device_
> Backup LUKS header to a file

**--type** _type_
> Specify encryption type (luks, luks2, plain)

**--cipher** _cipher_
> Encryption cipher specification

# CONFIGURATION

**/etc/crypttab**
> Defines encrypted volumes to unlock at boot.

# CAVEATS

Losing all passphrases means permanent data loss. Always backup LUKS headers. Formatting destroys all existing data. The encrypted device must be opened before it can be mounted.

# HISTORY

**cryptsetup** is the standard Linux disk encryption management tool, supporting dm-crypt, LUKS, and LUKS2 formats.

# SEE ALSO

[dmsetup](/man/dmsetup)(8), [losetup](/man/losetup)(8), [mkfs](/man/mkfs)(8)
