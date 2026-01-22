# TLDR

Download a **binary package**

```dget [package]```

Download and **extract source** from .dsc

```dget [http://deb.debian.org/debian/pool/main/p/package/package_1.0.dsc]```

**Download only** without extracting

```dget -d [http://deb.debian.org/debian/pool/main/p/package/package_1.0.dsc]```

# SYNOPSIS

**dget** [_options_] _url_|_package_

# DESCRIPTION

**dget** downloads Debian packages. It can download binary packages from repositories or source packages from .dsc URLs. When given a .dsc URL, it fetches all source components and optionally extracts them.

Part of the devscripts package, commonly used for package development.

# PARAMETERS

**-d, --download-only**
> Download without extracting

**-u, --unsigned**
> Don't verify signatures

**-x**
> Extract source package

**-b**
> Only get .orig.tar if necessary

# CAVEATS

Requires network access. Source package downloads require valid GPG signatures unless -u is used. Part of devscripts.

# SEE ALSO

[apt-get](/man/apt-get)(8), [dpkg-source](/man/dpkg-source)(1), [debuild](/man/debuild)(1)
