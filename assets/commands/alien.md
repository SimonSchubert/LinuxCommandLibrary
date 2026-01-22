# TLDR

Convert a file to **Debian format** (.deb)

```sudo alien -d [path/to/file]```

Convert a file to **Red Hat format** (.rpm)

```sudo alien -r [path/to/file]```

Convert a file to **Slackware format** (.tgz)

```sudo alien -t [path/to/file]```

Convert to Debian format and **install** on the system

```sudo alien -d -i [path/to/file]```

Convert **keeping the original version** number

```sudo alien -k [path/to/file]```

# SYNOPSIS

**alien** [_--to-deb_] [_--to-rpm_] [_--to-tgz_] [_--to-slp_] [_options_] _file_ [...]

# DESCRIPTION

**alien** is a program that converts between Red Hat rpm, Debian deb, Stampede slp, Slackware tgz, and Solaris pkg file formats. It enables users to convert packages from one Linux distribution format to another and install them.

# PARAMETERS

**-d, --to-deb**
> Create Debian packages (default)

**-r, --to-rpm**
> Create RPM packages

**-t, --to-tgz**
> Create TGZ (Slackware) packages

**--to-slp**
> Create SLP (Stampede) packages

**-p, --to-pkg**
> Create Solaris pkg packages

**-i, --install**
> Install generated packages automatically

**-g, --generate**
> Create temporary directory for manual package building

**-k, --keep-version**
> Don't increment version numbers

**-c, --scripts**
> Convert installation/removal scripts

**--fixperms**
> Sanitize file permissions (Debian only)

**-v, --verbose**
> Display executed commands

**-T, --test**
> Test generated packages with lintian

# CAVEATS

Converted packages may not work perfectly as distribution-specific dependencies and scripts may not translate correctly between formats.

# HISTORY

Created to help users install software from other Linux distributions when native packages are not available.

# SEE ALSO

[dpkg](/man/dpkg)(1), [rpm](/man/rpm)(8), [debtap](/man/debtap)(1)
