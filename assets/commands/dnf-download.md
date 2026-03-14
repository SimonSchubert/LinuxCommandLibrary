# TAGLINE

Download RPM packages without installing

# TLDR

**Download a package** to the current directory

```dnf download [package]```

**Download to a specific directory**

```dnf download [package] --destdir [path/to/directory]```

**Download a package and all its dependencies**

```dnf download --resolve [package]```

**Download the source RPM** of a package

```dnf download --source [package]```

**Print the URL** instead of downloading

```dnf download --url [package]```

# SYNOPSIS

**dnf download** [_options_] _package_ [_package_...]

# DESCRIPTION

**dnf download** downloads RPM packages from configured DNF repositories without installing them. It is part of the **dnf-plugins-core** package. Useful for obtaining packages for offline installation, inspection, or distributing to air-gapped systems.

# PARAMETERS

**--destdir** _dir_
> Download destination directory. Defaults to the current directory.

**--url**
> Print the download URL to stdout instead of downloading.

**--source**
> Download the source RPM instead of the binary package. Enables source repositories automatically.

**--resolve**
> Also download all uninstalled dependencies of the specified packages.

**--alldeps**
> When used with --resolve, download all dependencies (including already installed ones).

**--arch** _arch_
> Limit to packages of the given architecture.

# CAVEATS

Requires **dnf-plugins-core** to be installed. Downloaded packages are not automatically installed. When using --resolve, only missing dependencies are downloaded by default.

# SEE ALSO

[dnf](/man/dnf)(8), [rpm](/man/rpm)(8), [yumdownloader](/man/yumdownloader)(1)
