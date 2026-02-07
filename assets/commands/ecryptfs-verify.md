# TAGLINE

verify eCryptfs encryption setup

# TLDR

**Verify eCryptfs setup**

```ecryptfs-verify```

**Verify home directory** encryption

```ecryptfs-verify --home```

**Verify with verbose** output

```ecryptfs-verify -v```

# SYNOPSIS

**ecryptfs-verify** [_options_]

# PARAMETERS

**--home**
> Verify home directory encryption.

**-v**, **--verbose**
> Verbose output.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**ecryptfs-verify** checks that eCryptfs encryption is properly configured for the user. It validates mount points, wrapping passphrases, and encryption setup.

The tool verifies that encrypted private directories are correctly mounted and accessible. It checks for common misconfigurations and reports issues.

Running verification after setup or upgrades ensures encryption continues to function correctly.

# CAVEATS

Must be run as the user whose encryption is being verified. Cannot verify unmounted encrypted directories. Reports configuration not content integrity.

# HISTORY

ecryptfs-verify is part of the **eCryptfs** utilities, providing validation for encrypted filesystem configurations on Ubuntu and other distributions using eCryptfs.

# SEE ALSO

[ecryptfs-setup-private](/man/ecryptfs-setup-private)(1), [mount.ecryptfs](/man/mount.ecryptfs)(8)
