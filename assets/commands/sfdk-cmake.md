# TAGLINE

Run CMake in Sailfish build environment

# TLDR

**Run the CMake generate step** in the current project

```sfdk cmake```

**Do a shadow build** of a project in another directory

```sfdk cmake [path/to/project]```

**Configure with Release build type**

```sfdk cmake -DCMAKE_BUILD_TYPE=Release```

**Build the configured project**

```sfdk cmake --build .```

**Configure and build with make**

```sfdk cmake [cmake_args] && sfdk make```

**Show building command help**

```sfdk --help-building```

# SYNOPSIS

**sfdk cmake** [_project-dir_] [**--**] [_cmake-extra-arg_...]

**sfdk cmake --build .** [_cmake-extra-arg_...] [**--** _build-tool-extra-arg_...]

# DESCRIPTION

**sfdk cmake** runs **rpmbuild** in the Sailfish OS build environment and executes only the %build section of the RPM SPEC file, suppressing any **cmake** call in it that does not match the requested action: generating the project build system, or building the project. Part of Sailfish SDK.

A plain **make** in the %build section is treated as the build step. With a _project-dir_ a shadow build is done; otherwise the current directory is the project directory.

# CAVEATS

The project needs an RPM SPEC file, and a build target must be selected, for example with **sfdk config target=**. Compiler, sysroot and Qt arguments passed by an IDE (such as **-DCMAKE_SYSROOT:**) are filtered out during the generate step.

# SEE ALSO

[sfdk](/man/sfdk)(1), [sfdk-qmake](/man/sfdk-qmake)(1), [sfdk-make](/man/sfdk-make)(1), [cmake](/man/cmake)(1)

# RESOURCES

```[Source code](https://github.com/sailfishos/sailfish-qtcreator)```

```[Documentation](https://docs.sailfishos.org/Tools/Sailfish_SDK/)```

<!-- verified: 2026-11-09 -->
