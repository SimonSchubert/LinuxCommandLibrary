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

**--protocol _proto_**
> Clone protocol: ssh (default) or https

**--maintainer _name_**
> Filter by maintainer

**--universe**
> Clone from universe (community) rather than packages

# DESCRIPTION

**pkgctl repo** manages Git packaging repositories for Arch Linux packages hosted on GitLab. It provides commands to clone, create, and manage package source repositories.

The tool integrates with Arch Linux's GitLab infrastructure at gitlab.archlinux.org, where official package sources are maintained. SSH access requires configuring keys in your GitLab account.

Package maintainers use this to obtain sources for updating packages, while read-only HTTPS access allows anyone to view package build files.

# CAVEATS

SSH clone requires GitLab account with SSH key configured. Repository creation requires valid GitLab API authentication and appropriate permissions. Part of the pkgctl toolset for Arch Linux development.

# SEE ALSO

[pkgctl](/man/pkgctl)(1), [pkgctl-build](/man/pkgctl-build)(1), [git](/man/git)(1), [asp](/man/asp)(1)
