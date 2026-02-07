# TAGLINE

track source installs and create packages

# TLDR

Create and install a package with **default settings**

```sudo checkinstall -y```

Create a package but **don't install** it

```sudo checkinstall --install=no```

Create a package **without documentation**

```sudo checkinstall --nodoc```

Create a package and **set the name**

```sudo checkinstall --pkgname [package]```

Specify where to **save** the package

```sudo checkinstall --pakdir [path/to/directory]```

# SYNOPSIS

**checkinstall** [_options_] [_install command_]

# DESCRIPTION

**checkinstall** tracks the installation of software from source and produces a binary package that can be managed by the system's native package manager (deb, rpm, or Slackware tgz).

Instead of running `make install` directly, running `checkinstall` monitors which files are created during installation and packages them. This allows clean removal and management of locally compiled software.

# PARAMETERS

**-y, --default**
> Accept all default values non-interactively

**--install=**_yes|no_
> Whether to install the package after creation

**--nodoc**
> Don't include documentation in the package

**--pkgname** _name_
> Set the package name

**--pakdir** _path_
> Directory to save the created package

**-D**
> Create a Debian package

**-R**
> Create an RPM package

**-S**
> Create a Slackware package

# CAVEATS

Requires make or equivalent build system to be present. The resulting package may not be as polished as official distribution packages. Some installations may create files outside tracked directories.

# HISTORY

**checkinstall** was created to solve the problem of managing software installed from source code. It provides a bridge between traditional source compilation and modern package management systems.

# SEE ALSO

[make](/man/make)(1), [dpkg](/man/dpkg)(1), [rpm](/man/rpm)(8)
