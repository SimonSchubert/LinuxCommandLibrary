# TAGLINE

Package manager for CRUX Linux

# TLDR

**Install** a package

```prt-get install [package]```

Install with **dependencies**

```prt-get depinst [package]```

**Upgrade** a package

```prt-get upgrade [package]```

**Remove** a package

```prt-get remove [package]```

**System upgrade** from ports

```prt-get sysup```

**Search** ports tree

```prt-get search [query]```

Search for **file** in packages

```prt-get fsearch [filename]```

Show packages with **available updates**

```prt-get diff```

Show **info** about a package

```prt-get info [package]```

**List dependencies** of a package

```prt-get depends [package]```

**List installed** packages

```prt-get listinst```

# SYNOPSIS

**prt-get** [**install**|**depinst**|**upgrade**|**remove**|**search**|**sysup**] [_options_] [_package_]

# COMMANDS

**install**
> Install package without dependency handling

**depinst**
> Install package with dependencies

**upgrade**
> Upgrade installed package

**remove**
> Remove installed package

**sysup**
> Upgrade all installed packages

**search**
> Search for packages by name

**fsearch**
> Search for files in packages

**info**
> Display package information

**diff**
> Show packages with available updates

**listinst**
> List installed packages

**dependent**
> List packages depending on a package

**depends**
> List dependencies of a package

**deptree**
> Show the full dependency tree of a package

**cat**
> Print the Pkgfile of a port

**path**
> Print the path to a port directory

**lock**
> Lock a package to prevent upgrades

**unlock**
> Unlock a previously locked package

**listlocked**
> List locked packages

**isinst**
> Check if a package is installed

# PARAMETERS

**-fr**
> Force rebuild even if up-to-date

**-if**
> Ignore footprint mismatches

**-im**
> Ignore MD5 mismatches

**-v**
> Show version in search results

**-vv**
> Show version and description in search results

**-is**
> Ignore signature mismatches

**--margs**=_"args"_
> Pass additional arguments to pkgmk

**--aargs**=_"args"_
> Pass additional arguments to pkgadd

**--log**
> Enable build logging

**--all**
> Include locked packages in output

**--config**=_file_
> Use alternative configuration file

# DESCRIPTION

**prt-get** is the high-level package manager for CRUX Linux. It provides dependency resolution on top of the basic pkgutils, making package management more convenient while maintaining CRUX's simplicity.

The tool reads package information from the ports tree and can automatically build and install packages with their dependencies.

# CAVEATS

CRUX-specific tool. Requires ports tree to be synchronized. Builds packages from source. No pre-built binary packages.

# HISTORY

**prt-get** was created for CRUX Linux to add dependency handling to the basic pkgutils. It remains the primary way to manage packages on CRUX systems.

# SEE ALSO

[pkgmk](/man/pkgmk)(8), [pkgadd](/man/pkgadd)(8), [pkgrm](/man/pkgrm)(8), [pkginfo](/man/pkginfo)(8), [ports](/man/ports)(8)
