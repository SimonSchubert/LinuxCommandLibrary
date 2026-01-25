# TLDR

**Setup encrypted private directory**

```ecryptfs-setup-private```

**Setup with wrapped passphrase**

```ecryptfs-setup-private --wrapping```

**Setup without wrapped passphrase**

```ecryptfs-setup-private --noautomount```

**Force setup (overwrite existing)**

```ecryptfs-setup-private --force```

# SYNOPSIS

**ecryptfs-setup-private** [_options_]

# PARAMETERS

**--wrapping**
> Use login passphrase for wrapping.

**--noautomount**
> Don't configure automount on login.

**--nopwcheck**
> Don't verify login password.

**--force**
> Overwrite existing configuration.

**-u**, **--username** _name_
> Specify username (for root use).

**-l**, **--loginpass** _pass_
> Login passphrase (insecure, for scripting).

**-m**, **--mountpass** _pass_
> Mount passphrase (insecure, for scripting).

# DESCRIPTION

**ecryptfs-setup-private** creates an encrypted private directory for a user. It sets up ~/Private as an encrypted folder that is automatically mounted when the user logs in and unmounted on logout.

The setup creates the necessary encryption keys and wrapper, storing them in ~/.ecryptfs. The mount passphrase is wrapped with the login password, enabling automatic decryption on login.

# SETUP PROCESS

1. Prompts for login password
2. Generates random mount passphrase
3. Wraps mount passphrase with login password
4. Creates ~/.Private (encrypted) and ~/Private (mount point)
5. Configures PAM for auto-mount

# CAVEATS

Requires eCryptfs kernel module. Swap should be encrypted for security. Login password changes require rewrapping. Recovery requires unwrapped passphrase. Deprecated in favor of fscrypt on modern systems.

# HISTORY

This utility was developed for Ubuntu's encrypted home directory feature. It was widely used for per-user encryption from **Ubuntu 8.10** through **18.04**, after which fscrypt became the recommended solution.

# SEE ALSO

[ecryptfs-mount-private](/man/ecryptfs-mount-private)(1), [ecryptfs-umount-private](/man/ecryptfs-umount-private)(1), [ecryptfs-recover-private](/man/ecryptfs-recover-private)(1)
