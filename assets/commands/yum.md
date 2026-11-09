# TAGLINE

Red Hat package manager

# TLDR

**Install** a package

```sudo yum install [package]```

**Remove** a package

```sudo yum remove [package]```

**Update** all packages

```sudo yum update```

**Update** a specific package

```sudo yum update [package]```

**Check** for available updates

```yum check-update```

**Search** for a package by name

```yum search [keyword]```

**List installed** packages

```yum list installed```

**Show info** about a package

```yum info [package]```

Find which package **provides** a file

```yum provides [path/to/file]```

**Install** a package group

```sudo yum groupinstall "[group_name]"```

**Undo** a transaction

```sudo yum history undo [transaction_id]```

**Clean** cached data

```yum clean all```

# SYNOPSIS

**yum** [_options_] [_command_] [_package_...]

# PARAMETERS

**install** _package_
> Install one or more packages.

**remove**, **erase** _package_
> Remove a package.

**autoremove**
> Remove packages that were installed as dependencies and are no longer needed.

**update** [_package_]
> Update all packages, or a specific package if given.

**upgrade** [_package_]
> Like **update**, but also removes obsoleted packages.

**check-update**
> List available updates without installing them.

**reinstall** _package_
> Reinstall the current version of a package.

**downgrade** _package_
> Downgrade a package to an earlier version.

**distro-sync**
> Synchronize installed packages to the latest versions in the enabled repositories.

**localinstall** _file_
> Install a local RPM file, resolving dependencies from repositories.

**search** _keyword_
> Search package names and descriptions.

**info** _package_
> Display detailed information about a package.

**list** [_installed_|_available_|_updates_]
> List packages. Use **installed** for installed, **available** for repo packages, **updates** for available updates.

**clean** [_all_|_packages_|_metadata_]
> Clean cached data.

**provides**, **whatprovides** _file_
> Find which package provides a given file.

**deplist** _package_
> List the dependencies of a package.

**makecache**
> Download and cache repository metadata.

**groupinstall** _group_
> Install a package group.

**repolist** [_all_|_enabled_|_disabled_]
> List configured repositories.

**history** [_list_|_info_|_undo_|_redo_]
> View or manage transaction history.

**-y**, **--assumeyes**
> Assume yes to all prompts.

**--assumeno**
> Assume no to all prompts.

**-q**, **--quiet**
> Suppress output.

**-C**, **--cacheonly**
> Run entirely from the system cache.

**-x**, **--exclude=**_package_
> Exclude packages by name or glob.

**--skip-broken**
> Skip packages with dependency problems.

**--downloadonly**
> Download packages without installing them.

**--downloaddir=**_directory_
> Directory to store downloaded packages.

**--installroot=**_root_
> Use an alternative installation root.

**--releasever=**_version_
> Override the distribution release version.

**--security**
> Limit updates to packages with security advisories.

**--showduplicates**
> Show all versions in list and search output.

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

On modern systems, yum is an alias for dnf, and some options of legacy yum are unavailable or behave differently. Use **dnf** directly on newer systems. CentOS 7, a typical legacy yum system, reached end of life in June 2024.

# SEE ALSO

[dnf](/man/dnf)(8), [rpm](/man/rpm)(8), [yum-config-manager](/man/yum-config-manager)(1), [yum-versionlock](/man/yum-versionlock)(8), [apt-get](/man/apt-get)(8), [zypper](/man/zypper)(8)

# RESOURCES

```[Source code](https://github.com/rpm-software-management/yum)```

```[Homepage](http://yum.baseurl.org/)```

<!-- verified: 2026-11-09 -->
