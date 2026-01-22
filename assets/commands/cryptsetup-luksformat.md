# TLDR

Initialize LUKS volume with **passphrase**

```cryptsetup luksFormat [/dev/sdXY]```

Initialize LUKS volume with **keyfile**

```cryptsetup luksFormat [/dev/sdXY] [path/to/keyfile]```

Initialize with passphrase and **set label**

```cryptsetup luksFormat --label [label] [/dev/sdXY]```

# SYNOPSIS

**cryptsetup luksFormat** [_options_] _device_ [_keyfile_]

# DESCRIPTION

**cryptsetup luksFormat** initializes a LUKS (Linux Unified Key Setup) encrypted partition. It creates the LUKS header and sets up the initial key slot with either a passphrase or keyfile.

LUKS provides standardized on-disk encryption with multiple key slots, secure key management, and compatibility across distributions.

# PARAMETERS

**--label** _label_
> Set LUKS2 label

**--type** _type_
> LUKS type (luks1, luks2)

**--cipher** _cipher_
> Encryption cipher

**--key-size** _bits_
> Key size in bits

**--hash** _hash_
> Hash algorithm for PBKDF

**--iter-time** _ms_
> PBKDF iteration time in milliseconds

# CAVEATS

Destroys all data on the partition. Cannot be undone. Always backup data first. LUKS1 is more compatible; LUKS2 supports newer features. Requires root privileges.

# SEE ALSO

[cryptsetup](/man/cryptsetup)(8), [cryptsetup-open](/man/cryptsetup-open)(8), [lsblk](/man/lsblk)(8)
