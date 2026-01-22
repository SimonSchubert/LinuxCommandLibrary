# TLDR

**Build package in chroot**

```mock -r [fedora-39-x86_64] [package.src.rpm]```

**Initialize chroot**

```mock -r [fedora-39-x86_64] --init```

**Clean chroot**

```mock -r [fedora-39-x86_64] --clean```

**Shell into chroot**

```mock -r [fedora-39-x86_64] --shell```

**Build from spec**

```mock -r [fedora-39-x86_64] --spec [package.spec] --sources [sources/]```

**Rebuild SRPM**

```mock -r [fedora-39-x86_64] --rebuild [package.src.rpm]```

# SYNOPSIS

**mock** [_options_] _srpm_

# PARAMETERS

_SRPM_
> Source RPM to build.

**-r** _CONFIG_
> Chroot configuration.

**--init**
> Initialize chroot.

**--clean**
> Clean chroot.

**--shell**
> Enter chroot shell.

**--rebuild**
> Rebuild SRPM.

**--help**
> Display help information.

# DESCRIPTION

**mock** builds RPMs in clean chroot environments. It isolates builds from the host system.

The tool creates reproducible builds. Used for Fedora/RHEL package building.

mock builds RPMs in chroot.

# CAVEATS

Fedora/RHEL focused. Requires mock group membership. Needs chroot configs.

# HISTORY

Mock was created by the **Fedora** project for building RPM packages in isolated environments.

# SEE ALSO

[rpmbuild](/man/rpmbuild)(8), [dnf](/man/dnf)(8), [koji](/man/koji)(1)

