# TLDR

**Build package**

```sbuild [package.dsc]```

**Build for distribution**

```sbuild -d [unstable] [package.dsc]```

**Build with arch**

```sbuild --arch=[arm64] [package.dsc]```

**Clean chroot**

```sbuild-update --clean [chroot-name]```

**Create chroot**

```sbuild-createchroot [unstable] [/srv/chroot/unstable]```

# SYNOPSIS

**sbuild** [_-d dist_] [_--arch arch_] [_options_] _dsc-file_

# PARAMETERS

**-d** _DIST_
> Target distribution.

**--arch** _ARCH_
> Build architecture.

**-c** _CHROOT_
> Use specific chroot.

**-n**
> No install build-deps.

**--purge** _WHEN_
> Purge build directory.

**-v**
> Verbose output.

# DESCRIPTION

**sbuild** builds Debian packages. It uses clean chroot environments.

Reproducible builds. Clean environment each time.

Cross-architecture support. Build for other platforms.

Buildd compatible. Same as Debian infrastructure.

Schroot-based isolation. Safe building.

# CAVEATS

Requires chroot setup. Root privileges needed. Debian/Ubuntu focused.

# HISTORY

**sbuild** was originally developed for the **Debian** buildd network. It provides clean and reproducible package builds.

# SEE ALSO

[dpkg-buildpackage](/man/dpkg-buildpackage)(1), [pbuilder](/man/pbuilder)(1), [schroot](/man/schroot)(1)
