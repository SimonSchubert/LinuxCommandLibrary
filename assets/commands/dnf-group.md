# TAGLINE

manage package groups

# TLDR

**List** DNF groups

```dnf group list```

Show **group info**

```dnf group info [group_name]```

**Install** a group

```dnf group install [group_name]```

**Remove** a group

```dnf group remove [group_name]```

**Upgrade** a group

```dnf group upgrade [group_name]```

# SYNOPSIS

**dnf group** _command_ [_group_name_]

# DESCRIPTION

**dnf group** manages virtual collections of packages. Groups bundle related packages together, such as "Development Tools" or "Server".

Installing a group installs all its mandatory and default packages.

# PARAMETERS

**list**
> List available groups

**info** _group_
> Show group details including packages

**install** _group_
> Install group packages

**remove** _group_
> Remove group packages

**upgrade** _group_
> Upgrade group packages

# CAVEATS

Groups can be referenced by name or ID. Optional packages in groups aren't installed by default. Removing a group may leave some packages installed.

# SEE ALSO

[dnf](/man/dnf)(8), [dnf-install](/man/dnf-install)(8)
