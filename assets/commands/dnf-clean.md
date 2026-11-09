# TAGLINE

remove cached DNF repository data

# TLDR

Remove **cache files**

```dnf clean dbcache```

Mark metadata as **expired**

```dnf clean expire-cache```

Remove **repository metadata**

```dnf clean metadata```

Remove **cached packages**

```dnf clean packages```

Clean **all** DNF cache

```dnf clean all```

Clean **several types** at once

```dnf clean packages dbcache```

# SYNOPSIS

**dnf clean** _type_...

# PARAMETERS

**dbcache**
> Remove cache files generated from the repository metadata. DNF regenerates them on next run.

**expire-cache**
> Mark the repository metadata expired, so DNF re-validates the cache for each repository on next use.

**metadata**
> Remove repository metadata. DNF downloads all metadata again on next run.

**packages**
> Remove cached packages.

**all**
> Clean everything (all of the above).

# DESCRIPTION

**dnf clean** removes temporary files cached by DNF for repositories. This includes metadata, packages, and database files, including data left behind from disabled or removed repositories and from other distribution release versions.

Useful for freeing disk space or forcing DNF to refresh metadata from repositories.

# CAVEATS

Cleaning metadata means DNF must download it again on next use. Requires root privileges to clean the system cache. The cache lives in **/var/cache/dnf** under DNF 4 and **/var/cache/libdnf5** under DNF 5 (the default **dnf** on recent Fedora).

# SEE ALSO

[dnf](/man/dnf)(8), [dnf5](/man/dnf5)(8), [yum](/man/yum)(8)

# RESOURCES

```[Source code](https://github.com/rpm-software-management/dnf5)```

```[Documentation](https://dnf5.readthedocs.io/en/latest/commands/clean.8.html)```

<!-- verified: 2026-11-09 -->
