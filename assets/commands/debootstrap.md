# TLDR

Create a **Debian stable** system

```sudo debootstrap stable [path/to/debian-root]/ http://deb.debian.org/debian```

Create a **minimal** system

```sudo debootstrap --variant=minbase stable [path/to/debian-root]/```

Create **Debian Unstable** with local mirror

```sudo debootstrap sid [path/to/sid-root]/ file:///[path/to/mirror]/```

Switch to the **bootstrapped system**

```sudo chroot [path/to/root]```

**List** available releases

```ls /usr/share/debootstrap/scripts/```

# SYNOPSIS

**debootstrap** [_options_] _suite_ _target_ [_mirror_]

# DESCRIPTION

**debootstrap** installs a basic Debian system into a subdirectory. It downloads packages from a mirror and installs them to create a minimal working system that can be used for chroot environments, containers, or new installations.

The resulting system is minimal but functional, suitable for further customization.

# PARAMETERS

**--variant** _variant_
> minbase (minimal), buildd (build dependencies), fakechroot

**--arch** _arch_
> Target architecture (amd64, i386, arm64, etc.)

**--include** _packages_
> Additional packages to install

**--exclude** _packages_
> Packages to exclude

**--foreign**
> First stage only (for cross-architecture)

# CAVEATS

Requires root privileges. The target directory must exist. For cross-architecture bootstrapping, qemu-user-static may be needed. After debootstrap, additional configuration (networking, fstab, etc.) is usually needed.

# SEE ALSO

[chroot](/man/chroot)(8), [schroot](/man/schroot)(1), [systemd-nspawn](/man/systemd-nspawn)(1)
