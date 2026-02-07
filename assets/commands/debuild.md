# TAGLINE

build Debian packages from source

# TLDR

**Build** package in current directory

```debuild```

Build **binary package** only

```debuild -b```

Build **without running lintian**

```debuild --no-lintian```

# SYNOPSIS

**debuild** [_options_] [_dpkg-buildpackage options_]

# DESCRIPTION

**debuild** builds Debian packages from source. It's a wrapper around dpkg-buildpackage that adds additional features like automatic lintian checking and proper environment setup.

Run from a Debian source package directory containing debian/control and other packaging files.

# PARAMETERS

**-b**
> Build binary package only

**-S**
> Build source package only

**--no-lintian**
> Skip lintian checks after build

**-us**
> Don't sign source package

**-uc**
> Don't sign changes file

**-j** _n_
> Parallel build with n jobs

# CONFIGURATION

**~/.devscripts**
> Default debuild options including lintian settings and build behavior.

# CAVEATS

Must be run from a properly configured Debian source directory. Build dependencies must be installed. Part of devscripts package.

# SEE ALSO

[dpkg-buildpackage](/man/dpkg-buildpackage)(1), [lintian](/man/lintian)(1), [dch](/man/dch)(1)
