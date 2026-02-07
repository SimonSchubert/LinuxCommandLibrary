# TAGLINE

Encrypted overlay filesystem using FUSE

# TLDR

**Create encrypted directory**

```gocryptfs -init [cipher-dir]```

**Mount encrypted directory**

```gocryptfs [cipher-dir] [mount-point]```

**Unmount**

```fusermount -u [mount-point]```

**Change password**

```gocryptfs -passwd [cipher-dir]```

**Show info**

```gocryptfs -info [cipher-dir]```

# SYNOPSIS

**gocryptfs** [_options_] _cipherdir_ [_mountpoint_]

# PARAMETERS

_CIPHERDIR_
> Encrypted directory.

_MOUNTPOINT_
> Where to mount.

**-init**
> Initialize new volume.

**-passwd**
> Change password.

**-info**
> Show volume info.

**-fg**
> Run in foreground.

**-allow_other**
> Allow other users.

**--help**
> Display help information.

# DESCRIPTION

**gocryptfs** is an encrypted overlay filesystem written in Go. It encrypts files individually using AES-256-GCM, storing ciphertext in a directory while presenting plaintext through a FUSE mount.

The tool provides file-level encryption with encrypted file names, enabling safe cloud backup of encrypted data. Metadata leakage is minimized compared to full-disk encryption alternatives.

# CONFIGURATION

**gocryptfs.conf**
> Per-volume configuration file stored in the cipher directory, containing encryption parameters and the encrypted master key.

# CAVEATS

FUSE required. File sizes visible. Password recovery impossible without master key backup.

# HISTORY

gocryptfs was created as a modern, audited alternative to EncFS, using authenticated encryption and written in Go.

# SEE ALSO

[encfs](/man/encfs)(1), [cryptsetup](/man/cryptsetup)(1), [veracrypt](/man/veracrypt)(1)
