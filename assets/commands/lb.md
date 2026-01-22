# TLDR

**Initialize live build**

```lb config```

**Build live image**

```lb build```

**Clean build directory**

```lb clean```

**Configure with options**

```lb config --distribution [bookworm] --archive-areas "main contrib"```

**Full clean**

```lb clean --purge```

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
> Repository areas.

**--purge**
> Deep clean.

**--help**
> Display help information.

# DESCRIPTION

**lb** (live-build) creates Debian live system images. It builds bootable ISO images.

The tool supports customization of packages, configs, and hooks. It's the standard tool for Debian live images.

lb builds Debian live images.

# CAVEATS

Debian/Ubuntu specific. Root required. Disk space needed.

# HISTORY

live-build was created by the **Debian Live** project for building customizable live system images.

# SEE ALSO

[debootstrap](/man/debootstrap)(1), [mksquashfs](/man/mksquashfs)(1), [xorriso](/man/xorriso)(1)
