# TLDR

Create users from **all config files**

```systemd-sysusers```

Create users from **specific file**

```systemd-sysusers path/to/file.conf```

**Dry-run** (show what would be done)

```systemd-sysusers --dry-run```

Show all **config contents**

```systemd-sysusers --cat-config```

Specify **root directory**

```systemd-sysusers --root=/mnt/system```

# SYNOPSIS

**systemd-sysusers** [_OPTIONS_...] [_CONFIGFILE_...]

# DESCRIPTION

**systemd-sysusers** creates system users and groups based on configuration files in /usr/lib/sysusers.d/ and /etc/sysusers.d/. It is typically invoked during system boot or package installation.

# PARAMETERS

**--dry-run**
> Print what would be done without making changes

**--cat-config**
> Show the contents of all configuration files

**--root=PATH**
> Operate on an alternative filesystem root

**--image=PATH**
> Operate on a disk image

**--no-pager**
> Do not pipe output into a pager

**-h, --help**
> Show help message

**--version**
> Show version information

# CAVEATS

Configuration files use a declarative format defining users and groups. Users created by systemd-sysusers are typically system accounts with no login shell. Existing users are not modified.

# HISTORY

**systemd-sysusers** is part of **systemd**, implementing declarative system user/group creation to ensure consistent user accounts across installations.

# SEE ALSO

[sysusers.d](/man/sysusers.d)(5), [systemd-tmpfiles](/man/systemd-tmpfiles)(8), [useradd](/man/useradd)(8)
