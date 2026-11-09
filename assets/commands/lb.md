# TAGLINE

creates Debian live system images

# TLDR

**Create a build configuration** in the current directory

```lb config```

**Build the live image**

```sudo lb build```

**Clean the build directory, keeping the cache**

```sudo lb clean```

**Remove only binary artifacts before a rebuild**

```sudo lb clean --binary```

**Remove everything, including all caches**

```sudo lb clean --purge```

**Configure a distribution and archive areas**

```lb config --distribution [trixie] --archive-areas "[main contrib non-free-firmware]"```

**Build a specific image type**

```lb config --binary-image [iso-hybrid]```

**Set boot parameters for the live system**

```lb config --bootappend-live "[boot=live components quiet]"```

# SYNOPSIS

**lb** _command_ [_options_]

# PARAMETERS

**config**
> Create a config/ hierarchy with the build configuration.

**build**
> Build the live image. Requires root.

**clean**
> Clean build artifacts. Requires root.

**-d**, **--distribution** _CODENAME_
> For **lb config**: target distribution (default: testing).

**--archive-areas** _AREAS_
> For **lb config**: repository areas, default main only.

**-b**, **--binary-image** _TYPE_
> For **lb config**: image type: iso, iso-hybrid, netboot, tar or hdd. Older versions spell it **--binary-images**.

**-a**, **--architecture** _ARCH_
> For **lb config**: target architecture (defaults to host architecture).

**--bootappend-live** _PARAMS_
> For **lb config**: boot parameters for the live system.

**--all**
> For **lb clean**: remove chroot, binary, stage and source. The default.

**--cache**
> For **lb clean**: remove the cache directories.

**--chroot**
> For **lb clean**: unmount and remove the chroot directory.

**--binary**
> For **lb clean**: remove binary-related caches, files, directories and stage files.

**--stage**
> For **lb clean**: remove all stage files.

**--source**
> For **lb clean**: remove source-related caches, files, directories and stage files.

**--remove**
> For **lb clean**: remove everything including the package cache, but not the stage cache. config/ is kept.

**--purge**
> For **lb clean**: remove everything, including all caches. config/ is kept.

**--force**
> Force helper execution, even if a stage file exists.

**--debug**
> Show debug information.

**--color**, **--no-color**
> Enable or disable color in messages.

**--quiet**
> Suppress output messages.

**--verbose**
> Show detailed output.

**-h**, **--help**
> Display help information.

**-v**, **--version**
> Display version information.

# DESCRIPTION

**lb** is the front end of **live-build**, the Debian Live tool suite. It creates bootable ISO, netboot, tar and HDD live images from a config/ directory.

Run **lb config** in an empty directory, adjust the generated configuration, then run **lb build**. Packages, included files and hooks can be customized under config/. Each stage records completion in a stage file, so a repeated build only redoes unfinished stages.

# CAVEATS

Debian and derivatives only. **lb build** and **lb clean** need root and a lot of disk space. Run **lb clean** after a configuration change, or stale stages are reused. Cross-building for an architecture the host cannot execute is not possible.

# HISTORY

live-build was written by **Daniel Baumann** for the **Debian Live** project and is now maintained by the Debian Live team.

# SEE ALSO

[debootstrap](/man/debootstrap)(1), [mksquashfs](/man/mksquashfs)(1)

# RESOURCES

```[Source code](https://salsa.debian.org/live-team/live-build)```

```[Documentation](https://live-team.pages.debian.net/live-manual/)```

<!-- verified: 2026-11-09 -->
