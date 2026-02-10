# TAGLINE

handles ECryptfs encrypted home directories

# TLDR

**Auto-mount encrypted home**

```auth optional pam_ecryptfs.so unwrap```

**Session setup**

```session optional pam_ecryptfs.so unwrap```

**Password sync**

```password optional pam_ecryptfs.so```

# SYNOPSIS

**pam_ecryptfs.so** [_options_]

# PARAMETERS

**unwrap**
> Unwrap passphrase on login.

# DESCRIPTION

**pam_ecryptfs** handles eCryptfs encrypted home directories. Automatic mount on login.

The module manages encryption keys. Part of eCryptfs suite.

# CAVEATS

Requires eCryptfs setup. Login password unlocks encryption.

# HISTORY

pam_ecryptfs enables **automatic encrypted home** directory mounting on login.

# SEE ALSO

[ecryptfs](/man/ecryptfs)(7), [ecryptfs-setup-private](/man/ecryptfs-setup-private)(1), [pam](/man/pam)(8)

