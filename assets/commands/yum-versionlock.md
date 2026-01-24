# TLDR

**Lock a package** to its currently installed version

```sudo yum versionlock add [package_name]```

**List all locked packages**

```yum versionlock list```

**Remove a lock** from a specific package

```sudo yum versionlock delete [package_name]```

**Clear all version locks**

```sudo yum versionlock clear```

**Lock a package to a specific version**

```sudo yum versionlock add [package_name]-[version]-[release]```

**Exclude packages matching a pattern** from updates

```sudo yum versionlock exclude [package_pattern*]```

**Show status** of versionlock plugin

```yum versionlock status```

# SYNOPSIS

**yum versionlock** [_add_] [_list_] [_delete_] [_clear_] [_exclude_] [_status_] [_package ..._]

# PARAMETERS

**add** _package_
> Lock the specified package(s) to their currently installed versions. Prevents yum from updating these packages.

**list**
> Display all currently locked packages and their versions.

**delete** _package_
> Remove the version lock from the specified package(s), allowing them to be updated again.

**clear**
> Remove all version locks from the system.

**exclude** _package_
> Add packages to the exclude list based on wildcards or patterns.

**status**
> Show whether the versionlock plugin is enabled and functioning.

# DESCRIPTION

**yum-versionlock** is a yum plugin that allows administrators to lock specific packages to their currently installed versions, preventing them from being updated during system upgrades. This is useful for maintaining stability when newer package versions might break compatibility or when specific versions are required for compliance.

When a package is locked, yum will skip it during **yum update** operations, even if newer versions are available in configured repositories. The lock persists across reboots and update sessions until explicitly removed.

Locked packages are stored in **/etc/yum/pluginconf.d/versionlock.list** (or similar path depending on the distribution). Each entry follows the NEVRA format: name-epoch:version-release.arch.

The plugin must be installed separately via **yum install yum-plugin-versionlock** (RHEL/CentOS 7) or **dnf install python3-dnf-plugin-versionlock** (Fedora/RHEL 8+). On newer systems using DNF, the command syntax is **dnf versionlock**.

# CAVEATS

Locking packages may create dependency conflicts if other packages require newer versions. Security updates are also blocked for locked packages, potentially leaving vulnerabilities unpatched. The lock file format changed between yum and dnf versions. Version locks do not prevent manual installation of specific versions.

# HISTORY

The versionlock plugin was developed as part of the yum-utils package collection for Red Hat-based Linux distributions. It provided functionality similar to apt-mark hold on Debian systems. With the transition from yum to DNF in Fedora 22 (2015) and RHEL 8 (2019), the plugin was rewritten as a DNF plugin while maintaining command compatibility.

# SEE ALSO

[yum](/man/yum)(8), [dnf](/man/dnf)(8), [rpm](/man/rpm)(8), [yum-config-manager](/man/yum-config-manager)(1)
