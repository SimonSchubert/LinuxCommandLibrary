# TAGLINE

lock package versions

# TLDR

**List** versionlock entries

```dnf versionlock```

**Add** versionlock for a package

```dnf versionlock add [package]```

**Exclude** a package version

```dnf versionlock exclude [package]```

**Delete** versionlock entry

```dnf versionlock delete [package]```

**Clear** all versionlock entries

```dnf versionlock clear```

# SYNOPSIS

**dnf versionlock** [_command_] [_package_]

# DESCRIPTION

**dnf versionlock** protects packages from being updated to newer versions. Part of dnf-plugins-core.

Useful for keeping specific package versions that are known to work or avoiding problematic updates.

# PARAMETERS

**add** _package_
> Lock package at current version

**exclude** _package_
> Exclude package from updates

**delete** _package_
> Remove specific lock entry

**clear**
> Remove all lock entries

**list**
> Show current locks (default)

# CONFIGURATION

**/etc/dnf/plugins/versionlock.list**
> Stores package version lock entries. Each line contains a package specification to lock.

# CAVEATS

Requires dnf-plugins-core. Locked packages won't receive security updates. Review locks periodically. Lock entries stored in /etc/dnf/plugins/versionlock.list.

# SEE ALSO

[dnf](/man/dnf)(8), [yum-versionlock](/man/yum-versionlock)(8)
