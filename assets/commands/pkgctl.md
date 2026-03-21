# TAGLINE

Arch Linux package maintainer toolset

# TLDR

**Authenticate** with the Arch Linux GitLab instance

```pkgctl auth login```

**Build** a package inside a clean chroot

```pkgctl build```

**Update** the binary repository database after a release

```pkgctl db update```

**Compare** the current package with the repository version

```pkgctl diff```

**Release** a package to the binary repositories

```pkgctl release```

**Clone** a packaging repository from GitLab

```pkgctl repo clone [pkgbase]```

Display **version** information

```pkgctl version```

# SYNOPSIS

**pkgctl** [_command_] [_options_]

# COMMANDS

**auth**
> Authenticate with GitLab and other services

**build**
> Build packages in clean chroot

**db update**
> Update binary repository database

**diff**
> Compare package files

**release**
> Release build artifacts

**repo**
> Manage Git packaging repositories

**version**
> Display version information

# DESCRIPTION

**pkgctl** is the unified command-line interface for Arch Linux package maintainer tools. It consolidates various devtools commands into a single entry point, simplifying the workflow for building and releasing Arch packages.

The tool integrates with Arch infrastructure including GitLab, the binary repositories, and the Arch Build System (ABS).

# CAVEATS

Intended for Arch package maintainers. Requires devtools package. Authentication needed for some operations. Understanding of PKGBUILD files required.

# HISTORY

**pkgctl** was introduced as part of modernizing Arch Linux devtools. It provides a unified interface replacing scattered tools like archbuild, archrelease, and others, improving the package maintainer experience.

# SEE ALSO

[makepkg](/man/makepkg)(8), [pacman](/man/pacman)(8), [devtools](/man/devtools)(7), [asp](/man/asp)(1), [pkgctl-build](/man/pkgctl-build)(1)
