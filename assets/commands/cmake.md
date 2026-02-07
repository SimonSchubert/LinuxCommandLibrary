# TAGLINE

cross-platform build system generator

# TLDR

**Generate** build files

```cmake -B [build]```

**Build** project

```cmake --build [build]```

**Configure** and build

```cmake -B build && cmake --build build```

**Install** project

```cmake --install [build]```

**Run** tests

```ctest --test-dir [build]```

# SYNOPSIS

**cmake** [_options_] _source-dir_

# DESCRIPTION

**cmake** is a cross-platform build system generator. It reads platform-independent CMakeLists.txt project descriptions and generates native build files for the user's chosen build tool, including Unix Makefiles, Ninja, Visual Studio solutions, and Xcode projects.

The typical workflow involves a configure step that generates build files in an out-of-source build directory, followed by a build step that invokes the native build tool. CMake handles dependency detection, compiler feature checks, and library discovery through its find-module system.

CMake is the dominant build system for C and C++ projects, and also supports Fortran, CUDA, and other languages. It includes CTest for test automation and CPack for creating distributable packages.

# PARAMETERS

**-B** _dir_
> Build directory

**-S** _dir_
> Source directory (default: current)

**-G** _generator_
> Build system generator (Unix Makefiles, Ninja, Xcode)

**-D** _var_**=**_value_
> Set CMake variable

**--build** _dir_
> Build project

**--install** _dir_
> Install project

**--preset** _name_
> Use configure preset

**-j** _N_
> Parallel build jobs

# BUILD TYPES

**-DCMAKE_BUILD_TYPE=**_type_

- **Debug** - No optimization, debug symbols
- **Release** - Optimized, no debug symbols
- **RelWithDebInfo** - Optimized with debug symbols
- **MinSizeRel** - Optimized for size

# WORKFLOW

```bash
# Configure (generate build files)
cmake -B build -DCMAKE_BUILD_TYPE=Release

# Build
cmake --build build

# Parallel build
cmake --build build -j 8

# Install
sudo cmake --install build

# Run tests
cd build && ctest

# Clean build
cmake --build build --target clean
```

# CMAKELISTS.TXT

Simple example:
```cmake
cmake_minimum_required(VERSION 3.10)
project(MyProject)

add_executable(myapp main.cpp utils.cpp)
target_link_libraries(myapp pthread)
```

# COMMON OPTIONS

```bash
# Specify compiler
cmake -B build -DCMAKE_CXX_COMPILER=clang++

# Set install prefix
cmake -B build -DCMAKE_INSTALL_PREFIX=/usr/local

# Use Ninja generator
cmake -B build -G Ninja

# Verbose build
cmake --build build --verbose
```

# FEATURES

- Cross-platform builds
- Out-of-source builds
- Generator expressions
- Find modules for libraries
- Testing support (CTest)
- Packaging (CPack)
- IDE integration

# CAVEATS

Complex syntax for advanced features. Learning curve steep. Generated files can be large. Cache issues require cleaning. Version differences cause compatibility issues. Some find it overcomplicated for simple projects.

# HISTORY

**CMake** was created by Bill Hoffman and Ken Martin at Kitware in **2000** to address the complexity of cross-platform builds, becoming widely adopted by **2010**.

# SEE ALSO

[make](/man/make)(1), [ninja](/man/ninja)(1), [meson](/man/meson)(1)
