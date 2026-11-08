# TAGLINE

Manage Arch Linux Git packaging repositories

# TLDR

**Clone** a package repository (requires SSH key in Arch Linux GitLab)

```pkgctl repo clone [pkgname]```

Clone a package repository over **HTTPS**

```pkgctl repo clone --protocol https [pkgname]```

**Create** a new GitLab package repository and clone it

```pkgctl repo create [pkgbase]```

**Switch** a package repository to a specified version

```pkgctl repo switch [version] [pkgbase]```

**Open** a package repository's website

```pkgctl repo web [pkgbase]```

# SYNOPSIS

**pkgctl repo** _command_ [_options_] [_package_]

# PARAMETERS

**clone**
> Clone a package repository

**create**
> Create a new GitLab repository

**switch**
> Switch to a specific version/branch

**web**
> Open repository in web browser

**clean**
> Remove untracked files from the working tree

**configure**
> Configure a clone according to distro specs

**--protocol https**
> Clone over read-only HTTPS instead of SSH

**-m**, **--maintainer _name_**
> Clone all packages of the named maintainer

**--universe**
> Clone all existing packages, useful for cache warming

**--switch _version_**
> Switch to a specific version after cloning

**-j**, **--jobs _n_**
> Run up to N jobs in parallel

# DESCRIPTION

**pkgctl repo** manages Git packaging repositories for Arch Linux packages hosted on GitLab. It provides commands to clone, create, and manage package source repositories.

The tool integrates with Arch Linux's GitLab infrastructure at gitlab.archlinux.org, where official package sources are maintained. SSH access requires configuring keys in your GitLab account.

Package maintainers use this to obtain sources for updating packages, while read-only HTTPS access allows anyone to view package build files.

# CAVEATS

SSH clone requires GitLab account with SSH key configured. Repository creation requires valid GitLab API authentication and appropriate permissions. Part of the pkgctl toolset for Arch Linux development.

# SEE ALSO

[pkgctl](/man/pkgctl)(1), [pkgctl-build](/man/pkgctl-build)(1), [git](/man/git)(1), [asp](/man/asp)(1)

# RESOURCES

```[Source code](https://gitlab.archlinux.org/archlinux/devtools)```

```[Documentation](https://man.archlinux.org/man/pkgctl-repo.1.en)```

<!-- verified: 2026-11-08 -->
