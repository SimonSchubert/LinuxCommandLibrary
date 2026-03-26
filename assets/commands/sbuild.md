# TAGLINE

Build Debian packages in clean chroot environments

# TLDR

**Build a package**

```sbuild [package.dsc]```

**Build for a specific distribution**

```sbuild -d [unstable] [package.dsc]```

**Build for a specific architecture**

```sbuild --arch=[arm64] [package.dsc]```

**Build with parallel jobs**

```sbuild -j[4] [package.dsc]```

**Build and run lintian afterwards**

```sbuild --run-lintian [package.dsc]```

**Create a chroot**

```sbuild-createchroot [unstable] [/srv/chroot/unstable] [http://deb.debian.org/debian]```

# SYNOPSIS

**sbuild** [_-d dist_] [_--arch arch_] [_options_] _dsc-file_

# PARAMETERS

**-d**, **--dist=**_DIST_
> Target distribution (e.g. unstable, bookworm).

**--arch=**_ARCH_
> Build architecture (e.g. amd64, arm64).

**-c**, **--chroot=**_CHROOT_
> Use a specific chroot environment.

**-j**, **--jobs=**_N_
> Number of parallel build jobs.

**-s**, **--source**
> Build source package in addition to binaries.

**-A**, **--arch-all**
> Also build architecture-independent packages.

**--build-dep-resolver=**_RESOLVER_
> Choose dependency resolver: apt (default), aptitude, aspcud.

**--extra-repository=**_SPEC_
> Add an additional apt repository for the build.

**--run-lintian**
> Run lintian after a successful build.

**--no-clean-source**
> Skip running debian/rules clean before building.

**--profiles=**_PROFILE[,...]_
> Specify build profiles.

**-p**, **--purge=**_MODE_
> Purge build directory: always, never, or successful.

**-v**, **--verbose**
> Verbose output.

**-n**, **--nolog**
> Print output to stdout only, skip log files.

# DESCRIPTION

**sbuild** builds Debian packages inside clean chroot environments managed by schroot, ensuring reproducible results by starting from a pristine base system for each build. Build dependencies are installed fresh each time, eliminating contamination from previous builds or the host system.

The tool supports cross-architecture builds, allowing packages to be compiled for different platforms like arm64 or armhf from an x86 host. It is compatible with the Debian buildd infrastructure, meaning packages built with sbuild match the same build process used by official Debian archive builders.

# CAVEATS

Requires chroot setup via sbuild-createchroot. Root privileges or appropriate group membership (sbuild group) needed. Primarily for Debian/Ubuntu packaging.

# HISTORY

**sbuild** was originally developed for the **Debian** buildd network. It provides clean and reproducible package builds.

# SEE ALSO

[dpkg-buildpackage](/man/dpkg-buildpackage)(1), [pbuilder](/man/pbuilder)(1), [schroot](/man/schroot)(1), [debootstrap](/man/debootstrap)(1), [lintian](/man/lintian)(1)
