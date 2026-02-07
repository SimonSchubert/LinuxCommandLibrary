# TAGLINE

Gentoo repository cleanup utility

# TLDR

Clean **source file** directory

```sudo eclean distfiles```

Clean **binary package** directory

```sudo eclean packages```

**Deep clean** distfiles of uninstalled packages

```sudo eclean -d -n distfiles```

**Deep clean** binary packages

```sudo eclean -d -n packages```

# SYNOPSIS

**eclean** [_options_] _target_

# DESCRIPTION

**eclean** cleans Gentoo repository source files and binary packages. It removes old or unused distfiles and packages to free disk space.

The tool operates on two main targets: distfiles (source tarballs in /usr/portage/distfiles) and packages (binary packages in /usr/portage/packages). Over time, these directories accumulate old versions and files for uninstalled packages, consuming significant disk space.

eclean provides both conservative and aggressive cleaning modes. Normal mode keeps files for installed packages and current portage tree entries, while deep mode only keeps files for currently installed packages. This is particularly useful on systems with limited storage or after system upgrades.

# PARAMETERS

**distfiles**
> Clean source download directory

**packages**
> Clean binary package directory

**-d, --deep**
> Only keep files for installed packages

**-n, --package-names**
> Protect files by package name, not version

**-p, --pretend**
> Show what would be deleted

# CAVEATS

Gentoo-specific. Use -p to preview before deleting. Deep clean may remove files needed to reinstall packages.

# SEE ALSO

[emerge](/man/emerge)(1), [eclean-kernel](/man/eclean-kernel)(1)
