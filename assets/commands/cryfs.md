# TAGLINE

cryptographic filesystem for cloud storage

# TLDR

**Create and mount** an encrypted filesystem

```cryfs [path/to/cipher_dir] [path/to/mount_point]```

**Mount with a specific configuration** file

```cryfs --config [cryfs.config] [cipher_dir] [mount_point]```

**Unmount** the encrypted filesystem

```cryfs-unmount [path/to/mount_point]```

**Change the encryption password**

```cryfs-change-password [path/to/cipher_dir]```

**Show filesystem information**

```cryfs --show-ciphers```

**Mount in foreground** for debugging

```cryfs -f [cipher_dir] [mount_point]```

# SYNOPSIS

**cryfs** [_options_] _cipher_dir_ _mount_point_

# PARAMETERS

_CIPHER_DIR_
> Directory where encrypted data is stored.

_MOUNT_POINT_
> Directory where the decrypted filesystem is mounted.

**-c** _FILE_, **--config** _FILE_
> Use specified configuration file.

**-f**, **--foreground**
> Run in foreground instead of daemonizing.

**--allow-filesystem-upgrade**
> Allow upgrading the filesystem format.

**--show-ciphers**
> Show available cipher options.

**--unmount-idle** _MINUTES_
> Automatically unmount after idle time.

**--logfile** _FILE_
> Write logs to specified file.

# DESCRIPTION

**CryFS** is a cryptographic filesystem designed specifically for cloud storage services like Dropbox, Google Drive, or OneDrive. Unlike other encrypted filesystems, CryFS encrypts not just file contents but also file sizes, metadata, and directory structure.

Files are split into fixed-size blocks that are individually encrypted and stored with random names. This prevents cloud providers and attackers from learning anything about your data, including which files changed and how large they are.

The encrypted data is stored in the cipher directory, which can be synced with cloud services. The mount point shows the decrypted view of your files. CryFS uses authenticated encryption with AES-256-GCM by default.

# CONFIGURATION

**~/.cryfs/config**
> Stores filesystem configuration and cipher settings.

# CAVEATS

Performance is lower than unencrypted filesystems due to encryption overhead and block-based storage. The cipher directory should be synced, not the mount point. Forgetting the password means permanent data loss. FUSE must be available on the system.

# HISTORY

CryFS was created by Sebastian Messmer as his master's thesis project, with the first release in **2015**. It was designed to address privacy concerns with cloud storage, providing stronger confidentiality guarantees than traditional encrypted filesystems like EncFS.

# SEE ALSO

[encfs](/man/encfs)(1), [gocryptfs](/man/gocryptfs)(1), [veracrypt](/man/veracrypt)(1), [fusermount](/man/fusermount)(1)
