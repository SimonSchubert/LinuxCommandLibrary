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

**pwunconv** converts from shadow to traditional passwords. Removes shadow file.

The tool reverts password storage. Reverse of pwconv.

pwunconv disables shadow.

# CAVEATS

Security risk. Rarely used. Requires root.

# HISTORY

pwunconv is part of **shadow-utils** for reverting shadow passwords.

# SEE ALSO

[pwconv](/man/pwconv)(8), [grpunconv](/man/grpunconv)(8), [passwd](/man/passwd)(5)

