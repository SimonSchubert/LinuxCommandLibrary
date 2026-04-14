# TAGLINE

match eCryptfs encrypted filenames to their decrypted counterparts

# TLDR

**Find the encrypted form** of a decrypted filename

```ecryptfs-find [cleartext-filename]```

**Find the decrypted form** of an encrypted filename

```ecryptfs-find [ECRYPTFS_FNEK_ENCRYPTED.fwBGx...]```

# SYNOPSIS

**ecryptfs-find** _filename_

# PARAMETERS

_FILENAME_
> A cleartext or eCryptfs-encrypted filename to look up. The tool resolves the corresponding counterpart using inode numbers.

# DESCRIPTION

**ecryptfs-find** uses inode numbers to match encrypted filenames to their decrypted counterparts, and decrypted filenames to their encrypted counterparts. It calls **ls**(1) to determine the inode and **find**(1) to locate the inode on the filesystem.

The eCryptfs filesystem must be mounted for the command to function, since it needs both the encrypted and decrypted views of the directory to perform the match.

This is primarily a diagnostic tool for resolving filename mappings in eCryptfs deployments.

# CAVEATS

The eCryptfs filesystem must be mounted before running this command. The tool does not decrypt file contents, only filename mappings. Requires read access to the directories being searched.

# HISTORY

ecryptfs-find is part of the **ecryptfs-utils** package. eCryptfs is a POSIX-compliant stacked cryptographic filesystem included in the Linux kernel since version **2.6.19** (released **2006**).

# SEE ALSO

[ecryptfs-setup-private](/man/ecryptfs-setup-private)(1), [ecryptfs-verify](/man/ecryptfs-verify)(1), [ecryptfs](/man/ecryptfs)(1), [encfs](/man/encfs)(1), [fscrypt](/man/fscrypt)(1)
