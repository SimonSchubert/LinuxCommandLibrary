# TLDR

Compare package files in **tar content list** mode (default)

```pkgctl diff -l path/to/file```

Compare package files using **diffoscope**

```pkgctl diff -d path/to/file```

Compare package **.PKGINFO** files

```pkgctl diff -p path/to/file```

Compare package **.BUILDINFO** files

```pkgctl diff -b path/to/file```

# SYNOPSIS

**pkgctl diff** [_options_] _file|pkgname_

# PARAMETERS

**-l**, **--list**
> Compare using tar content list mode (default)

**-d**, **--diffoscope**
> Compare using diffoscope for detailed diff

**-p**, **--pkginfo**
> Compare .PKGINFO metadata files

**-b**, **--buildinfo**
> Compare .BUILDINFO files

# DESCRIPTION

**pkgctl diff** compares package files using different comparison modes. It can show differences in package contents, metadata, and build information between package versions.

This is useful for package maintainers to review changes before releasing updates and for verifying reproducible builds.

# CAVEATS

Diffoscope mode requires the diffoscope package to be installed. Large packages may take time to compare.

# HISTORY

Part of **pkgctl**, the Arch Linux package control tool for official repository maintainers.

# SEE ALSO

[pkgctl](/man/pkgctl)(1), [diffoscope](/man/diffoscope)(1)
