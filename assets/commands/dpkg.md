# TAGLINE

low-level Debian package manager

# TLDR

**Install** a package

```sudo dpkg -i [path/to/file.deb]```

**Remove** a package

```sudo dpkg -r [package]```

**List** installed packages

```dpkg -l [pattern]```

List a package's **contents**

```dpkg -L [package]```

List contents of a **local package file**

```dpkg -c [path/to/file.deb]```

Find which package **owns** a file

```dpkg -S [path/to/file]```

**Purge** a package including configuration files

```sudo dpkg -P [package]```

Show package **status**

```dpkg -s [package]```

# SYNOPSIS

**dpkg** [_options_] _action_ [_package_|_file_]

# DESCRIPTION

**dpkg** is the low-level package manager for Debian-based systems. It handles the installation, removal, and management of .deb packages. Higher-level tools like **apt** and **apt-get** use dpkg internally.

# PARAMETERS

**-i, --install file.deb**
> Install a package from a .deb file

**-r, --remove package**
> Remove a package (keep configuration files)

**-P, --purge package**
> Remove a package and its configuration files

**-l, --list pattern**
> List packages matching pattern

**-L, --listfiles package**
> List files installed by a package

**-c, --contents file.deb**
> List contents of a .deb file

**-S, --search path**
> Search for a package owning a file

**-s, --status package**
> Display package status details

**--configure package**
> Configure an unpacked package

**--unpack file.deb**
> Unpack but don't configure a package

**--get-selections**
> Get list of package selections

**--set-selections**
> Set package selections from stdin

# CAVEATS

dpkg does not handle dependencies automatically. Use **apt** or **apt-get** for dependency resolution. Configuration files are kept by default when removing packages.

# HISTORY

**dpkg** was originally created for the **Debian** project in **1994** by **Ian Murdock**, then rewritten in C by **Ian Jackson** who became its primary developer. It remains the foundation of package management on Debian-based systems.

# SEE ALSO

[apt](/man/apt)(8), [apt-get](/man/apt-get)(8), [dpkg-deb](/man/dpkg-deb)(1), [dpkg-query](/man/dpkg-query)(1)
