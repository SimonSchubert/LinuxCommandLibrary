# TAGLINE

Run CMake in Sailfish build environment

# TLDR

**Run CMake in build environment**

```sfdk cmake [cmake_args]```

**Configure with Release build type**

```sfdk cmake -DCMAKE_BUILD_TYPE=Release```

**Configure and build with make**

```sfdk cmake [cmake_args] && sfdk make```

**Show help**

```sfdk cmake --help```

# SYNOPSIS

**sfdk cmake** [_cmake_options_]

# DESCRIPTION

**sfdk cmake** runs CMake inside the Sailfish OS build environment with the correct toolchain configuration. Together with **sfdk make**, it allows running rpmbuild in a way that just the corresponding part of the %build section of the SPEC file is executed. Part of Sailfish SDK.

Native build system support is available for projects that use either qmake or CMake.

# SEE ALSO

[sfdk](/man/sfdk)(1), [sfdk-qmake](/man/sfdk-qmake)(1), [cmake](/man/cmake)(1)

