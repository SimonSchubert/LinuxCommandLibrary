# TAGLINE

Download RPM packages without installing

# TLDR

**Download a package** to the current directory

```dnf download [package]```

**Download to a specific directory**

```dnf download [package] --destdir [path/to/directory]```

**Download a package and all its dependencies**

```dnf download --resolve [package]```

**Download the source RPM** of a package (dnf5)

```dnf download --srpm [package]```

**Download the source RPM** of a package (dnf4)

```dnf download --source [package]```

**Download the debuginfo RPM** of a package

```dnf download --debuginfo [package]```

**Print the URL** instead of downloading

```dnf download --url [package]```

# SYNOPSIS

**dnf download** [_options_] _package_ [_package_...]

# DESCRIPTION

**dnf download** downloads RPM packages from configured DNF repositories without installing them. It is built into dnf5 (the default on Fedora 41 and later), while on dnf4 it is provided by the **dnf-plugins-core** package. Useful for obtaining packages for offline installation, inspection, or distributing to air-gapped systems.

# PARAMETERS

**--destdir** _dir_
> Download destination directory. Defaults to the current directory.

**--url**
> Print the download URL to stdout instead of downloading.

**--srpm**
> dnf5: download the source RPM instead of the binary package. Enables source repositories automatically.

**--source**
> dnf4: download the source RPM instead of the binary package. Enables source repositories automatically.

**--debuginfo**
> Download the debuginfo RPM. Enables debuginfo repositories automatically.

**--resolve**
> Also download all uninstalled dependencies of the specified packages.

**--alldeps**
> When used with --resolve, download all dependencies (including already installed ones).

**--arch** _arch_
> Limit to packages of the given architecture.

**--urlprotocol** _protocol_
> dnf5: with **--url**, only print URLs of this protocol (http, https, ftp, file). Named **--urlprotocols** in dnf4.

**--allmirrors**
> dnf5: with **--url**, print URLs from all available mirrors for each package.

**--skip-unavailable**
> dnf5: skip packages that are not available and download the rest.

# CAVEATS

On dnf4, requires **dnf-plugins-core** to be installed. Downloaded packages are not automatically installed. When using --resolve, only missing dependencies are downloaded by default.

# INSTALL

```pacman: sudo pacman -S dnf```

<!-- packages: 2026-11-09 -->

# SEE ALSO

[dnf](/man/dnf)(8), [rpm](/man/rpm)(8), [yumdownloader](/man/yumdownloader)(1)

# RESOURCES

```[Source code](https://github.com/rpm-software-management/dnf5)```

```[Documentation](https://dnf5.readthedocs.io/en/latest/commands/download.8.html)```

<!-- verified: 2026-11-09 -->
