# TAGLINE

Lock packages to specific versions

# TLDR

**Lock a package** to its currently installed version

```sudo yum versionlock add [package_name]```

**List all locked packages**

```yum versionlock list```

**Remove a lock** from a specific package

```sudo yum versionlock delete [package_name]```

**Clear all version locks**

```sudo yum versionlock clear```

**Lock a specific installed version** of a package

```sudo yum versionlock add [package_name]-[version]-[release]```

**Exclude packages matching a pattern** from updates

```sudo yum versionlock exclude [package_pattern*]```

**List updates blocked** by versionlock (yum only)

```yum versionlock status```

# SYNOPSIS

**yum versionlock** [_add_] [_list_] [_delete_] [_clear_] [_exclude_] [_status_] [_package ..._]

# PARAMETERS

**add** _package_
> Lock the specified package(s) to their currently installed versions. Prevents yum from updating these packages. DNF also locks to available versions when the package is not installed.

**list**
> Display all currently locked packages and their versions.

**delete** _package_
> Remove the version lock from the specified package(s), allowing them to be updated again.

**clear**
> Remove all version locks from the system.

**exclude** _package_
> Disallow currently available versions of the packages matching the given wildcards.

**status**
> List any available updates that are currently blocked by versionlock (yum only, not in DNF).

**--raw**
> DNF only: use the given spec as is instead of resolving it to NEVRAs, for example **dnf versionlock add --raw 'bash-5.*'**.

# DESCRIPTION

**yum-versionlock** is a yum plugin that allows administrators to lock specific packages to their currently installed versions, preventing them from being updated during system upgrades. This is useful for maintaining stability when newer package versions might break compatibility or when specific versions are required for compliance.

When a package is locked, yum excludes every other version of it, so **yum update** skips the package even if newer versions are available in configured repositories. The lock persists across reboots and update sessions until explicitly removed.

Locked packages are stored in **/etc/yum/pluginconf.d/versionlock.list** with entries of the form EPOCH:NAME-VERSION-RELEASE.ARCH, one per line, optionally prefixed with **!** for excludes. The DNF plugin uses **/etc/dnf/plugins/versionlock.list** and dnf5 uses the TOML file **/etc/dnf/versionlock.toml**.

The plugin must be installed separately via **yum install yum-plugin-versionlock** (RHEL/CentOS 7) or **dnf install python3-dnf-plugin-versionlock** (Fedora/RHEL 8+). On newer systems using DNF, the command syntax is **dnf versionlock**, which dnf5 provides as a built-in command.

# CAVEATS

Locking packages may create dependency conflicts if other packages require newer versions. Security updates are also blocked for locked packages, potentially leaving vulnerabilities unpatched. The lock file format differs between yum, dnf and dnf5. In DNF the lock only applies to in-repository packages, so local RPM files given on the command line are not affected.

# HISTORY

The versionlock plugin was developed as part of the yum-utils package collection for Red Hat-based Linux distributions. It provided functionality similar to apt-mark hold on Debian systems. With the transition from yum to DNF in Fedora 22 (2015) and RHEL 8 (2019), the plugin was rewritten as a DNF plugin while maintaining command compatibility.

# SEE ALSO

[yum](/man/yum)(8), [dnf](/man/dnf)(8), [rpm](/man/rpm)(8), [yum-config-manager](/man/yum-config-manager)(1)

# RESOURCES

```[Source code](https://github.com/rpm-software-management/yum-utils)```

```[Documentation](https://dnf-plugins-core.readthedocs.io/en/latest/versionlock.html)```

<!-- verified: 2026-11-09 -->
