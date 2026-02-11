# TAGLINE

Build Debian packages in clean chroot environments

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

**sbuild** builds Debian packages inside clean chroot environments managed by schroot, ensuring reproducible results by starting from a pristine base system for each build. Build dependencies are installed fresh each time, eliminating contamination from previous builds or the host system.

The tool supports cross-architecture builds, allowing packages to be compiled for different platforms like arm64 or armhf from an x86 host. It is compatible with the Debian buildd infrastructure, meaning packages built with sbuild match the same build process used by official Debian archive builders.

# CAVEATS

Requires chroot setup. Root privileges needed. Debian/Ubuntu focused.

# HISTORY

**sbuild** was originally developed for the **Debian** buildd network. It provides clean and reproducible package builds.

# SEE ALSO

[dpkg-buildpackage](/man/dpkg-buildpackage)(1), [pbuilder](/man/pbuilder)(1), [schroot](/man/schroot)(1)
