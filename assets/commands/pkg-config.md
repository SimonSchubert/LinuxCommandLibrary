# TAGLINE

Query library compiler and linker flags

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

**pkg-config** retrieves compiler and linker flags needed to build software against installed libraries. It reads metadata from **.pc** files that libraries install, providing the correct include paths, library paths, and link flags.

Build systems like autotools, CMake, and Meson use pkg-config to locate libraries portably. The **--cflags** flag returns compiler flags (include paths), **--libs** returns linker flags, and **--modversion** shows the installed version. Version constraints can be checked with **--atleast-version**.

# CONFIGURATION

**PKG_CONFIG_PATH**
> Colon-separated list of additional directories to search for .pc files.

**PKG_CONFIG_LIBDIR**
> Override the default .pc file search path entirely.

# CAVEATS

Requires .pc files. PKG_CONFIG_PATH for custom locations.

# HISTORY

pkg-config was created to **simplify library** compilation and linking.

# SEE ALSO

[make](/man/make)(1), [gcc](/man/gcc)(1), [pkgconf](/man/pkgconf)(1)

