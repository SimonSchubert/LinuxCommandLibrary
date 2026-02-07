# TAGLINE

verify integrity of group files

# TLDR

**Check group file integrity**

```sudo grpck```

**Read-only mode**

```sudo grpck -r```

**Sort by GID**

```sudo grpck -s```

**Check specific files**

```sudo grpck [/etc/group] [/etc/gshadow]```

# SYNOPSIS

**grpck** [_options_] [_group_] [_shadow_]

# PARAMETERS

_GROUP_
> Group file to check (default /etc/group).

_SHADOW_
> Shadow group file (default /etc/gshadow).

**-r**
> Read-only mode, report only.

**-s**
> Sort entries by GID.

**-R** _DIR_
> Chroot directory.

**--help**
> Display help information.

# DESCRIPTION

**grpck** verifies the integrity of group information files. It checks for duplicate entries, valid field formats, and consistency between /etc/group and /etc/gshadow.

The tool can automatically fix some issues when run interactively. It is essential for maintaining system security and proper group functionality.

# CAVEATS

Requires root access. Interactive fixes need confirmation. Back up files before repair.

# HISTORY

grpck was developed as part of the **shadow** password suite for Unix/Linux system administration.

# SEE ALSO

[pwck](/man/pwck)(8), [groups](/man/groups)(1), [gpasswd](/man/gpasswd)(1)
