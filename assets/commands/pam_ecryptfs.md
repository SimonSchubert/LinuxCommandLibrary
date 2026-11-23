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
> Use the user's login passphrase to decrypt the wrapped mount passphrase stored in `~/.ecryptfs/wrapped-passphrase` and add it to the kernel keyring.

# DESCRIPTION

**pam_ecryptfs** is the PAM glue that makes per-user eCryptfs encrypted home directories transparent at login: when used in the `auth` and `session` stacks it inserts the user's mount passphrase into the kernel keyring (typically by unwrapping `~/.ecryptfs/wrapped-passphrase` with the login password) and then invokes the helper that mounts `~/.Private` (or the entire home) on top of `~`. On logout the session step unmounts and clears the keys.

It ships with the **ecryptfs-utils** suite (`ecryptfs-setup-private`, `ecryptfs-mount-private`).

# CAVEATS

Requires eCryptfs to be set up beforehand with **ecryptfs-setup-private**. The wrapped-passphrase file is only re-encrypted when the login password changes if the `password` PAM stack also calls `pam_ecryptfs.so`; otherwise password changes silently desynchronize and the user can no longer mount the home directory. eCryptfs is no longer the default in Ubuntu since 18.04 in favor of full-disk encryption (LUKS).

# HISTORY

**pam_ecryptfs** is part of **ecryptfs-utils**, the userspace tools for the eCryptfs stacked filesystem developed by **Michael Halcrow** and colleagues at **IBM** (merged into Linux **2.6.19** in **2006**). The encrypted private directory and home directory support built around it was largely developed by **Dustin Kirkland** for Ubuntu, which offered encrypted home directories in its installer from **2009** until **18.04**.

# SEE ALSO

[ecryptfs](/man/ecryptfs)(7), [ecryptfs-setup-private](/man/ecryptfs-setup-private)(1), [pam](/man/pam)(8)

# RESOURCES

```[Source code](https://launchpad.net/ecryptfs)```

```[Documentation](https://manpages.ubuntu.com/manpages/noble/man8/pam_ecryptfs.8.html)```

<!-- verified: 2026-11-23 -->

