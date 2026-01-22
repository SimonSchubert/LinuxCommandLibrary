# TLDR

Create a **Debian Stable** directory chroot

```sudo mmdebstrap stable [path/to/debian-root]/```

Create a **Debian Bookworm** tarball chroot using a mirror

```mmdebstrap bookworm [path/to/debian-bookworm.tar] [http://mirror.example.org/debian]```

Create a Debian Sid tarball with **additional packages**

```mmdebstrap sid [path/to/debian-sid.tar] --include=[pkg1,pkg2]```

Create chroot using **user namespaces** (no root required)

```mmdebstrap --mode=unshare stable [path/to/debian.tar]```

Create **minimal chroot** with essential packages only

```mmdebstrap --variant=essential stable [path/to/minimal.tar]```

**Simulate** without downloading or installing

```mmdebstrap --simulate stable```

# SYNOPSIS

**mmdebstrap** [_options_] [_suite_ [_target_ [_mirror_...]]]

# PARAMETERS

**--mode _name_**
> Operation mode: auto, sudo, root, unshare, fakeroot, fakechroot, chrootless

**--format _name_**
> Output format: auto, directory, tar, squashfs, ext2, ext4, null

**--variant _name_**
> Package set: extract, custom, essential, apt, required, minbase, buildd, important, standard

**--include _packages_**
> Additional packages to install (comma-separated)

**--components _list_**
> Repository components: main, contrib, non-free

**--architectures _list_**
> Supported architectures (native and foreign)

**--keyring _file_**
> GPG keyring for signature verification

**--aptopt _option_**
> Pass options to apt

**--dpkgopt _option_**
> Pass options to dpkg

**--setup-hook _cmd_**
> Command to run after initial setup

**--customize-hook _cmd_**
> Command to run after packages installed

**--hook-directory _dir_**
> Execute hook scripts from directory

**--simulate, --dry-run**
> Test without downloading or installing

**-q, --quiet**
> Suppress output

**-v, --verbose**
> Show detailed output

# DESCRIPTION

**mmdebstrap** creates Debian chroots from one or more mirrors. It is an alternative to debootstrap that uses apt for dependency resolution, supports multiple mirrors simultaneously, and can operate without root privileges using user namespaces.

The suite can be a codename (bookworm, sid) or symbolic name (stable, unstable). The target can be a directory, tarball, squashfs image, ext2/ext4 image, or stdout. Output format is auto-detected from file extension.

# CAVEATS

The chrootless mode can modify the host system if used with unsupported packages. The unshare mode creates files with seemingly incorrect ownership outside the namespace; requires proper /etc/subuid and /etc/subgid configuration. Only works with apt-based distributions.

# HISTORY

**mmdebstrap** was developed by **Johannes Schauer Marin Rodrigues** as a faster, more flexible alternative to debootstrap. It supports reproducible builds when SOURCE_DATE_EPOCH is set and can be approximately twice as fast as debootstrap.

# SEE ALSO

[debootstrap](/man/debootstrap)(8), [apt](/man/apt)(8), [dpkg](/man/dpkg)(1)
