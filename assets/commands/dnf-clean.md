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

# SYNOPSIS

**dnf clean** _type_

# DESCRIPTION

**dnf clean** removes temporary files cached by DNF for repositories. This includes metadata, packages, and database files.

Useful for freeing disk space or forcing DNF to refresh metadata from repositories.

# PARAMETERS

**dbcache**
> Remove database cache files

**expire-cache**
> Mark metadata as expired

**metadata**
> Remove repository metadata

**packages**
> Remove cached packages

**all**
> Clean everything (all of the above)

# CAVEATS

Cleaning cache means DNF must re-download metadata on next use. Cached packages are in /var/cache/dnf. "all" is the most thorough option.

# SEE ALSO

[dnf](/man/dnf)(8), [dnf-makecache](/man/dnf-makecache)(8)
