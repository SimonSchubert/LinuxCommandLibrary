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
> Clean the source-download directory (DISTDIR, default `/var/cache/distfiles`).

**packages**
> Clean the binary-package directory (PKGDIR, default `/var/cache/binpkgs`).

**-d, --deep**
> Only keep files needed for currently installed packages (aggressive clean).

**-n**, **--package-names**
> Protect files by package name rather than exact version/slot.

**-p, --pretend**
> Dry-run: list what would be removed without deleting anything.

**-C, --color** _mode_
> Colorize output: _yes_, _no_, or _auto_.

**-t, --time-limit** _time_
> Protect files newer than _time_ (e.g. `7d`, `1m`).

**-s, --size-limit** _size_
> Protect files larger than _size_ (e.g. `50M`, `1G`).

**-e, --exclude-file** _file_
> Read additional exclusion patterns from _file_.

**-i, --interactive**
> Ask for confirmation before removing each file.

**-q, --quiet**
> Suppress informational output.

**-h, --help**
> Display help information.

# CAVEATS

Gentoo-specific. Use -p to preview before deleting. Deep clean may remove files needed to reinstall packages.

# SEE ALSO

[emerge](/man/emerge)(1), [eclean-kernel](/man/eclean-kernel)(1)
