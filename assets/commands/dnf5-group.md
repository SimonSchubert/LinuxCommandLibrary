# TAGLINE

manage package groups in DNF5

# TLDR

**List all available and installed groups**

```dnf5 group list```

**List only installed groups**

```dnf5 group list --installed```

**Show detailed info about a group**

```dnf5 group info [group_name]```

**Install a group (mandatory and default packages)**

```dnf5 group install [group_name]```

**Install a group including optional packages**

```dnf5 group install --with-optional [group_name]```

**Remove a group and its exclusive packages**

```dnf5 group remove [group_name]```

**Upgrade a group**

```dnf5 group upgrade [group_name]```

# SYNOPSIS

**dnf5 group** {**list**|**info**} [_options_] [_group-spec_...]

**dnf5 group** {**install**|**remove**|**upgrade**} [_options_] _group-spec_...

# PARAMETERS

**list**
> List all matching groups, either installed or available.

**info**
> Print detailed information about groups. Accepts the same options as list.

**install**
> Mark the group installed and install its mandatory and default packages.

**remove**
> Mark the group removed and remove packages that do not belong to another installed group.

**upgrade**
> Upgrade the group definition and the packages belonging to the group.

**--available**
> Show only available (not installed) groups.

**--installed**
> Show only installed groups.

**--hidden**
> Show also hidden groups.

**--contains-pkgs** _PACKAGE_NAME_
> Show only groups containing packages with specified names. Supports globs.

**--with-optional**
> Include optional packages from the group (install only).

**--no-packages**
> Operate on the group without manipulating any packages (install/remove).

# DESCRIPTION

**dnf5 group** manages virtual collections of packages in DNF5. Groups bundle related packages together, such as "Development Tools" or "Server".

Note: From Fedora 37 to 40 (inclusive), `dnf` runs DNF v4 while `dnf5` runs DNF v5. Starting with Fedora 41, `dnf` is an alias for `dnf5`.

# SEE ALSO

[dnf-group](/man/dnf-group)(8), [dnf5](/man/dnf5)(8)
