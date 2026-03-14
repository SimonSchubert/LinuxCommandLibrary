# TAGLINE

Extract debconf templates from Debian packages.

# TLDR

**Extract** debconf templates from packages

```apt-extracttemplates [package.deb]```

Extract to **specific directory**

```apt-extracttemplates -t [/tmp/templates] [package.deb]```

Extract from **multiple packages**

```apt-extracttemplates [package1.deb] [package2.deb]```

# SYNOPSIS

**apt-extracttemplates** [_-t tempdir_] _packages_

# DESCRIPTION

**apt-extracttemplates** extracts debconf templates and configuration scripts from Debian packages. It's used internally by APT during package installation to gather configuration information.

For each package, it outputs four lines: package name, version, template filename, and config script filename. The extracted templates contain questions that debconf uses to configure packages during installation.

# PARAMETERS

**-t** _dir_, **--tempdir** _dir_
> Directory for extracted files

**-c** _file_, **--config-file** _file_
> Configuration file

**-o** _option_
> Set an arbitrary APT configuration option

# CAVEATS

This is primarily an internal APT tool. Most users interact with debconf through frontend tools rather than directly extracting templates.

# HISTORY

**apt-extracttemplates** is part of the APT package management infrastructure, supporting the debconf configuration system.

# SEE ALSO

[apt](/man/apt)(8), [apt-get](/man/apt-get)(8), [dpkg](/man/dpkg)(1), [dpkg-deb](/man/dpkg-deb)(1)
