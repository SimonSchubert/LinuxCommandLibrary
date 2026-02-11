# TAGLINE

C/C++ cross-platform package manager

# TLDR

**Search for a package**

```vcpkg search [package_name]```

**Install a package**

```vcpkg install [package_name]```

**Install package for specific triplet** (platform)

```vcpkg install [package_name]:[triplet]```

**List installed packages**

```vcpkg list```

**Remove a package**

```vcpkg remove [package_name]```

**Update vcpkg** and package catalog

```vcpkg update```

**Integrate with system-wide MSBuild/CMake**

```vcpkg integrate install```

**Show package information**

```vcpkg search [package_name] --x-full-desc```

# SYNOPSIS

**vcpkg** _command_ [_options_] [_package_...]

# PARAMETERS

**search** [_pattern_]
> Search for packages matching the pattern.

**install** _package_[_:triplet_]
> Install a package, optionally specifying a target triplet.

**remove** _package_
> Remove an installed package.

**list**
> List all installed packages.

**update**
> Update vcpkg itself and refresh the package catalog.

**upgrade**
> Rebuild all outdated packages.

**integrate install**
> Enable system-wide integration with build systems.

**integrate remove**
> Remove system-wide integration.

**export** _package_ **--zip**|**--nuget**
> Export installed packages to a portable format.

**help** [_topic_]
> Display help on a specific command or topic.

**--triplet** _triplet_
> Specify target platform (e.g., x64-linux, x86-windows, arm64-osx).

**--disable-metrics**
> Disable telemetry data collection.

# DESCRIPTION

**vcpkg** is Microsoft's cross-platform C/C++ package manager for acquiring and managing library dependencies. It provides access to thousands of open-source libraries that can be built and integrated into projects on Windows, macOS, and Linux.

Unlike system package managers, vcpkg allows multiple versions of the same library to coexist and supports cross-compilation through triplets. It integrates seamlessly with CMake and MSBuild, automatically configuring include paths and link libraries.

Packages are built from source using curated build scripts (portfiles) maintained in the vcpkg registry. This ensures consistent builds across platforms and allows customization of build options. The tool can operate in classic mode with a central installation or manifest mode with per-project dependencies.

Configuration is done through environment variables (VCPKG_ROOT, VCPKG_DEFAULT_TRIPLET) or command-line options.

# CAVEATS

Building packages from source can be time-consuming, especially for large libraries. Some packages may require system dependencies to be installed first. Binary caching can speed up repeated builds but requires additional configuration. The default triplet varies by platform.

# HISTORY

**vcpkg** was developed by **Microsoft** and first released in **September 2016** to help C++ developers manage dependencies on Windows. It was initially focused on Visual Studio integration but expanded to become a cross-platform tool supporting Linux and macOS. The project is open source under the MIT license and maintained on GitHub with active community contributions.

# SEE ALSO

[cmake](/man/cmake)(1), [conan](/man/conan)(1), [apt](/man/apt)(8), [brew](/man/brew)(1)
