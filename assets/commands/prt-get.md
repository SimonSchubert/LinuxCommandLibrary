# TAGLINE

Package manager for CRUX Linux

# TLDR

**Install** a package

```prt-get install [package]```

Install with **dependencies**

```prt-get depinst [package]```

**Update** an installed package

```prt-get update [package]```

**Remove** a package

```prt-get remove [package]```

**Update all** outdated packages

```prt-get sysup```

**Dry run** of an installation

```prt-get depinst --test [package]```

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

**prt-get** _command_ [_options_] [_arguments_]

# COMMANDS

**install**
> Install packages in the given order, without dependency handling

**depinst**
> Install packages together with their dependencies

**grpinst**
> Install packages in the given order, stopping at the first failure

**update**
> Update installed packages

**remove**
> Remove installed packages

**sysup**
> Update all outdated packages, sorted by dependencies; locked packages are skipped

**search**
> Search port names

**dsearch**
> Search port names and descriptions

**fsearch**
> Search for file names in port footprints

**info**
> Display port information

**list**
> List ports available in the ports tree

**listinst**
> List installed packages

**listorphans**
> List installed packages that no other package depends on

**diff**
> Show differences between installed packages and the ports tree

**quickdiff**
> Print outdated packages on one line, for use as input to update

**dependent**
> List packages depending on a package

**depends**
> List recursive dependencies of packages

**quickdep**
> Print recursive dependencies on one line, for use as input to install

**deptree**
> Show the full dependency tree of a package

**cat**
> Print a file of a port (default: Pkgfile)

**edit**
> Edit a file of a port with $EDITOR

**ls**
> List the files in a port directory

**path**
> Print the path to a port directory

**readme**
> Print the README file of a port

**lock**
> Prevent packages from being updated by sysup

**unlock**
> Remove a lock from packages

**listlocked**
> List locked packages

**isinst**
> Check if a package is installed

**current**
> Print the installed version of a package

**dup**
> List ports found in more than one ports directory

**cache**
> Create the cache file used with --cache

**dumpconfig**
> Print the active configuration

# PARAMETERS

**-f**, **-i**
> Force installation, same as --aargs=-f

**-fr**
> Force rebuild even if up-to-date, same as --margs=-f

**-if**
> Ignore footprint mismatches

**-im**
> Ignore MD5 mismatches

**-uf**
> Update the footprint

**-um**
> Update the md5sum

**-ns**
> Do not strip binaries

**-kw**
> Keep the working directory

**-v**
> Show version in listings

**-vv**
> Show version and description in listings

**--test**
> Dry run: show what would happen without installing anything

**--ignore**=_pkg1,pkg2_
> Do not install these packages, even if listed as dependencies

**--margs**=_"args"_
> Pass additional arguments to pkgmk

**--aargs**=_"args"_
> Pass additional arguments to pkgadd

**--log**
> Write a build log file

**--all**
> Include locked packages in diff, list all dependents in dependent, expand all subtrees in deptree

**--path**
> Show port paths in search, dsearch, list and depends

**--regex**
> Interpret patterns as regular expressions

**--cache**
> Use the cache file for this command

**--nodeps**
> Do not sort by dependencies in sysup

**--prefer-higher**, **-ph**
> Prefer the higher version, even if the ports tree has a lower one

**--strict-diff**, **-sd**
> Override the preferhigher configuration option

**--pre-install**, **--post-install**, **--install-scripts**
> Run pre-install, post-install or both scripts if present

**--config**=_file_
> Use alternative configuration file

**--config-set**=_string_, **--config-append**=_string_, **--config-prepend**=_string_
> Replace, append to or prepend to the configuration for this run

**--no-std-config**
> Do not read /etc/prt-get.conf

**--install-root**=_dir_
> Install to a root directory other than /

# DESCRIPTION

**prt-get** is the high-level package manager for CRUX Linux. It provides dependency resolution on top of the basic pkgutils, making package management more convenient while maintaining CRUX's simplicity.

The tool reads package information from the ports directories listed in **/etc/prt-get.conf** and can automatically build and install packages with their dependencies.

# CAVEATS

CRUX-specific tool. Requires the ports tree to be synchronized with **ports -u**. Builds packages from source. Dependency information comes from each Pkgfile and is only as accurate as the packager made it. Patterns containing wildcards must be quoted or escaped so the shell does not expand them.

# HISTORY

**prt-get** was created for CRUX Linux to add dependency handling to the basic pkgutils. It remains the primary way to manage packages on CRUX systems.

# SEE ALSO

[pkgmk](/man/pkgmk)(8), [pkgadd](/man/pkgadd)(8), [pkgrm](/man/pkgrm)(8), [pkginfo](/man/pkginfo)(8), [ports](/man/ports)(8)

# RESOURCES

```[Source code](https://git.crux.nu/tools/prt-get)```

```[Homepage](https://crux.nu/)```

```[Documentation](https://crux.nu/doc/prt-get%20-%20User%20Manual.html)```

<!-- verified: 2026-11-09 -->
