# TLDR

Perform a **basic repair** on a specific package

```pacrepairdb package_name```

Update database entries **without extracting** packages

```pacrepairdb package_name --dbonly```

**Preview** packages to be repaired without making changes

```pacrepairdb package_name --print-only```

Display additional **progress and debug** information

```pacrepairdb package_name --verbose```

Display **help**

```pacrepairdb --help```

# SYNOPSIS

**pacrepairdb** [_options_] _package(s)_

# PARAMETERS

**--dbonly**
> Update database entries without extracting or removing packages

**--print-only**
> Display actions without making changes

**--verbose**
> Show additional progress and debug information

**--help**
> Display help message

**--version**
> Display version information

# DESCRIPTION

**pacrepairdb** fixes corrupted database entries in the libalpm database. It can repair package metadata, reinstall packages from cache, and restore database consistency without requiring a full package reinstallation.

This tool is useful when package database entries become corrupted due to interrupted transactions or filesystem issues.

# CAVEATS

Requires packages to be available in the cache for full repair. Use --dbonly if only database metadata needs correction.

# HISTORY

Part of **pacutils**, a collection of utilities for Arch Linux package management built on libalpm.

# SEE ALSO

[pacman](/man/pacman)(8), [pacrepairfile](/man/pacrepairfile)(1)
