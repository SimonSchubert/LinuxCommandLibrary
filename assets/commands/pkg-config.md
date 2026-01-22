# TLDR

**Get compiler flags**

```pkg-config --cflags [library]```

**Get linker flags**

```pkg-config --libs [library]```

**Get all flags**

```pkg-config --cflags --libs [library]```

**Check if library exists**

```pkg-config --exists [library] && echo "Found"```

**Get library version**

```pkg-config --modversion [library]```

**List all packages**

```pkg-config --list-all```

# SYNOPSIS

**pkg-config** [_options_] [_packages_]

# PARAMETERS

_PACKAGES_
> Package names.

**--cflags**
> Compiler flags.

**--libs**
> Linker flags.

**--exists**
> Check existence.

**--modversion**
> Show version.

**--list-all**
> List packages.

# DESCRIPTION

**pkg-config** provides library compile/link flags. Build system helper.

The tool retrieves library metadata. Used in build scripts.

pkg-config finds libraries.

# CAVEATS

Requires .pc files. PKG_CONFIG_PATH for custom locations.

# HISTORY

pkg-config was created to **simplify library** compilation and linking.

# SEE ALSO

[make](/man/make)(1), [gcc](/man/gcc)(1), [pkgconf](/man/pkgconf)(1)

