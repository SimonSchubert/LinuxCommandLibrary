# TLDR

**Find eCryptfs** encrypted files

```ecryptfs-find [directory]```

**Find with verbose** output

```ecryptfs-find -v [directory]```

# SYNOPSIS

**ecryptfs-find** [_options_] _directory_

# PARAMETERS

_DIRECTORY_
> Directory to search.

**-v**, **--verbose**
> Verbose output.

**--help**
> Display help information.

# DESCRIPTION

**ecryptfs-find** locates files encrypted with the eCryptfs filesystem within a directory tree. It identifies encrypted files by their characteristic markers.

The tool is useful for auditing encrypted content, finding orphaned encrypted files, or verifying encryption coverage. It scans file headers to identify eCryptfs encrypted data.

This is primarily a diagnostic tool for eCryptfs deployments.

# CAVEATS

Only finds eCryptfs encrypted files. Cannot decrypt or read file contents. Requires read access to directories being searched.

# HISTORY

ecryptfs-find is part of the **eCryptfs** utilities, a POSIX-compliant stacked filesystem providing transparent encryption. eCryptfs was included in Linux kernel since version 2.6.19.

# SEE ALSO

[ecryptfs-setup-private](/man/ecryptfs-setup-private)(1), [mount.ecryptfs](/man/mount.ecryptfs)(8)
