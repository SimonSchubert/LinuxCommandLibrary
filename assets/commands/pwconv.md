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

**pwconv** creates shadow password file from passwd. Enables shadow passwords.

The tool migrates password hashes. Security enhancement.

pwconv enables shadow.

# CAVEATS

Requires root. One-time migration. System administration.

# HISTORY

pwconv is part of **shadow-utils** for shadow password migration.

# SEE ALSO

[pwunconv](/man/pwunconv)(8), [grpconv](/man/grpconv)(8), [shadow](/man/shadow)(5)

