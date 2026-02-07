# TAGLINE

extract Slackware package contents without installing

# TLDR

**Extract** a package to current directory

```explodepkg [path/to/package.tgz]```

Extract **multiple** packages

```explodepkg [path/to/package1.tgz] [path/to/package2.tgz]```

# SYNOPSIS

**explodepkg** _packages_

# DESCRIPTION

**explodepkg** extracts the contents of Slackware packages to the current directory. Unlike installpkg, it does not install the package to the system or run installation scripts.

Slackware packages are compressed tarballs (.tgz or .txz) with a specific structure. This tool unpacks them for inspection, extracting files to see package contents, documentation, or to create modified packages.

Useful for inspecting package contents before installation, debugging package issues, or extracting specific files without full installation. Part of Slackware's pkgtools suite.

# PARAMETERS

_packages_
> One or more Slackware packages to extract

# CAVEATS

Slackware Linux specific. Extracts to current directory, not system paths. Does not run doinst.sh scripts. Part of pkgtools.

# SEE ALSO

[installpkg](/man/installpkg)(8), [removepkg](/man/removepkg)(8), [upgradepkg](/man/upgradepkg)(8), [makepkg](/man/makepkg)(8)
