# TLDR

**Clone a package from the Arch repositories**

```asp checkout [package]```

**Update all checked out packages**

```asp update```

**Export PKGBUILD files without full checkout**

```asp export [package]```

**List available packages in a repository**

```asp list-repos```

**Show package information**

```asp show [package]```

**Discard local changes and reset to upstream**

```asp update -f [package]```

# SYNOPSIS

**asp** _command_ [_options_] [_packages_]

# PARAMETERS

**checkout** _package_
> Clone a package's build files into a local directory.

**update** [_packages_]
> Update checked-out packages to latest version.

**export** _package_
> Copy PKGBUILD and related files to current directory.

**list-repos**
> List all available repositories.

**show** _package_
> Display package information.

**difflog** _package_
> Show commit history for a package.

**-f**, **--force**
> Force update, discarding local changes.

# DESCRIPTION

**asp** (Arch Source Package) is a tool for retrieving PKGBUILDs and related build files from the official Arch Linux package repositories. It provides access to the source recipes used to build packages in the core, extra, and multilib repositories.

Unlike downloading PKGBUILDs manually, asp uses a Git-based backend that enables tracking changes, viewing commit history, and updating packages efficiently. Each package is a separate Git branch, making it easy to see modifications between versions.

Common uses include: examining how official packages are built, modifying packages with custom options, backporting patches, and learning PKGBUILD best practices from official examples.

# CAVEATS

asp only provides build files from official Arch repositories, not the AUR. The checked-out files require **makepkg** to actually build packages. Local modifications are overwritten by **asp update -f**. Requires Git to be installed for the underlying VCS operations.

# HISTORY

The **asp** tool was created to replace the older **abs** (Arch Build System) tool, which downloaded a complete copy of all PKGBUILDs. Introduced around **2015**, asp uses Git to provide more efficient, incremental access to individual packages. It became the recommended method for obtaining official PKGBUILDs as the Arch package repositories moved to Git-based workflows.

# SEE ALSO

[makepkg](/man/makepkg)(8), [pacman](/man/pacman)(8), [yay](/man/yay)(8), [pkgctl](/man/pkgctl)(1)
