# TAGLINE

Red Hat package manager

# TLDR

On modern distros (RHEL 8+, Fedora 22+), **yum** is a symlink to **dnf**.

**Install** a package

```sudo yum install [package]```

**Remove** a package

```sudo yum remove [package]```

**Update** all packages

```sudo yum update```

**Update** a specific package

```sudo yum update [package]```

**Search** for a package by name

```yum search [keyword]```

**List installed** packages

```yum list installed```

**Show info** about a package

```yum info [package]```

**Clean** cached data

```yum clean all```

# SYNOPSIS

**yum** [_options_] [_command_] [_package_...]

# PARAMETERS

**install** _package_
> Install one or more packages.

**remove** _package_
> Remove a package.

**update** [_package_]
> Update all packages, or a specific package if given.

**search** _keyword_
> Search package names and descriptions.

**info** _package_
> Display detailed information about a package.

**list** [_installed_|_available_|_updates_]
> List packages. Use **installed** for installed, **available** for repo packages, **updates** for available updates.

**clean** [_all_|_packages_|_metadata_]
> Clean cached data.

**provides** _file_
> Find which package provides a given file.

**groupinstall** _group_
> Install a package group.

**repolist** [_all_|_enabled_|_disabled_]
> List configured repositories.

**history**
> View transaction history.

**-y**
> Assume yes to all prompts.

**--enablerepo=**_repo_
> Temporarily enable a specific repository.

**--disablerepo=**_repo_
> Temporarily disable a specific repository.

**--nogpgcheck**
> Skip GPG signature checking.

# DESCRIPTION

**yum** (Yellowdog Updater Modified) is the traditional package manager for Red Hat-based Linux distributions. On modern systems (RHEL 8+, Fedora 22+), **yum** is a symlink to **dnf**, which provides the same functionality with improved performance.

On older systems like CentOS 7, yum is the native package manager handling package installation, updates, and removal from configured repositories.

# CAVEATS

On modern systems, yum is an alias for dnf. Behavior may differ slightly between legacy yum and dnf. Use **dnf** directly on newer systems.

# SEE ALSO

[dnf](/man/dnf)(8), [rpm](/man/rpm)(8), [apt-get](/man/apt-get)(8), [zypper](/man/zypper)(8)
