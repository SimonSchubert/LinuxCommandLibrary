# TAGLINE

Disable shadow password storage

# TLDR

**Revert shadow passwords**

```pwunconv```

**With specific root**

```pwunconv -R [/]```

# SYNOPSIS

**pwunconv** [_options_]

# PARAMETERS

**-R** _ROOT_
> Chroot directory.

# DESCRIPTION

**pwunconv** reverses the shadow password setup by moving password hashes from **/etc/shadow** back into **/etc/passwd** and removing the shadow file. This is the inverse of **pwconv** and effectively disables shadow password protection on the system.

The command is part of **shadow-utils** and is rarely used in practice since shadow passwords are a fundamental security feature on modern Linux systems. Removing shadow protection makes password hashes readable by all users, significantly weakening system security.

# CAVEATS

Security risk. Rarely used. Requires root.

# HISTORY

pwunconv is part of **shadow-utils** for reverting shadow passwords.

# SEE ALSO

[pwconv](/man/pwconv)(8), [grpunconv](/man/grpunconv)(8), [passwd](/man/passwd)(5)

