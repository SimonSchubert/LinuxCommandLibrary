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

**--atleast-version** _VERSION_
> Exit successfully if version is at least VERSION.

**--exact-version** _VERSION_
> Exit successfully if version matches exactly.

**--max-version** _VERSION_
> Exit successfully if version is at most VERSION.

**--variable** _NAME_
> Print the value of a variable defined in the .pc file.

**--libs-only-L**
> Print only -L/-R library search path flags.

**--libs-only-l**
> Print only -l library name flags.

**--cflags-only-I**
> Print only -I include path flags.

**--static**
> Output for static linking (include private dependencies).

**--print-errors**
> Show errors when package not found.

**--silence-errors**
> Suppress error output.

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

pkg-config was created by **James Henstridge** around **2001** as part of the freedesktop.org project to simplify library compilation and linking. It is widely used in autotools, CMake, and Meson build systems.

# SEE ALSO

[make](/man/make)(1), [gcc](/man/gcc)(1), [pkgconf](/man/pkgconf)(1)

