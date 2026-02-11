# TAGLINE

Install packages on OpenBSD and NetBSD

# TLDR

**Install package from repository**

```pkg_add [package]```

**Install specific package file**

```pkg_add [/path/to/package.tgz]```

**Install from URL**

```pkg_add [https://example.com/package.tgz]```

**Install with verbose output**

```pkg_add -v [package]```

# SYNOPSIS

**pkg_add** [_options_] _pkg_...

# PARAMETERS

**-v**
> Verbose mode.

**-D**
> Force installation.

**-I**
> Non-interactive mode.

**-u**
> Update mode.

**-n**
> Dry run.

**-r**
> Replace existing.

# DESCRIPTION

**pkg_add** installs software packages on OpenBSD and NetBSD systems. It handles dependencies, downloads packages from mirrors, and configures installed software.

BSD's traditional package manager.

# EXAMPLES

```bash
# Install package
pkg_add vim

# Update package
pkg_add -u vim

# Install from mirror
export PKG_PATH=https://cdn.openbsd.org/pub/OpenBSD/$(uname -r)/packages/$(uname -m)/
pkg_add firefox

# Verbose install
pkg_add -v nginx
```

# ENVIRONMENT

```bash
PKG_PATH  # Package repository URL
PKG_CACHE # Local cache directory
```

# CAVEATS

OpenBSD/NetBSD specific. Set PKG_PATH for remote installs. Use pkg_info to list packages.

# HISTORY

pkg_add is part of the **OpenBSD** and **NetBSD** package tools, providing simple package management since the 1990s.

# SEE ALSO

[pkg_delete](/man/pkg_delete)(1), [pkg_info](/man/pkg_info)(1), [pkg](/man/pkg)(1)
