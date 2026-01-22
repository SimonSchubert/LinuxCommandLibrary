# TLDR

**Update** debtap database (required first)

```sudo debtap -u```

**Convert** a Debian package

```debtap [path/to/package.deb]```

Convert with **minimal prompts**

```debtap -q [path/to/package.deb]```

Generate **PKGBUILD** file only

```debtap -p [path/to/package.deb]```

# SYNOPSIS

**debtap** [_options_] _package.deb_

# DESCRIPTION

**debtap** converts Debian packages (.deb) to Arch Linux packages. It translates package metadata, dependencies, and file paths to create compatible Arch packages.

The database must be updated before first use to fetch dependency mappings.

# PARAMETERS

**-u, --update**
> Update debtap database

**-q, --quiet**
> Bypass questions except metadata editing

**-Q, --Quiet**
> Bypass all questions

**-p, --pkgbuild**
> Generate PKGBUILD file instead of package

**-P, --pseudo**
> Create pseudo-64-bit package

# CAVEATS

Arch Linux specific. Converted packages may have dependency issues as package names differ between distributions. Review and test converted packages before production use. Database update requires internet access.

# SEE ALSO

[pacman](/man/pacman)(8), [makepkg](/man/makepkg)(8), [dpkg](/man/dpkg)(1)
