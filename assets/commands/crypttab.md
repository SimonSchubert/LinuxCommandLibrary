# TAGLINE

encrypted block device configuration

# TLDR

**View current crypttab**

```cat /etc/crypttab```

**Basic encrypted partition entry**

```luks_root UUID=[device-uuid] none luks```

**Entry with keyfile**

```luks_data UUID=[device-uuid] /root/keyfile luks```

**Entry with discard/TRIM support**

```luks_ssd UUID=[device-uuid] none luks,discard```

**Entry for swap encryption**

```cryptswap /dev/sdX /dev/urandom swap,cipher=aes-xts-plain64,size=256```

# SYNOPSIS

**/etc/crypttab**

# FORMAT

```
name  device  keyfile  options
```

**name**: Mapped device name (/dev/mapper/name)
**device**: Block device, UUID=xxx, or PARTUUID=xxx
**keyfile**: Path to key or "none" for password prompt
**options**: Comma-separated mount options

# OPTIONS

**luks**
> Device is LUKS encrypted (auto-detected usually).

**plain**
> Plain dm-crypt (no LUKS header).

**swap**
> Format as encrypted swap (destroys data).

**discard**
> Allow TRIM/discard passthrough (SSD optimization).

**noauto**
> Don't unlock at boot.

**nofail**
> Don't fail boot if device unavailable.

**tries=N**
> Password attempts before failing.

**timeout=N**
> Seconds to wait for device.

**cipher=**_cipher_
> Encryption cipher (for plain mode).

**size=**_bits_
> Key size in bits.

**keyfile-offset=**_bytes_
> Offset in keyfile.

**keyfile-size=**_bytes_
> Bytes to read from keyfile.

# DESCRIPTION

**/etc/crypttab** defines encrypted block devices to be unlocked at boot by systemd-cryptsetup or cryptsetup. Each line describes one encrypted device: its mapped name, source device, key material, and options.

The file works alongside **/etc/fstab**: crypttab unlocks encrypted devices, then fstab mounts the resulting mapped devices. For LUKS devices, the system prompts for a password at boot unless a keyfile is specified.

UUID-based device identification is recommended over device paths for reliability across hardware changes.

# EXAMPLE

```
# LUKS root partition, password prompt
luks-root UUID=12345678-1234-1234-1234-123456789abc none luks

# Data partition with keyfile
luks-data UUID=abcdefab-cdef-abcd-efab-cdefabcdefab /root/data.key luks

# SSD with TRIM support
luks-ssd UUID=87654321-4321-4321-4321-210987654321 none luks,discard

# Encrypted swap (random key each boot)
cryptswap /dev/sda2 /dev/urandom swap,cipher=aes-xts-plain64,size=256
```

# CAVEATS

Keyfiles should be readable only by root and ideally on an encrypted root partition. The **discard** option may leak information about filesystem usage. Encrypted swap with random keys loses swap contents on reboot. Test crypttab changes carefully to avoid unbootable systems.

# HISTORY

The crypttab format originated in Debian and was later adopted by systemd and other distributions. It was designed to integrate dm-crypt/LUKS encryption with the boot process. The file format has evolved to support LUKS, plain dm-crypt, and various options for key management and performance tuning.

# SEE ALSO

[cryptsetup](/man/cryptsetup)(8), [fstab](/man/fstab)(5), [systemd-cryptsetup](/man/systemd-cryptsetup)(8)
