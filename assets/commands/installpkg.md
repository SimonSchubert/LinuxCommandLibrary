# TAGLINE

installs Slackware packages

# TLDR

**Install** a Slackware package

```sudo installpkg [path/to/package.txz]```

Install **several packages** at once

```sudo installpkg [path/to/*.txz]```

**Show which files would be overwritten** without installing

```installpkg --warn [path/to/package.txz]```

**Back up** files that the package would overwrite

```tar czvf [/tmp/backup.tar.gz] $(installpkg --warn [path/to/package.txz])```

Install into an **alternate root** directory

```sudo installpkg --root [/mnt/target] [path/to/package.txz]```

Install with **terse** one-line output

```sudo installpkg --terse [path/to/package.txz]```

# SYNOPSIS

**installpkg** [_options_] _package_ [_package2_ ...]

# PARAMETERS

**--warn**, **--dry-run**
> List files that would be overwritten, without installing.

**--md5sum**
> Record the package md5sum in the package metadata.

**--root** _DIR_
> Install using _DIR_ instead of **/** as the root (same as the **ROOT** environment variable).

**--infobox**
> Show an informational dialog box during installation.

**--menu**
> Ask via a dialog menu whether to install each package.

**--ask**
> With **--menu**, always ask regardless of package priority.

**--priority** _ADD|REC|OPT|SKP_
> Override tagfile priorities in menu mode.

**--tagfile** _FILE_
> Use a different tagfile for package priorities.

**--terse**
> Display only a single description line per package.

**--terselength** _N_
> Maximum line length in terse mode.

**--verbose**
> Display the complete file list during installation.

**--threads** _N_
> Maximum threads for xz/plzip decompression.

**--no-overwrite**
> Do not overwrite existing files (used internally by upgradepkg).

# DESCRIPTION

**installpkg** installs Slackware binary packages, which are compressed tar archives (**.txz**, **.tgz**, **.tbz**, **.tlz**) containing files and an optional **install/doinst.sh** script. It extracts the contents to the filesystem and runs the install script.

Package metadata is stored in **/var/lib/pkgtools/packages** (with **/var/log/packages** as a compatibility link), allowing installed files to be tracked for later removal or upgrade. To replace an already installed package, use **upgradepkg** instead.

# CAVEATS

Slackware-specific package tool. Does not resolve dependencies. Overwrites existing files without warning; run with **--warn** first to check. The old **-m** and **-r** options for building packages were removed; use Slackware's **makepkg** from pkgtools.

# HISTORY

installpkg has been part of Slackware Linux since its early releases in **1993**, written by **Patrick J. Volkerding** as part of **pkgtools**. Slackware's package management is intentionally simple, leaving dependency handling to the user.

# SEE ALSO

[upgradepkg](/man/upgradepkg)(8), [removepkg](/man/removepkg)(8), [explodepkg](/man/explodepkg)(8), [pkgtool](/man/pkgtool)(8), [slackpkg](/man/slackpkg)(8)

# RESOURCES

```[Homepage](http://www.slackware.com/)```

<!-- verified: 2026-09-29 -->
