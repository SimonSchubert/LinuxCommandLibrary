# TAGLINE

Arch Linux package maintainer toolset

# TLDR

View **auth** documentation

```tldr pkgctl auth```

View **build** documentation

```tldr pkgctl build```

View **db update** documentation

```tldr pkgctl db update```

View **diff** documentation

```tldr pkgctl diff```

View **release** documentation

```tldr pkgctl release```

View **repo** documentation

```tldr pkgctl repo```

Display **version**

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

[makepkg](/man/makepkg)(8), [pacman](/man/pacman)(8), [devtools](/man/devtools)(7)
