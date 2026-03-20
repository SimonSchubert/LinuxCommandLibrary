# TAGLINE

creates Debian live system images

# TLDR

**Initialize live build**

```lb config```

**Build live image**

```lb build```

**Clean build directory**

```lb clean```

**Configure with options**

```lb config --distribution [bookworm] --archive-areas "main contrib"```

**Build a specific image type**

```lb config --binary-images [iso-hybrid]```

**Clean including cache**

```lb clean --cache```

# SYNOPSIS

**lb** _command_ [_options_]

# PARAMETERS

**config**
> Initialize configuration.

**build**
> Build live image.

**clean**
> Clean build artifacts.

**--distribution** _NAME_
> Target distribution.

**--archive-areas** _AREAS_
> Repository areas (e.g. "main contrib non-free").

**--binary-images** _TYPE_
> Image type: iso, iso-hybrid, netboot, tar, hdd.

**--architecture** _ARCH_
> Target architecture (defaults to host architecture).

**--bootappend-live** _PARAMS_
> Boot parameters for live system.

**--cache**
> Clean cache directories (not cleaned by default).

**--force**
> Force helper execution, even if stage file exists.

**--quiet**
> Suppress output messages.

**--verbose**
> Show detailed output.

**--help**
> Display help information.

# DESCRIPTION

**lb** (live-build) creates Debian live system images. It builds bootable ISO, netboot, and HDD images.

The tool supports customization of packages, configs, and hooks. It's the standard tool for Debian live images. By default, `lb clean` removes chroot, binary, and source stages but preserves the cache.

# CAVEATS

Debian/Ubuntu specific. Root required. Disk space needed.

# HISTORY

live-build was created by the **Debian Live** project for building customizable live system images.

# SEE ALSO

[debootstrap](/man/debootstrap)(1), [mksquashfs](/man/mksquashfs)(1)
