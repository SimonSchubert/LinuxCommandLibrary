# TAGLINE

initialize LUKS encrypted partition

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

**--type** _type_
> LUKS type: luks1 or luks2. Defaults to luks2.

**-c**, **--cipher** _cipher_
> Encryption cipher specification. Compiled-in default (typically aes-xts-plain64).

**-s**, **--key-size** _bits_
> Key size in bits, must be a multiple of 8. For XTS the volume key is split between two ciphers, so 512 yields AES-256.

**-h**, **--hash** _hash_
> Hash algorithm used in the LUKS key setup and volume key digest.

**-i**, **--iter-time** _ms_
> Milliseconds to spend on PBKDF passphrase processing. Higher values increase brute-force resistance.

**--pbkdf** _algo_
> PBKDF algorithm for LUKS2: pbkdf2, argon2i, or argon2id (the default).

**-d**, **--key-file** _file_
> Read the passphrase from a file. Use - to read from standard input.

**-l**, **--keyfile-size** _bytes_
> Read at most this many bytes from the key file.

**-y**, **--verify-passphrase**
> Ask for the passphrase twice and fail if the entries differ.

**-q**, **--batch-mode**
> Suppress all confirmation questions. Useful for scripting.

**--use-urandom**, **--use-random**
> Select the kernel RNG (/dev/urandom or /dev/random) used to generate the volume key.

**--sector-size** _bytes_
> Encryption sector size for LUKS2: a power of two between 512 and 4096.

**--label** _label_
> Set the LUKS2 device label.

**--integrity** _algo_
> Enable authenticated disk encryption with the given integrity algorithm (LUKS2 only).

# CAVEATS

Destroys all data on the partition. Cannot be undone. Always backup data first. LUKS1 is more compatible; LUKS2 supports newer features. Requires root privileges.

# SEE ALSO

[cryptsetup](/man/cryptsetup)(8), [cryptsetup-open](/man/cryptsetup-open)(8), [lsblk](/man/lsblk)(8)
