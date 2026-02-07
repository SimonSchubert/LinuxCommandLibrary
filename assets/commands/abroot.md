# TAGLINE

immutable root partition manager with A/B switching

# TLDR

**Add** packages to the local image

```sudo abroot pkg add [package]```

**Remove** packages from the local image

```sudo abroot pkg remove [package]```

**List** packages in the local image

```sudo abroot pkg list```

**Apply** changes in the local image

```sudo abroot pkg apply```

**Rollback** your system to previous state

```sudo abroot rollback```

Edit or view **kernel parameters**

```sudo abroot kargs [edit|show]```

Display **status**

```sudo abroot status```

# SYNOPSIS

**abroot** [_pkg_] [_rollback_] [_kargs_] [_status_] [_command_]

# DESCRIPTION

**abroot** is a utility providing full immutability and atomicity by transacting between two root partition states (A⟺B). Updates are performed using OCI images to ensure the system is always in a consistent state.

This approach allows safe system updates where changes can be rolled back if issues occur. The system boots from one root partition while changes are applied to the other.

# PARAMETERS

**pkg add PACKAGE**
> Add packages to the local image; requires apply to take effect

**pkg remove PACKAGE**
> Remove packages from the local image; requires apply to take effect

**pkg list**
> List packages in the local image

**pkg apply**
> Apply pending package changes; requires reboot

**rollback**
> Rollback to the previous system state

**kargs edit**
> Edit kernel parameters

**kargs show**
> Display current kernel parameters

**status**
> Display current system status

**-h, --help**
> Display help information

# CAVEATS

Package changes require running **pkg apply** followed by a system **reboot** before they take effect.

# HISTORY

Developed for **Vanilla OS**, a Linux distribution focused on providing an immutable and atomic desktop experience using A/B partition scheme.

# SEE ALSO

[apt](/man/apt)(8), [dnf](/man/dnf)(8), [ostree](/man/ostree)(1)
