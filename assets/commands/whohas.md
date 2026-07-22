# TAGLINE

Query package availability across many Linux distributions

# TLDR

**Search for a package** across all supported distributions

```whohas [package_name]```

**Restrict the search** to specific distributions

```whohas -d [debian,ubuntu,arch] [package_name]```

**Match the package name exactly**

```whohas --strict [package_name]```

**Speed up the search** at the cost of some details

```whohas --shallow [package_name]```

**Disable multi-threaded** queries

```whohas --no-threads [package_name]```

# SYNOPSIS

**whohas** [**--no-threads**] [**--shallow**] [**--strict**] [**-d** _Dist1_[,_Dist2_[,_Dist3_]]] _pkgname_

# DESCRIPTION

**whohas** is a command-line tool that queries package lists from many Linux and BSD distributions in parallel and prints the results in a uniform format. It is intended to make it easy to discover which distributions ship a given package, at what version, and how big it is, without visiting each distribution's website.

Supported distributions include **Arch Linux**, **Debian**, **Fedora**, **Gentoo**, **Mageia**, **Mandriva**, **openSUSE**, **Slackware**, **Source Mage**, **Ubuntu**, **FreeBSD**, **NetBSD**, **OpenBSD**, **Fink**, **MacPorts**, and **Cygwin**.

By default each repository is queried concurrently to keep latency low; the **--no-threads** option falls back to sequential lookups when this is undesirable.

# PARAMETERS

**--no-threads**
> Disable multi-threaded queries (slower but easier to debug or rate-limit).

**--shallow**
> Limit to one call per server. Faster, but loses some information such as package size and release date.

**--strict**
> List only packages whose name exactly matches _pkgname_.

**-d** _DIST_[,_DIST_...]
> Restrict queries to the given distributions. Accepted values include _archlinux_, _debian_, _ubuntu_, _fedora_, _opensuse_, _gentoo_, _mageia_, _mandriva_, _slackware_, _sourcemage_, _freebsd_, _netbsd_, _openbsd_, _fink_, _macports_, _cygwin_.

_pkgname_
> The package name (or substring, unless **--strict** is given) to search for.

# CAVEATS

**whohas** scrapes upstream package indexes; if a distribution changes the format of its index, queries may temporarily return stale or incorrect data until **whohas** is updated. Some servers may rate-limit aggressive concurrent queries — use **--no-threads** if you hit such limits.

# HISTORY

**whohas** was written by **Philipp L. Wesche** as a Perl script to ease cross-distribution package discovery. It is packaged for many distributions and is commonly used by maintainers checking which distros already ship a piece of software before submitting a new package.

# INSTALL

```zypper: sudo zypper install whohas```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[apt-cache](/man/apt-cache)(8), [dpkg-query](/man/dpkg-query)(1), [pacman](/man/pacman)(8), [dnf](/man/dnf)(8)
