# TAGLINE

Simplified Debian package management wrapper

# TLDR

**Refresh** the package lists

```wajig update```

**Search** for a package by name or description

```wajig search [keyword]```

Show the **full details** of a package

```wajig show [package]```

**Install** a package

```wajig install [package1] [package2]```

Apply only the **safe upgrades**, which add and remove nothing

```wajig safeupgrade```

Do the routine **update and full upgrade** in one step

```wajig dailyupgrade```

Find which package **owns a file**

```wajig whichpackage [/usr/bin/awk]```

List the **files a package installed**

```wajig listfiles [package]```

Show which installed packages are **upgradable**

```wajig toupgrade```

Report **orphaned libraries** that nothing depends on

```wajig orphans```

Show the **largest installed** packages

```wajig large```

**Verify** installed packages against their checksums

```wajig integrity```

Purge configuration left behind by **already-removed** packages

```wajig purgeremoved```

# SYNOPSIS

**wajig** _COMMAND_ [_ARGS_...]

# COMMANDS

**update**
> Update package lists

**install**
> Install or upgrade package

**purge**
> Remove package and configuration

**daily-upgrade**
> Update and dist-upgrade

**sizes**
> Display installed package sizes

**versions**
> List versions for all packages

**toupgrade**
> List upgradable packages

**dependents**
> Show packages depending on given package

# DESCRIPTION

**wajig** is a simplified all-in-one-place system support tool for Debian-based systems. It wraps apt, dpkg, and other tools into a consistent interface with easy-to-remember commands.

The tool provides a unified interface for common package management tasks.

# CAVEATS

Debian-based systems only. Requires root for most operations. Wraps standard package tools.

# SEE ALSO

[apt](/man/apt)(8), [dpkg](/man/dpkg)(1), [aptitude](/man/aptitude)(8)
