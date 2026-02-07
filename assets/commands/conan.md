# TAGLINE

C/C++ package manager for all platforms

# TLDR

**Install dependencies from conanfile**

```conan install [.]```

**Install with specific profile**

```conan install [.] --profile=[release]```

**Create package from recipe**

```conan create [.]```

**Search for packages**

```conan search "[boost/*]"```

**List installed packages**

```conan list "*"```

**Add remote repository**

```conan remote add [name] [url]```

**Upload package to remote**

```conan upload [package/version] -r [remote]```

**Show package info**

```conan inspect [package/version]```

# SYNOPSIS

**conan** _command_ [_options_] [_arguments_]

# DESCRIPTION

**conan** is a modern, decentralized package manager designed specifically for C and C++ projects, addressing the historically fragmented dependency management landscape in these languages. Unlike language-specific package managers that assume a single build system, Conan integrates with CMake, MSBuild, Meson, Autotools, and custom build systems, making it genuinely cross-platform across Windows, Linux, macOS, and embedded systems.

The tool operates on a binary package model where packages can be precompiled for specific configurations (compiler, OS, architecture, build type) and cached for reuse, dramatically speeding up build times compared to source-only approaches. Conan profiles define these build configurations, and the package manager performs sophisticated dependency resolution that accounts for binary compatibility across the entire dependency graph.

Conan uses a decentralized repository model similar to Git, where teams can host private Conan servers (Artifactory, ConanCenter) while still accessing the public ConanCenter repository. Package recipes (conanfile.py) are written in Python, providing full programmability for complex build scenarios. Conan 2.x represents a major evolution with improved versioning, better CMake integration, and a cleaner CLI, though it introduces breaking changes from the 1.x series.

# COMMANDS

**install**
> Install dependencies from conanfile

**create**
> Build and create package from recipe

**build**
> Build package locally

**search**
> Search for packages

**list**
> List packages in cache

**remote**
> Manage remote repositories

**upload**
> Upload packages to remote

**download**
> Download packages

**export**
> Export recipe to cache

**profile**
> Manage build profiles

**config**
> Manage Conan configuration

**new**
> Create new package template

# PARAMETERS

**-pr**, **--profile** _name_
> Build profile to use

**-r**, **--remote** _name_
> Remote repository

**-of**, **--output-folder** _path_
> Output folder

**-b**, **--build** _policy_
> Build policy (missing, never, always)

**-s** _setting=value_
> Override setting

**-o** _option=value_
> Override option

# CONFIGURATION

**conanfile.txt**
> Simple text format for declaring dependencies.

**conanfile.py**
> Python-based package recipe with full control.

**~/.conan2/profiles/**
> Build profiles defining compiler, OS, architecture settings.

**~/.conan2/global.conf**
> Global configuration for Conan behavior.

# CAVEATS

Conan 2.x is current; Conan 1.x is legacy. Binary compatibility configurable. Integrates with CMake, MSBuild, Meson, and custom build systems.

# SEE ALSO

[cmake](/man/cmake)(1), [vcpkg](/man/vcpkg)(1)
