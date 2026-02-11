# TAGLINE

Convert RPM packages to cpio archives

# TLDR

**Convert** an RPM package to a cpio archive

```rpm2cpio [path/to/file.rpm] > [file.cpio]```

**Extract** files from an RPM package directly

```rpm2cpio [path/to/file.rpm] | cpio -idmv```

**List** contents of an RPM package

```rpm2cpio [path/to/file.rpm] | cpio -t```

# SYNOPSIS

**rpm2cpio** [_file.rpm_]

# PARAMETERS

**file.rpm**
> The RPM package file to convert (reads from stdin if omitted)

# DESCRIPTION

**rpm2cpio** converts an RPM (Red Hat Package Manager) package file to a cpio archive and writes it to standard output. This allows extracting the contents of an RPM package without installing it or using RPM tools.

The output is a cpio archive containing the files that would be installed by the RPM package, preserving their intended directory structure. This is commonly piped to the **cpio** command for extraction or listing.

# CAVEATS

Does not execute any RPM scripts (pre/post install) or handle dependencies. The extracted files will not be registered in the RPM database. Useful for inspecting or extracting specific files from packages without full installation.

# SEE ALSO

[rpm](/man/rpm)(8), [cpio](/man/cpio)(1), [rpmkeys](/man/rpmkeys)(8)
