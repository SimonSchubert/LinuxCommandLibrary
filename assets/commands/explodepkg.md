# TLDR

**Extract** a package to current directory

```explodepkg [path/to/package.tgz]```

Extract **multiple** packages

```explodepkg [path/to/package1.tgz] [path/to/package2.tgz]```

# SYNOPSIS

**explodepkg** _packages_

# DESCRIPTION

**explodepkg** extracts the contents of Slackware packages to the current directory. Unlike installpkg, it does not install the package to the system or run installation scripts.

Useful for inspecting package contents before installation.

# PARAMETERS

_packages_
> One or more Slackware packages to extract

# CAVEATS

Slackware Linux specific. Extracts to current directory, not system paths. Does not run doinst.sh scripts. Part of pkgtools.

# SEE ALSO

[installpkg](/man/installpkg)(8), [removepkg](/man/removepkg)(8), [upgradepkg](/man/upgradepkg)(8), [makepkg](/man/makepkg)(8)
