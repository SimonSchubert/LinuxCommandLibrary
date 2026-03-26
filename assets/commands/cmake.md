# TAGLINE

cross-platform build system generator

# TLDR

**Generate build files in a build directory**

```cmake -B [build]```

**Build the project**

```cmake --build [build]```

**Build with a specific build type**

```cmake -B [build] -DCMAKE_BUILD_TYPE=[Release]```

**Build with Ninja generator**

```cmake -B [build] -G Ninja```

**Build in parallel**

```cmake --build [build] -j [8]```

**Install the project**

```cmake --install [build]```

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
> Parallel build jobs (passed to the underlying build tool).

**--target** _target_
> Build a specific target instead of the default.

**--verbose**
> Enable verbose build output.

**--clean-first**
> Clean before building.

**-DCMAKE_INSTALL_PREFIX=**_path_
> Set installation prefix directory.

**-DCMAKE_CXX_COMPILER=**_compiler_
> Specify the C++ compiler.

**-DCMAKE_BUILD_TYPE=**_type_
> Build type: Debug, Release, RelWithDebInfo, or MinSizeRel.

# CAVEATS

Complex syntax for advanced features. Learning curve steep. Generated files can be large. Cache issues require cleaning. Version differences cause compatibility issues. Some find it overcomplicated for simple projects.

# HISTORY

**CMake** was created by Bill Hoffman and Ken Martin at Kitware in **2000** to address the complexity of cross-platform builds, becoming widely adopted by **2010**.

# SEE ALSO

[make](/man/make)(1), [ninja](/man/ninja)(1), [meson](/man/meson)(1)
