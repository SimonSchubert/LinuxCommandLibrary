# TLDR

**Mount encrypted directory**

```sudo mount -t ecryptfs [/encrypted] [/mnt/decrypted]```

**Setup encrypted private directory**

```ecryptfs-setup-private```

**Mount user's private directory**

```ecryptfs-mount-private```

**Unmount private directory**

```ecryptfs-umount-private```

**Add passphrase to keyring**

```ecryptfs-add-passphrase```

**Recover encrypted directory**

```ecryptfs-recover-private```

# SYNOPSIS

**mount -t ecryptfs** _source_ _dest_ [**-o** _options_]

# PARAMETERS

**ecryptfs_cipher** _cipher_
> Encryption cipher (aes, blowfish, des3_ede).

**ecryptfs_key_bytes** _bytes_
> Key size in bytes (16, 24, 32).

**ecryptfs_passthrough** _yes|no_
> Allow unencrypted files.

**ecryptfs_enable_filename_crypto** _yes|no_
> Encrypt filenames.

**ecryptfs_sig** _sig_
> Mount signature for key.

**ecryptfs_fnek_sig** _sig_
> Filename encryption key signature.

**no_sig_cache**
> Don't cache signature.

# DESCRIPTION

**eCryptfs** is a stacked cryptographic filesystem for Linux. It encrypts files at the filesystem level, storing encrypted data in a lower directory while presenting decrypted files through a mount point.

Unlike block-level encryption, eCryptfs encrypts individual files, allowing encrypted and unencrypted files to coexist. Metadata is stored in file headers, making backup and recovery straightforward.

# SETUP EXAMPLE

```bash
# Create directories
mkdir /encrypted /decrypted

# Mount with interactive setup
sudo mount -t ecryptfs /encrypted /decrypted

# Answer prompts for cipher, key size, plaintext passthrough
```

# CAVEATS

Filename encryption requires additional setup. Performance overhead compared to block encryption. Key management requires understanding of kernel keyrings. Deprecated in favor of fscrypt for ext4. Not recommended for new deployments.

# HISTORY

eCryptfs was developed by **IBM** and first included in the Linux kernel in **2006**. It was used by Ubuntu for encrypted home directories. The project has been largely superseded by **fscrypt** (native ext4/F2FS encryption) but remains available for legacy use.

# SEE ALSO

[cryptsetup](/man/cryptsetup)(8), [fscrypt](/man/fscrypt)(8), [mount](/man/mount)(8), [keyctl](/man/keyctl)(1)
