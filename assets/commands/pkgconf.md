# TAGLINE

Query library compile and link flags

# TLDR

**Get compiler flags**

```pkgconf --cflags [library]```

**Get linker flags**

```pkgconf --libs [library]```

**Check if library exists**

```pkgconf --exists [library] && echo "Found"```

**Get version**

```pkgconf --modversion [library]```

**List all packages**

```pkgconf --list-all```

# SYNOPSIS

**pkgconf** [_options_] _packages_...

# PARAMETERS

**--cflags**
> Compiler flags.

**--libs**
> Linker flags.

**--exists**
> Check existence.

**--modversion**
> Package version.

**--list-all**
> List all packages.

**--variable** _name_
> Get variable value.

**--print-requires**
> Show dependencies.

# DESCRIPTION

**pkgconf** is a program that helps configure compiler and linker flags for libraries. It's a drop-in replacement for pkg-config with improved performance and features.

# EXAMPLES

```bash
# Compile with library
gcc $(pkgconf --cflags --libs openssl) -o prog prog.c

# Check version requirement
pkgconf --atleast-version=1.1.0 openssl

# Get library directory
pkgconf --variable=libdir openssl

# In Makefile
CFLAGS += $(shell pkgconf --cflags gtk+-3.0)
LDFLAGS += $(shell pkgconf --libs gtk+-3.0)
```

# ENVIRONMENT

```bash
PKG_CONFIG_PATH   # Additional .pc file paths
PKG_CONFIG_LIBDIR # Override default paths
```

# CAVEATS

Reads .pc files. Compatible with pkg-config. Used in most build systems.

# HISTORY

pkgconf was created by **William Pitcock** as a lighter, faster alternative to pkg-config from freedesktop.org.

# SEE ALSO

[pkg-config](/man/pkg-config)(1), [gcc](/man/gcc)(1), [make](/man/make)(1)
