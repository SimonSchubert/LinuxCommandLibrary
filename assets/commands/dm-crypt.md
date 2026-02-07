# TAGLINE

Linux disk encryption subsystem

# TLDR

**Create LUKS encrypted volume**

```sudo cryptsetup luksFormat [/dev/sdX]```

**Open LUKS volume**

```sudo cryptsetup open [/dev/sdX] [name]```

**Close encrypted volume**

```sudo cryptsetup close [name]```

**Show LUKS header information**

```sudo cryptsetup luksDump [/dev/sdX]```

**Add a new key to LUKS volume**

```sudo cryptsetup luksAddKey [/dev/sdX]```

**Create plain dm-crypt volume**

```sudo cryptsetup open --type plain [/dev/sdX] [name]```

**Benchmark encryption algorithms**

```cryptsetup benchmark```

# SYNOPSIS

**cryptsetup** _action_ [_options_] _device_ [_name_]

# PARAMETERS

**luksFormat** _device_
> Initialize LUKS partition.

**open** _device_ _name_
> Open and map encrypted device.

**close** _name_
> Close mapped device.

**luksDump** _device_
> Display LUKS header information.

**luksAddKey** _device_
> Add new passphrase/keyfile.

**luksRemoveKey** _device_
> Remove a passphrase.

**luksHeaderBackup** _device_
> Backup LUKS header.

**luksHeaderRestore** _device_
> Restore LUKS header.

**--type** _type_
> Encryption type: luks, luks2, plain.

**--cipher** _cipher_
> Encryption cipher (aes-xts-plain64).

**--key-size** _bits_
> Key size in bits.

**--hash** _hash_
> Hash for key derivation.

**--key-file** _file_
> Use keyfile instead of passphrase.

# DESCRIPTION

**dm-crypt** is the Linux kernel's device-mapper encryption target, providing transparent disk encryption. **cryptsetup** is the userspace tool to configure dm-crypt, typically using the LUKS (Linux Unified Key Setup) format.

LUKS provides standardized on-disk format with multiple key slots, allowing multiple passphrases or keyfiles. It stores encryption metadata in a header, enabling key management without re-encrypting data.

Plain dm-crypt provides encryption without a header, useful for plausible deniability but requiring exact parameters to be remembered. Both modes create a mapped device in /dev/mapper/ for normal filesystem operations.

# USAGE WORKFLOW

```bash
# Create encrypted partition
sudo cryptsetup luksFormat /dev/sdb1

# Open and map
sudo cryptsetup open /dev/sdb1 encrypted_data

# Create filesystem
sudo mkfs.ext4 /dev/mapper/encrypted_data

# Mount and use
sudo mount /dev/mapper/encrypted_data /mnt
```

# CAVEATS

LUKS header damage can make data unrecoverable; always backup headers. Encryption has CPU overhead (AES-NI helps significantly). SSDs may require special TRIM considerations. Forgotten passphrases mean permanent data loss.

# HISTORY

dm-crypt was merged into the Linux kernel in version **2.6** (2004). **LUKS** was designed by **Clemens Fruhwirth** in **2004** to standardize Linux disk encryption. LUKS2, released in **2017**, added modern key derivation (Argon2), authenticated encryption, and larger metadata areas.

# SEE ALSO

[cryptsetup](/man/cryptsetup)(8), [crypttab](/man/crypttab)(5), [luks](/man/luks)(8)
