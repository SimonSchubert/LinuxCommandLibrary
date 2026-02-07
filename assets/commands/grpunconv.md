# TAGLINE

revert from shadow group format

# TLDR

**Convert from shadow groups**

```sudo grpunconv```

**Verify status after**

```ls -la /etc/gshadow```

# SYNOPSIS

**grpunconv** [_options_]

# PARAMETERS

**-R** _DIR_
> Chroot directory.

**--help**
> Display help information.

# DESCRIPTION

**grpunconv** converts from shadow group format back to traditional format. It moves password information from /etc/gshadow back to /etc/group and removes /etc/gshadow.

The tool reverses what grpconv does, returning to traditional group password storage. This is rarely needed on modern systems.

# CAVEATS

Requires root access. Reduces security. Rarely needed on modern systems.

# HISTORY

grpunconv was developed as part of the **shadow** password suite to allow reverting shadow group changes.

# SEE ALSO

[grpconv](/man/grpconv)(8), [grpck](/man/grpck)(8), [pwunconv](/man/pwunconv)(8)
