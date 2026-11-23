# TAGLINE

clean Gentoo distfiles and binary packages

# TLDR

Clean the **source file** directory (keeps files for anything in the ebuild repository)

```sudo eclean distfiles```

Clean the **binary package** directory

```sudo eclean packages```

**Preview** what would be removed

```sudo eclean -p distfiles```

**Deep clean** distfiles, keeping only those of installed package versions

```sudo eclean -d distfiles```

Deep clean binary packages but **keep all versions** of installed packages

```sudo eclean -d -n packages```

Deep clean distfiles but protect files **newer than a month** or **larger than 50 MB**

```sudo eclean-dist -d -t1m -s50M```

Remove binary packages whose **dependencies changed** in the ebuild

```sudo eclean-pkg --changed-deps```

# SYNOPSIS

**eclean** [_global-options_] _action_ [_action-options_]

**eclean-dist** [_options_]

**eclean-pkg** [_options_]

# DESCRIPTION

**eclean** is part of **gentoolkit** and cleans Gentoo source files and binary packages. It removes old or unused distfiles and packages to free disk space. **eclean-dist** and **eclean-pkg** are shortcuts for the **distfiles** and **packages** actions.

The tool operates on two main targets: distfiles (source tarballs in DISTDIR, default /var/cache/distfiles) and packages (binary packages in PKGDIR, default /var/cache/binpkgs). Over time, these directories accumulate old versions and files for uninstalled packages, consuming significant disk space.

eclean provides both conservative and aggressive cleaning modes. Normal mode keeps files for any ebuild available in the repository (allowing downgrades and reinstalls), while deep mode only keeps files for the exact versions currently installed. Adding **--package-names** to deep mode keeps files for all versions of installed packages. This is particularly useful on systems with limited storage or after system upgrades.

# PARAMETERS

**distfiles**
> Clean the source-download directory (DISTDIR, default `/var/cache/distfiles`).

**packages**
> Clean the binary-package directory (PKGDIR, default `/var/cache/binpkgs`).

**-d, --deep**
> Only keep files needed for currently installed packages (aggressive clean).

**-n**, **--package-names**
> Protect all versions of installed packages (with **--deep** only).

**-p, --pretend**
> Dry-run: list what would be removed without deleting anything.

**-C, --nocolor**
> Turn off colored output.

**-t, --time-limit** _time_
> Protect files modified within _time_. Units: y, m, w, d, h (e.g. `2w`, `1m`).

**-e, --exclude-file** _file_
> Exclusion file listing categories, packages or file names to protect. Defaults to **/etc/eclean/distfiles.exclude** or **/etc/eclean/packages.exclude**.

**-i, --interactive**
> Ask for confirmation before removing each file.

**-q, --quiet**
> Only display errors.

**-v, --verbose**
> Display more verbose messages.

**-h, --help**
> Display help information.

**-V, --version**
> Display version information.

# DISTFILES OPTIONS

**-s, --size-limit** _size_
> Protect distfiles larger than _size_. Units: G, M, K, B (e.g. `50M`).

**-f, --fetch-restricted**
> Protect manually downloaded fetch-restricted files (with **--deep** only).

**--skip-vcs**
> Protect VCS sources of live ebuilds that are not installed (with **--deep** only).

# PACKAGES OPTIONS

**-i, --ignore-failure**
> Ignore a missing PKGDIR instead of failing (for scripts).

**--changed-deps**
> Delete binary packages whose ebuild dependencies have changed.

# CAVEATS

Gentoo-specific. Use **-p** to preview before deleting. Deep clean may remove files needed to downgrade or reinstall an uninstalled package, which then must be downloaded or rebuilt. Default (non-deep) mode for distfiles is slow because it scans the whole repository. Note that **-i** is **--interactive** as a global option but **--ignore-failure** as a packages option; use the long forms to avoid ambiguity.

# SEE ALSO

[emerge](/man/emerge)(1), [eclean-kernel](/man/eclean-kernel)(1), [equery](/man/equery)(1), [eix](/man/eix)(1)

# RESOURCES

```[Source code](https://gitweb.gentoo.org/proj/gentoolkit.git)```

```[Documentation](https://wiki.gentoo.org/wiki/Eclean)```

<!-- verified: 2026-11-23 -->
