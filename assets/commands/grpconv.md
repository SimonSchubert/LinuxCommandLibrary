# TLDR

**Convert to shadow groups**

```sudo grpconv```

**Check current status first**

```ls -la /etc/gshadow```

# SYNOPSIS

**grpconv** [_options_]

# PARAMETERS

**-R** _DIR_
> Chroot directory.

**--help**
> Display help information.

# DESCRIPTION

**grpconv** converts from traditional group format to shadow group format. It creates /etc/gshadow from /etc/group information.

The tool moves encrypted group passwords from /etc/group to /etc/gshadow, improving security by limiting access to password data.

grpconv enables shadow group passwords.

# CAVEATS

Requires root access. Run grpck first to verify integrity. Irreversible without backup.

# HISTORY

grpconv was developed as part of the **shadow** password suite to improve group password security.

# SEE ALSO

[grpunconv](/man/grpunconv)(8), [grpck](/man/grpck)(8), [pwconv](/man/pwconv)(8)
