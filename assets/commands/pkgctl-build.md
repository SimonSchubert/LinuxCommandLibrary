# TLDR

Automatically choose the right build script to **build packages** in a clean chroot

```pkgctl build```

Manually build packages with **specific options**

```pkgctl build --arch [architecture] --repo [repository] --clean```

# SYNOPSIS

**pkgctl build** [_options_]

# PARAMETERS

**--arch _arch_**
> Target architecture to build for

**--repo _name_**
> Target repository

**--clean**
> Clean the chroot before building

**--staging**
> Build against staging repositories

**--testing**
> Build against testing repositories

**--worker _n_**
> Number of parallel workers

**--inspect _when_**
> Inspect chroot: always, never, or failure

# DESCRIPTION

**pkgctl build** builds Arch Linux packages inside a clean chroot environment, ensuring reproducible and isolated builds. It's the official tool for Arch Linux packagers to build packages for the repositories.

The command automatically detects the appropriate build configuration from the PKGBUILD and repository settings. It uses **devtools** infrastructure to create isolated build environments.

Building in a clean chroot prevents host system contamination and ensures packages only depend on declared dependencies.

# CAVEATS

Requires devtools package and proper chroot setup. First build downloads base system packages. Requires sufficient disk space for chroot. Part of the pkgctl toolset for Arch Linux maintainers.

# SEE ALSO

[pkgctl](/man/pkgctl)(1), [pkgctl-repo](/man/pkgctl-repo)(1), [makepkg](/man/makepkg)(8), [makechrootpkg](/man/makechrootpkg)(1)
