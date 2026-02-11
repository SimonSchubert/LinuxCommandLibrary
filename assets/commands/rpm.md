# TAGLINE

RPM package manager for Red Hat systems

# TLDR

**Query** package version

```rpm -q [package]```

List **all** matching packages

```rpm -qa '[pattern*]'```

**Forcibly install** package

```rpm -U [package.rpm] --force```

Find **file owner**

```rpm -qf [/path/to/file]```

List **package files**

```rpm -ql [package]```

Show package **scripts**

```rpm -qp --scripts [package.rpm]```

**Verify** packages

```rpm -Va '[pattern*]'```

Show **changelog**

```rpm -q --changelog [package]```

# SYNOPSIS

**rpm** [**-q**|**-i**|**-U**|**-e**|**-V**] [_options_] [_package_]

# MODES

**-q, --query**
> Query installed packages

**-i, --install**
> Install package

**-U, --upgrade**
> Upgrade or install package

**-e, --erase**
> Remove package

**-V, --verify**
> Verify package integrity

# PARAMETERS

**-a, --all**
> All packages

**-f, --file _file_**
> Query package owning file

**-l, --list**
> List files in package

**-p, --package _file_**
> Query package file

**--force**
> Force operation

**--nodeps**
> Ignore dependencies

**--scripts**
> Show scriptlets

# DESCRIPTION

**rpm** is the RPM Package Manager for Red Hat-based Linux distributions. It installs, upgrades, removes, and queries software packages in RPM format.

The tool maintains a database of installed packages, handles dependencies, and can verify package integrity. It's the low-level package tool; dnf/yum provide higher-level functionality.

# CAVEATS

Does not resolve dependencies automatically (use dnf/yum). Package signatures should be verified. Force and nodeps options can break systems. Root required for install/remove.

# HISTORY

**RPM** was originally developed at Red Hat by Marc Ewing and Erik Troan. It became the standard package format for many Linux distributions including Fedora, RHEL, CentOS, and SUSE.

# SEE ALSO

[dnf](/man/dnf)(8), [yum](/man/yum)(8), [rpm2cpio](/man/rpm2cpio)(8), [rpmbuild](/man/rpmbuild)(8)
