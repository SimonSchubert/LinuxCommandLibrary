# TLDR

**Create new project**

```xmake create [project_name]```

**Build project**

```xmake```

**Build with specific mode**

```xmake -m [release]```

**Run target**

```xmake run [target]```

**Install package**

```xmake require [package]```

**Clean build**

```xmake clean```

**Configure project**

```xmake config -p [linux] -a [x86_64]```

**Generate IDE project**

```xmake project -k [cmake]```

# SYNOPSIS

**xmake** [_build_] [_run_] [_clean_] [_require_] [_config_] [_options_] [_target_]

# PARAMETERS

**build**
> Build project (default).

**run** [_TARGET_]
> Run target.

**clean**
> Clean build files.

**config**
> Configure project.

**require** _PKG_
> Install package.

**create** _NAME_
> Create project.

**project** **-k** _KIND_
> Generate project files.

**-m** _MODE_
> Build mode (debug, release).

**-p** _PLATFORM_
> Target platform.

**-a** _ARCH_
> Target architecture.

**-v**
> Verbose output.

**-j** _N_
> Parallel jobs.

# DESCRIPTION

**xmake** is a cross-platform build system. It uses Lua for configuration, providing flexibility while remaining simple.

Build configuration in xmake.lua defines targets, dependencies, and compiler options. The syntax is more readable than CMake.

Package management is integrated. Dependencies are declared and automatically downloaded and built.

Cross-platform support covers Windows, Linux, macOS, and more. Cross-compilation and toolchain management are built-in.

Project generation creates files for CMake, Make, Ninja, Visual Studio, and Xcode. This enables integration with other tools.

Remote compilation distributes builds across machines. Cache sharing speeds up builds across teams.

# CAVEATS

Less widespread than CMake. Package repository smaller than vcpkg/conan. Lua config has learning curve for some.

# HISTORY

**xmake** was created by **ruki** around **2015** in China. It provides a modern alternative to CMake with integrated package management and simpler syntax.

# SEE ALSO

[cmake](/man/cmake)(1), [make](/man/make)(1), [meson](/man/meson)(1), [ninja](/man/ninja)(1)
