# TLDR

**Remove** a package

```xbps-remove [package]```

**Remove** a package and its dependencies

```xbps-remove -R [package]```

**Remove** orphan packages

```xbps-remove -o```

**Remove** obsolete packages from the cache

```xbps-remove -O```

# SYNOPSIS

**xbps-remove** [_options_] [_package_...]

# PARAMETERS

**-R, --recursive**
> Remove package and its dependencies

**-o, --remove-orphans**
> Remove orphaned packages (unused dependencies)

**-O, --clean-cache**
> Remove obsolete packages from cache

**-y, --yes**
> Assume yes to all questions

**-n, --dry-run**
> Show what would be done

**-f, --force**
> Force removal

**-v, --verbose**
> Verbose output

# DESCRIPTION

**xbps-remove** removes packages from a Void Linux system. It can remove individual packages, recursively remove packages with their dependencies, and clean up orphaned packages.

The **-o** option is useful for removing packages that were installed as dependencies but are no longer needed by any installed package.

# CAVEATS

Requires root privileges. Be careful with **-R** as it may remove packages you want to keep. Running **-o** regularly helps keep the system clean. Part of the XBPS package management system for Void Linux.

# SEE ALSO

[xbps-install](/man/xbps-install)(1), [xbps-query](/man/xbps-query)(1)
