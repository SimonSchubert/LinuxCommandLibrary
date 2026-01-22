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

**conan** is a decentralized C/C++ package manager supporting all platforms, build systems, and compilers. It manages dependencies, creates binary packages, and handles cross-compilation.

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

**conanfile.txt / conanfile.py**
> Project dependency file

**~/.conan2/profiles/**
> Build profiles

# CAVEATS

Conan 2.x is current; Conan 1.x is legacy. Binary compatibility configurable. Integrates with CMake, MSBuild, Meson, and custom build systems.

# SEE ALSO

[cmake](/man/cmake)(1), [vcpkg](/man/vcpkg)(1)
