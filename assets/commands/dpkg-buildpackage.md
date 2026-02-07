# TAGLINE

Debian package build tool

# TLDR

**Build package**

```dpkg-buildpackage```

**Build unsigned**

```dpkg-buildpackage -us -uc```

**Build binary only**

```dpkg-buildpackage -b```

**Build source only**

```dpkg-buildpackage -S```

**Build with parallelism**

```dpkg-buildpackage -j[4]```

**Build without cleaning**

```dpkg-buildpackage -nc```

**Specify key for signing**

```dpkg-buildpackage -k[keyid]```

# SYNOPSIS

**dpkg-buildpackage** [_options_]

# DESCRIPTION

**dpkg-buildpackage** builds Debian packages from source. It orchestrates the full build process including extracting source, running the build system, and creating .deb files.

The tool handles dependencies, runs debian/rules targets, calls dpkg-source for source packages, and dpkg-genchanges for upload files. It's the standard way to build Debian packages.

# PARAMETERS

**-b**
> Binary-only build.

**-S**
> Source-only build.

**-F**
> Full build (source and binary).

**-us**
> Don't sign source package.

**-uc**
> Don't sign changes file.

**-j** _n_
> Parallel jobs.

**-nc**
> Don't clean before build.

**-tc**
> Clean after build.

**-k** _keyid_
> GPG key for signing.

**-r** _cmd_
> Use cmd to gain root.

**-d**
> Don't check dependencies.

**--build=** _type_
> Specify build type.

# CAVEATS

Requires build dependencies installed. Signing needs GPG key. Must run in package source directory. Clean environment recommended for reproducible builds.

# HISTORY

**dpkg-buildpackage** is part of the **dpkg** suite, the core of Debian package management since **1994**. It has evolved with Debian's packaging practices, adding features for source formats, signing, and cross-compilation over the years.

# SEE ALSO

[dpkg](/man/dpkg)(1), [dpkg-source](/man/dpkg-source)(1), [debuild](/man/debuild)(1), [pbuilder](/man/pbuilder)(1)
