# TAGLINE

Retrieve Arch Linux package build files

# TLDR

**Clone a package from the Arch repositories**

```asp checkout [package]```

**Update all checked out packages**

```asp update```

**Export PKGBUILD files without full checkout**

```asp export [package]```

**List repositories** containing a package

```asp list-repos [package]```

**Show** PKGBUILD content for a package

```asp show [package]```

**View revision history** for a package

```asp log [package]```

**List all locally tracked** packages

```asp list-local```

# SYNOPSIS

**asp** _command_ [_options_] [_packages_]

# PARAMETERS

**checkout** _package_
> Create a git repository with full source and history for the given package.

**export** _package_
> Dump build source files into a directory named after the package in the current directory.

**update** [_packages_]
> Track new packages or refresh existing ones from remote.

**show** _package_ [_file_]
> Display PKGBUILD content, or a specific file if given.

**log** _package_
> Show revision history for a package.

**difflog** _package_
> Show revision history with file diffs.

**shortlog** _package_
> Show condensed revision history.

**list-repos** _package_
> List repositories containing the given package.

**list-arches** _package_
> List architectures available for the given package.

**list-all**
> List all available packages.

**list-local**
> List all locally tracked packages.

**ls-files** _package_
> List source files for the given package.

**untrack** _package_
> Remove remote tracking branch from local repository.

**disk-usage**
> Report approximate disk usage for locally tracked packages.

**gc**
> Perform housekeeping to optimize and compact the local repo.

**set-git-protocol** _protocol_
> Set communication protocol (git, http, or https).

**-a** _arch_
> Use a non-default architecture.

**-h**
> Display help text.

**-V**
> Show version information.

# DESCRIPTION

**asp** (Arch Build Source Management Tool) manages version-controlled sources for the build scripts used to create Arch Linux packages. It provides a thin wrapper over the svntogit repositories and serves as a replacement for the older **abs** tool.

Unlike downloading PKGBUILDs manually, asp uses a Git-based backend with sparse checkouts, enabling tracking changes, viewing commit history, and updating individual packages efficiently.

Common uses include: examining how official packages are built, modifying packages with custom options, backporting patches, and learning PKGBUILD best practices from official examples.

# CAVEATS

asp only provides build files from official Arch repositories, not the AUR. The checked-out files require **makepkg** to actually build packages. Requires Git to be installed for the underlying VCS operations. Package metadata is stored in **$ASPROOT** (defaults to **$XDG_CACHE_HOME/asp** or **~/.cache/asp**).

# HISTORY

The **asp** tool was created to replace the older **abs** (Arch Build System) tool, which downloaded a complete copy of all PKGBUILDs. Introduced around **2015**, asp uses Git to provide more efficient, incremental access to individual packages. It became the recommended method for obtaining official PKGBUILDs as the Arch package repositories moved to Git-based workflows.

# SEE ALSO

[makepkg](/man/makepkg)(8), [pacman](/man/pacman)(8), [yay](/man/yay)(1), [paru](/man/paru)(1), [pkgctl](/man/pkgctl)(1), [git](/man/git)(1)
