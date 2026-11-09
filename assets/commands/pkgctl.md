# TAGLINE

Arch Linux package maintainer toolset

# TLDR

**Authenticate** with the Arch Linux GitLab instance

```pkgctl auth login```

**Clone** a packaging repository from GitLab

```pkgctl repo clone [pkgbase]```

**Build** a package inside a clean chroot

```pkgctl build```

**Rebuild**, release and update the database in one step

```pkgctl build --rebuild --release --db-update --message "[rebuild reason]"```

**Compare** the current package with the repository version

```pkgctl diff```

**Release** a package to the binary repositories

```pkgctl release```

**Update** the binary repository database after a release

```pkgctl db update```

**Check** package versions against upstream

```pkgctl version check```

Display **pkgctl version** information

```pkgctl --version```

# SYNOPSIS

**pkgctl** _command_ [_options_]

# PARAMETERS

**-V**, **--version**
> Show pkgctl version information.

**-h**, **--help**
> Show help text.

# COMMANDS

**aur**
> Interact with the Arch User Repository

**auth**
> Authenticate with services like GitLab

**build**
> Build packages inside a clean chroot

**db move**
> Move packages between pacman repositories

**db remove**
> Remove packages from pacman repositories

**db update**
> Update the pacman database as the final release step

**diff**
> Compare package files using different modes

**issue**
> Work with GitLab packaging issues

**license**
> Check and manage package licenses

**release**
> Commit, tag and upload build artifacts

**repo**
> Manage Git packaging repositories and their configuration

**search**
> Search for an expression across the GitLab packaging group

**version check**
> Compare local package versions against upstream

**version setup**
> Detect and set up a basic nvchecker configuration

**version upgrade**
> Adjust the PKGBUILD to match the latest upstream version

# DESCRIPTION

**pkgctl** is the unified command-line interface for Arch Linux package maintainer tools. It consolidates various devtools commands into a single entry point, simplifying the workflow for building and releasing Arch packages.

The tool integrates with Arch infrastructure including GitLab and the binary repositories.

# CAVEATS

Intended for Arch package maintainers. Provided by the **devtools** package. Releasing packages and updating the repository databases require maintainer access, and GitLab operations require authentication. Understanding of PKGBUILD files required.

# HISTORY

**pkgctl** was added to **devtools** in **May 2023**, around Arch Linux's move of its packaging sources to Git on GitLab.

# SEE ALSO

[makepkg](/man/makepkg)(8), [pacman](/man/pacman)(8), [devtools](/man/devtools)(7), [pkgctl-build](/man/pkgctl-build)(1), [pkgctl-repo](/man/pkgctl-repo)(1)

# RESOURCES

```[Source code](https://gitlab.archlinux.org/archlinux/devtools)```

```[Documentation](https://man.archlinux.org/man/pkgctl.1)```

<!-- verified: 2026-11-09 -->
