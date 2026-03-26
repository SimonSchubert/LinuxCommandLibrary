# TAGLINE

Community package manager for all Linux distros

# TLDR

**Install** a package from LURE repos

```lure install [package]```

**Upgrade** all installed LURE packages

```lure upgrade```

**Show information** about a package

```lure info [package]```

**List** all packages in LURE repos

```lure list```

**List only installed** LURE packages

```lure list --installed```

**Add** a new repository

```lure addrepo -n [name] -u [https://github.com/user/repo]```

**Remove** a repository

```lure removerepo -n [name]```

**Refresh** all repositories

```lure refresh```

# SYNOPSIS

**lure** [_command_] [_options_]

# PARAMETERS

**install**, **in**
> Install a package from LURE repos. Packages not found in LURE are forwarded to the system package manager.

**remove**, **rm**
> Remove a package via the system package manager.

**upgrade**, **up**
> Upgrade installed LURE packages using rpmvercmp version comparison.

**info**
> Display package information from LURE repos. Supports wildcards (%).

**list**, **ls**
> List all packages in LURE repos. Accepts an optional pattern for filtering.

**build**
> Build a package from a lure.sh script in the current directory.

**addrepo**, **ar**
> Add a new repository. Requires **-n** (name) and **-u** (URL).

**removerepo**, **rr**
> Remove a repository and delete its contents. Requires **-n** (name).

**refresh**, **ref**
> Pull latest changes from all LURE repositories.

**fix**
> Delete and rebuild LURE's cache to resolve issues.

**version**
> Print the current LURE version.

**-c**, **--clean**
> Force a rebuild when installing or upgrading.

**-I**, **--installed**
> Show only installed packages when listing.

**-s** _path_
> Specify a custom lure.sh script path when building.

# DESCRIPTION

**LURE** (Linux User REpository) is a distro-agnostic package manager that brings AUR-like functionality to all Linux distributions. It reads **lure.sh** build scripts from git repositories, builds native packages (.deb, .rpm, .pkg.tar.zst, .apk), and installs them using the system's native package manager.

LURE supports **apt**, **pacman**, **apk**, **dnf**, **yum**, and **zypper**. Packages are built from lure.sh scripts similar to Arch's PKGBUILD format. Repositories are standard git repos containing directories with lure.sh files that describe how to build each package.

# CONFIGURATION

LURE uses environment variables for targeting specific distributions and architectures:

**LURE_DISTRO** — Target distribution (arch, alpine, opensuse, debian)
**LURE_PKG_FORMAT** — Package format (archlinux, apk, rpm, deb)
**LURE_ARM_VARIANT** — ARM variant (arm5, arm6, arm7)

# CAVEATS

LURE is written in pure Go with zero runtime dependencies beyond a privilege elevation command (sudo, doas) and a supported package manager. Build scripts from community repositories are not officially vetted — always review lure.sh files before installing packages, similar to AUR PKGBUILD review practices.

# HISTORY

LURE was created to solve the problem of packaging software for multiple Linux distributions. Inspired by the **Arch User Repository** (AUR), it was designed to bring the same community-driven package building model to all major Linux distros. Written in **Go**, it was first released in **2022** and is actively maintained at **lure.sh**.

# SEE ALSO

[yay](/man/yay)(1), [pacman](/man/pacman)(8), [apt](/man/apt)(8), [dnf](/man/dnf)(8), [zypper](/man/zypper)(8)
