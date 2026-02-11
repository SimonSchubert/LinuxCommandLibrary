# TAGLINE

Enable shadow password storage

# TLDR

**Convert to shadow passwords**

```pwconv```

**Verbose conversion**

```pwconv -R [/]```

# SYNOPSIS

**pwconv** [_options_]

# PARAMETERS

**-R** _ROOT_
> Chroot directory.

# DESCRIPTION

**pwconv** creates or updates the **/etc/shadow** file from **/etc/passwd**, migrating password hashes from the world-readable passwd file to the root-only-readable shadow file. This is a fundamental security measure that prevents unprivileged users from accessing password hashes for offline cracking.

The command is part of **shadow-utils** and is typically run once during initial system setup or when converting a legacy system to shadow passwords. It preserves existing shadow entries and only adds or updates entries as needed.

# CAVEATS

Requires root. One-time migration. System administration.

# HISTORY

pwconv is part of **shadow-utils** for shadow password migration.

# SEE ALSO

[pwunconv](/man/pwunconv)(8), [grpconv](/man/grpconv)(8), [shadow](/man/shadow)(5)

