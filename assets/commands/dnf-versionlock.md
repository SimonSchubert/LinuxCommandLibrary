# TAGLINE

Lock package versions to prevent updates

# TLDR

**List** versionlock entries

```dnf versionlock list```

**Add** a versionlock for a package at its current version

```dnf versionlock add [package]```

**Add** a versionlock without resolving to a specific version

```dnf versionlock add --raw [package-name-spec]```

**Exclude** a specific package version from being installed

```dnf versionlock exclude [package]```

**Delete** a specific versionlock entry

```dnf versionlock delete [package]```

**Clear** all versionlock entries

```dnf versionlock clear```

# SYNOPSIS

**dnf versionlock** [_options_] [_add_|_exclude_|_list_|_delete_|_clear_] [_package-name-spec_]

# DESCRIPTION

**dnf versionlock** protects packages from being updated to newer versions. It is part of the dnf-plugins-core package.

The plugin walks each line of the versionlock file, parses the name and version, and excludes any package by that name that does not match a listed version. It can also work in reverse by prefixing a '!' to exclude a specific version.

Useful for keeping specific package versions that are known to work or avoiding problematic updates.

# PARAMETERS

**add** _package-name-spec_
> Lock package at its currently installed version. Only matching versions will be available for transactions.

**exclude** _package-name-spec_
> Exclude packages matching the spec from being installed or updated to.

**list**
> Display the current versionlock entries (default when no subcommand given).

**delete** _package-name-spec_
> Remove specific versionlock entries matching the spec.

**clear**
> Remove all versionlock entries.

**--raw**
> Do not resolve package-name-spec to specific NEVRAs. Use the spec as-is, allowing locks on versions not yet available.

# CONFIGURATION

**/etc/dnf/plugins/versionlock.list**
> Stores package version lock entries. Each line contains a package specification in NEVRA format. Lines prefixed with '!' act as excludes.

# CAVEATS

Requires the dnf-plugins-core package. Locked packages will not receive security updates unless the lock is removed or updated. Review locks periodically with `dnf versionlock list`. The lock file uses NEVRA format (name-epoch:version-release.arch) for precise version matching.

# SEE ALSO

[dnf](/man/dnf)(8), [yum-versionlock](/man/yum-versionlock)(8), [rpm](/man/rpm)(8), [yum](/man/yum)(8)
