# TAGLINE

Linux native filesystem encryption manager

# TLDR

Prepare the **root filesystem** for use with fscrypt

```sudo fscrypt setup```

Prepare a **specific mountpoint** for use with fscrypt

```fscrypt setup [path/to/directory]```

**Enable encryption** for a directory

```fscrypt encrypt [path/to/directory]```

**Unlock** an encrypted directory

```fscrypt unlock [path/to/encrypted_directory]```

**Lock** an encrypted directory

```fscrypt lock [path/to/encrypted_directory]```

# SYNOPSIS

**fscrypt** _command_ [_arguments_]

# PARAMETERS

**setup**
> Initialize fscrypt on a filesystem or mountpoint

**encrypt**
> Enable encryption on a directory

**unlock**
> Unlock an encrypted directory using the protector

**lock**
> Lock an encrypted directory, making contents inaccessible

**purge**
> Remove keys from kernel keyring for a mountpoint

**status**
> Display encryption status of a file or directory

**metadata**
> Manage encryption metadata and policies

# CONFIGURATION

**/.fscrypt**
> Stores encryption metadata on each enabled mountpoint.

**~/.config/fscrypt/fscrypt.conf**
> Global fscrypt configuration settings and protector definitions.

# DESCRIPTION

**fscrypt** is a high-level tool for managing Linux native filesystem encryption (fscrypt). It provides a user-friendly interface to the kernel's filesystem encryption capabilities, supporting ext4, F2FS, and UBIFS filesystems.

fscrypt uses "protectors" (passwords, PAM integration, or raw keys) to secure encryption keys. A directory can have multiple protectors, enabling shared access or recovery options. The encryption is transparent once unlocked.

Setup requires kernel support (CONFIG_FS_ENCRYPTION) and filesystem configuration. The tool stores metadata in **/.fscrypt** on each enabled mountpoint.

# CAVEATS

Only encrypts file contents and names, not metadata like file sizes or timestamps. Swap and temporary directories may leak data. The filesystem must be mounted with encryption support. Files created before encryption are not automatically encrypted.

# HISTORY

fscrypt was developed by Google and first released in **2017** as a userspace tool for managing the Linux kernel's native filesystem encryption (fscrypt), which was introduced in kernel 4.1 for ext4 and later extended to other filesystems.

# SEE ALSO

[cryptsetup](/man/cryptsetup)(8), [ecryptfs](/man/ecryptfs)(7), [gpg](/man/gpg)(1)
