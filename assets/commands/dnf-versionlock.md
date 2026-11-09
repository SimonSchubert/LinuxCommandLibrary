# TAGLINE

Lock package versions to prevent updates

# TLDR

**List** versionlock entries

```dnf versionlock list```

**Add** a versionlock for a package at its current version

```sudo dnf versionlock add [package]```

**Add** a versionlock without resolving to a specific version

```sudo dnf versionlock add --raw '[package-5.*]'```

**Exclude** a specific package version from being installed

```sudo dnf versionlock exclude [package-version]```

**Delete** a specific versionlock entry

```sudo dnf versionlock delete [package]```

**Clear** all versionlock entries

```sudo dnf versionlock clear```

# SYNOPSIS

**dnf versionlock** [_options_] [_add_|_exclude_|_list_|_delete_|_clear_] [_package-name-spec_]

# DESCRIPTION

**dnf versionlock** protects packages from being updated to newer versions. On DNF 4 it is a plugin from the dnf-plugins-core project, usually packaged as **python3-dnf-plugin-versionlock**; DNF 5 provides the command natively.

The versionlock file is read entry by entry, and any package of a listed name that does not match a listed version is excluded. It can also work in reverse, excluding one specific version.

Useful for keeping specific package versions that are known to work or avoiding problematic updates.

# PARAMETERS

**add** _package-name-spec_
> Lock package to matching versions, searched first among installed packages and otherwise among all available ones. Only those versions will be available for transactions.

**exclude** _package-name-spec_
> Exclude packages matching the spec from being installed or updated to.

**list**
> Display the current versionlock entries (default when no subcommand given).

**delete** _package-name-spec_
> Remove specific versionlock entries matching the spec.

**clear**
> Remove all versionlock entries.

**--raw**
> DNF 4 only. Do not resolve package-name-spec to specific NEVRAs. Use the spec as-is, allowing locks on versions not yet available.

# CONFIGURATION

**/etc/dnf/plugins/versionlock.list**
> DNF 4 lock file. Each line contains a package specification. Lines prefixed with '!' act as excludes. Its location is set by **locklist** in **/etc/dnf/plugins/versionlock.conf**.

**/etc/dnf/versionlock.toml**
> DNF 5 lock file, in TOML format.

# CAVEATS

Locked packages will not receive security updates unless the lock is removed or updated. Review locks periodically with `dnf versionlock list`. Excludes are not applied in non-transactional operations such as repoquery, list and info, and local package files passed on the command line are not affected.

# SEE ALSO

[dnf](/man/dnf)(8), [dnf5](/man/dnf5)(8), [yum-versionlock](/man/yum-versionlock)(8), [rpm](/man/rpm)(8), [yum](/man/yum)(8)

# RESOURCES

```[Source code](https://github.com/rpm-software-management/dnf-plugins-core)```

```[Documentation](https://dnf-plugins-core.readthedocs.io/en/latest/versionlock.html)```

<!-- verified: 2026-11-09 -->
